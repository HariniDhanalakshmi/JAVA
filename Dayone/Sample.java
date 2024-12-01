//This code is to print text.

//public: This is an access modifier. It means the class is accessible from anywhere in the program.
//class: This is a keyword used to define a class in Java. A class is a blueprint for creating objects and contains methods and variables.
//Sample: This is the name of the class.The name is user-defined and can be anything valid.

public class Sample{//{: This marks the beginning of the body of the class Sample. Everything inside this block belongs to the Sample class.

	//public: Access modifier that allows this method to be called from anywhere. This is necessary because the JVM (Java Virtual Machine) needs to access this method to start the program.
	//static: This means the method belongs to the class rather than any specific instance of the class. It allows the JVM to call this method without creating an object of the class
	//void: This means the method does not return any value.
	//main: This is the entry point of a Java program. When the program runs, execution starts from this method.
	//String[] args: This is an array of strings. It is used to pass command-line arguments to the program. If no arguments are provided, it will be an empty array.
	
	public static void main(String[] args){//{: This marks the beginning of the body of the main method.
	
		//System: This is a built-in class in the java.lang package that provides standard input, output, and error streams.
        //out: This is a static field in the System class. It represents the standard output stream (usually the console).
		//println: This is a method of the PrintStream class (to which System.out belongs). It prints the given message followed by a newline.
		System.out.println("Empowering success, one step at a time");//[single line execution]
		
		//("Empowering success, one step at a time"): This is the message to be printed. It's a string literal enclosed in double quotes.
	
	}//}: This marks the end of the body of the main method.

}//}: This marks the end of the body of the Sample class.
