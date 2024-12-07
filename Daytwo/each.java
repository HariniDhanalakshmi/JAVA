public class each{
	public static void main(String[] args){
		int var[] = {1,32,34,56,57};
		for(int i=0;i< var.length;i++){
		System.out.println(var[i]);}
		//for each
		int num[] = {3,65,65,78,87};
		for (int j : num){
			System.out.println(j);
	
		}
		String name[] = {"Arun","Harini","Karthi"};
		for(int k=0;k< name.length;k++){
			System.out.println(name[k]);
		}
		String names[] = {"Arun","Harini","Deepa","Karthi"};
		for(String l: names){
			System.out.println(l);
		}
		
	}
}
		