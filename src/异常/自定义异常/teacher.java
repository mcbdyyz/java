package 异常.自定义异常;

public class teacher {
    public void checkScore(int score) throws ScoreException {
        if(score<0||score>100){
//            throw new ScoreException();//如果成绩错误，就抛出这个异常对象，这个是无参的
            throw new ScoreException("你输入的分数不在0-100之间");//这是带参，传入到Exception中了
        }
        else{
            System.out.println("成绩正常");
        }
    }
}
