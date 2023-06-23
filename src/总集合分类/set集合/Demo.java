package 总集合分类.set集合;

import java.util.HashSet;
import java.util.Set;

/**
 * set集合的特点
 *     不包含重复元素的集合
 *     没有带索引的方法，所以不能使用普通for循环遍历
 *
 *     HashSet:对集合的迭代顺序不作任何保证
 * */
public class Demo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        set.add("java");
        //不包重复元素
        set.add("hello");

        for(String i :set){
            System.out.println(i);//这存储时不是正序存储，是随机的
        }
    }
}
