package Hw;

public class While1到100和偶数和奇数和 {
    public static void main(String[] args) {

        int a = 0;
        int sum = 0;
        int oddSum = 0;
        int evenSum = 0;
        for (a = 0; a <= 100; a++) {
            sum = sum + a;
            if (a % 2 == 0) {
                evenSum += a;
            }else{
                oddSum += a;
            }
        }
        System.out.println(sum);
        System.out.println(evenSum);
        System.out.println(oddSum);

    int b = 0;
    while(b<=130) {
        System.out.println(b+"\t");
        if(b%5==0){
            System.out.println();
        }
        b++;
    }
    }
}
