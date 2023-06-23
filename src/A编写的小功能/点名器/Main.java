package A编写的小功能.点名器;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Attribute> array = new ArrayList<Attribute>();
        BufferedReader br = new BufferedReader(new FileReader("src\\A编写的小功能\\点名器\\Name.txt"));
        String line;

        while((line=br.readLine())!=null){
            //注意，实例化元素得放到while中，否则只会不停重写一个内容
            Attribute attribute = new Attribute();
            String[] split = line.split(",");
            attribute.setName(split[0]);
            attribute.setDanger(split[1]);
            array.add(attribute);
//            System.out.println("存入了"+line);
        }

//        Collections.shuffle(array);
        //随机后的名表
        for (Attribute s :array){
            System.out.println(s.getName()+s.getDanger());
        }
        ArrayList<Integer> arr = new ArrayList<>();
        arr = Attribute.Random(array);
//        for(Integer s:arr){
//            System.out.println(s);
//        }
        mainMenu(array,arr);
    }/**
     难度等级分为0-5级，等级越高危险程度越高或敌对或不可预料,6则是遇到就寄
     */
    public static void mainMenu(ArrayList<Attribute> arrayList,ArrayList<Integer> arr){
        System.out.println("----随机抽取一位进行符卡战-----");
        System.out.println("你抽取到的是："+arrayList.get(arr.get(0)).getName()+"\n遭遇危险等级："+arrayList.get(arr.get(
                0
        )).getDanger());


    }
}
