package 反射.越过泛型检查;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * 在ArrayList<Integer>集合中，添加一个字符串
 * */
public class Demo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> array = new ArrayList<>();
//        array.add(10);
        //得到ArrayList的对象
        Class<? extends ArrayList> aClass = array.getClass();
        Method mAdd = aClass.getMethod("add", Object.class);
        mAdd.invoke(array,"中文加进去喽");//调用方法的对象，和需要传递的参数
        mAdd.invoke(array,"这集合不能要了");
        System.out.println(array);

        //练习

    }
    /**
     * 练习，通过配置文件运行类中的方法
     * */
    public static void methodTest(){

    }
}
