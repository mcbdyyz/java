package 总集合分类.List集合特点.增强for;

import java.util.ArrayList;
import java.util.List;
/**
 * 增强for：简化数组和Collection集合的遍历
 * 实现Iterable接口的类允许其对象成为增强型for语句的目标
 * */
public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("yyz1");
        list.add("yyz2");
        list.add("yyz3");

        for(String s:list){
            System.out.println(s);
        }
    }
}
