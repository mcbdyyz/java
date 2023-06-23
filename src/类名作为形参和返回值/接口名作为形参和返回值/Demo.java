package 类名作为形参和返回值.接口名作为形参和返回值;

public class Demo {
    public static void main(String[] args) {
        userJump j = new userJump();
        Jump s = new Cat();
        j.jum(s);

        Jump jump = j.getJump();//new Cat();
        jump.jump();
    }
}
