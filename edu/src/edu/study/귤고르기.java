package edu.study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 귤고르기 {
	 public int solution(int k, int[] tangerine) {
		 int answer = 0;
	        Map<Integer, Integer> map = new HashMap<>();

	        // Map에 귤의 크기별 개수 담기
	        //반복문을 통해 map에 귤의 크기별 개수를 담는다. getOrDefault() 메서드를 통해 1씩 증가시켜 담을 수 있다.
	        for (int i : tangerine) {
	            map.put(i, map.getOrDefault(i, 0) + 1);
	        }

	        // 귤의 크기 리스트 생성
	        //귤의 key 값들을 담은 list를 초기화한다. keySet() 메서드를 통해 key 값들을 추출할 수 있다.
	        List<Integer> keyList = new ArrayList<>(map.keySet());
	        // 귤의 개수별 내림차순 정렬
	        //sort() 메서드와 Comparator 인터페이스의 compare() 메서드를 구현하여 귤의 개수를 기준으로 keyList를 내림차순으로 정렬한다
	        keyList.sort(((o1, o2) -> map.get(o2) - map.get(o1)));

	        // k의 개수 만큼 상자에 담기(종류의 최소값 추출)
	        //keyList를 순회하여 k가 0보다 작거나 같아지면 반복문을 종료하고, 그렇지 않으면 answer를 증가시키고 k에서 i 크기의 귤의 개수를 뺀다.
	        for (Integer i : keyList) {
	            if (k <= 0) {
	                break;
	            }

	            answer++;
	            k -= map.get(i);
	        }

	        return answer;
	    }
	 public static void main(String[] args) {
		 귤고르기  a = new 귤고르기();
		 int [] arr = {1, 3, 2, 5, 4, 5, 2, 3};
		 int b = a.solution(6,arr);
		 System.out.println(b);
		}

}
