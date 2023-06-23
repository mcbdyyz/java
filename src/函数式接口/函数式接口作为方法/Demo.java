package 函数式接口.函数式接口作为方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"线程启动了");
            }
        });

        startThread(()-> System.out.println(Thread.currentThread().getName()+"线程启动了"));

        method();
    }
    /**
     * 方法的参数
     * */
    private static void startThread(Runnable r){
        Thread tr = new Thread(r);
        tr.start();
    }
    /**
     *
     * 一个方法的返回值是函数式接口，lambda表达式作为结果返回
     * */
    private static Comparator<String> getComparator(){
        //匿名内部类的方式实现
//        return new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        };
        return (s1,s2)->s1.length()-s2.length();

    }
    public static void method(){
        ArrayList<String> ar = new ArrayList<>();
        ar.add("aaa");
        ar.add("b");
        ar.add("cc");
        ar.add("dddd");
        System.out.println("排序前"+ar);
//        Collections.sort(ar);

        Collections.sort(ar,getComparator());
        System.out.println("排序后："+ar);

    }
}
