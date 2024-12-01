public class demo1{
	public static void main(String[] args){
		int totcost = 2116;
		int count = 4;
		int onecost = totcost / count;
		char currency = '$';
		
		System.out.println("Total Cost : " +totcost +currency);
		System.out.println("No of items : " +count);
		System.out.println("Cost of one item : " +onecost +currency);
	}
}