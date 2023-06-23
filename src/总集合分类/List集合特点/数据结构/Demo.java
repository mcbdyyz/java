package 总集合分类.List集合特点.数据结构;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
    /**
     * 常见数据结构之栈
     *      数据进入栈模型的过程称为：压/进栈
     *      数据离开栈模型的过程称为：弹/出栈
     *      进ABCD   -->   出DCBA
     *
     *
     * 常见数据结构之队列
     *      数据从后端进入队列模型的过程称为：入队列
     *
     * --------------------------
     * List数组实现，和链表
     *      数组的特点：
     *      查询数据通过索引定位，查询任意数据耗时相同，查询效率高
     *      删除数据时，要将原始数据删除，同时后面每个元素前移，删除效率低
     *      添加数据时，添加位置后的每个数据后移，再添加元素，添加效率极低
     *
     *      链表的特点：
     *      链表是一种增删快的模型（对比数组）
     *      但是它的 todo 查询慢
     * ArrayList:底层数据结构是数组，查询快，增删慢
     * LinkedList:底层数据结构是链表，查询慢，增删快
     * */
    public static void main(String[] args) {
            ArrayList<String> array = new ArrayList<>();
            array.add("hello");
            array.add("world");
            array.add("java");
            //遍历

        for(String i :array){
            System.out.println(i);
        }
        System.out.println("--------two-------");
        //two
        Iterator<String> iterator = array.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("------three--------");
        //three
        for(int i=0;i<array.size();i++){
            System.out.println(array.get(i));
        }

        //LinkedList
        LinkedListDemo();

    }
    public static void LinkedListDemo(){
        System.out.println("------LinkedList------");
        LinkedList<String> linklist = new LinkedList<>();
        linklist.add("hello");
        linklist.add("world");
        linklist.add("java");

        //遍历
        for(String i : linklist){
            System.out.println(i);
        }
        System.out.println("-----two------");
        Iterator<String> iterator = linklist.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("-----three-------");
        for(int i=0 ;i<linklist.size();i++){
            System.out.println(linklist.get(i));
        }
    }
}
