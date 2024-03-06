package edu.study;

import java.util.Arrays;
import java.util.Collections;

public class 구명보트 {
	public int solution(int[] people, int limit) {
        int answer = 0;
        Integer[] intpeople = new Integer[people.length];
        for (int i = 0; i < people.length; i++)
        	intpeople[i] = people[i];
        Arrays.sort(intpeople,Collections.reverseOrder());
        int minus = 0;
        
        for(int i = 0; i< intpeople.length-minus;i++) {
        	if(limit>=intpeople[i]+intpeople[intpeople.length-1-minus]) {
        		minus++;
        		answer++;
        	}else {
        		answer++;
        	}
        }
        
        return answer;
    }
		 
	 public static void main(String[] args) {
		 구명보트  a = new 구명보트();
		 int [] arr = {70,50,80,50};
		 int limit = 100;
		 int b = a.solution(arr,limit);
		 System.out.println(b);
		}

}
