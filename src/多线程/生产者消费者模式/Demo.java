package 多线程.生产者消费者模式;
/**
 * 生产者消费者模式是一个十分经典的多线程协作的模式，弄懂生产者消费者问题能够让我们对多线程变成的理解更加深刻
 * 所谓生产者消费者问题，实际上主要是包含了两类线程；
 * 一类是生产者线程用于生产数据
 * 一类是消费者线程用于消费数据
 * 为了解耦产生着和消费者的关系，通常会采用共享的数据区域，就像是一个仓库
 * 生产者生产数据之后直接放置在共享数据区中，并不关心消费者的行为
 * 消费者只需要从共享数据区中去获取数据，并不需要关心生产者的行为
 *      等待和唤醒，
 *          void wait():导致当前线程等待，直达另一个线程调用该对象的notify()方法或notifyAll()方法
 *
 *          void notify():唤醒正在等待对象监视器的单个线程
 *
 *          void notifyAll():唤醒正在等待对象监视器的所有线程
 * */
public class Demo {
    public static void main(String[] args) {
        milkBox b = new milkBox();

        Producer p = new Producer(b);

        Customer c = new Customer(b);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);

        t1.start();
        t2.start();
    }
}
