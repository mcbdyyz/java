package 多线程.卖票;
/**
 * 需求：
 *      某电影院目前正在上映国产大片，共有100张票，而它有3个窗口卖票，请设计一个程序模拟该电影院卖票
 *      同步代码块，锁多条语句操作共享数据，
 *              synchronized(任意对象){
 *
 *              }
 *      同步方法：给方法加上锁,synchronized 修饰，默认锁的东西是this,
 *      静态同步方法：static synchronized 修饰，锁的方法不是this，而是类名.class
 * */
public class main {
    public static void main(String[] args) {
        SellTicket se = new SellTicket();

        Thread t1 = new Thread(se,"窗口1");
        Thread t2 = new Thread(se,"窗口2");
        Thread t3 = new Thread(se,"窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
}
