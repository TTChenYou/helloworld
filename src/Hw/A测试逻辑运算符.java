package Hw;

public class A测试逻辑运算符 {
    public static void main(String[]args) {
        boolean a = true;
        boolean b = false;
        System.out.println(a & b);//与:有一个false，结果为false
        System.out.println(a | b);//或:有一个true，结果为true
        System.out.println(!b);//取反
        System.out.println(a ^ b);//异或:相同false，不同true

        //短路与、短路或
        //int c = 3/0;
        boolean c = 1<2 || (4<3/0);
        System.out.println(c);
    }
}
