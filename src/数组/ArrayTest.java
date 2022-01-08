package 数组;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        /* 练习1-常见方法
        int[]a=new int[]{2,4,6,1,5,12};
        int[] b=Arrays.copyOfRange(a,0,a.length);
        int[]c=a;
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.binarySearch(b,4));
        System.out.println(Arrays.equals(a,b)); // 只要对应值相等即可
        int[] d=new int[10];
        Arrays.fill(d,5);
        System.out.println(Arrays.toString(d));

         */

        /* 练习2-二维数组排序*/
        int[][] twoDimArray=new int[5][8];
        for(int i=0;i<twoDimArray.length;i++)
            for(int j=0;j<twoDimArray[i].length;j++)
                twoDimArray[i][j]=(int)(Math.random()*100+1);
        int[] tempArray=new int[40];
        for(int i=0;i<twoDimArray.length;i++)
            System.arraycopy(twoDimArray[i],0,tempArray,twoDimArray[i].length*i,twoDimArray[i].length);
        Arrays.sort(tempArray);
        for(int i=0;i<twoDimArray.length;i++)
            System.arraycopy(tempArray,twoDimArray[i].length*i,twoDimArray[i],0,twoDimArray[i].length);
        for(int i=0;i<twoDimArray.length;i++){
            for(int j=0;j<twoDimArray[i].length;j++)
                System.out.print(twoDimArray[i][j]+" ");
            System.out.println();
        }

    }
}
