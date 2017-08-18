import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(), in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5, 6)).print();
		a.print();
		b.print();
		in.close();
	}

}

class Fraction {
	int fenzi;
	int fenmu;

	Fraction() {   // 无参构造
		fenzi = 1;
		fenmu = 1;
	}

	Fraction(int a, int b) {
		fenzi = a;
		fenmu = b;
	}

	double toDouble() {
		return fenzi * 1.0 / fenmu;
	}

	Fraction plus(Fraction r) {
		return new Fraction(this.fenmu * r.fenmu,this.fenzi * r.fenmu + 
				r.fenzi * this.fenmu);
	}

	Fraction multiply(Fraction r) {
		return new Fraction(this.fenzi * r.fenzi,this.fenmu * r.fenmu);
	}

	/* 化简输出 */
	void print() {
		int temp;
		int x = fenzi;
		int y = fenmu;
		// 求最大公约数
		while (x != 0) {
			temp = y % x;
			y = x;
			x = temp;
		}
		fenzi /= y;
		fenmu /= y;
		if (fenzi == 0) {
			System.out.println("0");
		} else if (fenzi == fenmu) {
			System.out.println("1");
		} else {
			System.out.println(fenzi + "/" + fenmu);
		}
	}
}
