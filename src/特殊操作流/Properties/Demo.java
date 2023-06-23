package 特殊操作流.Properties;

import java.util.Properties;
import java.util.Set;

/**
 * Properties作为Map集合的使用
 *      作为集合的特有方法
 *          Object setProperty(String key,String value):设置集合的键和值，都是String类型，底层调用Hashtable方法 put
 *
 *          String getProperty(String key):使用此属性列表中指定的键搜索属性
 *
 *          Set<String> stringPropertyNames():不从该属性列表中返回一个可修改的键集，其中键及其对应的值是字符串
 *
 * */
public class Demo {
    public static void main(String[] args) {
//        Properties<String,String> prop = new Properties();//错误写法
        Properties prop = new Properties();

        prop.put("yyz",18);
        prop.put("uuz",19);
        prop.put("xxs",20);

        Set<Object> keySet = prop.keySet();
        for(Object key:keySet){
            Object o = prop.get(key);
            System.out.println(key+","+o);
        }
        method();
    }
    /**
     * Properties特有方法的演示
     * */
    public static void method(){
        Properties prop = new Properties();
        prop.setProperty("吃不饱","的幽幽子");
        prop.setProperty("yyz","cbl");
//        public synchronized Object setProperty(String key, String value) {
//            return put(key, value);
//        }
        //String getProperty(String key):使用此属性列表中指定的键搜索属性
        System.out.println(prop.getProperty("yyz"));//对找到对应的值
        System.out.println(prop.getProperty("114514"));//这样会因为集合中没有，查询为null

        System.out.println("-----------------");
        Set<String> strings = prop.stringPropertyNames();//获取所有的键
        for(String key:strings){
            String property = prop.getProperty(key);
            System.out.println(key+","+property);
        }
        System.out.println(prop);
    }
}
