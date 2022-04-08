package Hw;

public class TestFor {
    public static void main(String[] args) {
        /*
        int a =0;//初始化部分
        while(a<3){//布尔表达式
            System.out.println("I LOVE U!---"+a);//循环体

            a++;//迭代因子
        }*/

        for (int a = 0; a < 3; a++) {
            System.out.println("I LOVE U!---" + a);
        }

        for (int i = 9; i > 0; i--) {
            System.out.println(i+"\t");
        }
        //输出90-1之间能被三整除的数
        for(int i=90;i>0;i-=3){

            System.out.println(i+"\t");
        }
    }
}
