package da;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GabiaCodingTest1_1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
	
		int x = sc.nextInt();
		
		int answer=0;
        
        	while (x >= 5) {
			answer += x / 5;
			x /= 5;
            }
        System.out.println(answer);
	}

}
