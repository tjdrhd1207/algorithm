package da.DongbinNa;

import java.util.Scanner;

public class CountSortSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int arr[] = {7,5,9,0,3,1,6,2,9,1,4,8,0,5,2};
		int newArr[] = new int[arr.length];
		int count[] = new int[10];
		
		
			for(int j=0; j<arr.length; j++){
				count[arr[j]]++;
			}
			int cnt=0;
			int index=0;
			while(index<count.length) {
			 while(count[index]!=0){
				
				count[index]--;
				newArr[cnt]=index;
				cnt++;
			 } 
			 index++;
			 
		   }
			/*for(int i=0; i<count.length; i++) {
			System.out.print(count[i]+" ");
			}*/
			System.out.println();
			for(int i=0; i<newArr.length; i++){
				System.out.print(newArr[i]+" ");
			}
	}

}
