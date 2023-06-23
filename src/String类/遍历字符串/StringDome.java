package String类.遍历字符串;

import java.util.Scanner;

public class StringDome {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));

        }
    }
}
