package 自动装箱和拆箱;
/**
 * 装箱：吧基本数据类型转换为对应的包装类型
 * 拆箱：把包装类类型转换为对应的基本数据类型
 * */
public class Demo {
    public static void main(String[] args) {
        //装箱
        Integer i = Integer.valueOf(100);
        Integer in =100;//todo Integer.valueOf(100);自动执行了这个动作，只是看不到，这是在jdk5后优化了

        // 拆箱
        in = in.intValue()+200;
        in += 200;//todo  内部有自动拆箱功能和一个自动装箱类容
        System.out.println(in);

        Integer iii = null;
        if(iii !=null){
 //todo 在使用包装类类型的时候，如果做操作，最好先判断是否为null，推荐只要是对象，在使用前就必须进行不为null的判断
            iii+=300;
            System.out.println(iii);
        }
    }
}
