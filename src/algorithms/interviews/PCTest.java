package algorithms.interviews;

import java.util.LinkedList;

/**
 * Created by Harish on 6/22/17.
 */
public class PCTest {
    public static void main(String[] args)  throws InterruptedException{
        final PC pc = new PC();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();


    }

    static class PC {
        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 2;

        void produce() throws InterruptedException {
            int val = 0;
            while(true) {
                synchronized (this) {
                    if(list.size() == capacity)
                        wait();

                    System.out.println("Producer produced:>> " + val);
                    list.add(val++);

                    notify();
                    Thread.sleep(1000);
                }
            }
        }

        void consume() throws InterruptedException {
            while(true) {
                synchronized (this) {
                    if(list.size() == 0)
                        wait();

                    int val = list.removeFirst();

                    System.out.println("Consumer consumed:<< " + val);

                    notify();

                    Thread.sleep(1000);
                }
            }
        }
    }
}
