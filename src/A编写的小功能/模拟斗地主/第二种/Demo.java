package A编写的小功能.模拟斗地主.第二种;

import java.util.*;

/**
 * 创建HashMap,键是编号，值是牌
 * */
public class Demo {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        String[] colors ={"◆","♠","♥","♣"};
        String[] numbers ={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int number =1;
        for(String sn :numbers){
            for(String sc :colors){
                hashMap.put(number,sc+sn);
                arrayList.add(number);
                number++;
            }
        }
        for(Integer s : arrayList){
            System.out.println(s);
        }
        hashMap.put(number,"大王");
        arrayList.add(number);
        number++;
        hashMap.put(number,"小王");
        arrayList.add(number);
        Collections.shuffle(arrayList);
        TreeSet<Integer> user1 = new TreeSet<>();
        TreeSet<Integer> user2 = new TreeSet<>();
        TreeSet<Integer> user3 = new TreeSet<>();
        TreeSet<Integer> downCard = new TreeSet<>();

        for(int i=0;i<arrayList.size();i++){
            int a = arrayList.get(i);
            if(i>=arrayList.size()-3){
                downCard.add(a);
            }else if(i%3==0){
                user1.add(a);
            }else if(i%3 ==1){
                user2.add(a);
            }else {
                user3.add(a);
            }
        }
        lookCard("uuz",user1,hashMap);
        lookCard("uuz1",user2,hashMap);
        lookCard("uuz2",user3,hashMap);
        lookCard("DownCard",downCard,hashMap);
    }
    public static void lookCard(String name,TreeSet<Integer> treeSet,HashMap<Integer,String> hashMap){
        System.out.print(name+"的牌是：");
        for(Integer s:treeSet){
            String s1 = hashMap.get(s);
            System.out.print(s1+" ");

        }
        System.out.println();
    }
}
