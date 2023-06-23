package A编写的小功能.有限次数猜数游戏;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

/**
 * 通过Properties集合功能来记录游戏游玩的次数，到达次数将无法再玩
 * */
public class main {
    public static void main(String[] args) {
        Properties pr = new Properties();
        Scanner sc = new Scanner(System.in);
        int c = 0;
        while(true) {
            System.out.println("猜数首页：输入1开始游戏，输入2结束程序");
            String s = sc.nextLine();
            switch(s){
                case "1":
                    count(c);

                    break;
                case"2":
                    System.out.println("欢迎下次再来");
                    System.exit(0);
                    break;
                case "3":
                    reWriter();
            }
        }
    }

    private static void reWriter() {
        Properties pr = new Properties();
        pr.setProperty("count","0");
        try(FileWriter fw = new FileWriter("src\\A编写的小功能\\有限次数猜数游戏\\count.txt");) {
            pr.store(fw,null);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void count(int c){
        Properties pr = new Properties();
        int num;
//        pr.setProperty("count", String.valueOf(c));
        try(FileReader fr = new FileReader("src\\A编写的小功能\\有限次数猜数游戏\\count.txt");
            FileWriter fw = new FileWriter("src\\A编写的小功能\\有限次数猜数游戏\\count.txt",true);
            ) {
            pr.load(fr);
            System.out.println(pr);
            if(Integer.parseInt(pr.getProperty("count"))==3){
                System.out.println("你游戏的次数已达上限，请充钱");
            }else{
                Game.start();
                num=Integer.parseInt(pr.getProperty("count"))+1;
                pr.setProperty("count",String.valueOf(num));
            }
            pr.store(fw,null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
