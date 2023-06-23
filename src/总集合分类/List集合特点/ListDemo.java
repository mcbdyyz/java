package 总集合分类.List集合特点;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * List同样是一个接口
 * 所以用多态的方法
 * */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");
        list.add("uuz");
        list.add(1,"xxs");// todo add用index插入的数据自动代替原本的位置，被代替的元素向后移
        System.out.println(list);
        list.add(2,"uuz");
        System.out.println(list);
        System.out.println(list.remove(0));//返回删掉的元素，选错会越界
        System.out.println(list.remove("uuz"));//这个删除顺序从小到大，返回值为boolean类型
        System.out.println(list);
        //遍历集合
        //for方法

        //*---------------------
        ListException();

    }
    public static void ListException(){
        List<String> list = new ArrayList<>();
        list.add("yyz");
        list.add("xxs");
        list.add("uuz");
        // 报错：ConcurrentModificationException当不允许这样修改时，可以通过检测到对象的并发修改的方法来抛出此异常
       /* Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            if(s.equals("xxs")){
                list.add("ling meng");
            }
        }*todo 并发修改异常
        */
        for(int i =0;i<list.size();i++){
            if(list.get(i).equals("xxs")){
                list.add("!!!!");
            }
            System.out.println(list.get(i));//get 没有进行预期和实际修改值是否相同所以可以


        }
        // todo 这样及时动态变动也不会报错，因为这是最基础的方法


    }
}
