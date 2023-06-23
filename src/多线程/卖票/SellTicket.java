package 多线程.卖票;

public class SellTicket implements Runnable {
    private static int ticket = 100;
    private int e;
    final Object obj = new Object();
    @Override
    public void run() {
        while (true) {
            if(e%2==0) {
//            synchronized (obj)//不能new Object()因为这样会创建三个对象
//            synchronized (this)//这是同步方法指向的类
                synchronized (SellTicket.class)//这是静态同步方法类指向的类
                {
                    if (ticket > 0) {
                        System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket + "票");
                        ticket--;

                    } else {
                        System.out.println("票以及卖完了");

                        return;
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                e++;
            }else{
                sellticket();
                e++;
            }
        }

    }

    private static synchronized void sellticket() {
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket + "票");
            ticket--;

        } else {
            System.out.println("票以及卖完了");
            sellticket();
            return;
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
