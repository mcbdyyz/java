package Stream流.练习;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * 有两个集合，分别存储了6名人员，要求
 *      一号集合只要名字是三个的前三个
 *      二号集合只要幽字开头的，且不要第一个
 *      过滤后，合并到一起
 *      然后遍历
 *
 *
 * */
public class Demo {
    public static void main(String[] args) {
        ArrayList<String> array1 = new ArrayList<>();
        array1.add("小脆骨,2");
        array1.add("因潘帝,3");
        array1.add("帕秋莉·诺蕾姬,4");
        array1.add("射命文丸,2");
        array1.add("红美铃,2");
        array1.add("八云紫,5");

        ArrayList<String> array2 = new ArrayList<>();
        array2.add("幽灵,4");
        array2.add("幽幽子,5");
        array2.add("伊吹翠香,5");
        array2.add("莉莉霍瓦特,0");
        array2.add("幽香,5");
        array2.add("魂魄妖梦,3");

//        array1.stream().filter(s -> s.length()==3).limit(3).forEach(System.out::println);
        //一号集合只要名字是三个的前三个
        Stream<String> s1 = array1.stream().filter(s -> s.length() == 5).limit(3);
        //二号集合只要幽字开头的，且不要第一个
//        array2.stream().filter(s -> s.startsWith("幽")).skip(1).forEach(System.out::println);
        Stream<String> you = array2.stream().filter(s -> s.startsWith("幽")).skip(1);

        //把两个流合并，去重复，然后转换集合的String为Actor，然后输出
        Stream.concat(s1,you).distinct().map(s->{
            String s2 = s.split(",")[0];
            int s3 = Integer.parseInt(s.split(",")[1]);
            return new Actor(s2,s3);
        }).forEach(p-> System.out.println(p.getName()+","+p.getAge()));

        System.out.println("------------");
        //合并写法,这个没有把集合打散，只传了name（懒）
        Stream.concat(array1.stream().filter(s->s.length()==5).limit(3),
                array2.stream().filter(s -> s.startsWith("幽")).skip(1)).map(Actor::new).
                forEach(p -> System.out.println(p.getName()));

    }
}
