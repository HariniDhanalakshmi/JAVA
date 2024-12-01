public class Assignment{
	public static void main(String[] args){
		int a=10;//assigning value to a
		System.out.println(a);
		
		int b=2;
		b+=3;//addition assignment
		System.out.println(b);
		
		int c=12;
		c-=3;//subtraction assignment
		System.out.println(c);
		
		int d=23;
		d*=3;//multiplication assignment
		System.out.println(d);
		
		int e=42;
		e/=3;//division assignment
		System.out.println(e);
		
		int f=42;
		f%=5;//modulo operator
		System.out.println(f);
		
		//bitwise AND assignment operator (&=)
		int g=8; //initialize g=8
		/*if both bits are 1, result is 1 
		otherwise result 0*/
		g&=3;  /*1000 = 8
		         0011 = 3
				 -----
                 0000 = 0*/
		System.out.println(g);
		
		//bitwise OR assignment operator (|=)
		int h=10; //initialize g=10
		/*If either bit is 1, the result is 1.
		If both bits are 0, the result is 0.*/
		h|=3; /* 1010 = 10
		         0011 = 3
				 -----
				 1011 = 11*/
		System.out.println(h);
		
		//bitwise XOR assignment operator (^=)
		int i=5; // initialize i = 9
		/* if the bits are different, the result is 1
		if the bits are the same, the result is 0.*/
		i^=3; /* 0101 = 5
		         0011 = 3
				 ----
				 0110 = 6 */
		System.out.println(i);
		
		//right shift assignment operator (>>=)
		int j=5;
		j>>=3;/*Original:00000000 00000000 00000000 00000101
		Shifted:00000000 00000000 00000000 00000000 00000001
*/
		System.out.println(j);//O/P=0
		int k=5;
		k<<=3;/*Original:00000000 00000000 00000000 00000101
		Shifted:00000000 00000000 00000000 00101000
*/
		System.out.println(k);//O/P = 40
	}
}