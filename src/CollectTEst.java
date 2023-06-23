import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectTEst {
    public static void main(String[] args) {
        ArrayList<Phone> arrayPhones = new ArrayList<Phone>();
        Phone p1 = new Phone("华为",2000);
        Phone p2 = new Phone("小米",2000);
        Phone p3 = new Phone("Vivo",2000);
        Phone p4 = new Phone("菠萝",2000);
        Phone p5 = new Phone("魅族",2000);
        Phone p6 = new Phone("华为",2000);
        System.out.println(p1);
        System.out.println(p6);
        arrayPhones.add(p1);
        arrayPhones.add(p2);
        arrayPhones.add(p3);
        arrayPhones.add(p4);
        arrayPhones.add(p5);
        arrayPhones.add(p6);
        System.out.println("第一种集合遍历");

        for(int i = 0; i<arrayPhones.size();i++){
            System.out.println("手机名字："+arrayPhones.get(i).name
            + "手机价格"+ arrayPhones.get(i).price);

        }
        System.out.println("第二种集合遍历");
        for(Phone phone :arrayPhones){
            System.out.println("手机名字："+phone.name
                    + "手机价格"+ phone.price);
        }
        System.out.println("第三种集合遍历");
        Iterator<Phone> iterator = arrayPhones.iterator();
        while(iterator.hasNext())
        {
            Phone phone = iterator.next();
            System.out.println("手机名字："+phone.name
                    + "手机价格"+ phone.price);
        }
        //作业LinkeList
        LinkedList<Phone> link = new LinkedList<>();
        link.add(p1);
        link.add(p2);
        link.add(p3);
        link.add(p4);
        link.add(p5);
        link.add(p6);
        System.out.println(link.toString());
        link.addFirst(p3);
        System.out.println(link.getFirst());
        link.remove(3);
        link.removeFirst();
        for(int i = 0; i<link.size();i++){
            System.out.println("手机名字："+link.get(i).name
                    + "手机价格"+ link.get(i).price);
        }
        for(Phone phone :link){
            System.out.println("手机名字："+phone.name
                    + "手机价格"+ phone.price);
        }
        Iterator<Phone> iterator1 = link.iterator();
        while(iterator1.hasNext())
        {
            Phone phone = iterator1.next();
            System.out.println("手机名字："+phone.name
                    + "手机价格"+ phone.price);
        }
        System.out.println("=====HashSet遍历=====");
        Phone p7 =p1;
        HashSet<Phone> hset = new HashSet<Phone>();
        hset.add(p1);
        hset.add(p2);
        hset.add(p3);
        hset.add(p4);
        hset.add(p5);
        hset.add(p7);
        for(Phone phone:hset){
            System.out.println("手机名字："+phone.name
                    + "手机价格"+ phone.price);
        }
        //作业: 迭代器遍历hset集合
        Iterator<Phone> iterator2 = hset.iterator();
        while(iterator2.hasNext())
        {
            Phone phone = iterator2.next();
            System.out.println("手机名字："+phone.name
                    + "手机价格"+ phone.price);
        }

    }
}
