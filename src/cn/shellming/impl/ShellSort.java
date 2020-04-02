package cn.shellming.impl;

import java.util.Arrays;

/**
 * @ClassName ShellSort
 * @Description TODO
 * @Author shaoming
 * @Date 2020/4/3 3:22 上午
 */
public class ShellSort implements ArraySort {

    @Override
    public int[] sort(int[] sourceArray) {
        long t1 = System.currentTimeMillis();
        int[] res = Arrays.copyOf(sourceArray,sourceArray.length);
        int gap = 1;
        while(gap < res.length / 3){
            gap = gap * 3 + 1;
        }
        while (gap > 0){
            for (int i = gap; i < res.length; i++) {
                int tmp = res[i];
                int j = i - gap;
                while (j >= 0 && res[j] > tmp) {
                    res[j + gap] = res[j];
                    j -= gap;
                }
                res[j + gap] = tmp;
            }
            gap = (int) Math.floor(gap / 3);
        }
        System.err.println(this.getClass().getName() + "      " + (System.currentTimeMillis() - t1));
        return res;
    }
}
