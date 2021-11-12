package Baekjoon;
// #2606�� ���̷���. BFS�̿�
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFSBFS_1 {
	static int v, e, s;		//����, ����, ���� ����
	static int map[][]; 	//�� ������ Ž�� ��� ����
	static boolean visit[];		//���� Ž������ üũ
	static int cnt=0;		//���̷��� �ɸ��� ��ǻ�ͼ�
	
	public static int bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(start);		//���� ����
		visit[start] = true;
		while(!q.isEmpty()) {
			int temp = q.poll();
			for(int i=1; i<=v; i++) { //��� ������ ���鼭
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
		v = scan.nextInt();	//��ǻ�� ��(����)
		e = scan.nextInt();	//���� ��
		s = 1; //�����ϴ� ����
		
		map = new int[v+1][v+1];	//�� ������ Ž����� ������ �迭
		visit = new boolean[v+1]; //������ Ž������ üũ
		
		for(int i=0; i<e; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			map[a][b] = map[b][a] = 1;
		}
		System.out.print(bfs(1));
		scan.close();
	}

}
