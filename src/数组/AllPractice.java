package 数组;

/**
 * 练习
 *1:数组最小值 2:数组反转 3:排序(选择，冒泡) 4:合并数组
 *5:二维数组最大值
 * @Date 1/8
 * @author zym
 */
public class AllPractice {
    public static void traverse(int[]a){
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
    public static int[] randomArr(int length){
        int[]a=new int[length];
        System.out.println("随机生成数组值1-100");
        for(int i=0;i<a.length;i++){
            a[i]= (int)(Math.random()*100+1); // random得到0-1的随机浮点数,再*100 [0，100),再+1 [1,100]
            System.out.print(a[i]+" ");
        }
        System.out.println();
        return a;
    }
    public static void main(String[] args) {
        int[]a=randomArr(5);
        /* 练习1-数组最小值
        int min=101;
        for(int i=0;i<a.length;i++)
            if(a[i]<min)
                min=a[i];
        System.out.println("数组的最小值为:"+min);

         */

        /* 练习2-数组反转
        int temp;
        for(int i=0;i<a.length/2;i++){
            // 第1个和最后一个交换，第二个和倒数第二个交换，以此类推
            temp=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=temp;
        }
        System.out.println("\n数组反转:");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");

         */

        /* 练习3-排序(选择，冒泡)
        * 选择易犯错误(1.只保存最小值，应该要保存一次遍历的最小值的下标和当前遍历的第一个位置交换)
        * (2.第一层遍历到a.length,第二层遍历到a.length-1，弄反了，会导致最后一个值在前n-1次中没有参与，而且
        * 第一层应该只要遍历n-1次，最后一次只剩下一个元素也就确定了，而第二层应该要遍历到当前趟所有元素)
        *
        int min;
        int temp;
        for(int i=0;i<a.length-1;i++){
            min=i;
            boolean flag=false;
            int j=i+1;
            // 找出第i小的值
            for(;j<a.length;j++)
                if(a[j]<a[min]){
                    min=j; //保存下标
                    flag=true;
                }
            if(flag){
                temp=a[i];
                a[i]=a[min];
                a[min]=temp;
            }

        }
        System.out.println("\n使用选择正排序:");
        traverse(a);
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("\n使用冒泡逆排序");
        traverse(a);

         */
        /* 练习4-合并数组
        int[]b=randomArr(3);
        int[]c=new int[a.length+b.length];
        System.out.println("合并数组a和b");
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        traverse(c);

         */

        /* 练习5-二维数组最大值*/
        int[][]c=new int[5][5];
        System.out.println("初始化二维数组:");
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                c[i][j]= (int) (Math.random()*100+1);
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }


        int max=Integer.MIN_VALUE;
        for(int i=0;i<c.length;i++)
            for(int j=0;j<c[i].length;j++)
                if(c[i][j]>max)
                    max=c[i][j];
        System.out.println("\n二维数组中的最大值为:"+max);
    }
}
