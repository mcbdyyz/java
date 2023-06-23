package 特殊操作流.对象序列化.对象反序列化流;

import 特殊操作流.对象序列化.对象序列化流.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * ObjectInputStream:反序列化先前使用ObjectOutputStream编写的原始数据和对象
 *      构造方法
 *          ObjectInputStream(InputStream in):创建从指定的InputStream读取的ObjectInputStream;
 *          方法：
 *              Object readObject():从ObjectInputStream读取一个对象
 * */
public class Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\特殊操作流\\对象序列化\\对象序列化流\\oos.txt"));
        //用一个对象接收
        Object o = ois.readObject();
        //向下转型，把object转换为Student
        Student s = (Student)o;
        System.out.println(s.getName()+","+s.getAge());
        ois.close();
    }
}
