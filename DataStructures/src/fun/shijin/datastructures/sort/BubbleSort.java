package fun.shijin.datastructures.sort;

import java.util.Arrays;

/**
 * @Author Jiaman
 * @Date 2022/11/29 9:50
 * @Desc
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 9, 5, 3, 8, 10, 5, 83};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        // 标志
        boolean flag = false;
        // 临时变量
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 前面的数据比后面大，交换
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            // 一趟排序没发生，退出
            if (!flag) {
                break;
            } else {
                // 重置标志
                flag = false;
            }
        }

    }
}
