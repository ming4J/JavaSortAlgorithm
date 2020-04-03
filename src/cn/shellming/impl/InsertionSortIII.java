package cn.shellming.impl;

import java.util.Arrays;

/**
 * @ClassName InsertionSortIII
 * @Description TODO
 * @Author shaoming
 * @Date 2020/4/4 2:01 上午
 */
public class InsertionSortIII implements ArraySort {
    @Override
    public int[] sort(int[] sourceArray) {
        int[] arr = Arrays.copyOf(sourceArray,sourceArray.length);
        int low,high,m,temp,i,j;
        for(i = 1;i<arr.length;i++){
            low = 0;
            high = i-1;
            while(low <= high){
                m = (low+high)/2;
                if(arr[m] > arr[i]) {
                    high = m - 1;
                } else {
                    low = m + 1;
                }
            }
            temp = arr[i];
            for(j=i;j>high+1;j--){
                arr[j] = arr[j-1];
            }
            arr[high+1] = temp;
        }
        return arr;
    }
}
