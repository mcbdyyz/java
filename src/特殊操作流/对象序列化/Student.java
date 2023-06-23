package 特殊操作流.对象序列化;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private transient int age;//这样这个成员变量将不会被序列化
    private static final long serialVersionUID =42L;
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
}
