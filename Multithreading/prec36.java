class first extends Thread {
    public void run() {
        System.out.println("First");
    }
}

class Second extends Thread {
    public void run() {
        System.out.println("Second");
    }
}

class Third extends Thread {
    public void run() {
        System.out.println("Third");
    }
}

public class prec36 {
    public static void main(String[] args) {
        first f = new first();
        
        Second s = new Second();
        Third t = new Third();

        f.setPriority(8);
        s.setPriority(4);
        t.setPriority(6);

        f.start();
        s.start();
        t.start();
    }
}
