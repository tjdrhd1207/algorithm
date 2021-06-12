package da.DongbinNa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Dijkstra3Node implements Comparable<Dijkstra3Node>{

	private int index;
	private int distance;
	
	public Dijkstra3Node(int index, int distance) {
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
	public int compareTo(Dijkstra3Node o) {
	
		if(this.distance < o.distance){
			return -1;
		}
		
		return 1;
	}
		
	
	
}

public class Dijkstra3 {

	public static final int INF = (int)1e9;
	
	public static int n,m,start;
	
	public static int d[] = new int[100001];
	
	public static ArrayList<ArrayList<Dijkstra3Node>> graph = new ArrayList<ArrayList<Dijkstra3Node>>();
	
	
	public static void dijkstra(int start){
		
		PriorityQueue<Dijkstra3Node> pq = new PriorityQueue<>();
		
		pq.offer(new Dijkstra3Node(start, 0));
		
		d[start] = 0;
		
		while(!pq.isEmpty()){

			Dijkstra3Node node = pq.poll();
			
			int dist = node.getDistance();
			int now = node.getIndex();
			
			if(d[now]< dist){
				continue;
			}
			
			for(int i=0;i<graph.get(now).size(); i++){
				
				int cost = graph.get(now).get(i).getDistance();
				
				if(cost < d[graph.get(now).get(i).getIndex()]){
					d[graph.get(now).get(i).getIndex()] = cost;
					pq.offer(new Dijkstra3Node(graph.get(now).get(i).getIndex(),cost));
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		start = sc.nextInt();
		
		for(int i=0; i<=n; i++){
			graph.add(new ArrayList<Dijkstra3Node>());
		}
		
		for(int i=0; i<m; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			graph.get(a).add(new Dijkstra3Node(b,c));
		}
		
		
		Arrays.fill(d, INF);
		
		
		dijkstra(start);
		
		int count = 0;
		
		int maxDistance = 0;
		
		for(int i=1; i<=n; i++){
			
			if(d[i] != INF){
				count +=1;
				maxDistance = Math.max(maxDistance, d[i]);
			}
		}
	
		System.out.println((count - 1)+" "+maxDistance);
	}
}
