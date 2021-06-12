package da;

public class CodingTest2Re_2 {

	public static void main(String[] args) {
		int target[]= {2,2,2,2,2};
		
		int positions[][] = {{0,0},{0,1},{1,1},{-3,5},{7,5},{10,0},{-15,22},{-6,-5},{3,3},{5,-5}};
		
		
		
		System.out.println(calculator(target,positions));
	}
	

	public static int calculator(int target[], int positions[][]){
		int sum=0;
		
		for(int i=1; i<target.length; i++){
			target[i]+=target[i-1];
		}
		
		for(int i=0; i<target.length; i++){
			target[i]=target[i]*target[i];
		}
		
		for(int i=0; i<positions.length; i++){
			int x = positions[i][0];
			int y = positions[i][1];
			
			int r = (x*x)+(y*y);
			
			sum+=score(r,target);
			
			
		}
		int answer = sum;
		return answer;
	}
	
	
	public static int score(int r,int target[]){
		if(r<=target[0]){
			return 10;
		}
		else if(r<=target[1]){
			return 8;
		}else if(r<=target[2]){
			return 6;
		}else if(r<=target[3]){
			return 4;
		}else if(r<=target[4]){
			return 2;
		}else {
			return 0;
		}
		
		
		
	}
	
}
