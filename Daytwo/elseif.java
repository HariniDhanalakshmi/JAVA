public class elseif{
	public static void main(String[] args){
		int time = 4;
		if(time<12){
			System.out.println("It's Morning");
		}
		else if(time<4){
			System.out.println("It's Afternoon");
		}
		else if(time<6){
		System.out.println("It's Evening");
		}
		else{
			System.out.println("It's Night");
		}
	}
}