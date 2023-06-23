package A编写的小功能.英语点单词;
//TODO:随机点写入的英文单词和中文，随机报出，然后自己来写;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * 用HashMap存英文和对应中文，中英文来源于文件English.txt，读文件，拆分，然后用方法录入hashMap，再用random函数随机不重复的输出对应索引，
 * 不重复方法，用数组接收random生成的范围内的数，如重复就不写入，然后遍历数组来输出hashmap，
 */
public class Main {
    static String num;

    public static void main(String[] args) {
        ArrayList<EnglishWord> arrayList = new ArrayList<>();
        ArrayList<String> word = new ArrayList<>();

        System.out.println();
        try {
            int i = 0;
            File f = new File("src\\A编写的小功能\\英语点单词\\English.txt");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
            String rword = bufferedReader.readLine();
            while (rword != null) {

                System.out.println("录入了：" + rword);//todo 显示录入信息

                EnglishWord englishWord = new EnglishWord();
                String[] temp = rword.split(",");
                englishWord.setEword(temp[0]);
                englishWord.setCword(temp[1]);
                arrayList.add(englishWord);
                i++;
                rword = bufferedReader.readLine();
            }
//            word = new int[i];
            boolean wflag = true;
            int k = 0;
            while (wflag) {
//                System.out.println(i);
                if (i == k) {
                    wflag = false;
                }
                Random random = new Random();
                String s = String.valueOf(random.nextInt(i));
                boolean flag = false;
                for (int j = 0; j < word.size(); j++) {
                    if (word.get(j).equals(s)) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                } else {
                    word.add(s);
                    k++;
                }
            }
//            for (String a : word) {
//
//                System.out.println(a);
//            }//todo: 显示所以输出的顺序
            while (true) {
                MainJieMian();
                switch (num) {
                    case "1":
                        System.out.println("开始猜中文");
                        getEnglish(arrayList, word);
                        break;
                    case "2":
                        System.out.println("开始猜英文");
                        getChinese(arrayList, word);
                        break;
                    case "3":
                        System.exit(0);
                        break;
                }

            }


        } catch (Exception e) {
            System.out.println("程序出错了");
        }
    }

    public static void MainJieMian() {
        System.out.println("-------------------------");
        System.out.println("-----欢迎来到点单词系统-----");
        System.out.println("-1.猜中文，2.猜英文，3退出系统");
        Scanner scanner = new Scanner(System.in);
        num = scanner.next();

    }

    public static void getEnglish(ArrayList<EnglishWord> arrayList, ArrayList<String> word) {
        String nnum;
        while (true) {

            for (String a : word) {
                System.out.println(arrayList.get(Integer.parseInt(a)).getEword());
                System.out.print("---输入猜测继续，0结束： ");
                Scanner scanner = new Scanner(System.in);
                nnum = scanner.next();
                if (nnum.equals("0")) {
                    break;
                }else{
                    System.out.println(arrayList.get(Integer.parseInt(a)).getCword());
                    System.out.println("-----------");
                }
            }
            break;
        }
    }

    public static void getChinese(ArrayList<EnglishWord> arrayList, ArrayList<String> word) {
        String nnum;
        while (true) {

            for (String a : word) {
                System.out.println(arrayList.get(Integer.parseInt(a)).getCword());
                System.out.print("---输入猜测继续，0结束 ");
                Scanner scanner = new Scanner(System.in);
                nnum = scanner.next();
                if (nnum.equals("0")) {
                   break;
                }else{
                    System.out.println(arrayList.get(Integer.parseInt(a)).getEword());
                    System.out.println("-----------");
                }

            }
            break;
        }
    }
}
