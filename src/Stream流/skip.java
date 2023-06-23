package Stream流;

import java.util.ArrayList;
import java.util.List;

public class skip {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("幽香");
        arr.add("幽幽子");
        arr.add("幽幽子3");
        arr.add("灵梦");
        arr.add("妖梦");

        ArrayList<String> youStart = new ArrayList<>();

        for (String s : arr) {
            if(s.startsWith("幽")){
                youStart.add(s);
                System.out.println(s);
            }
        }

        System.out.println("-------------");
        ArrayList<String> youLength = new ArrayList<>();

        for( String s:youStart){
            if(s.length()==3){
                youLength.add(s);
                System.out.println(s);
            }
        }
        System.out.println("------");

        //Stream流
        arr.stream().filter(s -> s.startsWith("幽")).filter(s -> s.length()==3).forEach(s -> System.out.println(s));

    }
}
