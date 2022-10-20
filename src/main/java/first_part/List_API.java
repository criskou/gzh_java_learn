package first_part;

import org.junit.Test;

import java.util.LinkedList;

/**
 * @Author criskou
 * @Date 2022/10/2022:16
 * @Description
 */
public class List_API {
    public static void main(String[] args) {
        Base b = new Extend();
        // b.run() //报错


        //问题拓展：常见集合的常用方法有哪些？
    }

    @Test
    public static void removeLastElem_LinkedList(){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.removeLast();
        //当声明为List而不是LinkedList时，调用不了该方法。
        //因为父类无法调用子类方法非同名方法。
    }
}


class Base{
    public void speak() {
        System.out.println("nihao");
    }
}

class Extend extends Base{
    @Override
    public void speak() {
        System.out.println("yeah");
    }

    public void run() {
        System.out.println("run");
    }
}
