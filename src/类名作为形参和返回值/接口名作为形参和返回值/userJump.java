package 类名作为形参和返回值.接口名作为形参和返回值;
/**
 * 使用类
 *
 * */
public class userJump {
    public void jum (Jump j){//这时候需要传递类，但是接口不能实力所以Jump j = new Cat();这样
        j.jump();

    }

    public Jump getJump(){
        Jump j = new Cat();
        return j;
    }
}
