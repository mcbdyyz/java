package 学生管理系统;

import java.util.ArrayList;
import java.util.Scanner;

public class SMain {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> array = new ArrayList<Student>();
        while (true) {
            System.out.println("-----欢迎来到学生管理系统-----");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            switch (line) {
                case "1":
//                    System.out.println("添加学生");
                    addStudent(array);
                    break;

                case "2":
//                    System.out.println("删除学生");
                    deleStudent(array);
                    break;
                case "3":
//                    System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "4":
//                    System.out.println("查看所有学生");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    System.exit(0);
                    break;
            }
        }
    }

    //定义添加学生的方法
    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        String sid;
       while (true){

           System.out.println("请输入学生学号：");
            sid = sc.nextLine();

           boolean flag = isUsed(array,sid);
           if(flag){
               System.out.println("你输入的学号已经被使用，请重新输入");

           }
           else{
               break;

           }
       }
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();
        //创建学生对象，把键盘录入的数据赋值给学生的成员变量
        Student st = new Student();
        st.setSid(sid);
        st.setName(name);
        st.setAge(age);
        st.setAddress(address);
        //将学生对象添加到集合中
        array.add(st);
        //
        System.out.println("添加成功");


    }
    //判断添加学生信息的学号是否存在
    public static boolean isUsed(ArrayList<Student> array,String sid){
        boolean flag= false;
        for (int i=0;i<array.size();i++){
            Student s = array.get(i);
            if (s.getSid().equals(sid)){
                flag = true;
                break;
            }
        }
        return flag;


    }    //定义查看所有学生的方法
    public static void findAllStudent(ArrayList<Student> array) {
        //判断集合是否有数据
        if (array.size() == 0) {
            System.out.println("无信息，请输入信息再查询");
            return;
        }

        System.out.println("学号\t\t姓名\t\t年龄\t\t居住地");
        //遍历集合取出数据
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t" + s.getAddress());

        }
    }

    //删除学生的方法
    public static void deleStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要删除的学生学号");
        String sid = sc.nextLine();
        //遍历集合将对应学生对象从集合中删除
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            Student s =array.get(i);
            if(sid.equals(s.getSid())){
                index = i;//存入相同的序列，
            }

        }
        if(index==-1){
            System.out.println("该信息不存在");
        }
        else{
            array.remove(index);
        }

        //forEach
//        array.forEach(i -> {
//            if(sid.equals(i.getSid())){
//
//            }
//        });
        //给出删除成功提示
        System.out.println("删除成功");

    }
    //修改学生信息方法
    public static void updateStudent(ArrayList<Student> array){
        //输入要修改的学生学号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生学号：");
        String sid = sc.nextLine();

        System.out.println("请输入新学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入新学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入新学生居住地：");
        String address = sc.nextLine();
        //创建学生对象，把键盘录入的数据赋值给学生的成员变量

        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //遍历集合
//        array.forEach(i->{
//            if(sid.equals(i.getSid())){
//                array.set(,s);
//            }
//        });
        for(int i=0;i<array.size();i++){
            Student st =array.get(i);
            if(sid.equals(st.getSid())){
                array.set(i,s);
                break;
            }
        }
        //修改成功提示
        System.out.println("修改成功");
    }
}
