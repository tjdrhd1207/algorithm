package da;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Programmers_위장2 {

	static ArrayList<String> list = new ArrayList<>();
	static boolean visited[];
	
	public static void main(String[] args) throws NumberFormatException, IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
			
	int clothesLen = Integer.parseInt(br.readLine());
		
	String clothes[][] = new String[clothesLen][2];
	
	int cnt =0;
	
	while(cnt!=clothesLen) {
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		clothes[cnt][0] = st.nextToken();
		clothes[cnt][1] = st.nextToken();
		cnt++;
	}
	
	for(int i=0; i<clothesLen; i++){
		System.out.println(clothes[i][0]+", "+clothes[i][1]);
	}
	
	
		solution(clothes);
	}
	
	
	public static int solution(String[][] clothes){
		int answer = 0;
		
		Stack <Combination> combiArr =new Stack<>();
		ArrayList<String> array = new ArrayList<>();
		visited = new boolean[clothes.length];
		
		
		for(int i=0; i<clothes.length; i++){
			combiArr.push(new Combination(clothes[i][0], clothes[i][1]));
		}
		
		int r = clothes.length;
		String result = "";
		
		while(combiArr.size()!=0) {	
			String cKinds = combiArr.peek().cKind;
			combiArr.pop();
			System.out.println("cKinds : "+cKinds);
		}
		
		
		
		System.out.println(combiArr);
		System.out.println("list : "+list);
		
		return answer;
	}
	
	/*
	public static void nCr(String[][] clothes, int r, String result){
		if(r==0){
			list.add(result);
		}
		else {
			for(int i=0; i<clothes.length; i++) {
			if(visited[i]==false) {
				visited[i] = true;
				nCr(clothes,r-1,result+clothes[i][0]+"|");
				visited[i] = false;
				}
			}
		}
		
	}*/
	
}

 class Combination{
	
	String cName; 
	String cKind;
	
	public Combination(String cName, String cKind) {
		super();
		this.cName = cName;
		this.cKind = cKind;
	}
	
	

	public String getcName() {
		return cName;
	}



	public void setcName(String cName) {
		this.cName = cName;
	}



	public String getcKind() {
		return cKind;
	}



	public void setcKind(String cKind) {
		this.cKind = cKind;
	}



	@Override
	public String toString() {
		return "Combination [cName=" + cName + ", cKind=" + cKind + "]";
	}
	
}