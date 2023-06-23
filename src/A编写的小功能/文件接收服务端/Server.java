package A编写的小功能.文件接收服务端;

import 网络编程.TCP收发数据.练习6多线程文件上传.ServerSock;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 客户端->文件名->服务器返回ok,
 */
public class Server {
    public static void main(String[] args) throws IOException {
        //开启服务器
        ServerSocket ss = new ServerSocket(10086);
        //底文件路径
        File file = new File("D:\\");
        String filename= null;
        boolean flag =true;
        String s1 =null;
        while (true) {
            //监听

            //接收

            //读写
            boolean fi= true;
            while(fi) {
                Socket sk = ss.accept();
                BufferedInputStream is = new BufferedInputStream(sk.getInputStream());
                byte[] bys = new byte[1024];
                int b;
                while ((b = is.read(bys)) != -1) {

                    String s = new String(bys, 0, b);
                    System.out.println(s);
                    if (s.equals("文件名传完了")) {
                        fi=false;
                        break;
                    }
                    //得到第一个目录
                    if (s.split(",")[1].equals("卡斯兰娜") && s.endsWith(",卡斯兰娜")) {
                        System.out.println("kasinanla来了");
                        if (flag) {
                            flag = false;
                            s1 = s.split(",")[0];//单独赋值
                            System.out.println("这是:" + s1);
                        }
                        String s2 = new StringBuilder(s).delete(s.length() - 5, s.length()).toString();//删除后缀
                        String fileWord = deleteWord(s2, s1);

//                        System.out.println(fileWord);

                        File dofile = new File(file, fileWord);//得到文件路径
                        if (!dofile.exists()) {//判断目录是否存在
                            dofile.mkdir();//创建目录
                        }
                    }

                    //判断数据是否是文件
                    else if (s.split(",")[1].equals("阿波卡利斯") && s.endsWith(",阿波卡利斯")) {
                        System.out.println("abkls来了");
                        s = new StringBuilder(s).delete(s.length() - 6, s.length()).toString();
                        filename = deleteWord(s, s1);
                        System.out.println(filename);

                        Socket sk2 = ss.accept();
                        System.out.println("来到了这里");
                        File file1 = new File(file, filename);
                        BufferedInputStream bis = new BufferedInputStream(sk2.getInputStream());
                        BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream(file1));
                        byte[] bys1 = new byte[1024];
                        int b1 = 0;
                        while ((b1 = bis.read(bys1)) != -1) {
//                            if (new String(bys1, 0, b1).equals("文件传完了")) {
//                                break;
//                            }
                            bw.write(bys1,0,b1);
                            bw.flush();

                        }
                        bw.close();
                    }

                }

            }

        }
    }

    private static String deleteWord(String s,String s1){
        return new StringBuilder(s).delete(0,s.indexOf(s1)).toString();
    }
}
