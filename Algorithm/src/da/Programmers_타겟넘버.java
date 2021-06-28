package da;

import java.util.ArrayList;

public class Programmers_타겟넘버 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;
		
		solution(numbers, target);
	}

	public static int solution(int[] numbers, int target){
		 int answer = 0;
	        int start = numbers[0];
	        int depth = numbers.length;
	        int result = 0;
	        int index = 0;
	         result = dfs(numbers, numbers[0], 1, target);
	         //dfs(numbers, depth, -start, target);
	         System.out.println(result);
	        
	        return answer;
	}
	
	 public static int dfs(int[] numbers, int start, int index, int target){
	        int ans = 0;
	        int sum = 0;
	        int result = 0;
	        ArrayList<Integer> list = new ArrayList<>();
	        
	        if(index == numbers.length){
	        	if(target == start) {
	        	return 1;
	        	}
	        	return 0;	
	        	
	        }
	           
	            int current1 = start+numbers[index];
	            int current2 = start-numbers[index];
	        	
	             result += dfs(numbers,  current1, index+1, target);
	             result += dfs(numbers,  current2, index+1, target);	            
	          
	             System.out.println(result);
	            return result;
	            
	        
	    }
}
