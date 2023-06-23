package Map集合.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        // V put(K key,V value)将指定的值与映射中的指定键相关联
        map.put("xxs","yyz");
        map.put("hmg","lmly");
        map.put("blss","lm");
        //若有重复，则以最后那个为准，来替换之前存在的值
        System.out.println(map);
        // V remove(Object key) 根据键来删除元素
        map.remove("blss");
        System.out.println(map);
        //
//        map.clear();//删除所以元素

        //boolean containsKey(Object key) 判断集合是否包含指定键
        System.out.println(map.containsKey("xxs"));
        //boolean containValue(Object value) 判断集合是否包含指定值
        System.out.println(map.containsValue("lmly"));
        //boolean isEmpty() 判断集合是否为空
        System.out.println(map.isEmpty());
        // int size()
        System.out.println(map.size());

        //todo Map集合的获取功能
        // V get(Object key) 根据键获取值
        System.out.println(map.get("xxs"));
        // Set<K> keySet() 获取所有键的集合
        System.out.println(map.keySet());
        //Collection<V> values() 获取所有值的集合
        System.out.println(map.values());
        //Set<Map.Entry<K,V>> entrySet() 获取所有键值对对象的集合
        System.out.println(map.entrySet());


        //遍历方法2
        Set<Map.Entry<String,String>> set = map.entrySet();
        for(Map.Entry<String,String> me : set){
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key+" "+ value);
        }
    }
}
