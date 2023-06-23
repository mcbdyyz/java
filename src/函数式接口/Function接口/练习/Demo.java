package 函数式接口.Function接口.练习;

import java.util.function.Function;

/**
 * String s ="幽幽子,20";
 * 将字符串截取得到数字年龄部分
 * 将上一步的年龄字符串转换为int类型的数据
 * 将上一步的int数据加70，得到一个int结果，在控制台输出
 */
public class Demo {
    public static void main(String[] args) {
        String s1 = "幽幽子,20";
        convert(s1, s -> s.split(",")[1], Integer::parseInt, s -> String.valueOf(s + 70));
    }

    private static void convert(String s, Function<String, String> fun, Function<String, Integer> fun2, Function<Integer, String> fun3) {
        String a = fun.andThen(fun2).andThen(fun3).apply(s);
        System.out.println(a);

    }
}
