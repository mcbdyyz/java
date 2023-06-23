package 总集合分类.TreeSet集合概述和特点;

import java.util.TreeSet;

/**
 * TreeSet集合特点
 *  1：元素有序，这里的顺序不是指存储和取出的循环，而是按照一定的规则进行排序，具体排序方式取决于构造方法
 *      TreeSet（）：根据其元素的自然排序
 *      TreeSet(Comparator comparator):根据指定的比较器进行排序
 *  2、没有带索引的方法，所以不能使用普通for循环遍历
 *  3、由于是Set集合，所以不包含重复元素的集合
 * */
public class Demo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        System.out.println(40);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(50);
        treeSet.add(20);

        for(Integer i : treeSet){
            System.out.println(i);
        }

    }
}
