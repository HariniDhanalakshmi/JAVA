/*
Syntax for creating variables  
==> type variableName = value;
*/

public class variables{//class name can also start with small letter
	public static void main(String[] args){
		
		//creating variable with assigning values to it
		int num = 21;//whole numbers from -2147483648 to 2147483647
		String name = "Charlie";
		float value = 11.7f;
		char letter = 'A';
		boolean val = true;
		
		//to print the values of variables
		System.out.println(name);
		System.out.println(num);
		System.out.println(value);
		System.out.println(letter);
		System.out.println(val);
		
		//declare a variable without assigning the value, and assign the value later
		int a;
		a=16;
		System.out.println(a);
		
		//assign a new value to an existing variable, it will overwrite the previous value
		String b = "Meow";
		b = "Woww";
		System.out.println(b);
		
		boolean v = true;
		v = false;
		System.out.println(v);
		
		//this will declare the variable as "final" or "constant", which means unchangeable and read-only
		final char c = 'C';
		//c = 'H'; // will generate an error: cannot assign a value to a final variable
		System.out.println(c);
		
		
		//print variable
		//combine both text and a variable, use the + character
		boolean d = true;//variable
		System.out.println("This is java = " + d);//This is java [text]
		
		//add a variable to another variable
		String Fname="Harini";
		String Lname="Charlie";
		String Fullname=(Fname+Lname);
		System.out.println(Fullname);
		
		//+ is used a mathematical operator for numerical values
		int p = 2;
		int q = 5;
		System.out.println(p+q);
	}
}
		
		