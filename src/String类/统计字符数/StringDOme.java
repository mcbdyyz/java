package String类.统计字符数;

import java.util.Scanner;

public class StringDOme {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("please input a String");
        String lin = s.nextLine();

        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        // 遍历
        for (int i = 0; i < lin.length(); i++) {
            char ch = lin.charAt(i);
            if(ch>='A'&& ch<='Z'){
                bigCount++;
            }else if(ch>='a'&&ch<='z'){
                smallCount++;
            }else if(ch>='0'&&ch<='9') {
                numberCount++;
            }
        }
        System.out.println("大写数"+bigCount+"\t小写数："+smallCount+"\t数字数："+numberCount);

    }
}
