package Collections类;

import java.util.Collections;

public class Student {
    private String name;
    private int dr;

    public Student(String name, int dr) {
        this.name = name;
        this.dr = dr;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDr() {
        return dr;
    }

    public void setDr(int dr) {
        this.dr = dr;
    }

}
