//declare multiple variables

public class multiple{
	public static void main(String[] args){
		//declare many variables for the same data type
		int a = 1;
		int b = 2;
		int c = 5;
		System.out.println(a+b+c);
		
		//other way comma-separated list
		int d=3,e=4,f=5;
		System.out.println(d+e+f);
		
		//one value to multiple variables
		int x,y,z;
		x=y=z = 11;
		System.out.println(x+y+z);
		
		
		//java identifier
		/*
		All Java variables must be identified with unique names.
		*/
		int minutesperhour=60;//descriptive names
		int m=60;//short name
		System.out.println(minutesperhour);
		System.out.println(m);
		//descriptive names are preffered to create understandable and maintainable code
		
	}
}