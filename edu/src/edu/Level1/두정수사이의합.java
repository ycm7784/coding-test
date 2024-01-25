package edu.Level1;

public class 두정수사이의합 {
	public long solution(int a, int b) {
		  long answer = 0;
	        if(a>b){
	            int tmp = 0;
	            tmp = b;
	            b = a;
	            a = tmp;
	        }
	        int m = 0;
	        m = b-a;
	        for(int i = 0; i<m+1;i++){
	            answer += a+i;
	        }
        return answer;
    }
	 public static void main(String[] args) {
		 두정수사이의합  a = new 두정수사이의합();
		 long b = a.solution(3,5);
		 System.out.println(b);
		}

}
