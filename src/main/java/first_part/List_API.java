package first_part;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

        //Java List集合全解
        //https://blog.csdn.net/a1781842634/article/details/116516967?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522166627641616782425167767%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=166627641616782425167767&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~baidu_landing_v2~default-5-116516967-null-null.142^v59^opensearch_v2,201^v3^control_1&utm_term=java%20List&spm=1018.2226.3001.4187

        //遍历集合的方式
        //foreach\迭代器

        // |--Iterable
        //     |--Collection
        //              API: add() \ remove() \ contains() \ size() \ isEmpty() \ clear() \
        //                      addAll() \ containsAll() \ removeAll()
        //
        //         |--List
        //                  API: set(index,value) 覆盖元素 \ get(index)
        //                          subList(startIndex,endIndex) 返回子list
        //             |--Vector 线程安全 扩容两倍
        //             |--ArrayList
        //                  说明：（1）可以存储null值
        //                            （2）底层是Object数组
        //                            （3）如果调用无参构造器，初始化时长度为0，add元素时分配初始长度为10
        //                            （4）1.5倍扩容
        //             |--LinkedList
        //                            （1）底层双向链表 first last \ prev next item五个属性(指针)
        //                            （2）增删效率高
        //         |--Set
        //             |--TreeSet
        //             |--HashSet

        //Set详解
        //https://blog.csdn.net/Qingai521/article/details/87968134?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522166670777216800184178915%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=166670777216800184178915&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~top_positive~default-2-87968134-null-null.142^v59^opensearch_v2,201^v3^control_1,213^v1^control&utm_term=java%20set&spm=1018.2226.3001.4187
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
