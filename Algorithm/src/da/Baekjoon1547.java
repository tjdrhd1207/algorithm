package da;

import java.util.Scanner;

public class Baekjoon1547 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("횟수 입력 : ");
		int n = sc.nextInt();
		int arr[]=new int[4];
		arr[1]=1;
		int temp;

		
		for(int i=0; i<n; i++){
			int x=sc.nextInt();
			int y=sc.nextInt();
		
			temp=arr[y];
			arr[y]=arr[x];
			arr[x]=temp;
			
			System.out.println("arr["+x+"] "+arr[x]+", arr["+y+"]"+arr[y]);
		}
		

		
		for(int i=0; i<n; i++){
			if(arr[i]==1){
				System.out.println(i);
				break;
			}
			
		}
		
		
		
	}

}
