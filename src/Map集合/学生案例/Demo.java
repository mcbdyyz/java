package Map集合.学生案例;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        Map<String,Student> map = new HashMap<String,Student>();
        Student s = new Student("yyz",18);
        Student s1 = new Student("yyz1",182);
        Student s2 = new Student("yyz2",181);
        Student s3 = new Student("yyz3",183);
        Student s4 = new Student("yyz3",183);

        map.put("001",s);
        map.put("002",s1);
        map.put("003",s2);
        map.put("004",s3);
        map.put("006",s4);
        for(String set : map.keySet()){
            System.out.println(set);
        }
        for(Student set1 :  map.values()){
            System.out.println(set1.getName()+"  "+ set1.getAge());
        }
        Set<Map.Entry<String, Student>> set = map.entrySet();
        for(Map.Entry<String,Student> me: set){
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key+"  "+value.getName()+" "+value.getAge());

        }
    }
}
