package 特殊操作流.对象序列化.对象序列化流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 将java对象的原始数据类型和图形写入OutputStream,可以使用ObjectInputStream读取(重构)对象，可以
 * 通过使用流的文件来实现对象的持久存储，如果流是网络桃姐字流，则可以在另一个主机上或另一个进程中重构对象
 *
 *      构造方法
 *      ObjectOutputStream（OutputStream out）:创建一个写入指定的OutputStream的ObjectOutputStream；
 *      序列化对象的方法
 *          void writeObject(Object obj):将指定的对象写入ObjectOutputStream；
 *     对象序列化得实现Serializable接口
 *
 * */
public class Demo {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\特殊操作流\\对象序列化\\对象序列化流\\oos.txt"));
        Student s = new Student("yyz",18);
        oos.writeObject(s);

        oos.close();
    }

}
