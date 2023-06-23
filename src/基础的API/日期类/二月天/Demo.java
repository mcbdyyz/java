package 基础的API.日期类.二月天;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 获取二月的天数
 * */
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入年份");
        int year = sc.nextInt();

        Calendar cl = Calendar.getInstance();//todo 因为它自身是抽象，所以要用它的子类来调用
        cl.set(year,2,1);
        cl.add(Calendar.DATE,-1);

        System.out.println(cl.get(Calendar.YEAR)+"年"+(cl.get(Calendar.MONTH)+1)+"月"+
                cl.get(Calendar.DATE)+"日");

    }
}
