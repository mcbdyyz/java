package A编写的小功能.模拟斗地主;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 需求：通过程序实现斗地主过程中的洗牌，发牌和看牌
 * */
public class Demo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

        /*牌的类型

        *  ♣2.。。。。
            ♠2.。。。。
            ♥2.。。。。
            ◇2.。。。。。
            大王
            小王
        * */
        String[] colors = {"♠", "♥", "♣", "◇"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "j", "Q","k","A"};
        for(String s :colors){
            for(String sn: numbers){
                array.add(s+sn);
            }
        }
        array.add("大王");
        array.add("小王");

        Collections.shuffle(array);

        ArrayList<String> user1 = new ArrayList<>();
        ArrayList<String> user2 = new ArrayList<>();
        ArrayList<String> user3 = new ArrayList<>();
        ArrayList<String> downCard = new ArrayList<>();

        for(int i= 0; i<array.size();i++){
            String a = array.get(i);
            if(i>=array.size()-3){
                downCard.add(a);
            }else if(i%3==0){
                user1.add(a);
            }else if(i%3==1){
                user2.add(a);
            }else {
                user3.add(a);
            }
        }

        Collections.sort(user1);
        Collections.sort(user2);
        Collections.sort(user3);

        for(String i :user1){
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("-----");
        for(String i: user2){
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("-----");
        for(String i: user3){
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("底牌是：");
        for(String i :downCard){
            System.out.print(i+" ");
        }

    }
}
