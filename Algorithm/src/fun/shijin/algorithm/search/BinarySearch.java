package fun.shijin.algorithm.search;

import fun.shijin.algorithm.sort.QuickSort;

import java.util.Arrays;

/**
 * @Author Jiaman
 * @Date 2022/11/29 11:21
 * @Desc 二分查找
 * 需要排序好
 */

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {7, 5, 3, 9, 5, 3, 8, 10, 5, 83};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        int index = binarySearch(arr, 9);
        System.out.println(index);
    }

    public static int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while(low <= high) {
            mid = (low + high) / 2;
            // 等于直接返回
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                // 向左查找
                high = mid - 1;
            } else {
                // 向右查找
                low = mid + 1;
            }
        }
        return - 1;
    }
}
