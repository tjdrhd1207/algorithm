package da;

import java.util.Scanner;

public class Baekjoon2847 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int arr[] = new int[N];
		int cnt=0;
		for(int i=0; i<N; i++){
		  arr[i]=sc.nextInt();	
		}
		
		int temp = arr[N-1];
		//System.out.println("temp : "+temp);
		for(int i=arr.length-2; i>=0; i--){
			while(true){
				if(arr[i]>(temp-1)){
					//System.out.println("현재 i값 : "+i+", 현재 arr[i] : "+arr[i]);
					arr[i]--;
					cnt++;
				}else {
					//System.out.println("임시 temp : "+temp);
					temp = arr[i];
					break;
				}
			}
		}
		
	
		/*System.out.println("----------------");
		for(int i=0; i<N; i++) {
		System.out.println(arr[i]+" ");
		}
		*/
		System.out.println(cnt);
		}
}
