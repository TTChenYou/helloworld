package Hw;

public class T第一个方法循环 {
	public static void main(String[] args) {
		sayLove();
		add(10, 20, 30);//实际参数
		add(100, 200, 300);
		int a = handleLate(25,8000);
		int b = handleLate(15,800);
		int c = handleLate(65,1100);
		System.out.println(a+b+c);
	}

	public static void sayLove() {
		int count = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print("我");
			System.out.print("爱");
			System.out.print("你");
			count++;
		}
		System.out.println(count);
	}

	public static int add(int a, int b, int c) {//形式参数
		int sum = a + b + c;
		System.out.println("sum:" + sum);
		return sum;
	}

	public static int handleLate(int lateMinute, int monthsalary) {
		int fakuan = 0;
		int daySalary = (int) (monthsalary / 22.5);
		System.out.println("迟到分钟数:" + lateMinute);
		System.out.println("月薪" + monthsalary);

		if (lateMinute < 10) {
			System.out.println("警告");
		} else if (lateMinute <= 20) {
			System.out.println("罚款100");
			fakuan = 100;
		} else if (lateMinute <= 30) {
			System.out.println("罚款200");
			fakuan = 200;
		} else if (lateMinute <= 60) {
			System.out.println("半天工资");
			fakuan = daySalary / 2;
		}else{
			System.out.println("一天工资");
			fakuan = daySalary;
		}return fakuan;
	}
}
