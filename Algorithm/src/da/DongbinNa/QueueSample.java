package da.DongbinNa;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> que = new LinkedList<Integer>();

		que.add(5);
		que.add(2);
		que.add(3);
		que.add(7);
		que.remove();
		//que.poll();
		que.add(1);
		que.add(4);
		//que.poll();
		que.remove();
		
		
		while(!que.isEmpty()){
			System.out.println(que.poll());
		}
		
		//System.out.println(que);
		
	
	
	}

}
