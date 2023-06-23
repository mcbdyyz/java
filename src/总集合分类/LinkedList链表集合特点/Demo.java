package 总集合分类.LinkedList链表集合特点;

import java.util.Iterator;
import java.util.LinkedList;
/**
 * LInkedList集合的特有功能
 *      public void addFirst(E e):在该列表开头插入指定元素
 *      public void addLast(E e):将指定的元素追加到此列表的末尾
 *      public E getFirst():返回此列表中的第一个元素
 *      public E getLast():返回此列表中的最后一个元素
 *      public E removeFirst():从此列表中删除并返回第一个元素
 *      public E removeLast（）:从此列表中删除并返回最后一个元素
 * */
public class Demo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");
        System.out.println("-----------");

        linkedList.addFirst("javaase");
        linkedList.addLast("uuz");
        System.out.println("-----------");

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println("-----------");

        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());


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
