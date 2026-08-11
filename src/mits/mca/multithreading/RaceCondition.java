package mits.mca.multithreading;

class Count {
    int count = 0;
    /*
    synchronized void increment(){ //locking the entire block
        count++;
    }
     */

    void increment(){
        synchronized (this) {
            count++; //
            // doctor chamber
        }
    }
    int getCount(){
        return count;
    }
}

public class RaceCondition extends Thread {
    public static void main(String[] args) throws InterruptedException {
        Count c = new Count();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });

        Thread t2 = new Thread(()-> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });

        t1.start();
        //t1.join(); //2000 always
        t2.start();
        t1.join(); //random values not 2000 always
        t2.join();
        System.out.println(c.getCount());

    }
}
