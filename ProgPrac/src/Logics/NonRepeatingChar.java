package Logics;

public class NonRepeatingChar {
	public static void main(String[] args) {
		String Str="aabbccddeef";
		for(char i:Str.toCharArray()) {
			if(Str.indexOf(i)==Str.lastIndexOf(i)) {
				System.out.println(i);
			}
		}
	}
}
