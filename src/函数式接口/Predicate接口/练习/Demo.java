package 函数式接口.Predicate接口.练习;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * 对集合中的信息进行筛选，将符合要求的字符串存入ArrayList集合中，遍历集合
 */
public class Demo {
    public static void main(String[] args) {
        //写入数组
        String[] arr = {"幽幽子,28", "灵梦,27", "妖梦,25", "蕾米莉亚,800"};
        //用lambda表达式判断
        ArrayList<String> arrayList = checkArray(arr, s -> s.split(",")[0].length() > 2,
                s -> Integer.parseInt(s.split(",")[1]) > 25);
        //遍历
        for (String ar : arrayList) {
            System.out.println(ar);
        }
    }

    private static ArrayList<String> checkArray(String[] arr, Predicate<String> pr1, Predicate<String> pr2) {
        ArrayList<String> sr = new ArrayList<>();
        //遍历判断，if存储
        for (String s : arr) {
            if (pr1.and(pr2).test(s)) {
                sr.add(s);
            }
        }
        //返回
        return sr;
    }
}
