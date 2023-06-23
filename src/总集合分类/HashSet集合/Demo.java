package 总集合分类.HashSet集合;

import java.util.HashSet;

/**
 * 存储的内容是混乱的
 *
 * */
public class Demo {
    public static void main(String[] args) {
        HashSet<String> sh = new HashSet<>();
        sh.add("hello");
        sh.add("world");
        sh.add("java");

        sh.add("world");

        for(String i :sh){
            System.out.println(i);

        }
    }
}
