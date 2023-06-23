import java.util.*;

public class MapTest {
    public static void main(String[] args)
    {
        HashMap<String, Phone> hMap = new HashMap<String, Phone>();
        Phone p1 = new Phone("华为",2000);
        Phone p2 = new Phone("小米",2000);
        Phone p3 = new Phone("Vivo",2000);
        Phone p4 = new Phone("菠萝",2000);
        Phone p5 = new Phone("魅族",2000);
        hMap.put("hw",p1);
        hMap.put("xm",p2);
        hMap.put("vv",p3);
        hMap.put("pl",p4);
        hMap.put("mz",p5);
        System.out.println(hMap.size());
        System.out.println(hMap.get("xm").name);
        Set<String> set =hMap.keySet();
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String strKey = iterator.next();
            System.out.println("手机名字："+hMap.get(strKey).name
                    + "手机价格"+ hMap.get(strKey).price);
        }
        System.out.println("===============");
        //values()用法
        Collection<Phone> setValueSet = hMap.values();
        Iterator<Phone> iterator1 = setValueSet.iterator();
        while(iterator1.hasNext())
        {
            Phone jphone = iterator1.next();
            System.out.println("手机名字："+jphone.name
                    + "手机价格"+ jphone.price);
        }

        //作业：HashTable完成上面用法
        Hashtable<String, Phone> balance = new Hashtable<String,Phone>();
        balance.put("hw",p1);
        balance.put("xm",p2);
        balance.put("vv",p3);
        balance.put("pl",p4);
        balance.put("mz",p5);
        System.out.println(balance.size());
        System.out.println(balance.get("hw").name);
        Collection<Phone> setbalance = balance.values();
        Iterator<Phone> iterator2 = setbalance.iterator();
        while(iterator2.hasNext()){
            Phone bphone = iterator2.next();
            System.out.println("手机名字是："+ bphone.name
            +"  "+"手机价格是"+bphone.price);
        }
        System.out.println("=============");
        balance.forEach((k, v) -> {
            System.out.println("手机名字是："+ v.name
                    +"  "+"手机价格是"+v.price);
        });

        Map<Integer,String> map = new HashMap<Integer,String>();
    }
}
