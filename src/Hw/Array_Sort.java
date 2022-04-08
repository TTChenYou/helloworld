package Hw;
import java.util.Arrays; //引入java.util.Arrays类


    public class Array_Sort
    {
        public static void main(String[] args)
        {
            int[] score={87,76,64,89,96,78,81,78,69,95,58,92,86,79,54};
            System.out.println("排序前:");
            for(int i=0; i<score.length; i++)
            {
                System.out.print(score[i]+"");
            }
            Arrays.sort(score);  //排序
            System.out.println("\n 排序后：");
            for(int i=0; i<score.length; i++)System.out.print(score[i]+"");
        }
    }

