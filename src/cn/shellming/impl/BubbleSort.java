package cn.shellming.impl;

import java.util.Arrays;

/**
 * @ClassName BubbleSort
 * @Description TODO
 * @Author shaoming
 * @Date 2020/3/31 10:33 下午
 */
/**
 * 算法步骤
 *
 * 1.比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 * 2.对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
 * 3.针对所有的元素重复以上的步骤，除了最后一个。
 * 4.持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 */
public class BubbleSort implements ArraySort {
    @Override
    public int[] sort(int[] sourceArray) {
        long t1 = System.currentTimeMillis();
        int[] res = Arrays.copyOf(sourceArray,sourceArray.length);
        for(int i = 1; i < res.length; ++i){
            boolean flag = true;
            for (int j = 0; j < res.length - i; ++j){
                if(res[j] > res[j + 1]){
                    int temp = res[j];
                    res[j] = res[j + 1];
                    res[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag){
                break;
            }
        }
        System.err.println(this.getClass().getName() + "      " + (System.currentTimeMillis() - t1));
        return res;
    }
}
