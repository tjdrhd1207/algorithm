package da;

public class Programmers_문자열압축1 {

	public static void main(String[] args) {


		String s = "ababcdcdababcdcd";
		
		solution(s);
	}
	public static int solution(String s){
		int answer = 0;
		
		int min = s.length();
		//1글자부터 절반글자까지 검색
		for(int i=1; i<=s.length()/2; i++){
			int compression = compress(s, i).length();
			min = Math.min(min, compression);
		}
		
		System.out.println(min);
		
		return answer;
	}
	
	public static String compress(String str, int index){
		String s = "";
		int count = 1;
		String compression = "";
		String pattern = "";
		
		for(int i=0; i<=str.length()+index; i+=index){
			
			String newStr;
			//37줄부터 44줄이 제일 이해안감
			if(i>=str.length()){
				newStr = "";
			}else if(str.length()<index+i){//마지막이 현재 문자열일 때
				newStr = str.substring(i);
			}else {
				newStr = str.substring(i,i+index);
			}
			
			if(i!=0){
				if(newStr.equals(pattern)){
					count++;
				}else if(count>=2){
					compression += count + pattern;
					count = 1;
				}else {
					compression += pattern;
				}
				
			}
			pattern = newStr;
		}

		System.out.println(compression);
		return compression;
	}
	
	
}
