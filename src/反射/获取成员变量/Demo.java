package 反射.获取成员变量;

import 反射.获取Class对象.Student;

import java.awt.image.PackedColorModel;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * Field[] getDeclaredFields() 返回一个 Field对象的数组，反映了由该 Class对象表示的类或接口声明的所有字段。
 * Field[] getFields() 返回一个包含 Field对象的数组， Field对象反映由该 Class对象表示的类或接口的所有可访问的公共字段。
 * */
public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> c = Class.forName("反射.获取Class对象.Student");
        Field[] f = c.getFields();//只能取到公共的字段
        Field[] f1 = c.getDeclaredFields();//返回一个Field对象数组，反映了由该类Class对象表示的类或接口声明的所有最短

        for (Field field : f1) {
            System.out.println(field);
        }

        System.out.println("-------------");
        Field field = c.getField("address");//返回单个

//        Student s = new Student();
//        s.address="西行寺";
//        System.out.println(s);
        Constructor<?> con = c.getConstructor();
        Object o = con.newInstance();

//        A Field提供有关类或接口的单个字段的信息和动态访问。 反射的字段可以是类（静态）字段或实例字段。
//        void set(Object obj, Object value) 将指定的对象参数中由此 Field对象表示的字段设置为指定的新值。
        field.set(o,"西行寺");//给o的成员变量field赋值
        System.out.println(o);

        method();
        method2();

    }
    /**
     * 通过反射实现
     * Student s = new Student();
         * s.name ="uuz";
         * s.age = 18;
         * s.address = "西行寺";
         * System.out.println(s);
     * */
    public static void method() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        System.out.println("---------------");
        Class<?> aClass = Class.forName("反射.获取Class对象.Student");
//        Student s = new Student();
        Constructor<?> con = aClass.getConstructor();
        Object o = con.newInstance();
        System.out.println(o);
//        * s.name ="uuz";
        Field df = aClass.getDeclaredField("name");
        df.setAccessible(true);
        df.set(o,"uuz");
        System.out.println(o);
//        s.age = 18;
        Field age = aClass.getDeclaredField("age");
        age.setAccessible(true);
        age.set(o,18);
        System.out.println(o);
//        s.address = "西行寺";
        Field address = aClass.getDeclaredField("address");
        address.setAccessible(true);
        address.set(o,"来自于幻想乡西行寺");
        System.out.println(o);

    }/**
     * 通过反射实现
     * Student s = new Student();
     * s.name ="uuz";
     * s.age = 18;
     * s.address = "西行寺";
     * System.out.println(s);
     * 方法二：
     * */
    public static void method2() throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        //获取对象，指向Student
        Class<?> a = Class.forName("反射.获取Class对象.Student");
        //获取对象的所有成员变量存入Field数组
        Field[] declaredFields = a.getDeclaredFields();
        //获取Class对象的构造方法，
        Constructor<?> constructor = a.getConstructor();
        //用newInstance方法实现constructor的构造方法，选择无参构造
        Object o = constructor.newInstance();
        //用暴力反射的方法，让java取消访问检测
        declaredFields[0].setAccessible(true);
        declaredFields[1].setAccessible(true);//这个每一个，只要是私有，都要取消访问，否则IllegalAccessException
        declaredFields[2].setAccessible(true);
        //给o 的成员变量，declaredFields[0]赋值，为↓
        declaredFields[0].set(o,"这个东西到底怎么搞啊");
        declaredFields[1].set(o,18);
        declaredFields[2].set(o,"我鬼知道在什么地方");

        //输出
        System.out.println(o);
    }
}
