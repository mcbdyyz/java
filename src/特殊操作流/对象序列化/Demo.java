package 特殊操作流.对象序列化;

import java.io.*;

/**
 * 在对象序列化的时候，存出去后如果，对象进行了修改，则会导致反序列化报错失败，所以每当对象序列化的时候请一定要给序列化的对象进行标识
 *      private static final long serialVersionUID = 42L：42可更改
 *
 * 如果有的序列化对象的成员变量不想被修饰，可以给那个成员变量加一个修饰符：transient
 * */
public class Demo {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        write();
        read();

    }
    public static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\特殊操作流\\对象序列化\\oos.txt"));
        Object o = ois.readObject();
        Student s = (Student) o;
        System.out.println(s.getName()+","+s.getAge());
    }
    public static void write() throws IOException{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\特殊操作流\\对象序列化\\oos.txt"));
        Student s = new Student("yyz",18);
        oos.writeObject(s);
        oos.close();
    }
}
