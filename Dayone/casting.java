//java type casting
/*
Widening casting 
	byte -> short -> char -> int -> long -> float -> double
Narrowing casting
    double -> float -> long -> int -> char -> short -> byte
*/
public class casting{
	public static void main(String[] args){
		//Widening casting
		int a = 7;
		float d = a; // Automatic casting: int to float		
		System.out.println(a);  //  O/p  9
		System.out.println(d);  //  O/p  9.0
		
		//Narrowing Casting
		double myDouble = 35.78d;
		int myInt = (int) myDouble; // Manual casting: double to int
		System.out.println(myDouble);   // Outputs 9.78
		System.out.println(myInt);      // Outputs 9
	}
}
