package 基础的API.基本类型包装类Integer;
/**
 * 构造方法
 * public Integer(int value):根据int 值创建Integer对象（过时）
 * public Integer（String s): 根据String创建Integer对象（过时）
 *
 * 静态方法获取对象：
 *      public static Integer valueOf(int i):返回表示指定的int值的 Integer实例
 *      public static Integer valueOf(String s):返回一个保存指定值的 Integer 对象 String；
 * */
public class demo {
    public static void main(String[] args) {

//        Integer in1 = new Integer(100);
//        System.out.println(in1);
//
//        Integer in2 = new Integer("100");
//        Integer in2 = new Integer("abc");//NumberFormatException报错
//        System.out.println(in2);todo 过时了


        Integer in1 = Integer.valueOf("100");//变成了数字
        in1--;
        System.out.println(in1);
//        Integer in2 = Integer.valueOf("abc");//还是会NumberFormatException报错
//        System.out.println(in2);


        /**
         * int 和String 的相互转换
         *
         * */
        // todo int ->String
        int number = 114514;
        String s1 = ""+number;
        System.out.println(s1);
        //方式2
        //public static String valueOf(int i)
        String s2 = String.valueOf(number);
        System.out.println(s2);
        System.out.println("----------");
        // todo String ->int
        String s3 ="100";
        //方式1 String->Integer->int
        Integer in = Integer.valueOf(s3);
        int num = in;
        System.out.println(num);
        //方式2
        int num2 = Integer.parseInt(s3);
        System.out.println(num2);

    }
}
