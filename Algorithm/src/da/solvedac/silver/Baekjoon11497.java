package da.solvedac.silver;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Baekjoon11497 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++){
			int N = sc.nextInt();
			int arr[] = new int[N];
			int brr[] = new int[N];
			for(int j=0; j<N; j++){
				arr[j] = sc.nextInt();
				
				
			
			}
			Arrays.sort(arr);	
			
			
			Stack<Integer> st = new Stack<Integer>();
			
			for(int k=0; k<arr.length; k++) {
			st.add(arr[k]);
			}
			//arr의 길이가 짝수일 떄
			if(arr.length % 2 == 0){
				int index = 1;
				int mid = (arr.length/2)-1;
				int count = 1;
				while(true){
				  brr[mid] = st.pop();
				  
				  mid = mid+index;
				  
				  index = ((index+count)*-1);
				  
				  count *= -1;
				  
				  if(mid < 0 || mid > arr.length){
					  break;
				  }
				}
				
			}
			//arr의 길이가 홀수일 때
			else {
				int index = 1;
				int mid = (arr.length/2);
				int count = 1;
				while(true){
				  brr[mid] = st.pop();
				 // System.out.println("brr[mid] "+ brr[mid]);
				  mid = mid+index;
				  
				  index = ((index+count)*-1);
				  
				  count *= -1;
				 
				 
				 // System.out.println("mid "+ mid);
				 // System.out.println("index "+ index);
				  
				  
				  if(mid < 0 || mid >= arr.length){
					  break;
				  }
				  
				}
			}
			
			int max = 0;
			for(int k=0; k<brr.length-1; k++){
				if(Math.abs((brr[k]-brr[k+1])) > max){
					max = Math.abs((brr[k]-brr[k+1]));
				}
			}
			System.out.println(max);
		}
		
	}
}
