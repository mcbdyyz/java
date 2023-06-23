package 反射.获取Class对象;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 要获取到该类的字节码文件对象，也就是类型为Class类型的对象
 *      1，使用类的Class属性来获取该类对应的Class对象，举例：Student.class 将返回Student类对应的Class对象
 *      2.调用对象的getClass()方法，返回该类对象所属类对应的Class对象
 *              该方法是Object类中的方法，所有的java对象都可以调用该方法
 *      3.使用Class类中的静态方法forName(String className),该方法需要传入字符串参数，该字符串参数的值是某个类的全路径，
 *      也就是完整包名的路径
 *
 *      //暴力反射
 *         //public void setAccessible (boolean flag):值为true，取消访问检查
 * */
public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Student> c1 = Student.class;
        System.out.println(c1);

        Class<Student> c2 = Student.class;
        System.out.println(c2==c1);//true 表示获取的class是一样的
        System.out.println("--------");

        Student s = new Student();
        Class<? extends Student> c3 = s.getClass();
        System.out.println(c1==c3);
        System.out.println("--------");

        Class<?> c4 = Class.forName("反射.获取Class对象.Student");
        System.out.println(c1==c4);

        method();

        method1();

        method2();
    }
    //todo 获得构造方法并使用
    public static void method() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> c = Class.forName("反射.获取Class对象.Student");
        Constructor<?>[] cons = c.getConstructors();//这个方法只能拿到公共的

        Constructor<?>[] cons1 = c.getDeclaredConstructors();//这个方法可以拿到所有的构造方法

        for(Constructor con :cons1){
            System.out.println(con);
        }
        System.out.println("------");
        Constructor<?> cons3 = c.getConstructor();//参数：你要获取的构造方法的参数的个数和数据类型对应的字节码文件对象

        Object o = cons3.newInstance();
        System.out.println(o);


    }
    /**
     * 反射获取构造方法并使用练习1
     * */
    public static void method1() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> c = Class.forName("反射.获取Class对象.Student");
        Constructor<?> con = c.getConstructor(String.class, int.class, String.class);
        Object o = con.newInstance("幽幽子",18,"西行寺");
        System.out.println(o.toString());



    }
    /**
     * 反射获取构造方法并使用练习2
     * */
    public static void method2() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> c = Class.forName("反射.获取Class对象.Student");
        Constructor<?> con= c.getDeclaredConstructor(String.class);

        //暴力反射
        //public void setAccessible (boolean flag):值为true，取消访问检查
        con.setAccessible(true);
        Object o = con.newInstance("这个是反射");//当构造方法是私有的，那么这个方法就不能被这样创建
        System.out.println(o);
    }
}
