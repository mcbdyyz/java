package 反射.类加载;
/**
 * 当程序要使用某个类时，如果该类还未被加载到内存中，则系统会通过类的加载，类的链接，类的初始化这三步骤来对类进行初始化，
 * 如果不出现意外情况，JVM将会连续完成这三个步骤，所以有时也把这三个步骤统称为类加载器或者类初始化
 *     todo 类的加载：
 *
 *          就是指将class文件读入内存，并为之创建一个java.lang.Class对象
 *          任何类被使用时，系统都会为之建立一个java.lang.Class对象
 *     todo 类的链接：
 *
 *          验证阶段：用于检验被加载的类是否有正确的内部结构，并和其他类协调一致
 *          准备阶段：负责为类的类遍历分配内存，并设置默认初始化值
 *          解析阶段：将类的二进制数据中的符号引用替换为直接引用
 *      todo 类的初始化
 *
 *          列如类还未被加载和连接，则程序先加载并连接该类
 *          假如该类的直接父类还未被初始化，则先初始化其直接父类
 *          假如类中有初始化语句，则系统依次执行这些初始化语句
 *
 *      todo 类的初始化时机：
 *
 *          创建类的实例
 *          调用类的方法
 *          访问类或者接口的类变量，或者为该类变量赋值
 *          使用反射方式来强制创建某个类或接口对应的java.lang.Class对象
 *          初始化某个类的子类
 *          直接使用java.exe命令来运行某个主类
 *
 *     todo 类加载器的作用
 *
 *          负责将.class文件加载到内存中，并为之成对应的java.lang.Class对象
 *
 *     todo  JVM的类加载机制
 *
 *          全盘负责：就是当一个类加载器负责加载某个Class时，该Class所依赖的和引用的其他Class也将由该类加载器负责载入，除非
 *          显示使用另一个类加载器来载入
 *
 *          父类委托：就是当一个类加载器负责加载某个Class时，先让父类加载器试图加载该Class，只有在父类加载器无法加载该类时才会
 *          尝试从自己的类路径中加载该类
 *
 *          缓存机制：保证所有加载过的Class都会被缓存，当程序需要使用某个Class对象时，类加载器先从缓存区中搜索该Class，只有当
 *          缓存区中不存在该Class对象时，系统才会读取该类对应的二进制数据，并将其转换成Class对象，存储到缓存区
 *
 *   todo java加载器：
 *
 *      Bootstrap class loader:它是虚拟机的内置类加载器，通常表示为null，并且没有父null
 *
 *      Platform class loader:平台类加载器可以看到所有平台类，平台类包括由平台类加载器或其祖先定义的Java SE平台API，其实现类和JDK特定的运行
 *      时类
 *
 *      System class loader:它也被称为应用程序类加载器，与平台类加载器不同，系统类加载器通常用于定义应用程序类路径，
 *      模块路径和JDK特定工具上的类
 *
 *      类加载器的继承关系：System的父类加载器为Platform，而Platform的父类加载器为Bootstrap
 *
 *      todo ClassLoader 中的两个方法
 *
 *          static ClassLoader getSystemClassLoader():返回用于委派的系统类加载器
 *          ClassLoader getParent():返回父类加载器进行委派
 * */
public class Demo {
    public static void main(String[] args) {

        ClassLoader c = ClassLoader.getSystemClassLoader();
        System.out.println(c);//AppClassLoader

        ClassLoader parent = c.getParent();//返回父类加载器进行委派
        System.out.println(parent);//PlatformClassLoader

        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);//null
    }
}
