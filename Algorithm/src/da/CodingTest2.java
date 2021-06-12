package da;

public class CodingTest2 {

	public static void main(String[] args) {
		//중심으로부터 과녁의 각 점수별 거리
		int[] target = {2,2,2,2,2};
		
		//주어진 화살 10개의 위치
		int[][]position ={{0,0},{0,1},{1,1},{-3,5},{7,5},{10,0},{-15,22},{-6,-5},{3,3},{5,-5}};
		
		System.out.println(solution(target,position));
		
	}



public static int solution(int[]target, int[][]positions){
	int answer=0;
	//주어진 과녁의 각 거리를 원점에서의 거리로 수정
	for(int i=1; i<5; i++){
			target[i]+=target[i-1];
		}
	//target[0]=>2, target[1]+=target[0] =>4 , target[2]+=target[1]=>6, target[3]+=target[2]=>8, target[4]+=target[3]=>10
	
	
	//화살의 거리와 비교하기 위해 제곱의 값으로 수정
	for(int j=0; j<5; j++){
		target[j]=target[j]*target[j];
		}
	//target[0]=target[0]*target[0] => 4, target[1]=target[1]*target[1] => 4*4=16 , target[2]=target[2]*target[2] => 6*6=36
	//target[3]=target[3]*target[3] => 8*8=64, target[4]=target[4]*target[4] => 10*10=100
	
	//좌표 x,y를 이용하여 원점에서 거리를 구해서 점수를 얻어 총점에 더한다.
	for(int i=0; i<10; i++){
		int x = positions[i][0];
		int y = positions[i][1];
		int dist = x*x+y*y;
		answer+=get_score(target,dist);
		
		}
	return answer;
	}

//좌표의 거리와 각 점수별 거리를 비교하여 점수채정
private static int get_score(int[] target, int dist){
	if(dist<=target[0])
		return 10;
	else if(dist<=target[1])
		return 8;
	else if(dist<=target[2])
		return 6;
	else if(dist<=target[3])
		return 4;
	else if(dist<=target[4])
		return 2;
	return 0;
}


//30+6+2+2+4+6+4==54

}