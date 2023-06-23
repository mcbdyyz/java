package 总集合分类.Collection集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection是接口，继承自Iterable<E>
 *
 * Collection单列集合，List集合可重复，Set不可重复
 * List后面有：ArrayList,LinkedList,...
 * Set:HashSet,TreeSet...
 *
 * Map：双列
 * HashMap...
 *
 * Collection常用方法
 * boolean add(E e)添加元素
 * boolean remove(Object o):从集合中移除指定的元素
 * void clear():清空集合中的元素
 * boolean contains(Object 0):判断集合中是否存在指定的元素
 * boolean isEmpty():判断集合是否为空
 * int size():集合的长度，也就是集合中元素的个数
 * 集合遍历方法
 * Iterator 迭代器
 * */
public class Demo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("uuz");//添加元素
        c.add("xxs");
        System.out.println(c);
        //todo 多态的方法录入信息，然后输出，ArrayList重写了Collection的方法

        //创建
        Collection<String> c1 = new ArrayList<String>();
        //todo boolean add(E e)
        c1.add("yyz");
        c1.add("ym");
        c1.add("lm");
        c1.add("Holle");
        System.out.println(c1);
        //todo boolean remove(Object o)
        c1.remove("yyz");
        System.out.println(c1);
        //todo void clear()
        c1.clear();
        System.out.println(c1);
        //todo boolean contains(Object 0)
        System.out.println(c1.contains("ym"));
        //todo boolean isEmpty():判断集合是否为空
        System.out.println(c1.isEmpty());

        //todo int size():集合的长度，也就是集合中元素的个数
        System.out.println(c1.size());
        //使用迭代器，用hasNext()来判断集合内是否还有东西，next()来下一个
        Iterator<String> iterator = c.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
