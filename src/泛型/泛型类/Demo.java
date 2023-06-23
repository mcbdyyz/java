package 泛型.泛型类;
/**
 * 一般方法传入的数据的类型都是定义好的，无法传入非给定类型的内容
 * */
public class Demo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("yyz");

        System.out.println(s.getName());

        Teacher t = new Teacher();
        t.setAge(30);
        System.out.println(t.getAge());
        System.out.println("----------------");
        FanXing<String> f = new FanXing<>();
        f.setT("uuz");
        System.out.println(f.getT());

        FanXing<Integer> f1 = new FanXing<>();
        f1.setT(114514);
        System.out.println(f1.getT());

        FanXing<Boolean> f2 = new FanXing<>();
        f2.setT(true);
        System.out.println(f2.getT());
    }
}
