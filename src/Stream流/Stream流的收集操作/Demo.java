package Stream流.Stream流的收集操作;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream流的收集方法
 *      R collect(Collector collector)
 *      但是这个收集方法的参数是一个Collector接口
 *
 *      工具类Collectors提供了具体的收集方法
 *      public static <T> Collector toList():把元素收集到List集合中
 *      public static <T> Collector toSet():把元素收集到Set中
 *      public static <T> collector toMap(Function keyMapper,Function valueMapper):把元素收集到Map集合中
 *
 * */
public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("yyz");
        list.add("yyz2");
        list.add("yyz3");
        list.add("yyzasf");
        list.add("yyz33");
        //转流，筛选，然后收集回来
        List<String> collect = list.stream().filter(s -> s.length() == 4).collect(Collectors.toList());
        //遍历
        collect.forEach(System.out::println);

        Set<Integer> set = new HashSet<>();
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(10);
        set.add(70);

        Set<Integer> collect1 = set.stream().filter(s -> s > 35).collect(Collectors.toSet());
        collect1.forEach(System.out::println);
        System.out.println("---------");
        String[] s = {"幽幽子,18","灵梦,20","八云紫,555","妖梦,21"};
//      变流，筛选，分割存入map然后返回
        Map<String, String> collect2 = Stream.of(s).filter(s1 -> Integer.parseInt(s1.split(",")[1]) > 20).
                collect(Collectors.toMap(p -> p.split(",")[0], p1 -> p1.split(",")[1]));

        Set<String> str = collect2.keySet();
//        //遍历
        str.forEach(st-> System.out.println(st+","+collect2.get(st)));

    }
}
