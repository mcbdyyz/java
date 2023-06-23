package 基础的API.Object.equals方法;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    public Student(){

    }
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString(){
        return "Student{"+
                "name="+name+'\''+
                "age="+age+'\''+
                '}';

    }

    @Override
    public boolean equals(Object o) {
        /**
         * this ----s
         * o ----s1
         * */
        //比较两个地址是否相同，如果地址相同则直接返回true
        if (this == o) return true;
        //判断参数是否为null
        //判断两个对象是否来自于同一个类
        if (o == null || getClass() != o.getClass()) return false;
        //向下转型
        Student student = (Student) o;
        //比较年龄
        if (age != student.age) return false;
        //比较名字
        return name != null ? name.equals(student.name) : student.name == null;
    }
}
