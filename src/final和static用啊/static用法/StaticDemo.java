package final和static用啊.static用法;

public class StaticDemo {
    public static void main(String[] args) {
        Student.university = "幻想乡·西行寺";
        Student s = new Student();
        s.name = "xxsyyz";
        s.age = 20;
//        s.university="湖北科技职业学院"; //定义static给university后，可以直接用Student类名来访问定义
        s.show();
        //------------
        Student s2 = new Student();
        s2.name ="uuz";
        s2.age = 18;
//        s.university =""
        s2.show();

    }


}
