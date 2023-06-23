package 内部类.成员内部类;

public class Test {
    public static void main(String[] args) {
        //创建内部类对象并调用方法
//        Inner io = new Inner();错误方法
//        Demo.Inner io = new Demo().new Inner();
//        io.show();//todo 这种方法别人会直接访问到，就藏不住

        Demo d = new Demo();
        d.method();// todo 这样用类中的方法调用内部类

    }
}
