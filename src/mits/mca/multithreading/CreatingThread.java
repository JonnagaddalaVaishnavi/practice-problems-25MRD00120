package mits.mca.multithreading;

class SampleThread extends Thread{
    @Override
    public void run() {
        //System.out.println("My thread");
        //System.out.println(Thread.currentThread().getName());
        for (int i = 0; i<10;i++){
            try {
                Thread.sleep(1000);
                System.out.println("Hello");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class CreatingThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        SampleThread t1 = new SampleThread();
        SampleThread t2 = new SampleThread();
        t1.start();
        t2.start();
    }
}
