package A编写的小功能.复制文件夹;

import java.io.*;
/**
 * 这个复制方法可以把文件复制到java中的目录中，为了能够copy过来，所以多纯目录时，会自动添加skip.txt
 * 文件，便于copy成功，可以删掉
 * */
public class Demo {
    public static void main(String[] args) throws IOException{
        //指向文件夹
        File srcFile = new File("D:\\yyzCopy");
        //把文件夹的名字指向到要复制的地方
        File descFile = new File("src\\A编写的小功能\\复制文件夹",srcFile.getName());
        //判断是否存在这个文件，不存在则创建
        if(!descFile.exists()){
            descFile.mkdir();
        }
        FileName(srcFile,descFile);

    }
    //传入最早的文件夹和要copy指向的地方的File
    public static void FileName(File srcFile,File descFile) throws IOException{
        //把srcFile变成文件数组
        File[] files = srcFile.listFiles();
        //断言，以免文件夹为空
        assert files !=null;
        //遍历
        for(File srcfiles: files){
            //取出末端名
            String name = srcfiles.getName();
            //把末端名和descFile指向链接起来
            File newDir = new File(descFile,name);
            //skip文件
            File skipFile = new File(descFile,"skip.txt");
            //判断是否为目录
            if(srcfiles.isDirectory()){
                //是目录则创建sikp，判断这个文件夹是否存在，并递归调用FileName()方法，
                skipFile.createNewFile();
                if(!newDir.exists()){

                    newDir.mkdir();
                }
                FileName(srcfiles,newDir);
            }else{
                //调用复制方法
                System.out.println("复制了"+ srcfiles.getName());
                copyFile(srcfiles,newDir);

            }
        }
    }

    private static void copyFile(File srcfiles, File descFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcfiles));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(descFile));
        byte[] by = new byte[1024];
        int b;
        while((b =bis.read(by))!=-1){
            bos.write(by,0,b);
        }
        bis.close();
        bos.close();
    }
}
