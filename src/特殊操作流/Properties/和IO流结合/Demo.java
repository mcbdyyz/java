package 特殊操作流.Properties.和IO流结合;

import javax.annotation.processing.Filer;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

/**
 * Properties和IO流结合的方法
 *      void load(Reader reader);
 *          从输入字符流读取属性列表（键和元素对）
 *      void store(Writer writer,String comments);
 *          将此属性列表（键和元素对）写入此Properties表中，以适合使用load（Reader)方法的格式写入输出字符流
 * */
public class Demo {
    public static void main(String[] args) throws IOException{
        myStore();
        myLoad();
    }
    /**
     * 把集合中的数据保存到文件
     * */
    public static void myStore() throws IOException {
        Properties ppt = new Properties();
        ppt.setProperty("yyz1","第一个存入的");
        ppt.setProperty("yyz2","第二个存入的");
        ppt.setProperty("yyz3","第三个存入的");

        FileWriter fw = new FileWriter("src\\特殊操作流\\Properties\\和IO流结合\\write.txt");
        ppt.store(fw,null);
        fw.close();
    }
    /**
     * 把文件中的数据读取到集合
     * */
    public static void myLoad() throws IOException{
        Properties p = new Properties();
        FileReader fr = new FileReader("src\\特殊操作流\\Properties\\和IO流结合\\write.txt");
        p.load(fr);
        fr.close();
        System.out.println(p);
    }
}
