package edu.Level1;

import java.util.ArrayList;
import java.util.Arrays;
public class 나누어떨어지는숫자배열 {
	 public int[] solution(int[] arr, int divisor) { 
	        ArrayList<Integer> array = new ArrayList<Integer>();
	        for(int i= 0; i<arr.length;i++) {
	        	if(arr[i]%divisor==0) {
	        		array.add(arr[i]);
	        	}
	        }
	        if(array.size()==0) {
	        	array.add(-1);
	        }
	        int[] answer = new int[array.size()];
	        for(int i= 0; i<array.size();i++) {
	        	answer[i] = array.get(i).intValue();
	        }
	        Arrays.sort(answer);
	        return answer;
	    }
	 public static void main(String[] args) {
		 나누어떨어지는숫자배열  a = new 나누어떨어지는숫자배열();
		 int [] arr = {5, 9, 7, 10};
		 int divisor = 5;
 		 int[] b = a.solution(arr,divisor);
		 System.out.println(b);
		}

}
