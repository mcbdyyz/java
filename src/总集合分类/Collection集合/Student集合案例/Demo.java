package 总集合分类.Collection集合.Student集合案例;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {

        Collection<Student> cl =new ArrayList<Student>();
        Student s = new Student("yyz",18,"女");
        Student s1 = new Student("yyz1",18,"女");
        Student s2 = new Student("yyz2",18,"女");
        Student s3 = new Student("yyz3",18,"女");
        cl.add(s);
        cl.add(s1);
        cl.add(s2);
        cl.add(s3);

        Iterator<Student> iterator = cl.iterator();
        while(iterator.hasNext()){
            Student next = iterator.next();
            System.out.println(next.getName()+" \t"+next.getSex()+"\t"+next.getAge());
        }
    }
}
