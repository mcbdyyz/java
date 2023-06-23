package 总集合分类.TreeSet集合概述和特点.Comparator比较器;

public class Student {
    private String name;
    private int age;
    public Student(){}

    public Student(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
