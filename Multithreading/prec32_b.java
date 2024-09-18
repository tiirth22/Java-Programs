class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Hello World");
    }
}

public class prec32_b {
    public static void main(String[] args) {
        MyRunnable m1 =  new MyRunnable();
        Thread t1 = new Thread(m1);
        t1.start();
    }

}
