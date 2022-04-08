package Hw;

public class Test_if01 {
    public static void main(String[] args) {
        int i = (int)(Math.random()*6)+1;
        int j = (int)(Math.random()*6)+1;
        int k = (int)(Math.random()*6)+1;

        System.out.println("第一次"+i);
        System.out.println("第二次"+j);
        System.out.println("第三次"+k);

        int count = i+j+k;

        if(count>15){
            System.out.println("好");
        }
        if(count>=10&&count<=15){
            System.out.println("中");
        }
        if(count<10){
            System.out.println("差");
        }
        System.out.println("今天得分"+count);
    }
}
