package shuJuJieGou;

public class Demo1 {
    void merge(int[] a,int[] b){
        int i =0,
            j =0,
            k =0,
            temp =0;
        int alength =a.length;
        int blength =b.length;
        int clength =alength+blength;

        int[] c =new int[clength];
        //把重复的值转换为0
        for(int brr:b){
            for (int arr=0;arr<alength;arr++)
                if(brr==a[arr]){
                    a[arr]=0;
                }
        }
        //先存入后排序
        while(i<alength) {
            c[k++] = a[i++];
        }
        while(j<blength) {
            c[k++] = b[j++];
        }
        //冒泡排序
        for (int l = 0; l < clength-1; l++) {
            for (int m = l; m < clength-1; m++) {
                if(c[l]>c[m+1]){
                    temp =c[l];
                    c[l]=c[m+1];
                    c[m+1]=temp;
                }
            }
        }
        //数组必须是均提前排好序
        /*while(i<alength&&j<blength) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while(i<alength) {
            c[k++] = a[i++];
        }
        while(j<blength) {
            c[k++] = b[j++];
        }*/

        System.out.println("\n排序好的是：");
        for(int ar :c){
            System.out.println(ar);
        }


    }
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        int[] a = {1, 5, 8, 10,50};
        int[] b = {3, 5, 9,11,12,15,10};

        d1.merge(a, b);

    }

}
