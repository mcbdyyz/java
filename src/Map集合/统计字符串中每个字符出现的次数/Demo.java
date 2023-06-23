package Map集合.统计字符串中每个字符出现的次数;

import java.util.HashMap;
import java.util.Scanner;
/**
 * 键盘录入一个字符串，要求统计字符串中每个字符出现的次数。
 * 举例：键盘录入“aababcabcdabcde” 在控制台输出“a(5)b(4)c(3)d(2)e(1)”;
 * */
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();
        //这里也可以存入TreeMap，就可以排序写入的数据了，这是默认排序的
        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i=0;i<line.length();i++){
            char a = line.charAt(i);
            Integer integer = hm.get(a);
            if(integer == null){
                hm.put(a,1);
            }else{
                integer++;
                hm.put(a,integer);
            }
        }
        //遍历
        for(Character s :hm.keySet()){
            Integer integer = hm.get(s);
            System.out.print(s+"("+integer+")");
        }

    }
}
