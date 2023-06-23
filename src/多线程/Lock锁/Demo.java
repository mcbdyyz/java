package 多线程.Lock锁;
/**
 * 为了更清晰的表达如何加锁和释放锁，JDK5以后提供了一个全新的锁对象Lock
 *      void lock():获得锁
 *      void unlock():释放锁\
 * Lock是接口不能实例化，这里采用它的实现类ReentrantLock来实例化
 *          ReentrantLock():创建一个ReentrantLock的实例
 * */
public class Demo {
    public static void main(String[] args) {
        SellTicketDemo std = new SellTicketDemo();

        Thread tr = new Thread(std,"幽幽子1");
        Thread tr1 = new Thread(std,"幽幽子2");
        Thread tr2 = new Thread(std,"幽幽子3");

        System.out.println(tr.getPriority());
        System.out.println(tr1.getPriority());
        System.out.println(tr2.getPriority());

        tr.start();
        tr1.start();
        tr2.start();

    }
}
