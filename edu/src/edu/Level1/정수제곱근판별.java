package edu.Level1;

public class 정수제곱근판별 {
	public long solution(long n) {
	        long answer = 0;
	        for(long num= 0 ;num*num<=n;num++ ) {
	        	if(n==num*num) {
	        		answer = (num+1)*(num+1);
	        	}else
	        		answer = -1;
	        }
	        return answer;
	   	}
	 public static void main(String[] args) {
		 
		}
	 

}
