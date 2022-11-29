package fun.shijin.algorithm.sort;

import java.util.Arrays;

/**
 * @Author Jiaman
 * @Date 2022/11/29 10:07
 * @Desc 快速排序
 */

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {7, 5, 3, 9, 5, 3, 8, 10, 5, 83};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        int start = low, end = high, key = arr[low], temp = 0;
        while (end > start) {
            // 从后往前比较
            while (end > start && arr[end] >= key) {
                end--;
            }
            // 如果有比key小的 交换
            if (arr[end] <= key) {
                temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
            }
            // 从前往后比较
            while (end > start && arr[start] <= key) {
                start++;
            }
            // 如果比key大， 则交换
            if (arr[start] >= key) {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        // 递归左边
        if (start > low) {
            quickSort(arr, low, start - 1);
        }
        // 递归右边
        if (end < high) {
            quickSort(arr, end + 1, high);
        }

    }
}
