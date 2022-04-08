package Hw;

public class A测试关系运算符 {
    public static void main(String[] args){
        int a = 3;
        int b = 4;
        boolean c =a>b;
        System.out.println(c);

        char d ='h';//char位于0-65536区间，可以通过（int）强制转换成数字
        System.out.println((int)d);
        boolean e = d > 100;
        System.out.println(e);
    }
}
