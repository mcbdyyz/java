package A编写的小功能.有限次数猜数游戏;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private Game(){}
    public static void start(){
        Random r = new Random();
        int num = r.nextInt(100)+1;
        System.out.println("====猜数游戏开始了====");
        while(true){

            Scanner sc = new Scanner(System.in);
            int guessnumber = sc.nextInt();

            if(guessnumber>num){
                System.out.println("你输入的数大了");
            }else if(guessnumber<num){
                System.out.println("你输入的数小了");
            }else{
                System.out.println("恭喜你猜中了！");
                break;
            }
        }
    }
}
