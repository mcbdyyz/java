package 基础的API.Object.equals方法;
/**
 * 测试类
 * public boolean equals (Object obj)：指示一些其他对象是否等于此
 * */
public class Demo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("uuz");
        s.setAge(18);
        System.out.println(s);

        Student s1 = new Student();
        s1.setName("uuz");
        s1.setAge(18);
        System.out.println(s1);
        // 需求：比较两个对象的内容是否相同
        System.out.println(s.equals(s1));//s和s1代表的地址值，是不可能相等的,重写equals方法后内容相同则可以对比
        //
        System.out.println(s.equals(s1));
    }
}
