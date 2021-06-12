package da;

public class CodingtTest2_Re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int target[] = {2,2,2,2,2};
		
		int positions[][]= {{0,0},{0,1},{1,1},{-3,5},{7,5},{10,0},{-15,22},{-6,-5},{3,3},{5,-5}};
		
		
		System.out.println(solution(target,positions));
		
	}

	public static int solution(int target[],int positions[][]){
		int answer=0;
		int sum=0;
		for(int i=1; i<target.length; i++){
			
			target[i]+=target[i-1];
		}
		
		for(int i=0; i<target.length; i++){
			target[i]=target[i]*target[i];
		}
		
		
		for(int i=0; i<positions.length; i++){
			int x=positions[i][0];
			int y=positions[i][1];
			
			int r=x*x+y*y;
			
			answer = getScore(target,r);
			
			sum+=answer;
			
		}
		
		
		return sum;
		
	}
	
public static int getScore(int target[],int location){
		
		
		if(target[0]>=location){
			return 10;
		}
		else if(target[1]>=location){
			return 8;
		}else if(target[2]>=location){
			return 6;
		}else if(target[3]>=location){
			return 4;
		}else if(target[4]>=location){
			return 2;
		}else {
			return 0;
		}
		
		
	}
	
}
