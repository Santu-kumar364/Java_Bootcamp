package Java_Bootcamp.OOPS;

class Mythread extends Thread {
    public void run() {
        System.out.println("Thread Running: " + Thread.currentThread().getName());
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        t1.setName("SantuThread");
        t1.start();
        
    }
}
