package da;

import java.util.ArrayList;

public class 조합 {
	
	static ArrayList<String> stringCombination = new ArrayList<>();
	
	public static void main(String[] args) {
		nCr("abcd".toCharArray(), 2, "");
		System.out.println(stringCombination.toString());
	}
	
	static void nCr(char[] str, int r, String result){
		if(r == 0){
			stringCombination.add(result);
			return;
		}else {
			for(int i = 0; i< str.length; i++){
				nCr(str, r-1, result+str[i]);
			}
		}
	}

}
