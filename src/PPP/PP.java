package PPP;

import java.util.Arrays;

public class PP {

	public void P0(int n) {
		int a = 1;
		int b = 1;
		int c = 0;
		int i = 0;
		while (c <= n) {
			b = a;
			a = c;
			c = a + b;
			i++;
			System.out.print(c + "\t");
		}
	}
//
//    public void P00(int n) {
//        int sum = 1;
//        for (int i = 1; i <= n; i++) {
//            sum *= i;
//            System.out.println(sum);
//        }
//        int a = 1;
//        while (a <= n) {
//            sum *= a;
//            System.out.println(sum);
//            a++;
//        }
//    }
//

	//题目1：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
	public int P1month(int month) {
		if (month <= 2) {
			return 1;
		} else {
			return P1month(month - 1) + P1month(month - 2);
		}
	}

	public void P1(int month) {
		System.out.println("斐波那契数列的第" + month + "项为：" + P1month(month));
	}
//		public int P1(int month) //循环实现求斐波那契数列的第n项
//		{
//			int a1 = 1;
//			int a2 = 1;
//			int a3 = 0;
//			if (month <= 2) {
//				return 1;
//			} else {
//				for (int i = 0; i < month - 2; i++) {
//					a3 = a1 + a2;
//					a1 = a2;
//					a2 = a3;
//				}
//			}
//			return a3;
//
//		}

	//题目2：判断101-200之间有多少个素数，并输出所有素数。
	public void P2(int min, int max) {//最小值min100最大值max200
		boolean flg = true;
		for (int c = min; c <= max; c++) {
			flg = true;
			for (int d = 2; d < c; d++) {
				if (c % d == 0) {
					flg = false;
					break;
				}
			}
			if (flg) {
				System.out.print(c + "\t");
			}
		}
	}

	/*题目3：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
	例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。*/
	public void P3(int sum) {
		System.out.println("\n");
		for (int i = 100; i <= 999; i++) {
			int a = i % 10;
			int b = i / 10 % 10;
			int c = i / 10 / 10 % 10;
			if (i == Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)) {
				sum++;
				System.out.print(i + "\t");
			}
		}
		System.out.println("总数为：" + sum);


		for (int i = 100; i <= 999; i++) {
			int a = i % 10;
			int b = i / 10 % 10;
			int c = i / 100 % 10;
			if (i == Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)) {
				sum++;
			}
		}
		System.out.println(sum);
	}


	//题目4：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
	public void P4(int num) {
		System.out.print(num + "=");
		for (int b = 2; b <= num; b++) {
			while (num % b == 0 && num != b) {
				System.out.print(b + "*");
				num = num / b;
			}
			if (num == b) {
				System.out.println(b);
				break;
			}
		}
	}

	//题目5：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
	public void P5(int score) {
		String level = (score >= 90 ? "A" : (score >= 60 ? "B" : "C"));
		System.out.println(score + "分" + "属于" + level);
	}

	//题目6：输入两个正整数m和n，求其最大公约数和最小公倍数。
	public void P6(int m, int n) {

	}

	//题目7：输入一行字符，分别统计出其英文字母、空格、数字和其它字符的个数。
	public void P7() {
	}

	//题目8：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
	//输出结果的形式如：2+22+222=246；
	public void P8(int a, int n) {//a为数字，n为项数，sum为合计,i为第几项
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			if (a == 2) {
				System.out.print(a);
			} else {
				System.out.print("+" + a);
			}
			sum = sum + a;
			a = a * 10 + a % 10;
		}
		System.out.println("=" + sum);
	}
//		int sum = 0;
//		System.out.print(a);
//		for (int i = 1; i <= n; i++) {
//			sum = sum + a;
//			System.out.print("+" + a);
//			a = a * 10 + a % 10;
//		}
//		System.out.println("=" + sum);
//	}

	//题目9：一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程找出1000以内的所有完数。
	public void P9(int a) {
	}

	//题目10:一球从h米高度自由落下，每次落地后反跳回原高度的一半;再落下，求它在第n次落地时，共经过多少米？第n次反弹多高？
	public void P10(int n, int h) {//n第n次落地，h高度，i总共多少次，sum共经过多少米，height最后一次反弹高度
		double sum = 0;
		double height = 0;
		for (int i = 1; i <= n; i++) {
			if (i == 1) sum += h;
			else sum += Math.pow(((double) 1 / (double) 2), (i - 1)) * h * 2;
		}
		height = Math.pow(((double) 1 / (double) 2), n) * h;
		System.out.println("共经过" + sum + "米,最后一次反弹高度为" + height + "米");
	}

	//题目11：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
	public void P11() {
		int sum = 0;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				for (int k = 1; k <= 4; k++) {
					if (i != j && i != k && j != k) {
						sum++;
						System.out.print(i * 100 + j * 10 + k + "\t");
					}
				}
			}
			System.out.println("总共有" + sum + "个");
		}
	}

	//题目12：企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；
	// 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；
	// 20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；
	// 60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，
	// 从键盘输入当月利润I，求应发放奖金总数？
	public void P12(double I) {
		double bonus = 0;
		if (I <= 10) {
			bonus = I * 0.1;
		} else if (I <= 20) {
			bonus = (I - 10) * 0.075 + 10 * 0.1;
		} else if (I <= 40) {
			bonus = (I - 20) * 0.05 + 10 * 0.075 + 10 * 0.1;
		} else if (I <= 60) {
			bonus = (I - 40) * 0.03 + 20 * 0.05 + 10 * 0.075 + 10 * 0.1;
		} else if (I <= 100) {
			bonus = (I - 60) * 0.015 + 20 * 0.03 + 20 * 0.05 + 10 * 0.075 + 10 * 0.1;
		} else {
			bonus = (I - 100) * 0.01 + 40 * 0.015 + 20 * 0.03 + 20 * 0.05 + 10 * 0.075 + 10 * 0.1;
		}
		System.out.println("应发奖金" + bonus + "万元");
	}

	//题目13：一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
	public void P13(int a) {
		for (int i = 0; i <= a; i++) {
			int j, k;
			j = (int) Math.sqrt(i + 100);
			k = (int) Math.sqrt(i + 268);
			if ((Math.pow(j, 2) == (i + 100) && (Math.pow(k, 2) == (i + 268)))) {
				System.out.print(i + "\t");
			}
		}
	}

	//题目14：输入某年某月某日，判断这一天是这一年的第几天？
	public void P14(int year, int month, int day) {

	}


	//题目15：输入三个整数x,y,z，请把这三个数由小到大输出。
	public void P15(int a, int b, int c) {
		System.out.println("");
		if (a < b && b < c) {
			System.out.println(a + "" + "" + b + "" + "" + c);
		} else if (a < c && c < b) {
			System.out.println(a + "" + "" + c + "" + "" + b);
		} else if (b < a && a < c) {
			System.out.println(b + "" + "" + a + "" + "" + c);
		} else if (b < c && c < a) {
			System.out.println(b + "" + "" + c + "" + "" + a);
		} else if (c < a && a < b) {
			System.out.println(c + "" + "" + a + "" + "" + b);
		} else if (c < b && b < a) {
			System.out.println(c + "" + "" + b + "" + "" + a);
		} else {
			System.out.println("输入错误");
		}
	}

	//题目16：输出9*9口诀。
	public void P16(int a, int b) {
		for (int m = 1; m <= 9; m++) {
			for (int n = 1; n <= m; n++) {
				System.out.print(n + "*" + m + "=" + (n * m) + "\t");
			}
			System.out.println();
		}

	}

	//题目17：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
	// 以后每天早上都吃了前一天剩下的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
	public void P17(int days) {
		int all = 1;
		for (int i = days; i > 1; i--) {
			all = (all + 1) * 2;
		}
		System.out.println("第一天一共：" + all);
	}

	//题目17：两个乒乓球队进行比赛，各出三人。
	// 甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。
	//有人向队员打听比赛的名单。a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。
	public void P18() {
		char a_vs, b_vs, c_vs;
		{
			for (a_vs = 'x'; a_vs <= 'z'; a_vs++) {
				for (b_vs = 'x'; b_vs <= 'z'; b_vs++) {
					if (a_vs != b_vs) {
						for (c_vs = 'x'; c_vs <= 'z'; c_vs++) {
							if (c_vs != a_vs && c_vs != b_vs) {
								if (c_vs != 'x' && c_vs != 'z' && a_vs != 'x') {
									System.out.println("a的对手：" + a_vs);
									System.out.println("b的对手：" + b_vs);
									System.out.println("c的对手：" + c_vs);
								}
							}
						}
					}
				}
			}
		}
	}

	//题目19：打印出如下图案（菱形）
	public void P19() {
		System.out.println("   *   ");
		System.out.println("  ***  ");
		System.out.println(" ***** ");
		System.out.println("*******");
		System.out.println(" ***** ");
		System.out.println("  ***  ");
		System.out.println("   *   ");
	}

	//题目20：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
	public void P20() {
	}

	//题目21：求1+2!+3!+...+20!的和
	public void P21() {
	}

	//题目22：利用递归方法求5!。
	public void P22(int a) {
		System.out.println(sum(a));
	}

	private static int sum(int a) {
		if (a == 1) {
			return 1;
		}
		return a * sum(a - 1);
	}

	//题目23：有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。
	// 问第4个人岁数，他说比第3个人大2岁。问第三个人，又说比第2人大两岁。问第2个人，说比第一个人大两岁。
	// 最后问第一个人，他说是10岁。请问第五个人多大？
	public void P23(int firstAge, int num) {
		int numAge = 0;
		for (int i = 1; i <= num; i++) {
			numAge = firstAge + 2 * (num - 1);
		}
		System.out.println(numAge);
	}

	//题目24：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
	public void P24(int a) {
		int[] arr = new int[5];
		int i = 0;


	}

	//题目26：请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续判断第二个字母。
	public void P26(String a, String b, String c) {
		switch (a) {
			case "m":
				System.out.println("Monday");
				break;
			case "t":
				if (b == "u") {
					System.out.println("Tuesday");
				} else if (b == "h") {
					System.out.println("Thursday");
				} else {
					System.out.println("日期不正确");
				}
				break;
			case "w":
				System.out.println("Wednesday");
				break;
			case "f":
				System.out.println("Friday");
				break;
			case "s":
				if (c == "a") {
					System.out.println("Saturday");
				} else if (c == "u") {
					System.out.println("Sunday");
				} else {
					System.out.println("日期不正确");
				}
				break;
			default:
				System.out.println("日期不正确");
				break;
		}
	}

	//题目27：求100之内的素数
	public void P27(int a) {
		boolean flag = true;
		int i, j;
		for (i = 2; i <= a; i++) {
			flag = true;
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.print(i + "\t");
			}
		}
		System.out.println();
	}

	//题目28：对10个数进行排序

	public void P28() {
		int[] num = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "");
		}
		System.out.println("");
	}


	//题目32：取一个整数a从右端开始的4～7位。
	public void P32(long a) {
		String str1 = Long.toString(a);
		StringBuffer str2 = new StringBuffer(str1);
		str2.reverse();
		String str3 = new String(str2);
		String str4 = str3.substring(3, 7);
		System.out.println(str4);

	}

	//题目33：打印出杨辉三角形（要求打印出10行如下图）

	//题目34：输入3个数a,b,c，按大小顺序输出。
	public void P34(int a, int b, int c) {
		if (a > b && b > c) {
			System.out.println(a + "" + b + "" + c);
		} else if (a > c && c > b) {
			System.out.println(a + "" + c + "" + b);
		} else if (b > a && a > c) {
			System.out.println(b + "" + a + "" + c);
		} else if (b > c && c > a) {
			System.out.println(b + "" + c + "" + a);
		} else if (c > b && b > a) {
			System.out.println(c + "" + b + "" + a);
		} else if (c > a && a > b) {
			System.out.println(c + "" + a + "" + b);
		}
	}


	//题目36：有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
	public void P36() {

	}

	//题目37：有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位。
	public void P37(int n, int a) {
		for (int i = 0; i < a; i++) {
		}
	}

	//题目38：写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度。
	public void P38(String a) {
		System.out.println("字符串长度为" + a.length());
	}

	//题目41：海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子凭据分为五份，多了一个，
	// 这只猴子把多的一个扔入海中，拿走了一份。第二只猴子把剩下的桃子又平均分成五份，又多了一个，
	// 它同样把多的一个扔入海中，拿走了一份，第三、第四、第五只猴子都是这样做的，问海滩上原来最少有多少个桃子？
	public void P41(int monkey) {
		System.out.println(sum(monkey));
	}

	private static int peach(int monkey) {
		if (monkey == 5) {
			return 6;
		}
		return peach(monkey + 1) * 5 + 1;
	}

	//题目42：809*??=800*??+9*??+1
	//其中??代表的两位数,8*??的结果为两位数，9*??的结果为3位数。求??代表的两位数，及809*??后的结果。
	public void P42() {
		int sum = 0;
		for (int i = 10; i <= 99; i++) {
			if (809 * i == 800 * i + 9 * i + 1) {
				System.out.println(i);
			} else {
				System.out.println("不存在");
			}
			break;
		}
	}

	//题目43：求0—7所能组成的奇数个数。
	public void P43(int n) {
		int sum = 0;
		sum = n / 2;
		System.out.println(sum);
	}

	//题目44：一个偶数总能表示为两个素数之和。
	public void P44(int a) {
		int i = 0;
		int j = 0;
		if (a % 2 != 0) {
			System.out.println("不是偶数");
		} else if (a % 2 == 0) {
			for (i = 2; i < a; i++) {
				j = a - i;
				if (suShu(i) && suShu(j)) {
					System.out.println(a + "=" + i + "+" + j);
					break;
				}
			}
		}
	}

	public static boolean suShu(int a) {
		for (int i = 2; i < Math.sqrt(a) + 1; i++) {
			if (a % i == 0) return false;
		}
		return true;
	}

	//题目45：判断一个素数能被几个9整除
	public void P45(int n) {
		int i;
		for (i = 2; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(n + "不是素数");
				break;
			}
		}
		if (i == n) {
			System.out.println(n + "是素数");
			int j = n;
			int count = 0;
			while (j > 8) {
				count = (j /= 9);
			}
			System.out.println(n + "能被" + count + "个9整除");
		}
	}


	//题目46：两个字符串连接程序
	public void P46(String a, String b) {
		System.out.println(a + b);
	}

	//题目47：读取7个数（1—50）的整数值，每读取一个值，程序打印出该值个数的＊。

}

