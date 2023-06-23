package IO流.File类.案例集合到文件;

import java.io.*;
import java.util.ArrayList;

public class ArrayToDate {
    public static void main(String[] args) throws IOException {
        ArrayList<String > arrayList = new ArrayList<>();
        arrayList.add("yyz");
        arrayList.add("uuz");
        arrayList.add("xxs");

        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\IO流\\File类\\案例集合到文件\\arrayToDate.txt"));
        for (String b:arrayList){
            bw.write(b);
            bw.newLine();
        }
        bw.flush();
        bw.close();

        DateToArray();
    }
    /**
     * 从文件中读取数据到集合
     * */
    public static void DateToArray() throws IOException{
        ArrayList<String> arrayList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("src\\IO流\\File类\\案例集合到文件\\arrayToDate.txt"));
        String line;
        while((line =br.readLine())!=null){
            arrayList.add(line);
        }
        for (String s : arrayList){
            System.out.println(s);
        }
    }
}
