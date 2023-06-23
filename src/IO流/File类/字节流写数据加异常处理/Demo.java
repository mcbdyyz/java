package IO流.File类.字节流写数据加异常处理;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * Finally来实现释放资源
 * */
public class Demo {
    public static void main(String[] args) {

    }
    //标准的异常抛出
    public static void method1(){
        File file = new File("src\\IO流\\File类\\字节流写数据加异常处理\\javaTest.txt");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            fos.write("测试".getBytes());
        }catch(IOException e){
            System.out.println("你报错跳出来了");
        }finally{
            try {
                assert fos != null;
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //todo jdk-7后新增的抛出方法
    public static void method2(){
        File file = new File("src\\IO流\\File类\\字节流写数据加异常处理\\javaTest.txt");

        try(FileOutputStream fos = new FileOutputStream(file)) {

            fos.write("测试".getBytes());
        }catch(IOException e){
            System.out.println("你报错跳出来了");

        }
    }
}
