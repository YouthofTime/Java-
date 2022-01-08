package 控制流程;

import java.util.Scanner;

/**
 * 练习
 * 1:BMI 2:闰年判断 3:季节(switch) 4:阶乘 5:乞丐要钱(for)
 * 6:跳过倍数 7:百万富翁 8:跳出外部循环(outloop:)
 * @Date 2022/1/3
 * @Author zym
 */
public class ControlFlow {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*练习1-BMI
        System.out.println("请输入身高(m):");
        float height=scanner.nextFloat();
        System.out.println("请输入体重(kg):");
        float weight=scanner.nextFloat();
        float bmi=weight/(height*height);
        System.out.println("当前的BMI是:"+bmi);
        String bodyStatus="";
        if(bmi<18.5)
            bodyStatus="体重过轻";
        else if(bmi<24)
            bodyStatus="正常范围";
        else if(bmi<27)
            bodyStatus="体重过重";
        else if(bmi<30)
            bodyStatus="轻度肥胖";
        else if(bmi<35)
            bodyStatus="中度肥胖";
        else
            bodyStatus="重度肥胖";
        System.out.println("身体状态是:"+bodyStatus);
        */

        /*练习2-闰年判断
        System.out.println("请输入年份");
        int year=scanner.nextInt();
        boolean isLeapYear=false;
        if((year%4==0&&year%100!=0)||year%400==0)
            isLeapYear=true;
        if(isLeapYear)
            System.out.println(year+"是闰年");
        else
            System.out.println(year+"不是闰年");
        */

        /*练习3-季节switch（多种情况）
        System.out.println("请输入月份");
        int month=scanner.nextInt();
        switch (month){
            case 1:
            case 2:
            case 3:
                System.out.println("春天");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("夏天");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("秋天");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("冬天");
                break;
        }
         */

        /*练习4-阶乘
        System.out.println("请输入一个整数");
        int factorial=scanner.nextInt();
        int i=1;
        int sum=1;
        while (i<factorial)
        {
            sum*=(i+1);
            i+=1;
        }
        System.out.println("阶乘是:"+sum);
         */

        /*练习5-乞丐
        int money=1;
        int sum=0;
        for(int i=1;i<=10;i++){
            System.out.println("第"+i+"天要了"+money+"块钱");
            sum+=money;
            money<<=1;
        }
        System.out.println("洪乞丐干10天,收入为"+sum+"块钱");
        System.out.println(Integer.toBinaryString(sum));

         */

        /*练习6-跳过倍数
        for(int i=1;i<101;i++)
        {
            if(i%3==0||i%5==0)
                continue;
            System.out.println(i);
        }

         */
        /*练习7-百万富翁
        int yearSurplus=12000; // 本金积累到12000开始投资
        float finalIncome=0;
        int year=0;
        while (finalIncome<1000000){
            year+=1;
            finalIncome+=yearSurplus*(Math.pow(1+0.2,year));
            System.out.println("第一年收入"+finalIncome+"元");
        }
        System.out.println("持续投资"+year+"年，总收入达到100万");

         */
        /*练习8-跳出外部循环*/
        outloop:
        for(int i=0;i<10;i++) {
            for (int j = 0; j < 10; j++)
                if (0 == j % 2)
                    break outloop;
            System.out.println(i);
        }
        System.out.println("第一个标签");
        outloop:
        for(int i=0;i<10;i++) {
            for (int j = 0; j < 10; j++)
                if (0 == j % 2)
                    break outloop;
            System.out.println(i);
        }
        System.out.println(1);
        System.out.println("第二个标签");
    }
}
