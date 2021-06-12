package da.DongbinNa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class DijkstraNode2 implements Comparable<DijkstraNode2>{

	private int index;
	private int distance;
		
	public DijkstraNode2(int index, int distance) {
		super();
		this.index = index;
		this.distance = distance;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}


	public int getDistance() {
		return distance;
	}


	public void setDistance(int distance) {
		this.distance = distance;
	}

	@Override
	public int compareTo(DijkstraNode2 o) {
		
		if(this.distance < o.distance){
			return -1;
		}
		return 1;
	}
	
	
}


public class DijkstraPractice {

	public static final int INF = (int) 1e9;
	
	public static int n,m,start;
	
	public static int d[] = new int[100001];
	
	public static ArrayList<ArrayList<DijkstraNode2>> graph = new ArrayList<ArrayList<DijkstraNode2>>();
	
	
	public static void dijkstra(int start){
	
		PriorityQueue<DijkstraNode2> pq = new PriorityQueue<>();
		
		pq.offer(new DijkstraNode2(start,0));
		
		d[start]=0;
		
		while(!pq.isEmpty()){
			DijkstraNode2 node = pq.poll();
			int dist = node.getDistance();
			int now = node.getIndex();
			
			if(d[now]< dist) continue;
			for(int i=0; i<graph.get(now).size(); i++){
				int cost = graph.get(now).get(i).getDistance();
				
				if(cost < d[graph.get(now).get(i).getIndex()]){
					d[graph.get(now).get(i).getIndex()] = cost;
					pq.offer(new DijkstraNode2(graph.get(now).get(i).getIndex(),cost));
				}
			}
		}
		
	}

	
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	 n = sc.nextInt();
	 m = sc.nextInt();
	 start = sc.nextInt();
	
	
	 for(int i=0;i<=n; i++){
		 graph.add(new ArrayList<DijkstraNode2>());
	 }
	 
	 for(int i=0; i<m; i++){
		 
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 int c = sc.nextInt();
		 
		 graph.get(a).add(new DijkstraNode2(b,c));
		 
	 }
	 
	 Arrays.fill(d, INF);
	 
	 dijkstra(start);
	 
	 for(int i=1; i<=n; i++){
		 if(d[i]==INF){
			 System.out.println("INFINITY");
		 }else {
			 System.out.println(d[i]);
		 }
	 }
	 
	 
	}

}
