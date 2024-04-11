package edu.study;

import java.util.HashMap;

public class 의상2 {
	public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < clothes.length;i++) {
        	hm.put(clothes[i][1],hm.getOrDefault(clothes[i][1], 0)+1);
        }
        for(String key : hm.keySet()) {
        	answer *= hm.get(key)+1;
        }
        answer -= 1;
        return answer;
    }
		 
	 public static void main(String[] args) {
		 의상2  a = new 의상2();
		 String [][] arr = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		 int b = a.solution(arr);
		 System.out.println(b);
		}

}
