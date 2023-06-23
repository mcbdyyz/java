package 总集合分类.LinkedHash集合特点;

import java.util.LinkedHashSet;

/**
 * LinkedHashSet集合特点
 *  1.哈希表和链表实现的Set接口，具有可预测的迭代次序
 *  2.由链表保证元素有序，也就是说元素的存储和取出的顺序是一致的
 *  3.由哈希表保证元素唯一，也就是说没有重复的元素
 * */
public class Demo {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Hello");
        linkedHashSet.add("world");
        linkedHashSet.add("java");

        linkedHashSet.add("world");

        for(String i : linkedHashSet)
        {
            System.out.println(i);
        }
    }
}
