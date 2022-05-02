package programmers;

import java.util.Arrays;
import java.util.Collections;

//로또의 최고 순위와 최저 순위g
public class Lotto {
	
	class Solution {
	    public int[] solution(int[] lottos, int[] win_nums) {
			
			int cnt = 0;
			int zeroCnt = 0;
			
			for(int lotto : lottos) {
				
				if(lotto == 0) {
					zeroCnt++;
					continue;
				}
				
				for(int nums : win_nums) {
					if(nums == lotto) {
						cnt++;
	                    break;
					}
				}
			}
			
			int min = cnt;
			int max = cnt + zeroCnt;
			
			int[] answer = { Math.min(7 - max, 6),Math.min(7 - min, 6)};
			
			
		    return answer;
		   }
	}
}
