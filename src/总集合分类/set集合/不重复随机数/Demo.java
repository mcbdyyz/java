package 总集合分类.set集合.不重复随机数;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {

//        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> set = new TreeSet<Integer>();
        Random r = new Random();

        while(set.size()<10){
            int i = r.nextInt(20) + 1;//[0,20)+1,[0,20]
            set.add(i);
        }
        for(Integer s :set){
            System.out.println(s);
        }
    }
}
