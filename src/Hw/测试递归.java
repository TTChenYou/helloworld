package Hw;

import org.w3c.dom.ls.LSOutput;

public class 测试递归 {
	public static void main(String[] args) {
		double startTime = System.currentTimeMillis();//当前时刻
		double result = factorial(10);
		int result2 = xunHuan(10);
		double endTime = System.currentTimeMillis();//当前时刻
		System.out.println(result);
		System.out.println(result2);
		System.out.println("耗时" + (endTime - startTime));
	}

	//阶乘5*4*3*2*1
	public static double factorial(double n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static int xunHuan(int a) {
		int result2 = 1;
		while (a > 1) {
			result2 *= a * (a - 1);
			a -= 2;
		}
		return result2;
	}
}
