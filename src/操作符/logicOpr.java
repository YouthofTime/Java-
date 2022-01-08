package 操作符;

import java.util.Scanner;

public class logicOpr {
    public static void main(String[] args) {
        /*练习 长路短路与或，异或*/
        int i=-4,j=1;
        if(j==2&&j++==1);
        System.out.println("短路与"+j);
        if(j==1||j++==1);
        System.out.println("短路非"+j);
        System.out.println("异或运算数字（每位二进制异或）"+(i^j)+Integer.toBinaryString(i^j));
        boolean b1=true,b2=false;
        System.out.println(b1^b2);
        System.out.println(i+"的二进制为"+Integer.toBinaryString(i)+"按位取非"+~i);
        System.out.println(i>>1);//i最高位为符号位
        System.out.println(i>>>1);//i看作一个无符号数
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.println("读取字符串:");
        String s1=s.next();
        System.out.println(s1);
    }
}
