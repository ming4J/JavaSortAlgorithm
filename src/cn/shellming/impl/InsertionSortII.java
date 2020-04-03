package cn.shellming.impl;

import java.util.Arrays;

/**
 * @ClassName InsertionSortII
 * @Description TODO
 * @Author shaoming
 * @Date 2020/4/2 4:50 下午
 */
public class InsertionSortII implements ArraySort {
    @Override
    public int[] sort(int[] sourceArray) {
        long t1 = System.currentTimeMillis();
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);
        for(int i = 1; i < arr.length; ++i){
            int temp = arr[i];
            int j = i;
            while(j > 0 && temp < arr[j - 1]){
                arr[j] = arr[j - 1];
                j--;
            }
            if(i != j){
                arr[j] = temp;
            }
        }
        System.err.println(this.getClass().getName() + "      " + (System.currentTimeMillis() - t1));
        return arr;
    }
}
