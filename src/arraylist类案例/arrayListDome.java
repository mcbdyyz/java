package arraylist类案例;

import java.util.ArrayList;

public class arrayListDome {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        //public boolean add(E e)//将指定元素添加到集合的末尾，也可以插入指定位置，
        arrayList.add("uuz");
        arrayList.add("uuz1");
        arrayList.add("xxs");
        System.out.println(arrayList);
        //指定位置
        arrayList.add(3,"uuz2");
        System.out.println(arrayList);
        arrayList.add(1,"yyz");
        System.out.println(arrayList);

        //删除集合指定元素和返回指定索引处的元素
        //public boolean remove(Object o)//会返回TRUE或false
        arrayList.remove("uuz");
        System.out.println(arrayList);

        arrayList.remove(1);
        System.out.println(arrayList);

        //修改元素
        //public E set(int index,E element);修改指定索引处元素，返回被修改的元素
        System.out.println(arrayList.set(2,"uuz3"));
        System.out.println(arrayList);

    }
}
