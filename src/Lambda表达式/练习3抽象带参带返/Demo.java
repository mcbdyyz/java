package Lambda表达式.练习3抽象带参带返;

public class Demo {
    public static void main(String[] args) {
        useAnimal((String a,int b)->{
//            System.out.println(a+","+b);
//            System.out.println("This cat name is hiiro");
            return a+","+b+"\tShe name is Elysia";
        });
    }
    public static void useAnimal(Animal a){
        String s =a.type("猫",18);
        System.out.println(s);
    }
}
