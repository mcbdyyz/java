package 总集合分类.ArrayList集合;

import java.util.ArrayList;

public class ArrayListDome {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        //输入集合
        System.out.println(array.add("hello"));

        array.add("aaa");
        array.add("world");

        // 指定位置添加元素
        array.add(1,"javase");
        //删除指定元素
        array.remove("world");
//        array.remove(1);//返回删除的元素
        //输出集合
        System.out.println("array"+array);

    }
}
