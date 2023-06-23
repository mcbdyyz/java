package 特殊操作流.复制java文件字符打印流优化版;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException {
        //先读取文件，这个打印流只能输出，没有读取
        BufferedReader br = new BufferedReader(new FileReader("src\\特殊操作流\\skip.java"));
        //打印流,记得要写true，这才能自动更新
        PrintWriter pw = new PrintWriter(new FileWriter("src\\特殊操作流\\复制java文件字符打印流优化版\\copy.java"),true);
        String line;
        while((line=br.readLine())!=null){
            pw.println(line);
        }
        br.close();
        pw.close();
    }
}
