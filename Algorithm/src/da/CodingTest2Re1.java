package da;

public class CodingTest2Re1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target[]= {2,2,2,2,2};
		int positions[][]= {{0,0},{0,1},{1,1},{-3,5},{7,5},{10,0},{-15,22},{-6,-5},{3,3},{5,-5}};
		
		System.out.println(caclulator(target,positions));
		
	}

	public static int caclulator(int target[],int positions[][]){

		int sum=0;
		int answer=0;
		
		for(int i=1; i<5; i++){
			target[i] += target[i-1];
			System.out.println(target[i]);
		}
		
		for(int i=0; i<5; i++){
			target[i] = target[i]*target[i];	
		}
		
		for(int i=0; i<positions.length; i++){
			int x=positions[i][0];
			int y=positions[i][1];
			
			
			int location = (x*x)+(y*y);
			
		
			answer = getScore(target,location);
			
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
	/*public static int getScore(int target[],int location){
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
	}*/
	
	
}


