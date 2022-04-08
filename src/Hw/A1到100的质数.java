package Hw;

public class A1到100的质数 {
    //    public static void main(String[] args)
//    {
//        System.out.println (2);
//        System.out.println (3);
//        System.out.println (5);
//        System.out.println (7);
//        for (int e = 2; e <= 100; e++) {
//            if (e % 2 != 0 && e % 3 != 0 && e % 5 != 0 && e % 7 != 0) ;
//            System.out.println(e);
//        }
//    }
    public static void main(String[] args) {
        boolean a = true; //假定a为一个质数
        int i, j;
        for (i = 2; i <= 100; i++) {
            a = true;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    a = false;
                    break;
                }
            }
            if (a) System.out.println(i);
        }

    }
}


