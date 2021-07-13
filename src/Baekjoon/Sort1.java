package Baekjoon;
//백준 #18870번 좌표압축 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
public class Sort1 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());	//N의 값
		StringBuilder sb = new StringBuilder();		
		String[] array = bf.readLine().split(" ");
		int[] nums = Arrays.stream(array).mapToInt(Integer::parseInt).toArray();	//string[] --> int[]
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
		
		System.out.println(sb.toString());
		
		
	}

}
