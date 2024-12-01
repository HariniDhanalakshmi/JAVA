public class Strings{
	public static void main(String[] args){
		String name = "Harini";//assign value
		System.out.println(name);
		
		//String length
		String txt = "HARINI IS A FULL STACK DEVELOPER";
		System.out.println("Length of string:" +txt.length());//method to find the length of string
		
		String word = "Hello world";
		System.out.println(txt.toUpperCase());//converts to uppercase
		System.out.println(txt.toLowerCase());//converts to lowercase
		
		String test = "Please find the word of java";
		System.out.println(test.indexOf("java"));//to find the index of word
	}
}
