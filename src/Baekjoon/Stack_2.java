package Baekjoon;
//백준 1874번 - 스택 수열(BufferedReader 이용)
import java.io.IOException;
import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Stack_2 {

	public static void main(String[] args) throws  IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();	//출력할 결과물 저장
		
		Stack<Integer> stack = new Stack<>();
		
		int N = Integer.parseInt(br.readLine());
		
		int start = 0;
		
		while(N-- > 0) {
			int value = Integer.parseInt(br.readLine());
			
			if(value>start) {
				for(int i=start+1; i<= value; i++) {
					stack.push(i);
					sb.append('+').append('\n');
				}
				start = value;	//오름차순 유지 위함
			}
			else if(stack.peek()!= value) {
				System.out.println("NO");
				return;
			}
			
			stack.pop();
			sb.append('-').append('\n');
		}
		System.out.println(sb);
	}

}
