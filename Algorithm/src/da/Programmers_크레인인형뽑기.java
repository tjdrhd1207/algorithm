package da;

import java.util.Stack;

public class Programmers_크레인인형뽑기 {

	public static void main(String[] args) {


		
		
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		
		int[] moves = {1,5,3,5,1,2,1,4};
		
		solution(board, moves);
		
	}

	
	public static int solution(int[][] board, int[] moves){
		int answer = 0;
		int result = 0;
		Stack<Integer> st = new Stack<>();
		boolean visited[][] = new boolean[board.length][board[0].length];
		
		for(int i=0; i<moves.length; i++){
			int top = moves[i]-1;
			System.out.println(top);
			
			for(int j=0; j<board[top].length; j++){
				int doll = board[j][top];
				if(doll!=0 && visited[j][top]==false){
					visited[j][top]=true;
					if(st.size()!=0 && st.peek()==doll){
					st.pop();
					result+=2;
					}else {
					st.push(doll);
					}
					break;
				}
			}
		}
		
		
		System.out.println(st);
		System.out.println(result);
		
		return answer;
	}
}
