package final和static用啊;

public class Fu {
    public int age=10;//TODO:if age add final,
//    public final age = 18;
    public void method(){// TODO:if final to method,the method will not override;

        age = 20;//TODO:The age will bad;
        System.out.println(age);

    }
}
