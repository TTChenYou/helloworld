package Hw;

public class A3_1 {
    public static void main(String[] args) {
        int year = 2008;
        int month = 2;
        int day = 0;
        switch (month) {
            case 2:
                day = 28;
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    day++;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            default:
                day = 31;
        }
        System.out.println(year + "年" + month + "月的天数为" + day + "天");
    }
}
