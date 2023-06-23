package Lambda表达式.lambda体验;

import 多线程.Runnable接口.MyRunnable;

import java.awt.*;

/**
 * Lambda表达式的格式
 * 格式：（形式参数）->{代码块}
 * 形式参数：如果有多个参数，参数之间用逗号隔开；如果没有参数，留空即可
 * ->:由英文中画线和大于符号组成，固定写法，代表指向动作
 * 代码块：是我们具体要做的事情，也就是以前我们写的方法体内容
 *
 * 匿名内部类，可以运行，接口，抽象类，具体类
 * 而lambda只能使用接口
 *
 * 匿名内部类编译之后会有一个单独的.class字节码文件
 * Lambda表达式，编译之后，没有一个单独的.class字节码文件，对应的字节码会在运行的时候动态生成
 * */
public class Demo {
    public static void main(String[] args) {
        //实现类的方式实现了需求
        MyThread mt = new MyThread();
        Thread t = new Thread(mt);
        t.start();

        //匿名内部类的方式改进
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类方法实现了多线程");
            }
        }).start();
        //lambda表达式的方式改进

        new Thread(()->{
            System.out.println("lambda表达式实现了多线程");
        }).start();

    }


}
