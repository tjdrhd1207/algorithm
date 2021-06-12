package da.FasooCodingTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		//계좌 갯수
		int n = sc.nextInt();
		
		String nums[]=new String[n];
		sc.nextLine();
		for(int i=0; i<n; i++){
			nums[i]=sc.nextLine();
		}
			
		String whereM[]=new String[n];
		for(int i=0; i<n; i++){
			whereM[i]="";
		}
		int cnt[]=new int[n];
		int cntM[]=new int[n];
		boolean flag[]=new boolean[n];
		
		
		for(int i=0; i<n; i++){
		  flag[i]=false;
		  
			for(int j=0; j<nums[i].length(); j++){
				if(((nums[i].charAt(j))<=57 &&  (nums[i].charAt(j))>=48)  || (nums[i].charAt(j)=='-')){
					if((nums[i].charAt(j))<=57 &&  (nums[i].charAt(j))>=48){
						cnt[i]++;
					}
					if((nums[i].charAt(j)=='-')){
						cntM[i]++;
					
						whereM[i]+=j;
						
					}
					if(nums[i].charAt(0)=='-' || nums[i].charAt(nums[i].length()-1)=='-' || (nums[i].charAt(j)=='-'&&nums[i].charAt(j+1)=='-') ){
						//System.out.println((i+1)+"번 실패");
						flag[i]=true;
						break;
					}
					
				}else {
					//System.out.println((i+1)+"번 실패");
					flag[i]=true;
					break;
				}
				
				
				
				
			}
			if((!(cntM[i]>=0 && cntM[i]<=3) || !(cnt[i]>=11 && cnt[i]<=14))){
				//System.out.println((i+1)+"번 실패");
				flag[i]=true;
				continue;
			}else {
			}
		}
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		Set<String> setArr = new HashSet<String>();
		int same[] =new int[n];
		
		String sum[]=new String[n];
		for(int i=0; i<n; i++){
			if(flag[i]==false) {
			sum[i]=cnt[i]+cntM[i]+whereM[i];
			}
			System.out.println(sum[i]);
		}
		
		
		int x;
		for(int i=0; i<n; i++){
			System.out.println("sum");
				System.out.println(sum[i]+" ");
			
		}
		
		
		System.out.println(array);
		
		
		
	}

}
