package da.solvedac.silver;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Baekjoon1339 {

	static int[] data;
	static int max;
	static boolean[] visit;
	static String  str[];
	static HashMap<Character,Integer> map;		
	
 	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		 str = new String[n];
		
		map = new HashMap<Character,Integer>();
		
		sc.nextLine();
		
		int cnt = 0;
		
		for(int i=0; i<n; i++){
			str[i]=sc.nextLine();
			
			for(int j=0; j<str[i].length(); j++){
				if(!map.containsKey(str[i].charAt(j))){
					map.put(str[i].charAt(j),cnt++);
					System.out.println("map : "+map+" cnt : "+cnt);
				}
			}
			
		}
		
		data = new int[map.size()];		
		System.out.println("data크기 : "+data.length);
		visit = new boolean[10];
		
		
		
		max = Integer.MIN_VALUE;
		
		solve(0, 0);
		System.out.println(max);

	}

	
	private static void solve(int index, int depth){
		//만약 depth 와 data의 길이가 같다면
		if(depth == data.length){
			System.out.println("같을 때 depth , data.length "+depth+ " , "+data.length);
			check();
			return;
		}
		
		for(int i=0; i<10; i++){
			//visit[i]가 false라면 
			if(!visit[i]){
				System.out.println("visit["+i+"] : "+visit[i]);
				//visit[i]는 트루
				visit[i] = true;
				
				data[depth] = i;
				System.out.println("data["+i+"] : "+data[depth]);
				solve(i, depth+1);
				visit[i] = false;
				
				
				/* i=0;
				 *  if(!visit[0]){
				 *  visit[0] = true
				 * 	data[0] = 0;
				 *  solve(0, 1);---->
				 *  visit[0] = false;
				 * }
				 * 
				 * 
				 * */
				
			}
		}
		
	}
	
	private static void check(){
	
		int ret = 0;
		for (int i=0; i<str.length; i++){
			
			int temp = 0;
			for(int j=0; j<str[i].length(); j++){
				System.out.println("map.get(str[i].charAt(j))"+map.get(str[i].charAt(j)));
				temp += data[map.get(str[i].charAt(j))];
				System.out.println("temp : "+temp);
				temp *=10;
			}
			ret +=temp/10;
		}

		if(max < ret)
			max = ret;
		
		
	}
	
	
	
}
