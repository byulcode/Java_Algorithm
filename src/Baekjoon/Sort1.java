package Baekjoon;
//���� #18870�� ��ǥ���� 
/*��ǥ���� : ��ǥ�� ������ �ʹ� ū ��� �ε������� ��ǥ ���� ���� ���ִ� ���
           �����͸� �����ؼ� �ٽ� ������ �ο��ϴ°�(�ߺ� ����)
�ʿ��� ���� :�޸𸮸� ���̱� ����
#���� ����(deep copy)
�迭�� ������ �Ŀ� ���� ���� �����ص� �ٸ� �迭�� ���� ��ġ�� ����
1���� �迭�� �������� ==> �迭.clone()
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
public class Sort1 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());	//N�� ��
		StringBuilder sb = new StringBuilder();		
		
		String[] array = bf.readLine().split(" ");
		int[] nums = new int[N];
		for(int i=0;i<array.length;i++) 
			nums[i] = Integer.parseInt(array[i]);
		
		int cnt = 0;
		
		int numClone[] = nums.clone();	//����(��½� ���)
		Arrays.sort(nums);
		
		HashMap<Integer, Integer> hash = new HashMap<>();	//�ߺ� �����ϱ� ���� ���
		for(int i=0; i<nums.length; i++) {
			if(!hash.containsKey(nums[i])) 
				hash.put(nums[i], cnt++);	
		}
		for(int i=0; i<N;i++) {
			sb.append(hash.get(numClone[i])).append(" ");
		}
		
		System.out.print(sb.toString());
	}
}