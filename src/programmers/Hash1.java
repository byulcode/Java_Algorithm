package programmers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hash1 {

	 public String solution(String[] participant, String[] completion) {
		 	String answer = "";
	        HashMap<String, Integer> map = new HashMap<>();
	        
	        for(String player : participant){
	        	// key값이 중복될 경우 +1
	            map.put(player, map.getOrDefault(player, 0) + 1); 
	        }
	        
	        for(String player : completion){
	        	map.put(player, map.get(player) - 1);
	        }
	        
	        for(String key : map.keySet()) {
	        	if(map.get(key) != 0) {
	        		answer = key;
	        	}
	        }
	        
	        // iterator 사용
//	        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
//	        while(it.hasNext()) {
//	        	Map.Entry<String, Integer> entry = it.next();
//	        	if(entry.getValue()!= 0) {
//	        		answer = entry.getKey();
//	        		break;
//	        	}
//	        }
	        return answer;
	    }
}
