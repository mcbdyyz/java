package 反射.通过配置文件运行类方法;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("src\\反射\\通过配置文件运行类方法\\class.txt");
        prop.load(fr);
        fr.close();

        //反射方法来运行配置文件
        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");

        try {
            Class<?> aClass = Class.forName(className);
            Constructor<?> con = aClass.getConstructor();
            Object o = con.newInstance();

            Method m = aClass.getMethod(methodName);
            m.invoke(o);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
