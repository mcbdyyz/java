package IO流.File类;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

/**
 * File是文件和目录路径名的抽象表示；
 *      文件和目录是可以通过FIle封装成对象的
 *      对于File而言，其封装的并不是一个真正存在的文件，仅仅是一个路径名而已，它可以是存在的，也可以是不存在的
 *      将来是要通过具体的操作吧这个路径的内容转换为具体存在的
 *
 *      构造方法：
 *          File(String pathname); 通过将给定的路径名字符串转换为抽象路径名来创建新的File实例
 *          File(String parent,String child)从父路径名字符串和子路径名字符串创建新的File实例
 *          File(String parent,String child)从父抽象路径名和子路径名字字符串创建新的File实例
 *
 *      File类创建功能
 *          public boolean createNewFile():当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件夹
 *                  如果文件不存在，创建文件返回True，反之false；
 *          public boolean mkdir():创建由此抽象路径名命名的目录
 *                  如果目录不存在，创建目录返回True，反之false；
 *          public boolean mkdirs():创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录
 *                  如果目录不存在，创建目录返回True，反之false；包括父级目录
 *
 *      File类判断和获取功能
 *          public boolean isDirectory():测试此抽象路径名称表示的File是否为目录
 *          public boolean isFIle():测试此抽象路径名表示的File是否为文件
 *          public boolean exists(): 测试此抽象路径名表示的File文件是否存在
 *          public String getAbsolutePath():返回此抽象路径名的绝对路径名字符串
 *          public String getPath():将此抽象路径名转换为路径名字符串
 *          public String getName():返回由此抽象路径名表示的文件或目录的名称
 *          public String[] list(): 返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
 *          public FIle[] listFile():返回此抽象路径名表示的目录中的文件和目录的File对象数组
 * */
public class Demo {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\javaFile测试\\java.txt");
        System.out.println(f1);

        File f2 = new File("D:\\javaFile测试","\\javaSE");
        System.out.println(f2);

        File f3 = new File("D:\\javaFile测试\\javaWed");
        File f4 = new File(f3,"\\yyz");
        System.out.println(f4);
        // 虽然上面三个方法构造的路径是相同的，但是不同的构成方式可以有不同的结构，有不同的使用方法；

        //File类功能
        boolean newFile = f1.createNewFile();
        System.out.println(newFile);

        boolean mkdir = f2.mkdir();
        System.out.println(mkdir);

        boolean mkdirs = f4.mkdirs();
        System.out.println(mkdirs);

        File f5 = new File("D:\\javaFile测试\\.");//不符合文件创建规则的文件是无法创建的哦
        boolean mkdir1 = f5.mkdir();
        System.out.println(mkdir1);
        FileIf();
    }
    /** File类判断和获取功能
     *          public boolean isDirectory():测试此抽象路径名称表示的File是否为目录
     *          public boolean isFile():测试此抽象路径名表示的File是否为文件
     *          public boolean exists(): 测试此抽象路径名表示的File文件是否存在
     *          public String getAbsolutePath():返回此抽象路径名的绝对路径名字符串
     *          public String getPath():将此抽象路径名转换为路径名字符串
     *          public String getName():返回由此抽象路径名表示的文件或目录的名称
     *          public String[] list(): 返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
     *          public FIle[] listFiles():返回此抽象路径名表示的目录中的文件和目录的File对象数组
     *          public boolean delete():删除由此抽象路径名称表示的文件或目录*/
    public static void FileIf() throws IOException {
        System.out.println("-------------");
        File f1 = new File("src\\IO流\\File类\\yyz1.txt");
        System.out.println(f1.createNewFile());
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());

        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getParent());
        System.out.println(f1.getName());
        System.out.println("----------");
        File f2 = new File("D:\\javaFile测试");
        String[] list = f2.list();
        assert list !=null;
        for(String s :list){
            System.out.println(s);
        }

        File[] files = f2.listFiles();
        assert files != null;
        for(File f : files){
                System.out.println(f);
        }
        System.out.println("----------");
        boolean delete = f1.delete();
        System.out.println(delete);


    }
}
