package 异常;
/**
 * Throwable类是java语言中所有错误和异常的超类，只有作为此类（或其一个子类）的实例的对象由java虚拟机抛出，或者可以
 * 由java throw语句抛出。类似的，只有这两个类或其子类可以是catch子句中的参数类型，
 *---------------------------------------------------------
 * Throwable->Error/Exception
 * Exception->RuntimeException/非RuntimeException
 * Error: 严重问题，不需要处理
 *------------------
 * Exception：称为异常类，它表示程序本身可以处理的问题
 *      RuntimeException: 在编译期是不检查的，出现问题后，需要我们回来修改
 *      非RuntimeException：编译期就必须处理的问题，否则程序不能通过编译，就更不能正常运行
 *---------------------------------------------------------
 * JVM默认处理方案
 *把异常名称，异常原因，异常出现的位置等信息输出在了控制台
 * 程序停止运行
 *---------------------------------------------------------
 * 异常处理：
 *      try····catch····
 *---------------------------------------------------------
 * public String getMessage():返回此，throwable 的详细消息字符串
 * public String toString():返回此可抛出的简短描述
 * public void printStackTrace():把异常的错误信息输出在控制台
 * ---------------------------------------------------------
 * 编译时异常和运行时异常的区别
 * java异常被分为两大类：编译时异常和运行时异常，也被称为受检异常和非受检异常
 * 所有的RuntimeException类及其子类被称为运行时异常，其他的都是编译时异常
 * */

public class Demo {
    public static void main(String[] args){
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    public static void method(){
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);//new ArrayIndexOutOfBoundsException(“xxx”);
        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("你错了");
//            e.printStackTrace();//todo 把错误的信息输出到控制台
//            System.out.println(e.getMessage());//todo 输出错误的原因消息

            System.out.println(e.toString());// todo 返回此可抛出的简短描述
        }
//            System.out.println(arr[2]);

    }
}
