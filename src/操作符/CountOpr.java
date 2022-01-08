package 操作符;
import java.util.*;
public class CountOpr {
    public static void main(String[] args) {
        /*练习1计算俩个数的和*/
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        System.out.println("第一个整数:"+a);
        int b=s.nextInt();
        System.out.println("第二个整数:"+b);
        int sum=a+b;
        System.out.println("俩个数的和是:"+sum);
        /*练习2 BMI计算*/
        System.out.println("请输入身高(m):");
        float height=s.nextFloat();
        System.out.println("请输入体重(kg):");
        float weight=s.nextFloat();
        float bmi=weight/(height*height);
        System.out.println("当前的BMI是:"+bmi);
    }
}
