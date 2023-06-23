package String类.StringBuilder.反转字符串;

import java.util.Scanner;

public class StringBuilderReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input String to the console");
        //输入一个参数
        String s = myReverse(scanner.nextLine());
        //输出传入的参数
        System.out.println("s:"+s);
    }
    public static String myReverse (String s){
        //通过链式写法来简化代码
        return new StringBuilder(s).reverse().toString();
    }
}
