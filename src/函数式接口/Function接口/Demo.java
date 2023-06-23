package 函数式接口.Function接口;

import java.util.function.Function;

/**
 * Function接口：
 * Function<T,R>:T：输入的类型，R输出的类型
 * R apply(T t):将此函数应用于给定的参数
 * default <V> Function and Then(Function after):返回一个组合函数，首先
 * 将该函数应用于输入，然后将after函数应用于结果，然后将after函数应用于结果
 * Function<T,R>:接口通常用于对参数进行处理，转换处理逻辑由lambda表达式实现，然后返回一个新的值
 */
public class Demo {
    public static void main(String[] args) {
        convert("1314", Integer::parseInt);

        convert(100, s -> String.valueOf(s + 20));

        convert("120", Integer::parseInt, s -> String.valueOf(s + 20));
    }

    //定义一个方法，把一个字符串转换int类型，在控制台输出
    private static void convert(String s, Function<String, Integer> fun) {
        Integer apply = fun.apply(s);
        System.out.println(apply);
    }

    //定义一个方法，把一个int类型的数据加上一个整数之后，转换为字符串在控制台输出
    private static void convert(int i, Function<Integer, String> fun) {
        String apply = fun.apply(i);
        System.out.println(apply);
    }

    //定义一个方法，把一个字符串转换int类型，把int类型的数据加上一个整数之后，转为字符串在控制台输出
    private static void convert(String s, Function<String, Integer> fun1, Function<Integer, String> fun2) {
        String apply = fun1.andThen(fun2).apply(s);

        System.out.println(apply);
    }
}
