package da;

public class Programmers_약수의개수와덧셈 {

	public static void main(String[] args) {

		
		int left = 24;
		int right = 27;

		solution(left, right);
	}
	public static int solution(int left, int right){
		int answer = 0;
		
		for(int i=left; i<=right; i++){
			int x = (int)Math.sqrt(i); 
			
			int yaksu = 0;
			
			for(int j=1; j<=x; j++){
				if(i%j==0){
					int a = j;
					int b = i/j;
					System.out.println("a : "+a+", b : "+b);
					if(a!=b){
						yaksu+=2;
					}else {
						yaksu+=1;
					}
				}
			}
			System.out.println("약수 : "+yaksu);
			if(yaksu%2==0){
				answer+=i;
			}else {
				answer-=i;
			}
			
		}
		System.out.println(answer);
		
		return answer;
	}
}
