package mattiasson;

public class Maths {

	// 1
	public long lesserThanLong(long a, long b) {
		return Math.min(a, b);

	}

	// 2
	public float lesserThanFloat(float a, float b) {
		return Math.min(a, b);
	}

	// 3
	public int lesserThanInt(int a, int b) {
		return Math.min(a, b);
	}

	// 4
	public double lesserThanDouble(double a, double b) {
		return Math.min(a, b);
	}

	// 5
	public int biggerThanInt(int a, int b) {
		return Math.max(a, b);
	}

	// 6
	public double biggerThanDouble(double a, double b) {
		return Math.max(a, b);
	}

	// 7
	public int biggerThanInt2(int a, int b) {
		return Math.max(a, b);
	}

	// 8
	public long biggerThanLong(long a, long b) {
		return Math.max(a, b);

	}

	// 9
	public double expDouble(double a, double b) {
		return Math.pow(a, b);
	}

	// 10
	public int plusOneInt(int a, int b) {
		return a + b;
	}

	// 11
	public long plusOneLong(long a, long b) {
		return a + b;
	}

	// 12
	public int minusOneInt(int a, int b) {
		return a - b;
	}

	// 13
	public long minusOneLong(long a, long b) {
		return a - b;
	}

	// 14
	public double sqrtDouble(double a) {
		return Math.sqrt(a);
	}

	// 15
	public double cubeRootDouble(double a) {
		return Math.cbrt(a);
	}

	// bonus
	public double randomDouble() {
		return Math.random();
	}

	public static void main(String[] args) {
		// System.out.println(Math.min(a, b));
	}
}
