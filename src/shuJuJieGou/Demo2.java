package shuJuJieGou;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) throws Exception{
        List<Integer> array =new ArrayList<>();
        array.add(1);
        array.add(11);
        array.add(8);
        array.add(20);
        array.add(13);
        array.add(28);
        array.add(12);

        int clu =array.size();
        int i =0;
        if(i<0 || i>=array.size()+1){
            throw new Exception();
        }
        System.out.println(clu);
        array.remove(3);
        System.out.println(array.size());

        int max =array.get(0);
        for (int j = 1; j < array.size(); j++) {
            if(max<array.get(j))
                max =array.get(j);
        }
        if((double)clu/max<0.4&&clu>max){
            clu =array.size()/2;
        }
        System.out.println(clu);

    }
}
