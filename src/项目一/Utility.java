package 项目一;

import java.util.Scanner;

public class Utility {
    private static Scanner scanner = new Scanner(System.in);

    public static int readdMenuSelection() {
        int c = 0;
        String str = readKeyBoard();
        try {

                switch (str) {
                    case "1":

                        break;
                    case "2":

                        break;
                    case "3":

                        break;
                    case "4":
                        exit();
                       break;
                    default:
                        System.out.println("请重新输入");
                }

        } catch (Exception e) {
            System.out.println("请重新输入");
        }
        return c;
    }

    public static String readKeyBoard() {
        String sele = scanner.next();

        return sele;
    }

    private static void exit () {
        System.out.println("是否退出Y/N:");
        String s = scanner.nextLine();
        try {
            if ("Y".equals(s) || "N".equals(s)) {

            }
        }catch (Exception e){
            System.out.println("sfasldfhakls");
        }

    }
}
