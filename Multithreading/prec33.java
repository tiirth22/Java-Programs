

import java.util.Scanner;

class MyThread extends Thread {
    int start, end;
    static int sum = 0;

    // Constructor to initialize the range for each thread
    MyThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    // Synchronized method to safely add the sum from each thread
    static void addSum(int partialSum) {
        sum += partialSum;
    }

    // The task that each thread will perform
    public void run() {
        int partialSum = 0;
        for (int i = start; i <= end; i++) {
            partialSum += i;
        }
        addSum(partialSum);  // Add the partial sum from this thread to the total sum
    }
}

public class prec33 {
    public static void main(String[] args) {
        int N, numThreads;
        Scanner s = new Scanner(System.in);

        // Getting input for the number N and number of threads
        System.out.print("Enter the number 'N': ");
        N = s.nextInt();
        System.out.print("Enter the number of threads to be used (should be less than or equal to N): ");
        numThreads = s.nextInt();

        // Array to hold the thread objects
        MyThread[] threads = new MyThread[numThreads];

        // Distribute the range of numbers across threads
        int range = N / numThreads;
        int start = 1, end;

        for (int i = 0; i < numThreads; i++) {
            end = (i == numThreads - 1) ? N : start + range - 1; // Ensure last thread handles the remainder
            threads[i] = new MyThread(start, end); // Create thread with the range of numbers
            threads[i].start();  // Start the thread
            start = end + 1;
        }

        try {
            for (int i = 0; i < numThreads; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("The sum of numbers from 1 to " + N + " is: " + MyThread.sum);
    }
}

