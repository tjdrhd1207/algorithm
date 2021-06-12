package da.DongbinNa;

import java.util.Scanner;

public class SequentialSearchSample {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.nextLine();
		
		String str = sc.nextLine();
		
		String ex = sc.nextLine();
		String[] arr = ex.split(" ");
		
		/*for(int i=0; i<n; i++){
			arr[i]=sc.nextLine();
		}*/
		
		int index=0;
		for(int i=0; i<n; i++){
			if(str.equals(arr[i])){
				index=i;
				break;
			}
		}
		
		System.out.println(index+1);
		
	}

}
