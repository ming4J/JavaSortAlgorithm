package cn.shellming.impl;

import java.util.Arrays;

/**
 * @ClassName InsertionSort
 * @Description TODO
 * @Author shaoming
 * @Date 2020/4/2 2:47 上午
 */
public class InsertionSort implements ArraySort {
    @Override
    public int[] sort(int[] sourceArray) {
        long t1 = System.currentTimeMillis();
        int[] res = Arrays.copyOf(sourceArray,sourceArray.length);
        for(int i = 1; i < res.length; ++i){
            for(int j = i; j > 0; --j){
                if(res[j] < res[j - 1]){
                    int temp = res[j];
                    res[j] = res[j - 1];
                    res[j - 1] = temp;
                }
            }
        }
        System.err.println(this.getClass().getName() + "      " + (System.currentTimeMillis() - t1));
        return res;
    }
}
