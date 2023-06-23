package Map集合.ArrayList集合存储HashMap;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
    HashMapArray();
    ArrayHashMap();


    }
    /**
        用ArrayList存储HashMap这个键值对，然后遍历
     */
    public static void ArrayHashMap (){
        System.out.println("----------------");
        ArrayList<HashMap<String,String>> ar = new ArrayList<>();
        HashMap<String,String> hash = new HashMap<String,String>();
        hash.put("yyz","ym");
        hash.put("mls","lm");
        ar.add(hash);
        HashMap<String,String> hash1 = new HashMap<String,String>();
        hash1.put("yyz1","ym1");
        hash1.put("mls1","lm1");
        ar.add(hash1);
        HashMap<String,String> hash2 = new HashMap<String,String>();
        hash2.put("yyz2","ym2");
        hash2.put("mls2","lm2");
        ar.add(hash2);

//        for(HashMap<String,String> i: ar){
//            //下面这个可以吧HashMap也遍历出来
//            Set<Map.Entry<String, String>> entries = i.entrySet();
//            for(Map.Entry<String,String> me : entries){
//                String key = me.getKey();
//                String value = me.getValue();
//                System.out.println(key+","+value);
//            }
//            //这个只是把ar中的HashMap这个对象给打印出来了，因为有toString方法重写，所以才能看到这个内容
////            System.out.println(i);
//
//        }
        // todo 遍历方法二
        //先得出HashMap的内容，然后获取key，使用keySet()方法,再反复通过get()方法来获得HashMap中，键对应的值
        for(HashMap<String,String> mow :ar){
            for(String s : mow.keySet()){
                String s1 = mow.get(s);
                System.out.println(s+","+s1);

            }
            System.out.println("-------");
        }
    }
    /**
     * 用HashMap存储ArrayList这个集合，然后遍历
     * */
    public static void HashMapArray(){
        ArrayList<String> arrayList = new ArrayList<>();
        Map<Integer,ArrayList<String>> map = new HashMap<Integer,ArrayList<String>>();
        arrayList.add("yyz");
        arrayList.add("yyz2");
        map.put(1,arrayList);
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("yyz3");
        arrayList1.add("yyz4");
        map.put(2,arrayList1);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("yyz5");
        arrayList2.add("yyz6");
        map.put(3,arrayList2);

        Set<Integer> integers = map.keySet();
        Collection<ArrayList<String>> values = map.values();
        System.out.println(integers);
        System.out.println(values);

        for(Integer i : map.keySet()){
            ArrayList<String> arrayList3 = map.get(i);
            System.out.print(i+",");
            for(String s :arrayList3) {
                System.out.print(s+" ");

            }
            System.out.println("");
        }
//        Set<Map.Entry<Integer, ArrayList<String>>> entries = map.entrySet();
    }
}
