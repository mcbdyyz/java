package 总集合分类.TreeSet集合概述和特点.学生案例;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
/**
 * 正数正常排序，负数倒着来，0就扔掉
 * */
    @Override
    public int compareTo(Student s) {
//        return 1;
//        return -1;
//        return 0
       int num = this.age - s.age;
       int num2 = num==0?this.name.compareTo(s.name):num;
       return  num2;

    }

}
