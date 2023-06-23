package 总集合分类.TreeSet集合概述和特点.Comparator比较器;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 存储学生对象并遍历，创建TreeSet集合使用带参构造方法
 * 要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
 *
 * 用TreeSet集合存储自定义对象，带参构造方法使用的是比较器排序对元素进行排序的
 * 比较器排序，就是让集合构造方法接受Comparator的实现类对象，重写compare(T o1,T o2)方法
 * 重写方法时，一定要注意排序规则必须按照要求的主要条件和次要条件来写
 * */
public class Demo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                //this.age -s.age
                //s1,s2
                int num =s1.getAge()-s2.getAge();
                int num2 = num==0?s1.getName().compareTo(s2.getName()):num;
                return num2;
            }
        });
        Student s1 = new Student("yyz", 200);
        Student s2 = new Student("uuz", 1100);
        Student s3 = new Student("ym", 18);
        Student s4 = new Student("byz", 100);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        for(Student i:ts){
            System.out.println(i.getName()+","+i.getAge());
        }
    }
}
