package Lambda表达式.方法引用.引用对象的实例方法;

public class Demo {
    public static void main(String[] args) {
        usePrinter(s-> System.out.println(s.toUpperCase()));
        //因为有一个类中有变大写输出的方法，那么就可以直接引用
        usePrinter(PrinterImp::Up);
        System.out.println("-------");
        method();
    }
    private static void usePrinter(Printer a){
        a.printerUp("HelloWorld");
    }
    /**
     * 引用类的实例方法
     * **/
    public static void method(){
        useMyString((s,x,y)->s.substring(x,y));
        //引用类的实例方法
        useMyString(String::substring);
//      Lambda表达式被类的实例反复噶代替的时候
        //第一个参数作为调用者
        //后面的参数全部传递给该方法作为参数

    }
    private static void useMyString(MyString a){
        String helloWorld = a.mySubString("HelloWorld", 2, 5);
        System.out.println(helloWorld);
    }
}
