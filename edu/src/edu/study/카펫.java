package edu.study;
public class 카펫 {
	 public int[] solution(int brown, int yellow) {
	        int[] answer = new int[2];
	        for(int i = 1; i*i<yellow;i++) {
	        	//약수중에서 browm 개수 맞는지 확인
	        	if(yellow%i == 0) {
	        		int m = yellow/i;
	        		if(brown == 2*(m+2)+2*i) {
	        			answer[0] = m+2;
	        			answer[1] = i+2;
	        			break;
	        		}
	        	}
	        }
	        return answer;
	    }
		 
	 public static void main(String[] args) {
		 카펫  a = new 카펫();
		 int[] b = a.solution(1,2);
		 System.out.println(b);
		}

}
