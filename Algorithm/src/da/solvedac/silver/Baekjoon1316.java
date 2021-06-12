package da.solvedac.silver;

import java.util.Scanner;

public class Baekjoon1316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		sc.nextLine();
		
		String str[] = new String[N];
		
		
		for(int i=0; i<N; i++){
		
			str[i]=sc.nextLine();
		
		}
		
		
		int cnt=0;
		for(int i=0; i<N; i++){
			
			label: for(int j=0; j<str[i].length(); j++){
			  
			  char temp=' ';
			  char ch = str[i].charAt(j);
			  boolean flag = false;
			  
			  	for(int k=j+1; k<str[i].length(); k++){
			  		char ch2 = str[i].charAt(k);	
			  		if(ch==ch2 && flag==false){
			 			
			  				continue;
			  			}
			  			else {
			 			
			 			flag=true;
			 		}
			  		if(ch==ch2 && flag==true){
			  			cnt++;
			  			break label;
			  		}	
			 	}
			}
		}
		
		
		
		System.out.println(N-cnt);
		
	
		
	}

}
