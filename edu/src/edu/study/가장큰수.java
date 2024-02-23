package edu.study;
import java.util.Arrays;
import java.util.Collections;


public class 가장큰수 {
	 public String solution(int[] numbers) {
	        String answer = "";
	        String[] c = new String[numbers.length];
	        
	        for(int i = 0; i< numbers.length;i++) {
	        	c[i] = String.valueOf(numbers[i]);
	        }
	        Arrays.sort(c,Collections.reverseOrder());
	        for(int i = 0; i< c.length;i++) {
	        	answer += c[i];
	        }
	        return answer;
	    }
	 public static void main(String[] args) {
		 가장큰수  a = new 가장큰수();
		 int[] arr ={ 6, 10 , 2};
		 String b = a.solution(arr);
		 System.out.println(b);
		}

}
