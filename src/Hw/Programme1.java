package Hw;

import java.util.Scanner;
public class Programme1 {
	public static void main(String[] args) {
		System.out.print("请输入你想知道的兔子数量的月份：");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();//获取输入的整数
		System.out.println("第" + n + "个月兔子总数为" + fun(n));
		scanner.close();
	}
	//求得所需月份的兔子的数量，返回值为兔子的数量
	private static int fun(int n) {
		if (n == 1 || n == 2)
			return 1;
		else
			return fun(n - 1) + fun(n - 2);
	}
}