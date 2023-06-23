package final和static用啊.static用法;

/**
 *
 */
public class Student {
    /**
     * 可以访问静态成员变量
     * 可以访问非静态成员变量
     * 可以访问静态成员方法
     * 可以访问非静态的成员方法
     */
    /**
     * 静态只能访问静态成员方法和变量
     * */
    public String name;
    public int age;
    public static String university;
    public void show(){
        System.out.println(name+","+age+","+university);
    }
//     TODO:非静态的成员方法

    public static void main(String[] args) {

    }
}
