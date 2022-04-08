package Hw;
import  java.util.Scanner;
public class SalaryCalculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("*****我的薪水计算器*****");
		System.out.println("1.输入88，退出程序\n2.输入66，计算下一个年薪" );

		while(true){
			System.out.println("请输入月薪:");
			int monthSalary = s.nextInt();
			System.out.println("请输入一年几个月的薪资:");
			int months = s.nextInt();
			int yearSalary = monthSalary*months;//年薪

			System.out.println("年薪是："+yearSalary);
			if(yearSalary>=200000){
				System.out.println("恭喜你超越98%的国人");
			}else if(yearSalary>=100000){
				System.out.println("恭喜你超越90%的国人");
			}
			System.out.println("输入88，退出系统；输入66，继续计算。");
			int comm = s.nextInt();
			if(comm == 88){
				System.out.println("系统退出");
				break;
			}
			else if(comm == 66){
				System.out.println("继续计算");
				continue;
			}
		}
	}
}
