package prac;

import java.util.function.Function;

public class P1 {
	/*public static int Square(int n) {
		return n*n;
	}
	public static void main(String[] args) {
		System.out.println("the square of 4 is " +Square(4));
		System.out.println("the square of 5 is " +Square(5));
	}*/
	public static void main(String[] args) {
		
		Function<Integer,Integer> f=i->i*i;
		System.out.println("the square of 5 is "+f.apply(7));
	}
}
