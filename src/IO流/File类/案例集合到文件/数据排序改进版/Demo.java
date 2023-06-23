package IO流.File类.案例集合到文件.数据排序改进版;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
/**
 * 把成绩从高到低排序
 * */
public class Demo {
    public static void main(String[] args) throws IOException {
        TreeSet<Student> treeSet = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s2.sum()-s1.sum();
                int num2 = num==0?s1.getChinese()-s2.getChinese():num;
                int num3 = num2==0?s1.getMath()-s2.getMath():num2;
                int num4 = num3 ==0?s1.getName().compareTo(s2.getName()):num3;
                return num4;
            }
        });
        for (int i = 0; i < 2; i++) {
            Scanner s = new Scanner(System.in);
            System.out.println("请录入第"+(i+1)+"个学生信息");
            System.out.println("学生姓名：");
            String name = s.nextLine();
            System.out.print("语文成绩：");
            int chinese = s.nextInt();
            System.out.println();
            System.out.print("数学成绩：");
            int math = s.nextInt();
            System.out.println();
            System.out.print("英语成绩：");
            int english = s.nextInt();
            System.out.println();
            Student st = new Student(name,chinese,math,english);
            treeSet.add(st);
        }
        BufferedWriter bfw = new BufferedWriter(new FileWriter("src\\IO流\\File类\\案例集合到文件\\数据排序改进版\\Student.txt"));
        for(Student s: treeSet){
            StringBuilder sb = new StringBuilder();
            sb.append(s.getName()).append(",").append(s.getChinese()).append(",").append(s.getMath()).append(",")
                    .append(s.getEnglish()).append(",").append(s.sum());
            bfw.write(sb.toString());
            bfw.newLine();
            bfw.flush();

        }
        bfw.close();
    }
}
