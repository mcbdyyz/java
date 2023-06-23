package Stream流.Stream流生成方式;

import java.util.*;
import java.util.stream.Stream;

/**
 * Stream
 *      生成流：
 *          通过数据原（集合，数组等）生成流
 *          list.Stream()
 *      中间操作:
 *          一个流后面可以跟随零个或多个中间操作，其目的主要是打开流，做出某种程度的数据过滤/映射，然后返回一个新的流
 *          交给下一个操作使用
 *          filter()
 *
 *      终结操作：
 *          一个流只能有一个终结操作，当这个操作执行后，流就被使用光了，无法再次被操作，所以这必定是流的最后一个操作
 *          forEach()
 *
 *     常见生成方式：
 *          Collection体系的集合可以使用默认方法stream()生成流
 *              default Stream<E> stream()
 *          Map体系的集合间接生成流
 *          数组可以通过Stream接口的静态方法of(T...values)生成流
 * */
public class Demo {
    public static void main(String[] args) {
        //Collection体系的集合可以使用默认方法stream()生成流
        List<String> ls = new ArrayList<>();
        Stream<String> stream = ls.stream();


        Set<String> set = new HashSet<>();
        Stream<String> stream1 = set.stream();

        //Map体系的集合间接生成流
        Map<String,Integer> map = new HashMap<>();
        //keySet()会输出一个set集合，这样就可以用stream流了
        Stream<String> keyStream = map.keySet().stream();
        //values()会返回一个Collection集合，这样也可以用Stream流了
        Stream<Integer> valueStream = map.values().stream();
        // entrySet()返回一个set集合
        Stream<Map.Entry<String, Integer>> stream2 = map.entrySet().stream();

        //数组可以通过Stream接口的静态方法of(T...values)生成流
        String[] strArray = {"hello","yyz","world"};
        Stream<String> strArray1 = Stream.of(strArray);
        Stream<String> hello = Stream.of("hello", "yyz", "world");

    }
}
