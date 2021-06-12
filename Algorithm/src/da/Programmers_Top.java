package da;

import java.util.Scanner;
import java.util.Stack;

public class Programmers_Top {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int L =sc.nextInt();
		int heights[]= new int[L];
		for(int i=0; i<heights.length; i++){
			heights[i]=sc.nextInt();
		}
		
		
		System.out.println(solution(heights));
	}

	
	/*public static ArrayList solution(int[] heights){
		int towerNum = heights.length;
		int answer[]= new int[towerNum];
		ArrayList array=new ArrayList<>();
		
		for(int sender=towerNum-1; sender>0; sender--){
			for(int receiver=0; receiver<sender; receiver++){
				if(heights[receiver]>heights[sender]){
					answer[sender]=receiver+1;
				}
				
			}
			
			
		}
		
		for(int i=0; i<answer.length; i++ ){
			array.add(answer[i]);
		}
		return array;
	}*/
	
	
	public static int[] solution(int[] heights){
		Stack <Integer> st	= new Stack<Integer>();
		int sender_len = heights.length;
		int[] answer = new int[sender_len];
		//배열 스택에 옮기기
		for(int i=0; i<sender_len; i++){
			st.push(heights[i]);
			}
		
		int sender, receiver;
		for(int sdr_idx=sender_len-1; sdr_idx>=0; sdr_idx--){
			sender = st.pop();
			System.out.println("sender : "+sender+", sdr_idx : "+sdr_idx);
			
			int rNum=0; //다시 복구해줘야 하는 스택 요소 개수
						//sender에 맞는 receiver찾기
			while(!st.empty()){
				receiver=st.pop();
				rNum++;
				if(receiver > sender){
					
					answer[sdr_idx]=(sdr_idx-rNum)+1;
					System.out.println("rNum : "+rNum+", answer[sdr_idx] : "+answer[sdr_idx]+", receiver : "+receiver);
					
					break;
				}
			}
			for(int i=sdr_idx-rNum; i<sdr_idx; i++){
				st.push(heights[i]);
				
			}
			
		}
		for(int i=0; i>answer.length; i++) {
		System.out.println("answer[i] : "+answer[i]);
		}
		return answer;
	}
}
