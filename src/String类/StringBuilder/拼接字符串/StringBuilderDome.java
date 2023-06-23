package String类.StringBuilder.拼接字符串;

public class StringBuilderDome {
    public static void main(String[] args){
        int[] arr = {1,2,3,5};
        String s = arrayToString(arr);
        System.out.println("s:"+s);

    }
    public static String arrayToString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(arr.length-1 == i){
                sb.append(i);
            }else{
                sb.append(i).append(", ");
            }

        }

        sb.append("]");

        return  sb.toString();
    }
}
