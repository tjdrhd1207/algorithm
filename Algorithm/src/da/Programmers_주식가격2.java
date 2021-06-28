package da;

public class Programmers_주식가격2 {

	public static void main(String[] args) {

		int[] prices = {1,2,3,4,2,3};
		
		solution(prices);
	}

	public static int[] solution(int[] prices){
		int[] answer = {};
		
		for(int i=0;i <prices.length; i++){
			int time = 0;
			for(int j=i+1; j<prices.length; j++){
				
				if(prices[i]<=prices[j]){
				time++;	
				}else {
					time++;
					break;
				}
			}
			answer[i] = time;			
			System.out.println(answer[i]);
		}
		
		
		
		
		
		
		return answer;
	}
}
