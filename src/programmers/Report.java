package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import javax.management.relation.Relation;

import jdk.internal.icu.text.Replaceable;

public class Report {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
//	    public int[] solution(String[] id_list, String[] report, int k) {
//	        //시간초과 나옴
//	    	HashMap<String, Integer> map = new HashMap<>();
//	    	ArrayList<String> reportList = new ArrayList<>();
//	    	
//	    	ArrayList<String> reportedId = new ArrayList<>();
//	    	int[] answer = new int[id_list.length];
//	    	
//	    	for(String data : report) {//report의 중복제거
//	    		if(!reportList.contains(data))
//	    			reportList.add(data);
//	    	}
//	    	
//	    	String[][] list = new String[reportList.size()][2];
//	    	for(int i=0;i<reportList.size();i++) {
//	    		list[i] = reportList.get(i).split("\\s");
//	    		
//	    		//신고당한 id++
//	    		map.put(list[i][1], map.getOrDefault(list[i][1], 0) + 1);
// 	    	}
//	    	
//	    	for(String key : map.keySet()) {
//	    		int value = map.get(key);
//	    		if(value >= k) {
//	    			reportedId.add(key);
//	    		}
//	    	}
//	        
//	    	for(int i=0; i<id_list.length;i++) {
//	    		int cnt=0;
//	    		for(int j=0; j<list.length;j++) {
//	    			if(id_list[i].equals(list[j][0]) && reportedId.contains(list[j][1])) {
//	    				cnt++;
//	    			}
//	    		}
//	    		answer[i] = cnt;
//	    	}
//	        
//			return answer;
//	    }
	    
	    //Hashset 사용하여 중복제거
	    public int[] solution2(String[] id_list, String[] report, int k) {
	    	Map<String, HashSet<String>> reportIdList = new HashMap<>();
	    	Map<String, Integer> getCnt = new HashMap<>();
	    	
	    	for(String id: id_list) {
	    		getCnt.put(id, 0);
	    		reportIdList.put(id, new HashSet<>());
	    	}
	    	
	    	for(String rep : report) {
	    		//mem[0] : 신고를 한 사람 / mem[1] : 신고를 당한 사람
	    		String[] mem = rep.split("\\s");
	    		reportIdList.get(mem[1]).add(mem[0]);
	    	}
	    	
	    	for(String key : reportIdList.keySet()) {
	    		HashSet<String> reporters = reportIdList.get(key);
	    		if(reporters.size() >= k) {
	    			for(String reporter : reporters) {
	    				Integer getCntNum = getCnt.get(reporter);	    	
	    				getCnt.put(reporter, getCntNum + 1);
	    			}
	    		}
 	    	}
	    	
	    	int[] answer = new int[id_list.length];
	    	for(int i=0; i<id_list.length; i++) {
	    		answer[i] = getCnt.get(id_list[i]);
	    	}
	    	
	    	
	    	return answer;
	    }
	    
	}


