package IO流.File类.字节流;

import java.io.*;

/**
 * 字节流抽象基类：
 *      inputStream:这个抽象类是表示字节输入流的所有类的超类
 *      OutputStream：这个抽象类是表示字节输出流的所有类的超类
 *      子类特点：子类名称都是以其父类名作为子类名的后缀
 *
 *      FileOutputStream;文件输出流用于将数据写入File
 *          FileOutputStream（String name): 创建文件输出流以指定的名称写入文件
 *                  write(int b):将指定的字节写入此文件输出流
 * */
public class Demo {
    public static void main(String[] args) throws IOException {
            File file = new File("D:\\javaFile测试\\java.txt");
        FileOutputStream inputStream = new FileOutputStream(file,true);
        inputStream.write(97);//这种行为只能执行数字行的字符串

        //void write(byte[] b) 将b.length字节从指定的字节数组写入此文件输出流，一次写一个字节数组数据
        byte[] s ={97,98,99,100,101};
            inputStream.write(s);
        //void write(byte[] b,int off,int len):将len字节从指定的字节数据开始，从偏移量off开始写入此文件输出流一次写一个字节数组的部分数据
            byte[] s1 ="abced".getBytes();
            inputStream.write(s1,1,3);
        //最后释放资源
        inputStream.close();

        forWrite();
        File file1 = new File("src\\IO流\\File类\\字节流\\java.txt");
        readData(file1);

    }
/**
 * 字节流写数据
 * */
    public static void forWrite() throws IOException {
        File file = new File("src\\IO流\\File类\\字节流\\java.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file,true);//这里判断是否连续

        for(int i =0;i<10;i++){
            fileOutputStream.write("yyz".getBytes());
            fileOutputStream.write("\n".getBytes());
        }
        fileOutputStream.close();

    }
    /**
     * 字节流读数据
     * */
    public static void readData(File file) throws IOException {
        FileInputStream fis = null;
        try {
             fis = new FileInputStream(file);
            int read = fis.read();
            System.out.println((char) read);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                assert fis != null;
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        fis = new FileInputStream(file);
//        int by;
//        while((by=fis.read()) != -1){
//            System.out.print((char)by);
//        }
//        fis.close();
    }
    /**字节流读入数据（一次读入一个字节数组数据）
     * */
    public static void arrayRead(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        byte[] by = new byte[1024];
        int b;
        while((b=fis.read(by))!=-1){
            System.out.println(new String(by,0,b));
        }
        fis.close();
    }
}
