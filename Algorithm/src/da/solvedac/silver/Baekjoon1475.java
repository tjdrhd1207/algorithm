package da.solvedac.silver;

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon1475 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int n1[]=new int[10];
		int temp=n;
		
		//10씩 나눠주면서 각 자리의 숫자에 맞는 인덱스 값을 증가시켜준다.
		//6이 나오면 9를 증가시킨다.
		while(temp!=0){
			int k = temp%10;
			if(k==6 ||  k==9){
				n1[9]++;
			}else {
				n1[k]++;
			}
			temp/=10;
		}
		
		//6을 제외한 0~8까지의 숫자의 최대값을 구하는 변수
		int max_to_eight=0;
		
		for(int i=0; i<n1.length-1; i++){
			if(max_to_eight<=n1[i]){
				max_to_eight=n1[i];
			}
		}
		
		int six_or_nine =0;
		
		//9의 개수가 짝수일 떄와 홀수일 떄를 나눠서 생각해준다.
		if(n1[9]%2==0){
			six_or_nine = n1[9]/2;
		}else {
			six_or_nine = n1[9]/2+1;
		}
		
		
		//둘중의 최대값을 구한다. 여기서 나온 최대값이 필요한 최소 카드팩의 수이다.
		//만약 n==0이면, while문이 돌지 않고 넘어가므로 1이라고 예외 처리를 해준다.
		
		int real_max = (int)Math.max(max_to_eight,six_or_nine);
		if(n==0){
			real_max=1;
		}
		System.out.println(real_max);
		
	}

}
