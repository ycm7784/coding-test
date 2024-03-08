package edu.study;

import java.util.HashMap;

public class 의상 {
	public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer> hm = new HashMap<>();
        // 의상 종류 별로 몇개씩 있는지 hash에 저장해주기 
        for(int i = 0 ; i < clothes.length;i++) {
        	hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1], 0)+1);
        }
        // 조합 -> 안입는 경우도 고려하기 위해 + 1
        for(String key:hm.keySet()) {
        	answer *= (hm.get(key)+1);
        }
        // 모두 '안입음'일 경우 -1 해주기 
        answer -= 1;
        return answer;
    }
		 
	 public static void main(String[] args) {
		 의상  a = new 의상();
		 String [][] arr = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		 int b = a.solution(arr);
		 System.out.println(b);
		}

}
