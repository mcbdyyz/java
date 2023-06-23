package 泛型;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 泛型：是JDK5中引入的特性，它提供了编译时类型安全检测机制，该机制允许在编译时检测到非法的类型，它的本质是参数化类型
 * 也就是操作的数据类型被定义为一个参数，
 * 一提到参数，最熟悉的就是定义方法时有形参，然后调用此方法时传递实参，那么参数化类型怎么理解？
 * 顾名思义，就是将类型由原来的具体的类型参数化，然后再使用/调用时传入具体的类型
 * 这种参数类型可以用在类、方法和接口中，分别被称为泛型类，泛型方法，泛型接口
 *
 * 泛型定义格式：
 *      <类型>: 指定一种类型的格式，这里的类型可以看成是形参
 *      <类型1，类型3.。。>:指定多种类型的格式，多种类型之间用逗号隔开，这里的类型可以看成是形参
 *
 * 泛型的好处：
 *      把运行时期的问题提前到了编译期间
 *      避免了强制转换
 * */
public class Demo {
    public static void main(String[] args) {
        //这里创建集合对象，但是没有进行给定类型，所以默认为Object,
//        Collection c = new ArrayList();
        //如果给定了类型，就会限定为这一个类型，这就是泛型的指定格式，它可以提前判断存入类容的错误
        Collection<String> c = new ArrayList<String>();

        c.add("uuz");
        c.add("yyz");
        c.add("lm");

        Iterator iterator = c.iterator();
        while(iterator.hasNext()){//可以强转成各种类型
//            Object next = iterator.next();
//            System.out.println(next);

            String s = (String)iterator.next();
            System.out.println(s);
        }
    }
}
