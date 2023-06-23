package 多线程;
/**
 * 定义一个类，继承Thread类
 * 然后重写run()
 *      Thread类中获取和设置线程名称方法
 *          void setName(String name):将此线程的名称更改为等于参数name
 *          String getName():返回此线程的名称
 *
 *          Static Thread currentThread():返回对当前正在执行的线程对象的引用
 * */
public class Demo {
    public static void main(String[] args) {
//        MyTread();
//        MyTread2();
        MyTread3();
    }


    /**
     * start()方法是开启多线程
     * */
    public static void MyTread(){
        MyThread mt = new MyThread("飞机");
        MyThread mt2 = new MyThread("高铁");
        mt.start();
        mt2.start();

        System.out.println(Thread.currentThread().getName());
    }
    /**
     * 线程优先级：
     *      public final int getPriority():返回此线程的优先级
     *      public final void setPriority(int newPriority):更改此线程的优先级,设置的范围在Min_PRIORITY到MAX_PRIORITY之间
     *      1-10;
     * */
    public static void MyTread2(){
        MyThread mt1 = new MyThread("曲率引擎");
        MyThread mt2 = new MyThread("空间折跃");
        MyThread mt3 = new MyThread("光帆");
//        System.out.println(mt1.getPriority());//查看优先级
//        System.out.println(mt2.getPriority());
//        System.out.println(mt3.getPriority());

        mt1.setPriority(5);
        mt2.setPriority(10);
        mt3.setPriority(1);

        mt1.start();
        mt2.start();
        mt3.start();
    }
    /**
     * 线程控制：
     *      static void sleep(long millis):使用当前正在执行的线程停留（暂停执行）指定的毫秒数
     *      void join():等待这个线程死亡
     *      void setDaemon(boolean on):将此线程标记为守护线程，当运行的线程都是守护线程时，java虚拟机将退出
     * */
    public static void MyTread3(){
        MyThread mt = new MyThread();
        MyThread mt2 = new MyThread();
        MyThread mt3 = new MyThread();
        mt.setName("曹操");
        mt2.setName("刘备");
        mt3.setName("孙权");

        mt.setDaemon(true);//守护线程

        mt.start();
        try {
            mt.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mt2.start();
        mt3.start();
    }
}
