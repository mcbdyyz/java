package Lambda表达式.方法引用.引用构造器;

public class Demo {
    public static void main(String[] args) {
        useStudentBuilder((s,y)->new Student(s,y));

        //方法引用,构造器
        useStudentBuilder(Student::new);
    }
    private static void useStudentBuilder(StudentBuilder St){
        Student yyz = St.build("yyz", 18);
        System.out.println(yyz.getName()+","+yyz.getAge());
    }
}
