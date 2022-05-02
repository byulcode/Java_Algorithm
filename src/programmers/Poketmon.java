package programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int pick = nums.length / 2;	//선택하는 포켓몬 수
        
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
        	set.add(num);
        }
        answer = Math.min(set.size(), pick);
        
        return answer;
    }
}

public class Poketmon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		
		int[] array = {3,1,2,3};
		System.out.println(solution.solution(array));
	}

}
