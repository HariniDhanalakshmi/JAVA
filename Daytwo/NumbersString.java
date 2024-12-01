/*
Java uses the + operator for both addition and concatenation.

Numbers are added. Strings are concatenated.
*/
public class NumbersString{
	public static void main(String[] args){
		int a = 34;
		int b = 23;//addition
		System.out.println(a+b);
		String c = "34";
		String d = "332";//concatenate
		System.out.println(c+d);
		int e = 36;
		String f = "98";
		int g = 34;
		int h = e+g;
		System.out.println(h+f);
	}
}
