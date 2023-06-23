package String类;
//1、字符串不可变，它们的值在创建之后不能被修改
//String 虽然不可变，但是可以被共享
//3、字符串效果上相当于字符数组（char[]），但是底层原理是字节数组（byte[])；
// 推荐直接赋值

public class StringDome {
    public static void main(String[] args) {
        String s1 = new String();//创建一个空白的字符串对象，不包含如何内容
        char[] chs = {'a','b','c'};

        String s2 = new String(chs);//可以存入字符数组
        System.out.println(s2);

        byte[] bys = {97,98,99};//也可以存入字节数组，字节根据Acs码
        String s3 = new String(bys);

        //字符串比较基本类型是数据值是否相同
        //引用类型：比较的是地址值是否相同，而String是引用形类型，所以比较不能用==，来比较0u<;
        System.out.println(s2.equals(s3));//用这种方法即可
    }
}
