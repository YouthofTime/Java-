package 变量;

public class AllPractice {
    final int j=3; // 必须初始化
    public static void main(String[] args) {
        boolean b1=true; //注意不能使用0，1赋值
        float f1=3.4f; //后缀f不要忘记了

        /*练习1基本类型*/
        float f=3.14f;
        float f2=2.76934348f;
        double d1=2.123456789123456178;
        char c='吃';
        String str="不可描述";
        boolean b2=false;
        System.out.println(f2);
        System.out.println(d1);

        /*练习2字面值
        * dec hex ox bin
        * */
        long l1=433L;
        int decVal=23;
        int hexVal=0x17;
        int oxVal=027;
        int binVal=0b10111;
        System.out.println(hexVal+" "+oxVal+" "+binVal);
        //科学计数法
        float f3=1.32e3f;
        System.out.println(f3);
        //转义字符\
        System.out.println("你好\n嗯你好\t哇4\\");
        System.out.println("\'\"");

        /*练习3类型转换*/
        // short和char;
        char c1='b';
        short s=(short)c1;
        System.out.println(s);
        byte b=(byte)256; // 注意超过范围会提示强制转换
        System.out.println(Integer.toBinaryString(b));
        System.out.println(b);
        short s1=1;
        short s2=2;
        short s3=(short)(s1+s2);
        System.out.println(s3);
        /*练习4变量命名规则*/
        int $2;
        int _23;
        int ab$_a;
        int a4gd;
        final int j=3;
        System.out.println(j);
        new AllPractice().method(4);
    }
    public void method(final int j){
        System.out.println(j);
    }
}
