package mits.mca.multithreading;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running ");
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class LifeCycle {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread(); //new state
        System.out.println(t1.getState());

        t1.start(); //runnable state
        System.out.println(t1.getState());

        Thread.sleep(100); // terminated state
        System.out.println(t1.getState());

//        t1.interrupt(); //interrupted state
//        System.out.println(t1.getState());
    }
}
