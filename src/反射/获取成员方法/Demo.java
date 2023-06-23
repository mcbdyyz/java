package 反射.获取成员方法;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *  Method[] getMethods() 返回一个包含 方法对象的数组， 方法对象反映由该 Class对象表示的类或接口的所有公共方法，
 *  包括由类或接口声明的对象以及从超类和超级接口继承的类。
 *
 *  Method[] getDeclaredMethods() 返回一个包含 方法对象的数组， 方法对象反映由 Class对象表示的类或接口的所有
 *  声明方法，包括public，protected，default（package）访问和私有方法，但不包括继承方法。
 *  -----------------------------------------------------------------------------------------------
 *  Method getMethod(String name, Class<?>... parameterTypes) 返回一个 方法对象，该对象反映由该 Class
 *  对象表示的类或接口的指定公共成员方法。
 *
 *  Method getDeclaredMethod(String name, Class<?>... parameterTypes) 返回一个 方法对象，它反映此表示的类
 *  或接口的指定声明的方法 Class对象。
 * */
public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> ac = Class.forName("反射.获取Class对象.Student");

//        Method[] methods = ac.getMethods();//这个拿公共并包含继承的方法
        Method[] methods = ac.getDeclaredMethods();//这个可以拿到私有，但只有本类的
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("----单个方法---");
//        public void method1
        Method method1 = ac.getMethod("method1");
        //获取无参构造方法，创建对象
        Constructor<?> con = ac.getConstructor();
        Object o = con.newInstance();

//        o.method1();
        //Object invoke(Object obj, Object... args) 在具有指定参数的指定对象上调用此 方法对象表示的基础方法。
        //Object:返回值类型
        //obj:调用方法的对象
        //args:方法需要的参数
        method1.invoke(o);

        //练习
        fMethod();
    }
    /**
     * 练习
     * 实现如下操作
     * Student s = new Student();
     * s.method1();
     * s.method2("uuz");
     * String ss = s.method3("uuz",18);
     * System.out.println(ss);
     * s.function();
     * */
    public static void fMethod(){
        System.out.println("-----练习---------");
        try {

            Class<?> aClass = Class.forName("反射.获取Class对象.Student");
            Constructor<?> constructor = aClass.getConstructor();
            //获取无参构造方法，创建对象
            Object o = constructor.newInstance();

            Method[] dMethods = aClass.getDeclaredMethods();
            for (Method dMethod : dMethods) {
//                System.out.println(dMethod.getName());
                switch(dMethod.getName()){
                    case "method1":
                        dMethod.invoke(o);
                        break;
                    case "method2":
                        dMethod.invoke(o,"uuz");
                        break;
                    case"method3":
                        Object uuz = dMethod.invoke(o, "uuz", 18);
                        System.out.println(uuz);
                        break;
                    case"function":
                        dMethod.setAccessible(true);
                        dMethod.invoke(o);
                        break;
                }
            }
            //单个使用的方法
            System.out.println("----单个使用方法-----");
            Method mothed1 = aClass.getMethod("method1");
            mothed1.invoke(o);
            Method method2 = aClass.getMethod("method2",String.class);
            method2.invoke(o,"uuz");
            Method method3 = aClass.getMethod("method3", String.class, int.class);
            Object uuz = method3.invoke(o, "uuz", 18);
            System.out.println(uuz);
            Method function = aClass.getDeclaredMethod("function");
            function.setAccessible(true);
            function.invoke(o);

        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
