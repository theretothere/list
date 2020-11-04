package genericity;

/**
 * @Version 1.0
 * @Author: Hu
 * @DATE: 2020/11/3
 * Content:
 */

public class Cat<T> {
    private T cat;
    public T getCat(T t){
        this.cat = t;
        return t;
    }
    public void getType(){
        System.out.println("T的实际类型为："+cat.getClass().getName());
    }

    public static void main(String[] args) {
        Cat box = new Cat();
        System.out.println(box.getCat(1));
        box.getType();
        System.out.println(box.getCat("Tom"));
        box.getType();
    }
}
