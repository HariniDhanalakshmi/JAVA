public class Maths{
    public static void main(String args[]){
    //Syntax : Math.max(x,y)
    System.out.println(Math.max(5,30)); //to find maximum number
    //Syntax : Math.min(x,y)
    System.out.println(Math.min(8,39));//to find minimum number
    //Syntax : Math.sqrt(x)
    System.out.println(Math.sqrt(144));//to find square root
    //Syntax : Math.abs(-x)    
    System.out.println(Math.abs(-4.7));//to find absolute positive value
    //Sytax : Math.random()
    System.out.println(Math.random());//to find random number
    int randomnum = (int)(Math.random()*100); //to find random number only between 0 to 100
    System.out.println(randomnum);
    }
}