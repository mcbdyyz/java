package 函数式接口;

import java.util.function.Supplier;
import java.util.stream.Stream;

/***
 * 函数式接口：有且仅有一个抽象方法的接口
 * java中的函数式编程体现就是lambda表达式，所以函数式接口就是可以适用于Lambda使用的接口
 * 只有确保接口中有且仅有一个抽象方法，java中的lambda才能顺利地进行推导
 *
 *      常用的函数式接口
 *          Supplier接口
 *          Consumer接口
 *          Predicate接口
 *          Function接口
 * 在lambda的调用中，不必一点要创建新的方法，可以通过实现接口然后用lambda方法来进行操作
 */

public class demo {
    public static void main(String[] args) {
        Interface my =()-> System.out.println("函数式接口");
        my.show();

        String s = getString(()->"yyz");
        System.out.println(s);

        Supplier<String> sup = ()->"yyz2";
        Object o = sup.get();
        System.out.println(o);


    }
    //Supplier接口
    private static String getString(Supplier<String> sup){
        return sup.get();
    }

}
