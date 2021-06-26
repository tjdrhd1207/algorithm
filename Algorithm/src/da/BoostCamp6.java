package da;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class BoostCamp6 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int len = Integer.parseInt(br.readLine());
		
		int arr[] = new int[len];
		
		for(int i=0; i<len; i++){	
			
			arr[i]= Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		int num[] = new int[100];
		
		for(int i=0; i<arr.length; i++){
			num[arr[i]-1]++;
		}
		ArrayList <Integer> cntList = new ArrayList<>();
		
		for(int i=0; i<num.length; i++){
			if(num[i]>=2){
				cntList.add(num[i]);
			}
		}
		
		if(cntList.isEmpty()){
		System.out.println("-1");
		}else {
		
		System.out.println(cntList);
		}
	}

}
