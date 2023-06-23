package 函数式接口.Supplier接口;

import java.util.function.Supplier;

/**
 * 用这个接口获得最大值
 *
 * */
public class Demo {
    public static void main(String[] args) {
        int[] arr = {1,5,6,9,10,8};
        int[] max = {arr[0]};
        int a =getMAX(()->{
            for (int j : arr) {
                if (j > max[0]) {
                    max[0] = j;
                }
            }
            return max[0];
        });
        System.out.println(a);

    }
    private static Integer getMAX(Supplier<Integer> a){
        return  a.get();
    }
}
