package Baekjoon;
//백준 #18870번 좌표압축 
/*좌표압축 : 좌표의 범위가 너무 큰 경우 인덱싱으로 좌표 사이 갭을 없애는 기법
           데이터를 정렬해서 다시 순서를 부여하는것(중복 제외)
필요한 이유 :메모리를 줄이기 위해
#깊은 복사(deep copy)
배열을 복사한 후에 한쪽 값을 수정해도 다른 배열에 영향 끼치지 않음
1차원 배열의 깊은복사 ==> 배열.clone()
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
public class Sort1 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());	//N의 값
		StringBuilder sb = new StringBuilder();		
		
		String[] array = bf.readLine().split(" ");
		int[] nums = new int[N];
		for(int i=0;i<array.length;i++) 
			nums[i] = Integer.parseInt(array[i]);
		
		int cnt = 0;
		
		int numClone[] = nums.clone();	//복사(출력시 사용)
		Arrays.sort(nums);
		
		HashMap<Integer, Integer> hash = new HashMap<>();	//중복 제외하기 위해 사용
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
