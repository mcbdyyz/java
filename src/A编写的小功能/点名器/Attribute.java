package A编写的小功能.点名器;

import java.util.*;

public class Attribute {
    private String name;
    private String danger;

    public Attribute(String name, String danger) {
        this.name = name;
        this.danger = danger;
    }

    public Attribute() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDanger() {
        return danger;
    }

    public void setDanger(String danger) {
        this.danger = danger;
    }
    public static ArrayList<Integer> Random(ArrayList<Attribute> a){
        Random random = new Random();
        boolean f =true;
        ArrayList<Integer> i = new ArrayList<>();
        i.add(random.nextInt(a.size()));
        while(i.size()<a.size()) {
            int num=random.nextInt(a.size());
            for(Integer num2:i){

                if(num2 -num==0){
                    f =false;
                    break;
                }else{
                   f=true;
                }

            }
            if(f) {
                i.add(num);
            }
        }
        return i;
    }
}
