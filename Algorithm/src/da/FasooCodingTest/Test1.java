package da.FasooCodingTest;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc =new Scanner(System.in);		
		
		String s = sc.nextLine();
		
		int[] idx= new int[s.length()]; 
		
		int[] temp=new int[6];
		for(int i=0; i<temp.length; i++){
			temp[i]=sc.nextInt();
		}
		
		
		int pair[]= new int[s.length()];
		
		for(int i=0; i<s.length(); i++){
			pair[i]=-1;
		}
		
		
		Stack<Integer> st = new Stack<Integer>();
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		
		
		
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)=='{'){
				st.push(i);
			}
			if(s.charAt(i)=='}'){
				pair[i]=st.peek();
				pair[st.peek()]=i;
				st.pop();
						
			}
			
		}
		
			
			
			
			for(int i=0; i<idx.length; i++){
				
				System.out.print(idx[i]+" ");
				
			}
			System.out.println();
			for(int i=0; i<idx.length; i++){
				
				System.out.print(pair[i]+" ");
				
			}
		
		
			for(int i=0;i<pair.length; i++){
				if(pair[i]==-1){
					continue;
				}
				else {
					arr1.add(pair[i]);
				}
			}
			
			
			for(int i=0; i<temp.length; i++){
				arr2.add(pair[temp[i]]);
			}
		   
			
			
			System.out.println();
			System.out.println(arr1);
			System.out.println(arr2);
			
	}

}
