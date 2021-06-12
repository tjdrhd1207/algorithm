package da.DongbinNa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.*;

public class Sort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String arr[][] = new String[n][2];
		
		sc.nextLine();
		
		/*String str="Hello World Hi Min";
		String array[] = str.split(" ");
		
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}*/
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++){
			String str = sc.nextLine();
			String array[] = str.split(" ");
			
			   map.put( array[0],Integer.parseInt(array[1]));
			   
		}
		
		List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(map.entrySet());
		
		Collections.sort(list_entries, new Comparator<Entry<String,Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
			
				return o1.getValue().compareTo(o2.getValue());
			}
			
		
		});
		
		for(Entry<String, Integer>entry : list_entries){
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		//intArray.addAll(map.values());
		
		//Collections.sort(intArray);
		
		//System.out.println(intArray);
		
		/*for(int i=0; i<map.size(); i++){
			System.out.println(map.get(intArray));	
		}*/
		
	
		
		
	}

}
