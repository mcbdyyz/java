package 多线程.Runnable接口;
/**
 * 这是实现Runnable，好处是避免了java单继承的局限性，适合多个相同的程序代码去处理同一个资源的情况，把线程和程序的代码，数据有效分离，
 * 较好的体现了面向对象的设计思想
 * */
public class Demo {
    public static void main(String[] args) {
        //创建对象
        MyRunnable my = new MyRunnable();

        Thread t1 = new Thread(my,"幽幽子");
        Thread t2 = new Thread(my,"妖梦");


        t1.start();

        t2.start();
//        t1.setDaemon(true);
    }
}
