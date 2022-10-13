package first_part;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author criskou
 * @Date 2022/10/1123:31
 * @Description 这篇代码记录一下我面试过程中遇到的排序问题
 */
public class Sort_related {
    public static void main(String[] args) {

        //主要问题：Arrays.sort()默认升序排序，怎么降序排序呢？
        //升序
        int[] arr1={1,4,3,6,7,9};
        Arrays.sort(arr1);
        System.out.println("升序："+Arrays.toString(arr1));

        //第一种方法：调用API，注意不能使用int数组了，要使用Integer数组
        Integer[] arr2={1,4,3,6,7,9,11};
        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println("调API："+Arrays.toString(arr2));

        //第二种方法：重载比较器进行降序,同样地使用Integer数组
        Integer[] arr3={1,4,3,6,7,9,11};
        Arrays.sort(arr3, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println("重载比较器："+Arrays.toString(arr3));

        //次要问题一：我想把以上代码中的匿名对象以lambda表达式的方式写出来，没成功
        Integer[] arr4={1,4,3,6,7,9,11};
        Arrays.sort(arr4,(o1,o2) -> o2 - o1);
        System.out.println("lambda："+Arrays.toString(arr4));

        //次要问题二：关于面试题的区间排序，其实是有API的
        //同样的可以传入比较器控制升序还是降序
        Integer[] arr5={1,4,3,6,7,9,11};
        Arrays.sort(arr5,2,5);
        System.out.println("区间排序："+Arrays.toString(arr5));

        //次要问题三：排序写废了，复习一下
    }
}
