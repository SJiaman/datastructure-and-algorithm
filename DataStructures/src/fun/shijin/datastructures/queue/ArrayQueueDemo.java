package fun.shijin.datastructures.queue;

import java.util.Queue;

/**
 * @Author Jiaman
 * @Date 2022/4/14 21:53
 * @Desc
 */

public class ArrayQueueDemo {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(3);



        queue.showQueue();

        queue.pushQueue(2);
        queue.pushQueue(3);
        queue.pushQueue(18);

        queue.showQueue();


        int i = queue.pullQueue();

        System.out.println("取出元素为：" + i);

        int i2 = queue.pullQueue();

        System.out.println("取出元素为：" + i2);

        queue.showQueue();
    }

}

class ArrayQueue {
    /**
     * 队列最大容量
     */
    private int maxSize;

    /**
     * 队列头
     */
    private int font;

    /**
     * 队列尾
     */
    private int rear;

    /**
     * 存储数据数组
     */
    private int[] arr;

    /**
     * 构建队列
     * @param maxSize 设置最大容量
     */
    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        this.arr = new int[maxSize];
        this.font = -1;
        this.rear = -1;
    }

    /**
     * 判断队列是否满
     */
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    /**
     * 判断队列是否为空
     */
    public boolean isEmpty() {
        return font == rear;
    }

    /**
     * 出队列
     */
    public int pullQueue() {
        if (isEmpty()){
           throw new RuntimeException("队列空，不能取数据");
        }
        font++;
        return arr[font];
    }

    /**
     * 添加元素
     * @param n
     */
    public void pushQueue(int n) {
        if (isFull()) {
            System.out.println("队列已满");
            return;
        }
        rear++;
        arr[rear] = n;
    }

    /**
     * 队列展示
     */
    public void showQueue() {
        if (isEmpty()) {
            System.out.println("队列为空");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("a[%d]=%d\t", i, arr[i]);
        }
    }
}