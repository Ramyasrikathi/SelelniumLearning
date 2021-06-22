package ramya;

//Fibonacci Series using Recursion
class fibonacci {
	static void fib(int n) {
		System.out.println(0);
		System.out.println(1);
		for(int i = 2; i <= n; ++i) {
			System.out.println(i-1 + i-2);
		}
	}

	public static void main(String args[]) {
		int n = 9;
		fib(n);
	}
}
/* This code is contributed by Rajat Mishra */
