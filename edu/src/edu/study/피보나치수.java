package edu.study;
public class 피보나치수 {
	 public int solution(int n) {
        int answer = 0;
        answer =F(n);
        return answer;
     }
	 public int F(int n) {
		 int [] dp = new int[n+1];
		 
		 dp[0] = 0;
	     dp[1] = 1;

		 
		 for(int i = 2; i<=n;i++) {
			 dp[i] = (dp[i-1]+dp[i-2])%1234567;
		 }
		 return dp[n]%1234567;
	 }
		 
	 public static void main(String[] args) {
		 피보나치수  a = new 피보나치수();
		 int b = a.solution(3);
		 System.out.println(b);
		}

}
