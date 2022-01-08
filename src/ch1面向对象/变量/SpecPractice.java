package ch1面向对象.变量;

public class SpecPractice {
        int i = 1; //属性名是i
        public void method1(int i){ //参数也是i
            System.out.println(i);// 优先级高于属性的
        }

        public static void main(String[] args) {
            new SpecPractice().method1(5);
            //结果打印出来是 1还是5?
        }
}
