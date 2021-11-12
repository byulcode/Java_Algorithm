package Baekjoon;
// #2606번 바이러스. BFS이용
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFSBFS_1 {
	static int v, e, s;		//정점, 간선, 시작 정점
	static int map[][]; 	//각 정점간 탐색 경로 지정
	static boolean visit[];		//정점 탐색여부 체크
	static int cnt=0;		//바이러스 걸리는 컴퓨터수
	
	public static int bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(start);		//순차 보관
		visit[start] = true;
		while(!q.isEmpty()) {
			int temp = q.poll();
			for(int i=1; i<=v; i++) { //모든 정점을 돌면서
				if(map[temp][i] == 1 && visit[i] == false) {
					q.offer(i);
					visit[i] = true;
					cnt++;
				}
			}
		}
		return cnt; 
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		v = scan.nextInt();	//컴퓨터 수(정점)
		e = scan.nextInt();	//간선 수
		s = 1; //시작하는 정점
		
		map = new int[v+1][v+1];	//각 정점간 탐색경로 저장할 배열
		visit = new boolean[v+1]; //정점의 탐색여부 체크
		
		for(int i=0; i<e; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			map[a][b] = map[b][a] = 1;
		}
		System.out.print(bfs(1));
		scan.close();
	}

}
