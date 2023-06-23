package 基础的API.Math;

public class Demo {
    public static void main(String[] args) {
        //todo public static int abs (int a):返回参数的绝对值
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));
        System.out.println("-----------");
        //todo public static double ceil (double a):返回大于或者等于参数的最小double值，等于一个整数
        System.out.println(Math.ceil(12.32));
        System.out.println(Math.ceil(12.56));
        System.out.println("-----------");
        // todo public static double floor(double a):返回小于或者等于参数的最大double值，等于一个整数
        System.out.println(Math.floor(12.32));
        System.out.println(Math.floor(12.56));
        System.out.println("-----------");
        //todo public static int round(floot a):按照四舍五入返回最接近参数的int
        System.out.println(Math.round(12.32F));
        System.out.println(Math.round(12.56F));
        System.out.println("-----------");
        //todo public static int max(int a,int b ):返回这两个int值中的较大值
        System.out.println(Math.max(66,88));
        System.out.println("-------");
        // todo public static int min(int a int b):返回两个int值中的较小值
        System.out.println(Math.max(66,88));
        System.out.println("-------");
        //todo public static double pow(double a,double b):返回a的b次幂的值
        System.out.println(Math.pow(2.0,3.0));
        System.out.println("------------");
        //todo public static double random():返回值为double的正值，[0.0,1.0]之间
        System.out.println(Math.random());
    }
}
