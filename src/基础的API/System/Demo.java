package 基础的API.System;

public class Demo {
    public static void main(String[] args) {
//        System.out.println("Start");
//        // todo public static void exit(int status):终止当前运行的虚拟机，非零表示异常终止
//        System.exit(0);//在这里就被终止 了
//        System.out.println("end");

        //todo public static long currentTimeMillis():返回当前时间（毫秒);
//        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis()*1.0 /1000/60/60/24/365+"年");
        int a =0;
        long start = System.currentTimeMillis();
        for(int i =0;i<=1000000000;i++){
//            System.out.println(i);
            a++;
        }
        long end = System.currentTimeMillis();
        System.out.println("耗时："+(end-start)+"毫秒");
        System.out.println(a);
    }

}
