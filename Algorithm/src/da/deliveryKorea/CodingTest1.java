package da.deliveryKorea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CodingTest1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		String C = br.readLine();
		
		solution(S,C);
	}

	
	public static String solution(String S, String C){
		String answer = "";
			
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> name2 = new ArrayList<>();
        
		ArrayList<String> result = new ArrayList<>();
		
        int checkNum =2;
        String[] nameArray = S.split(",");
        String[] nameArray2 = S.split(",");
        nameArray2[0] = " "+nameArray2[0];
        nameArray[0] = " "+nameArray[0];
        
        for(int i=0; i<nameArray.length; i++){
        	int cnt = 0;
        	int dotIndex[] = new int[3];
        	 
	        	for(int j=0; j<nameArray[i].length(); j++){
	        		char ch = nameArray[i].charAt(j);
	        		if(ch==' '){
	        			dotIndex[cnt] = j;
	        			cnt++;
	        		}
	        	}
	        	
        	if(cnt==3){
        		String centerName = nameArray[i].substring(dotIndex[1], dotIndex[2]);
        		nameArray[i] = nameArray[i].replace(centerName, "");
        	}
        }
        
     
        for(int i=0; i<nameArray.length; i++){
        	checkNum=2;
        	
        	for(int j=0; j<nameArray.length; j++){
        		
        		if(i==j){
        			continue;
        		}
        		
	        		if(nameArray[i].equals(nameArray[j])){
	        			nameArray[j] = nameArray[i]+checkNum;
	        			checkNum++;
	            		//System.out.println("중복체크");
	        			//System.out.println(nameArray[i]+", "+nameArray[j]);

	        		}	        		
        		
        	}
        	
        }
        
        name.add(nameArray[0]);
        
        
        for(int i=1; i<nameArray.length; i++){
                    	
        	name.add(nameArray[i]);
        }
       // System.out.println("하이");
        
        
        
        
        
        String newC = "@";
        for(int i=0; i<C.length(); i++){
        	char ch = C.charAt(i);
        	int chToInt = (int) ch;
        	 if(chToInt>=65 && chToInt<=90){
	            	chToInt = chToInt+32;
	            	ch = (char) chToInt;
	            	newC +=ch;
        	 }else {
        		 newC +=ch;
        	 }
        
        }
        
        
        
        for(int i=0; i<name.size(); i++){
        		
        		String newName = " <";
        	for(int j=1; j<name.get(i).length(); j++) {
        		
        		char ch = name.get(i).charAt(j);
	            int chToInt = (int) name.get(i).charAt(j);
	            if(chToInt>=65 && chToInt<=90){
	            	chToInt = chToInt+32;
	            	//System.out.println("chToInt : "+chToInt);
	            	ch = (char) chToInt;
	            	//System.out.println("ch : "+ch);
	            	newName +=ch;
	            	//System.out.println("newName : "+newName);
	            }else if(chToInt ==32){
	            	chToInt = 46;
	            	ch = (char) chToInt;
	            	newName +=ch;
	            	//System.out.println("newName : "+newName);
	            }else if(chToInt == 45){
	            	continue;
	            }
	            else {
	            	
	            	newName +=ch;
	            	//System.out.println("newName : "+newName);

	            } 
        	}
        	newName += newC+".com>";
        	name2.add(newName);
        }
        
        
        for(int i=0; i<nameArray.length; i++){
        	String s2 = nameArray2[i].replaceFirst(" ","")+name2.get(i);
        	result.add(s2);
        	if(i!=nameArray.length-1) {
        	answer +=result.get(i)+", ";
        	}else {
        	answer +=result.get(i);
        	}
        	
        }
        answer = "\""+answer+"\".";
        //System.out.println(name2);
        //System.out.println(result);
        System.out.println(answer);
		return answer;
	}
	
	
}
