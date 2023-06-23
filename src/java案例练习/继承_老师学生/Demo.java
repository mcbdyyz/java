package java案例练习.继承_老师学生;

public class Demo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("uuz");
        t1.setAge(18);
        System.out.println(t1.getName()+"\t"+t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("yyz",19);
        System.out.println(t2.getName()+"\t"+t2.getAge());
        t2.teach();
    }
}
