package 泛型.泛型类;
/**
 * 这样定义的类，是没有确定类型的，属于模板类
 * */
public class FanXing<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
