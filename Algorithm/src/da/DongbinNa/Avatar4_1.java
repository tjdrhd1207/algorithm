package da.DongbinNa;

import java.util.Scanner;

public class Avatar4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		sc.nextLine();
		
		String map[] = sc.nextLine().split(" ");
		
		int dx[] = {0,0,-1,1};
		
		int dy[] = {1,-1,0,0};
		
		char command[] = {'R','L','U','D'};
				
		int x = 1; //현재 x좌표
		
		int y = 1; //현재 y좌표
		
		int start[][] = new int[N][N];
		
		for(int i=0; i<map.length; i++){
			
			char location = map[i].charAt(0);
					
			for(int j=0; j<command.length; j++){
				if(location==command[j]){
					x +=dx[j];
					y +=dy[j];
					
					System.out.println(x +" "+y);
					if(x<=0 || y<=0 || x>N || y>N){
						System.out.println("x 값 현재 "+x+", y값 현재 "+y+"continue 구문 실행");
						x -=dx[j];
						x -=dy[j];
						continue;
					}
				}
				
				
			}
			
		}
	
		System.out.println("x 좌표 : "+x+" y 좌표 : "+y);
		
		
	}
}
