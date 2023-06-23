package java案例练习.继承_老师学生;

public class Teacher extends Person{
    public Teacher(){}
    public Teacher(String name, int age){
        super(name,age);
    }
    public void teach(){
        System.out.println("yyz教你做人");
    }
}
