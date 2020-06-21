package UI;

public class Fibonacci {
	static int[] fib = new int[201];
	static int pos = 2;
	public static int of(int n) {
		fib[1] = 1;
		fib[2] = 1;
		if(n > pos) {
			while(pos <= n) {
				fib[pos] = fib[pos-1]+fib[pos-2];
				pos ++;
			}
			pos = n;
		}
		return fib[n];
	}
	public static void main(String[] args) {
		for(int i = 1; Fibonacci.of(i)<=200; i ++)
			System.out.println(Fibonacci.of(i));
	}
}
