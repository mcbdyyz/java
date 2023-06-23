package Stream流.常见终结流操作方法;

import java.util.ArrayList;

/**
 * void forEach(Consumer action):对此流的每一个元素执行操作
 *      Consumer接口中的方法  void accept(T t):对给定的参数执行此操作
 * long count():返回此流中的元素数
 *
 * */
public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("yyz");
        list.add("yyz1");
        list.add("yyz2");
        list.add("yyz3");

//        list.stream().forEach(System.out::println);

        list.forEach(System.out::println);

        long count = list.stream().count();
        System.out.println(count);
    }
}
