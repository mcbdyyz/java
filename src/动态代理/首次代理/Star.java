package 动态代理.首次代理;

public class Star implements Skill{
    private String name;
    public Star(String Starname){
        this.name=Starname;
    }

    @Override
    public void jump() {
        System.out.println(name+"开始跳舞");
    }

    @Override
    public void sing() {
        System.out.println(name+"开始唱歌");

    }
}
