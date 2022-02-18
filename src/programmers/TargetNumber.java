package programmers;

public class TargetNumber {
	   static int count = 0;
		public int solution(int[] numbers, int target) {
	       
	        
	        dfs(numbers, target, 0, 0);
	        
	        int answer = count;
	        return answer;
	    }
		
		public void dfs(int[] numbers, int targetNum, int depth, int sum) {
			if(depth == numbers.length) {
				if(targetNum == sum) count++;
			}
			else {
				dfs(numbers, targetNum, depth + 1, sum + numbers[depth]);
				dfs(numbers, targetNum, depth + 1, sum - numbers[depth]);
			}
		}
}
