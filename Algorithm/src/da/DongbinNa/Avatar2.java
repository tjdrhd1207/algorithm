package da.DongbinNa;

import java.util.Scanner;

public class Avatar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
	
		String str = sc.nextLine();
		
		char x[] = {'a','b','c','d','e','f','g','h'};
		char y[] = {1,2,3,4,5,6,7,8};
	
		
		int dx[] = {-2,-2,-1, -1, 1, 1, 2, 2};
		int dy[] = { 1,-1, 2, -2, 2,-2, 1,-1};
		
		
		char nowX = str.charAt(0);
		char nowY = str.charAt(1);
	
		//System.out.println(nowX);
		//System.out.println(nowY);
		
		
		int next_row;
		int next_column;
		
		int cnt=0;
		
		for(int i=0; i<8; i++){
			
		next_row = (nowX-96) + dx[i];
		//System.out.println(next_row);
		next_column	= (nowY-48) + dy[i];
		//System.out.println(next_column);
		
		if(next_row<=0 || next_column <=0 || next_row > x.length || next_column > y.length ){
			continue;
		  }else {
			cnt++;
		  }
		
		
		}
		System.out.println(cnt);
	
	
	
	}

}
