package 基础的API.Arrays.冒泡排序;

import java.util.Arrays;

/**
 * 两两对比，然后把最大的数放到后面并不加入排序
 * */
public class Demo {
    public static void main(String[] args) {
        int[] a ={12,23,4,99,25,55,66};

        for(int x = 1; x<a.length;x++){
            System.out.println("我循环了："+x+"次");
            for(int j = 0;j<a.length-x;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1] =temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
