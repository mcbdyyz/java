package IO流.File类.字符流;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**InputStreamReader：是从字节流到字符流的桥梁
 * 它读取字节，并使用指定的编码将其解码为字符
 *
 * OutputStreamWrite：是从字符流到字节流的桥梁
 * 是从字符流到字节流的桥梁，使用指定的编码将写入的字符编码为字节
 *
 * OutputStreamWriter (OutPutStream out)
 * InputStreamReader (InputStream in)
 * */
public class Demo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src\\IO流\\File类\\字符流\\Test.txt"));
        osw.write("幽幽子可以直接写中文了");
        osw.close();

        InputStreamReader isr = new InputStreamReader(new FileInputStream("src\\IO流\\File类\\字符流\\Test.txt"));
        int by;
        while((by = isr.read())!=-1){
            System.out.print((char)by);
        }

        charString();
    }
    /**
     * 通过字节数组，来解码指定的字节数组来构造
     * */
    public static void charString() throws UnsupportedEncodingException {
        System.out.println();
        String s = "中国";
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));//[-28, -72, -83, -27, -101, -67]

        String s1 = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(s1);
        System.out.println();

    }

}
