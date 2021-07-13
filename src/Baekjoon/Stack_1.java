package Baekjoon;
//백준 1874번 - 스택 수열(Scanner이용)
import java.util.Scanner;
import java.util.Stack;
public class Stack_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();	//출력할 결과물 저장
		
		Stack<Integer> stack = new Stack<>();
		
		int N = scan.nextInt(); //N개의 숫자를 입력
		int start = 0;
		
		while(N-- > 0) {
			int value = scan.nextInt();
			
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
