package da.DongbinNa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class DijkstraNode implements Comparable<DijkstraNode>{
	
	private int index;
	private int distance;
	
	public DijkstraNode(int index, int distance) {
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
	
	//거리(비용)가 짧은 것이 높은 우선순위를  가지도록 설정
	@Override
	public int compareTo(DijkstraNode o) {
		
		if(this.distance < o.distance){
			return -1;
		}
		return 0;
	}
	
}

public class DijkstraSample2 {

	public static final int INF = (int) 1e9; // 무한을 의미
	
	public static int n,m,start;
	
	public static ArrayList<ArrayList<DijkstraNode>> graph = new ArrayList<ArrayList<DijkstraNode>>();
	
	public static int[] d = new int[100001];
	
	public static void dijkstra(int start) {	
		PriorityQueue<DijkstraNode> pq = new PriorityQueue<>();
		//시작 노드로 가기 위한 최단 경로는 0으로 설정하며, 큐에 삽입
		
		pq.offer(new DijkstraNode(start, 0));
		
		d[start] = 0;
		
		while(!pq.isEmpty()){//큐가 비어있지 않다면
			//가장 최단 거리가 짧은 노드에 대한 정보 꺼내기
			
			DijkstraNode node = pq.poll();
			int dist = node.getDistance();//현재 노드까지의 비용
			int now = node.getIndex();//현재 노드
			//현재 노드가 이미 처리된 적이 있는 노드라면 무시
			if(d[now]<dist)continue;
			
			for(int i=0; i<graph.get(now).size(); i++){
				int cost = d[now] + graph.get(now).get(i).getDistance();
				//현재 노드를 거쳐서, 다른 노드로 이동하는 거리가 더 짧은 경우
				if(cost < d[graph.get(now).get(i).getIndex()]){
					d[graph.get(now).get(i).getIndex()] = cost;
					pq.offer(new DijkstraNode(graph.get(now).get(i).getIndex(), cost));
					
				}
				
			}
			
			
		}
		
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		start = sc.nextInt();
		
		//그래프 초기화
		for(int i=0; i<=n; i++){
			graph.add(new ArrayList<DijkstraNode>());
		}
		
		
		for(int i=0; i<m; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			graph.get(a).add(new DijkstraNode(b,c));
			
		}
		
		Arrays.fill(d, INF);
		
		dijkstra(start);
		
		for(int i=1; i<=n; i++){
			
			if(d[i]==INF) {
			System.out.println("INFINITY");
			}
			else {
			System.out.println(d[i]);
			}
		}
		
		
		
		
		
	}
	

}
