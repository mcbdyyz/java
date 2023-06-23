package 总集合分类.List集合特点.列表迭代器Listiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * ListIterator常用方法
 * E next():返回迭代中的下一个元素
 * boolean hasNext():如果迭代具有更多元素，则返回true
 *
 * E previous():返回列表中的上一个元素
 * boolean hasPrevious():如果此列表迭代器在相反方向遍历列表时具有更多元素，则返回true
 * void add(E e):将指定的元素插入列表
 * */
public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("yyz1");
        list.add("yyz2");
        list.add("yyz3");
        ListIterator<String> stringListIterator = list.listIterator();
        while(stringListIterator.hasNext()){
            String next = stringListIterator.next();
            System.out.println(next);
        }//正向遍历
        System.out.println("--------------------");
        while(stringListIterator.hasPrevious()){
            String previous = stringListIterator.previous();
            System.out.println(previous);
        }//反向遍历
        System.out.println("----------这个还能add哦----------");
        while(stringListIterator.hasNext()){
            String next = stringListIterator.next();
            if(next.equals("yyz2")){
                stringListIterator.add("yyz4");
            }
            System.out.println(next);//原本的遍历内容不会变化
        }
        System.out.println(list);//但是原来的产生了变化，还是在next()选择的背后
    }
}
