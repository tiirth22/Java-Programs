class MyThread extends Thread {
    public void run() {
        System.out.println("Hello World");
    }
}

public class prec32_a {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}

