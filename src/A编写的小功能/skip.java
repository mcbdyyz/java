package A编写的小功能;

public class skip {
    public static void main(String[] args) {
        int[][] a = new int[4][];
        System.out.println(a.length);
//        for (int i =0;i<a.length;i++){
//
//        }

        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print("\t0");
            }
            System.out.println();
        }
    }
}

