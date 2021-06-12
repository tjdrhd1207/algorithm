package da.solvedac.silver;

import java.util.Scanner;

public class Baekjoon2941 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str=sc.nextLine();
		
		int cnt=0;

		
		while(true){
			
			
			if(str.contains("c=")){
				
				str=str.replace("c="," ");
			}
			else if(str.contains("c-")){
				
				str=str.replace("c-"," ");
				
			}
			else if(str.contains("dz=")){
				
				str=str.replace("dz="," ");
			}
			else if(str.contains("d-")){
				
				str=str.replace("d-"," ");
			}
			else if(str.contains("lj")){
				
				str=str.replace("lj"," ");
			}
			else if(str.contains("nj")){
				
				str=str.replace("nj", " ");
			}
			else if(str.contains("s=")){
				
				str=str.replace("s="," ");
			}
			else if(str.contains("z=")){
				
				str=str.replace("z="," ");
			}
			else {
				
				break;
			}
			
		}
		
		
		
			System.out.println(str.length());
			
		
		
		

	}

}
