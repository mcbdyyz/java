package 总集合分类.TreeSet集合概述和特点.成绩排序;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private int Chinese;
    private int math;

    public Student (){}

    public Student(String name, int chinese, int math) {
        this.name = name;
        Chinese = chinese;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public int compareTo(Student s) {
        int num = (this.getChinese()+this.getMath())-(s.getChinese()+s.getMath());
        return num==0? this.getName().compareTo(s.getName()):num;

    }
}
