package da.solvedac.silver;

import java.util.Scanner;

public class Baekjoon5598 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String kaizarStr = "";
		for(int i=0; i<str.length(); i++){
			char kaizar = (char) (str.charAt(i)-3);
			if(kaizar < 65){
				kaizar+=26;
			}
				System.out.print(kaizar);
		}
		
	}

}
