package cn.shellming.impl;

import java.util.Arrays;

/**
 * @ClassName SelectionSort
 * @Description TODO
 * @Author shaoming
 * @Date 2020/3/31 11:16 下午
 */

/**
 * 算法步骤
 *
 * 1.首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置
 * 2.再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 * 3.重复第二步，直到所有元素均排序完毕。
 */

public class SelectionSort implements ArraySort {
    @Override
    public int[] sort(int[] sourceArray) {
        long t1 = System.currentTimeMillis();
        int[] res = Arrays.copyOf(sourceArray,sourceArray.length);
        // 总共要经过 N-1 轮比较
        for (int i = 0; i < res.length - 1; ++i){
            int min = i;
            // 每轮需要比较的次数 N-i
            for (int j = i + 1; j < res.length; ++j){
                if (res[min] > res[j]){
                    min = j;
                }
            }
            // 将找到的最小值和i位置所在的值进行交换
            if (min != i){
                int temp = res[min];
                res[min] = res[i];
                res[i] = temp;
            }
        }
        System.err.println(this.getClass().getName() + "      " + (System.currentTimeMillis() - t1));
        return res;
    }
}
