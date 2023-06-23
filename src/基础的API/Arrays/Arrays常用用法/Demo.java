package 基础的API.Arrays.Arrays常用用法;

import java.util.Arrays;

/**
 * Arrays 常用方法
 * public static String toString(int[] a):返回指定数组的内容的字符串表示形式
 * public static void sort (int[] a) :按照数字排序指定的数组
 * 工具类设计思想：
 *构造方法用private
 * 成员用 public static 修饰
 * */
public class Demo {
    public static void main(String[] args) {
        int[] arr ={1,2,3,55,2,4,6,79,6,8,16,6};

        System.out.println("排序前"+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后"+ Arrays.toString(arr));

    }
}
