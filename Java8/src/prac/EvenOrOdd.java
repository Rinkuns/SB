package prac;

import java.util.function.Predicate;

//import java.util.function.*;
public class EvenOrOdd {

	public static void main(String[] args) {
		Predicate<Integer> p=i->i%2==0;
		System.out.println(p.test(4));
		

	}

}
