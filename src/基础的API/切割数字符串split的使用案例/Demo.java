package 基础的API.切割数字符串split的使用案例;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 要求：把字符串转换为数组，然后排序，再字符串输出出来
 * */
public class Demo {
    public static void main(String[] args) {
        String s ="23 26 59 46 19";
        String[] s1 = s.split(" ");
        int[] num = new int[s1.length];
        for(int i =0;i<s1.length;i++){
            num[i]= Integer.parseInt(s1[i]);
        }

        //遍历数组
        for(int j =0 ;j<num.length;j++){
            System.out.print(num[j]+",");
        }
        //用Arrays自带的排序方法来排序数组
        Arrays.sort(num);
        System.out.println("");

        StringBuilder sbuilder = new StringBuilder();
        sbuilder.append("{");
        for(int b : num){
            if(b == num[num.length-1]) {sbuilder.append(b).append("}");break;}
            sbuilder.append(b).append(",");
        }

        s = sbuilder.toString();
        System.out.println(s);

        ArrayList<String> arrayList= new ArrayList<>();

    }
}
