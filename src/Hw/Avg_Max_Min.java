package Hw;

public class Avg_Max_Min {
    public static void main(String[] args) {
        int[] score = {72, 89, 65, 58, 87, 91, 53, 82, 71, 93, 76, 68};
        double average = 0.0;
        double sum = 0.0;
        double max = score[0];
        double min = score[0];
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
            min = min < score[i] ? min : score[i];
            max = max > score[i] ? max : score[i];
        }
        average = sum / score.length;
        System.out.println(average);
        System.out.println(min);
        System.out.println(max);

        average = 0.0;
        sum = 0.0;
        max = score[0];
        min = score[0];
        for (int s : score) {
            sum += s;
            min = min < s ? min : s;
            max = max > s ? max : s;
        }
        average = sum / score.length;
        System.out.println(average);
        System.out.println(min);
        System.out.println(max);
    }
}
