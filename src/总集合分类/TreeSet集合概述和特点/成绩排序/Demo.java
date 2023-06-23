package 总集合分类.TreeSet集合概述和特点.成绩排序;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

/**
 * 要求：用TreeSet集合存储多个学生信息(姓名，语文成绩，数学成绩)，并遍历该集合，
 * 按照总分从高到低排序
 * */
public class Demo {
    public static void main(String[] args) {
        //todo 方法一：使用匿名内部类的方法重写Comparator()方法
/*        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {

                int num = (s1.getChinese()+s1.getMath())-(s2.getChinese()+s2.getMath());
                int num2 = num==0?s1.getName().compareTo(s2.getName()):num;
                return num2;
//                return 1;
            }
        });*/
        TreeSet<Student> ts = new TreeSet<Student>();
        //todo 方法二：在Student中实现接口，用重写的方法来实现Comparator()方法
        Student s = new Student();
        for (int i = 0; i < 4; i++) {
            Random r = new Random();
            s = new Student("yyz"+i,r.nextInt(100),r.nextInt(100));
            System.out.println(s.getChinese()+","+s.getMath());
            ts.add(s);
        }
        s = new Student("yyz10086",114514,114514);
        ts.add(s);
        s = new Student("uuz10086",114514,114514);
        ts.add(s);
        s = new Student("uuz10086",114514,114514);
        ts.add(s);//这个因为重复，不会录入
        for(Student s1 :ts){
            System.out.println("学生姓名："+s1.getName()+
                    "\t语文成绩："+s1.getChinese()+
                    "\t数学成绩"+s1.getMath()+
                    "\t总分："+(s1.getMath()+s1.getChinese()));

        }


    }
}
