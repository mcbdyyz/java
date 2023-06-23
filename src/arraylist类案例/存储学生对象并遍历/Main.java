package arraylist类案例.存储学生对象并遍历;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> arraylist = new ArrayList<>();
        //调用子函数来运用
        addStudent(arraylist);

        //================================================
        //用增强for来遍历，i为Student类型，然后遍历的对象为arraylist
        for (Student i: arraylist) {
            //通过get方法来输出内容
            System.out.println(i.getName()+","+i.getAge());
        }


        //===================================================
        //用迭代器Iterator来遍历
        Iterator<Student> iterator = arraylist.iterator();
        while (iterator.hasNext()){
            Student next = iterator.next();
            System.out.println(next);
        }

    }
    public static void addStudent(ArrayList<Student> arraylist){
        //因为arraylist是引用型的，所以不需要返回值，这里的修改会反应到上面
        System.out.println("请输入学生的姓名");
        //构造student
        Student student = new Student();
        //输入要的数并存起
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();

        System.out.println("请输入学生年龄");
        String age = s.nextLine();
        //吧存的东西赋值到构造的student中，然后再存到arraylist中，通过add；
        student.setName(name);
        student.setAge(age);
        arraylist.add(student);

    }
}
