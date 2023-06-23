package 多线程.Lock锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicketDemo implements Runnable{
    private int ticket =100;
    private final Lock lock =new ReentrantLock();
    @Override
    public void run() {

        while(true){
            try{
                lock.lock();
                if (ticket > 0) {

                    System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket + "张票");
                    ticket--;

                }else {
                    System.out.println("票以及卖完了");
                    return;
                }
            }finally {
                lock.unlock();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
