package da;

public class Programmers_문자열압축_Answer {

	public static void main(String[] args) {


		String s = "aabbaccc";
		
		solution(s);
	}

	public static int solution(String s){
		int answer = 0;
		
		int min = s.length();
		
		for(int i=1; i<=s.length()/2; i++){ //1부터 s의 절반까지 순회
			int compLeng = compression(s, i).length();
			min = Math.min(min, compLeng);
		}
		System.out.println(min);
		
		return min;
	}
	
	public static String compression(String str, int i){
		
		int count = 1;
		String compression = "";
		String pattern = "";
		
		for(int j=0; j<=str.length()+i; j+=i){
			String nowStr;
			System.out.println((j+1)+"회전 : ");
			//전 문자열과 비교할 현재 문자열
			if(j >= str.length()) {//현재 문자열이 없을 때
				nowStr = "";
			}else if(str.length() < j+i){ //마지막 현재 문자열일 때
				nowStr = str.substring(j);
				System.out.println("else if(str.length()<j+i : "+nowStr+", j : "+j+", i : "+i);
			}else {
				nowStr = str.substring(j, j+i);//그 외
				System.out.println("else nowStr: "+nowStr+", j : "+j+", i : "+i);

			}
			
			if(j!=0){
				if(nowStr.equals(pattern)){
					//똑같으면
					count++;
					System.out.println("nowStr.equals(pattern) : "+nowStr+", pattern : "+pattern+", count : "+count);
				}else if(count >=2){ //다르고 count가 2회 이상이면 압축가능
					compression += count + pattern;
					count =1;
					System.out.println("count>=2 compression : "+compression+", pattern : "+pattern+", nowStr : "+nowStr+", count : "+count);

				}
				else {//압축 불가능하면 그냥 그대로 문자열 이어붙이기
					compression += pattern;
					System.out.println("else compression: "+compression+", pattern : "+pattern+", count : "+count);
				}
			 }
			pattern = nowStr;
		}
		return compression;	
				
				
	}
		
		
}

