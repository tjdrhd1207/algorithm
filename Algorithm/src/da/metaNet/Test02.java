package da.metaNet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Test02 {
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	
	int arr[]= {2,1,5,4};
	
	solution(arr);
	
	
	}
	
	
	public static boolean solution(int[] arr){
		
		boolean answer = true;
		int sortArr[] = new int[arr.length];
		
		ArrayList <Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++){
			sortArr[i]=arr[i];
		}
		
		Arrays.sort(sortArr);
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<arr.length; i++) {
		
			if(arr[i]==sortArr[i]){
				stack.push(sortArr[i]);
				list.add(stack.pop());
			}else {
				stack.push(sortArr[i]);
				
			}
			
		}
		while(stack.size()>0){
			list.add(stack.pop());
		}
		
		for(int i=0; i<list.size(); i++){
			if(list.get(i) != arr[i]){
				answer=false;
			}
		}
		
		System.out.println(list);
		
		System.out.println(answer);
		return answer;
		
	}
}
