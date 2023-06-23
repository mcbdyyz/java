package Stream流.中间流常见操作方法;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Stream<T> filter (Predicate predicate):todo 用于对流中的数据进行过滤
 * Predicate接口中的方法 boolean test (T t):todo 对给定的参数进行判断，返回一个布尔值
 *-----------------------------------------------------------------------------------
 * Stream<T> limit(long maxSize):todo 返回此流中的元素组成的流，截取前指定参数个数的数据
 * Stream<T> skip(long n):todo 跳过指定参数个数的数据，返回由该流的剩余元素组成的流
 * -----------------------------------------------------------------------------------
 * static Stream<T> concat(Stream a,Stream b):todo 合并a和b两个流为一个流
 * Stream<T> distinct():todo 返回由该流的不同元素（根据Object.equals(Object))组成的流
 * -----------------------------------------------------------------------------------
 * Stream<T> sorted():todo 返回由此流的元素组成的流，根据自然顺序排序
 * Stream<T> sorted(Comparator comparator):todo 返回由该流的元素组成的流，根据提供的Comparator进行排序
 * -----------------------------------------------------------------------------------
 * <R> Stream<R> map(Function mapper):todo 返回由给定函数应用于此流的元素的结果组成的流
 *          Function接口中的方法： R apply(T t)
 * IntStream mapToInt(ToIntFunction mapper):todo 返回一个IntStream其中包含将给定函数应用于此流的元素的结果
 *      IntStream:表示原始int流
 *      ToIntFunction接口中的方法 int applyAsInt(T value)
 * */
public class Demo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("幽幽子");
        array.add("幽香");
        array.add("魔理沙");
        array.add("妖梦");
        array.add("幽幽子二号机");
        array.add("ab");

        //把list集合中以幽开头的元素在控制台输出
        array.stream().filter(s->s.startsWith("幽")).forEach(System.out::println);
        System.out.println("---------幽开头的元素在控制台输出");
        //把list集合中长度为3的元素在控制台输出
        array.stream().filter(s -> s.length()==3).forEach(System.out::println);
        System.out.println("---------长度为3的元素在控制台输出");

        //把list集合中以幽为开头的，长度为3的元素在控制台输出
        array.stream().filter(s->s.startsWith("幽")).filter(s->s.length()==3).forEach(System.out::println);
        System.out.println("---------集合中以幽为开头的，长度为3的元素在控制台输出");
        //取前三个数据在控制台输出
        array.stream().limit(3).forEach(System.out::println);
        System.out.println("---------");

        //todo Stream<T> limit(long maxSize):返回此流中的元素组成的流，截取前指定参数个数的数据
        // * Stream<T> skip(long n):跳过指定参数个数的数据，返回由该流的剩余元素组成的流
        // 跳过三个元素，把剩下的元素在控制台输出
        array.stream().skip(3).forEach(System.out::println);
        System.out.println("---------跳过三个元素");

        //跳过两个元素，把剩下的元素中前2个在控制台输出
        array.stream().skip(2).limit(2).forEach(System.out::println);
        System.out.println("-----------跳过两个元素，把剩下的元素中前2个");
        //todo static Stream<T> concat(Stream a,Stream b):合并a和b两个流为一个流
        // *
        // * Stream<T> distinct():返回由该流的不同元素（根据Object.equals(Object))组成的流
        //取前四个数据组成一个流
        Stream<String> st1 = array.stream().limit(4);
        //跳过两个数据组成的流
        Stream<String> st2 = array.stream().skip(2);
        //和并需求1和需求2 的流，并把结果在控制台输出
//        Stream.concat(st1,st2).forEach(System.out::println);
//        System.out.println("-------取前四个数据,跳过两个数据组成的流");
        //和并需求1和需求2的流,并把结果在控制台输出,要求字符串元素不能重复
        Stream.concat(st1,st2).distinct().forEach(System.out::println);
        System.out.println("------和并需求1和需求2的流,并把结果在控制台输出,要求字符串元素不能重复");

        //todo Stream<T> sorted():返回由此流的元素组成的流，根据自然顺序排序
        // * Stream<T> sorted(Comparator comparator):返回由该流的元素组成的流，根据提供的Comparator进行排序
        //排序
        array.stream().sorted().forEach(System.out::println);
        System.out.println("---------------排序");
        //按照字符串长度把数据输出
        array.stream().sorted((s1,s2)->s1.length()-s2.length()).forEach(System.out::println);
        System.out.println("-----按照字符串长度把数据输出");
        method();
    }
    public static void method(){
        ArrayList<String> list =new ArrayList<>();
        list.add("30");
        list.add("10");
        list.add("20");
        list.add("50");
        list.add("100");
        //将集合中的字符串转换为整数后在控制台输出
        list.stream().map(Integer::parseInt).forEach(System.out::println);
        System.out.println("-----");
        //int sum()返回此流中元素的总和
        int sum = list.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(sum);
    }
}
