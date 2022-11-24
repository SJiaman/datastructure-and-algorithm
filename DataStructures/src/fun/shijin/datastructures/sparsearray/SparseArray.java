package fun.shijin.datastructures.sparsearray;

/**
 * @Author Jiaman
 * @Date 2021/2/9 12:30
 * @Desc 对于一个较大的数组有很多数据没有意义，可以使用稀疏数组来做存储数组的值，节约空间
 */

public class SparseArray {
    public static void main(String[] args) {
        //创建原始二维数组
        int chessArr1[][] = new int[11][11];
        chessArr1[2][3] = 1;
        chessArr1[3][4] = 2;
        chessArr1[5][6] = 3;

        //遍历数组
        System.out.println("原始数组");
        for (int[] row : chessArr1) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

        //创建稀疏数组
        //1.获取值的总个数
        int sum = 0;
        for (int i = 0; i < chessArr1.length; i++) {
            for (int j = 0; j < chessArr1.length; j++) {
                if (chessArr1[i][j] != 0){
                    sum++;
                }
            }
        }

        //创建sparsearray
        int sparsearr[][] = new int[sum+1][3];

        //赋值数组
        sparsearr[0][0] = 11;
        sparsearr[0][1] = 11;
        sparsearr[0][2] = sum;
        
        //给稀疏数组赋值
        int count = 0;
        for (int i = 0; i < chessArr1.length; i++) {
            for (int j = 0; j < chessArr1.length; j++) {
                if (chessArr1[i][j] != 0 ){
                    count++;
                    sparsearr[count][0] = i;
                    sparsearr[count][1] = j;
                    sparsearr[count][2] = chessArr1[i][j];
                }
            }
        }

        //遍历数组
        System.out.println("稀疏数组：");
        for (int i = 0; i < sparsearr.length; i++) {
            System.out.printf("%d\t%d\t%d\n", sparsearr[i][0], sparsearr[i][1], sparsearr[i][2]);
        }
        
        //稀疏数组 ----> 原始数组
        int originalArr[][] = new int[sparsearr[0][0]][sparsearr[0][1]];

        for (int i = 1; i < sparsearr.length; i++) {
            originalArr[sparsearr[i][0]][sparsearr[i][1]]  = sparsearr[i][2];
        }

        System.out.println("原始数组：");
        for (int[] row : originalArr) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

    }
}
