package String类.StringBuilder;

//TODO:在字符串拼接中，常量池因为无法自动拼接子字符串，所以会不停创建字符串，这样会很占用内存
//TODO:所以java提供了一个方法，StringBuilder来解决这个问题，

public class StringBuilderDome {
    public static void main(String[] args) {
        //StringBuilder 是可以改变内容，所以就不用不停重创常量池地址
        StringBuilder sb = new StringBuilder();//一个空的字符串空间
        sb.append("hello");
        sb.append("123").append("345").append("567");//添加
        System.out.println("sb:"+sb);


        StringBuilder sb1 = new StringBuilder();//一个空的字符串空间
        sb1.append("world");
        System.out.println("sb:"+sb1);

        sb1.reverse();//翻转
        System.out.println(sb1);

        //===============================相互转换
        StringBuilder uuz = new StringBuilder();
        uuz.append("西行寺幽幽子");
//        String yyz = uuz;//错误示范
        String yyz1 = uuz.toString();
        System.out.println(yyz1);

        //String to StringBuilder
        String s = "hello";
//        StringBuilder uuz1 = s;//错误示范
        StringBuilder uuz1 = new StringBuilder(s);
        System.out.println(uuz1);
    }



}
