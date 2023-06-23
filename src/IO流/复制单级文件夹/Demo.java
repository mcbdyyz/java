package IO流.复制单级文件夹;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws IOException{
        File srcFolder = new File("E:\\Photo");
        String srcFolderName = srcFolder.getName();
        File destFolder = new File("src\\IO流\\复制单级文件夹",srcFolderName);
        //判断目的地目录对应的File是否存在，如果不存在，就创建
        if(!destFolder.exists()){
            destFolder.mkdir();
        }
        File[] files = srcFolder.listFiles();
        assert files != null;
        for(File f :files){
            String name = f.getName();
            File destFile = new File(destFolder,name);
            copyFile(f,destFile);
            System.out.println("复制了"+f.getName());
        }
    }

    private static void copyFile(File f, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        byte[] b = new byte[1024];
        int by;
        while((by =bis.read(b,0,b.length) )!=-1){
            bos.write(b);
        }
        bos.flush();
        bis.close();
        bos.close();
    }
}
