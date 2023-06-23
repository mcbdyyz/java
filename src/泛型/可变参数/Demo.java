package 泛型.可变参数;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 格式：修饰符 返回值类型 方法名(数据类型...方法名){}
 * public static int sum(int...a){}
 *
 * Arrays 工具类中有一个静态方法
 * public static<T> List<T> asList(T... a):返回由指定数组支持的固定大小列表
 * 不能做增删操作，可以做修改操作
 *
 * List接口中有一个静态方法：
 * public static<E> List<E> of(E... elements):返回包含任意数量元素的不可列表
 * 不能做增删改操作
 *
 * Set接口中有一个静态方法；
 * public static <E> Set<E> of(E... elements):返回一个包含任意元素的不可变集合
 * 给元素时，不能给重复元素
 * 返回的集合不能做增删操作，没有修改方法
 * */
public class Demo {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));

        List<String> list = Arrays.asList("uuz","yyz","xxs","hello");
//        list.add("add");//UnsupportedOperationException报错
//        list.remove("ym");//UnsupportedOperationException
        list.set(1,"yyz3");//
        System.out.println(list);

//        List<String> list1 = List.of("hello","world","java");
//        list1.add()//不行
//        list1.remove()//不支持
//        list1.set()//不支持
//        System.out.println(list1);

//        Set<String> set = Set.of("uuz","java","ym");
//        set.add()
//        set.remove()

//        System.out.println(set);

    }
    public static int sum(int...s){
        int sum = 0;
        for(int i :s){
            sum += i;
        }
        return sum;
    }
}
