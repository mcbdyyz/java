package 函数式接口.Predicate接口;

import java.util.function.Predicate;

/**
 * Predicate是对应参数进行判断的，返回一个布尔值
 * boolean test(T t):对给定的参数进行判断（判断逻辑由lambda表达式实现），返回一个布尔值
 * default Predicate<T> negate():返回一个逻辑的否定，对应逻辑非
 * default Predicate<T> and(Predicate other):返回一个组合判断，对应短路与
 * default Predicate<T> or(Predicate other):返回一个组合判断，对应短路或
 * Predicate<T> 接口通常用于判断参数是否满足指定的条件
 * *        *
 */
public class Demo {
    public static void main(String[] args) {
        uTest("yyz", (s -> {

            boolean b = s.length() >= 3;
            System.out.println(b);
            return b;
        }));
        uTest("lm", (s -> {
            boolean b = s.length() >= 3;
            System.out.println(b);
            return b;
        }));
        //省略写法
        boolean mcbdyyz = uTest("mcbdyyz", s -> s.length() > 5);
        System.out.println(mcbdyyz);

        Predicate<String> pr = ((s) -> s.length() > 5);
        System.out.println(pr);

        //AND
        boolean b2 = uTest2("yyz", s -> s.length() >= 3, s -> s.length() < 2);
        System.out.println(b2);//结果为False//or为true

        boolean b3 = uTest2("mcbdyyz", s -> s.length() > 5, s -> s.length() < 20);
        System.out.println(b3);//结果为True//or为true

    }

    //判断给定的字符串是否满足要求
    private static boolean uTest(String s, Predicate<String> a) {
//        return a.test(s);
        //要对test逻辑非
        return a.negate().test(s);

    }

    //and方法的使用,同一个字符串给出两个不同的判断条件，最后把这两个判断的结果做逻辑与运算的结果作为最终的结果
    private static boolean uTest2(String s, Predicate<String> pr1, Predicate<String> pr2) {
        return pr1.and(pr2).test(s);
        //or方法的使用，逻辑或，
//        return pr1.or(pr2).test(s);
    }


}
