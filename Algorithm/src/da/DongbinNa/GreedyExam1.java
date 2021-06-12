package da.DongbinNa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class GreedyExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		ArrayList<Integer> mohum = new ArrayList<Integer>();
		
		
		for(int i=0; i<n; i++){
		
		mohum.add(sc.nextInt());
		}
		
	    
	    Collections.sort(mohum,Collections.reverseOrder());
	    
	    int sum=0;
	    int cnt=0;
	    for(int i=0; i<mohum.size(); i++){
	    	sum+=mohum.get(i);
	    	if(sum>=n){
	    		cnt++;
	    		sum=0;
	    	}
	    }
	    
	    	System.out.println(mohum);
	    	System.out.println(cnt);
		
		
	}

}
