package 函数式接口.Consumer接口;

import java.util.function.Consumer;

/***
 *Consumer<T>:包含两个方法
 * void accept(T t):对给定的参数执行此操作
 * default Consumer<T> andThen(Consumer after):返回一个组合的Consumer,依次执行此操作，然后执行after操作
 * Consumer<T> 接口也被称为消费类型接口，它消费的数据的数据类型由泛型指定
 *
 *
 */

public class Demo {
    public static void main(String[] args) {
        useConsumer("yyz", System.out::println);
        useConsumer("yyz2", System.out::println);

        useConsumer("yyz3", s -> System.out.println(new StringBuilder(s).reverse().toString()));
        System.out.println("-----");

        operatorString("幽幽子", System.out::println, s -> System.out.println(new StringBuilder(s).reverse().toString()));

        System.out.println("----------");
        method();
    }

    private static void useConsumer(String s, Consumer<String> a) {
        a.accept(s);

    }

    //定义一个方法，用不同的方式消费同一个字符串数据两次
    private static void operatorString(String name, Consumer<String> con1, Consumer<String> con2) {
//        con1.accept(name);
//        con2.accept(name);
        con1.andThen(con2).accept(name);
    }

    //数组
    public static void method() {
        String[] strArray = {"yyz1,18", "yyz2,19", "yyz3,20"};
        useArrayPrint(strArray, s -> {
            String ar = s.split(",")[0];
            System.out.println("姓名" + ar);
        }, s -> {
            String nar = s.split(",")[1];
            System.out.println("年龄" + nar);
        });

    }

    private static void useArrayPrint(String[] str, Consumer<String> con1, Consumer<String> con2) {
        for (String s : str) {
            con1.andThen(con2).accept(s);
        }
    }
}
