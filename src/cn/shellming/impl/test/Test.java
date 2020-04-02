package cn.shellming.impl.test;

import cn.shellming.impl.*;

import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName Test
 * @Description TODO
 * @Author shaoming
 * @Date 2020/3/31 10:39 下午
 */
public class Test {
    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        System.err.println(Arrays.toString(sort.sort(Test.randomNumber(1000))));
        SelectionSort selectionSort = new SelectionSort();
        System.err.println(Arrays.toString(selectionSort.sort(Test.randomNumber(100000))));
        InsertionSort insertionSort = new InsertionSort();
        System.out.println(Arrays.toString(insertionSort.sort(Test.randomNumber(1000))));
        InsertionSortII ii = new InsertionSortII();
        System.out.println(Arrays.toString(ii.sort(Test.randomNumber(10))));
        ShellSort shellSort = new ShellSort();
        System.out.println(Arrays.toString(shellSort.sort(Test.randomNumber(10))));
    }

    public static int[] randomNumber(int n){
        int [] test = new int[n];
        Random random = new Random();
        for(int i = 0; i < n; ++i){
            int t = random.nextInt(n);
            System.out.print(t + " ");
            test[i] = t;
        }
        System.out.println();
        return test;
    }
}
