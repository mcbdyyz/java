package 特殊操作流.对象序列化.对象序列化流;

import java.io.Serializable;
/**
 * 要序列化对象，必须要调用Serializable接口，而这个接口不用重写方法，仅作为标记
 * */
public class Student implements Serializable {
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
}
