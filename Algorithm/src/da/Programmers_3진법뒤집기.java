package da;

import java.util.Stack;

public class Programmers_3진법뒤집기 {

	public static void main(String[] args) {

		
		int n = 125;
		
		solution(n);
	}

	public static int solution(int n){
        int answer = 0;
        
        Stack<Integer> st = new Stack<>();
            
        	int mok = n;
            int namuji;
        
        while(mok>=1){
        	namuji = mok%3;
        	st.push(namuji);
            mok = mok/3;
            //System.out.println("하이");
        }
        System.out.println(st);
        int sq = 0;
        int len = st.size();
        for(int i=0; i<len; i++){
        	int x =(int)Math.pow(3, sq);
        	answer+=st.pop()*x;
        	sq++;
        }
        
        System.out.println(answer);
        return answer;
		
		
	}
	
}
