// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int)(Math.random()*lim);
		int b = (int)(Math.random()*lim);
		int c = (int)(Math.random()*lim);
		int first = Math.min(Math.min(a, b),c);
		int last = Math.max(Math.max(a, b),c);
		int middle = a+b+c-first-last;
		System.out.println(first + " "+ middle + " " + last);


	}
}
