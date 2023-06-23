package 哈希值;
/**
 *  哈希值：
 *      是JDK根据对象的地址或者字符串或者数字算出来的int类型的数值
 *
 *    Object类中有一个方法可以获得对象的哈希值
 *      public inthashCode();返回对象的哈希值
 * */
public class Demo {
    public static void main(String[] args) {
        Student student = new Student();

        //它们两个相等
        System.out.println(student.hashCode());//2129789493
        System.out.println(student.hashCode());//2129789493

        System.out.println("-----");
        //默认情况下hash值是不同的，但是重写可以改变哈希值，
        Student s1 = new Student();
        System.out.println(s1.hashCode());

        System.out.println("------------");
        System.out.println("hello".hashCode());//99162322
        System.out.println("world".hashCode());//113318802
        System.out.println("java".hashCode());//3254818
        System.out.println("----中文-----");//todo // 重写了，又没完全重写
        System.out.println("重地".hashCode());//1179395

        System.out.println("通话".hashCode());//1179395
        System.out.println("王的".hashCode());//947289
    }
}
