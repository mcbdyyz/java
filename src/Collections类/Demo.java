package Collections类;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections类的概述
 *      是针对集合操作的工具类
 * Collections类的常用方法
 *          public static <T extends Comparable<? super T>> void sort(List<T> list):将指定的列表按升序排序
 *          public static void reverse(List<?> list):反转指定列表中元素的顺序
 *          public static void shuffle (List<?> list):使用默认的随机源随机排列指定的列表
 * */
public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(60);
        list.add(10);

        System.out.println(list);
        //todo 将指定的列表按升序排序
        Collections.sort(list);
        System.out.println(list);
        //todo 反转指定列表中元素的顺序
        Collections.reverse(list);
        System.out.println(list);
        //todo 使用默认的随机源随机排列指定的列表
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println("------------");
        ArrayCollections();


    }/**
        在ArrayList中传入Student对象，然后用Collections()方法来排序，
     但是因为Student中没有特定方法，所以还是重写comparator<>()方法来指定规则排序
     */
    public static void ArrayCollections(){
        ArrayList<Student> list = new ArrayList<>();
        Student s = new Student("yyz",18);
        Student s1 = new Student("yyz1",230);
        Student s2 = new Student("yyz2",22);
        Student s3 = new Student("yyz3",30);
        list.add(s);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s1.getDr()-s2.getDr();
                int num2 = num==0?s1.getName().compareTo(s2.getName()):num;
                return num2;
            }
        });

        for(Student i:list) {

            System.out.println(i.getName()+","+i.getDr());
        }
    }
}
