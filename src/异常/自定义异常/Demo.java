package 异常.自定义异常;

import java.util.Scanner;

/**
 * 自定义异常类：
 * public class 异常类名 extends Exception{}继承Exception及可
 * */
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输出分数");
        int score = sc.nextInt();
        teacher teacher = new teacher();
        try {
            teacher.checkScore(score);//因为这个方法抛出了异常，
        } catch (ScoreException e) {
            e.printStackTrace();
        }

    }
}
