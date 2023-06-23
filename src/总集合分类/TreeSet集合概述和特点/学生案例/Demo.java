package 总集合分类.TreeSet集合概述和特点.学生案例;

import java.util.TreeSet;
/**
 * 给添加的内容进行排序，按照年龄从小到大，年龄相同时按照字母顺序排序，
 * */
public class Demo {
    public static void main(String[] args) {


        TreeSet<Student> ts = new TreeSet<Student>();
        Student s1 = new Student("yyz", 200);
        Student s2 = new Student("uuz", 1100);
        Student s3 = new Student("ym", 18);
        Student s4 = new Student("byz", 100);


//        for(int i = 0; i<10;i++) {
//            s1 = new Student("yyz"+i,18+i);
////            System.out.println(s1.getName()+","+s1.getAge());
//            ts.add(s1);
//        }
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        for(Student i:ts){
            System.out.println(i.getName()+","+i.getAge());
        }


    }
}
