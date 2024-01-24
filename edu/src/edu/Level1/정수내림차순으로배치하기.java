package edu.Level1;
import java.util.*;
public class 정수내림차순으로배치하기 {
	public long solution(long n) {
		long answer = 0;
		String a = ""+n; // 문자열로 변경
		long[] num = new long[a.length()];
		//배열에 담아주기
        for(long i = 0;i<a.length();i++) {
	        num[(int) i] = n%10;
	        n/=10;
        	}
        Arrays.sort(num);  //내림차순 정렬
        // 숫자로 합치기
        for(long i = a.length()-1;i>=0;i--) {
        	answer += num[(int) i]; 
        	if(i>0)answer*=10;
            }
        return answer;
    }
	 public static void main(String[] args) {
		 정수내림차순으로배치하기  a = new 정수내림차순으로배치하기();
		 long b = a.solution(790000000);
		 System.out.println(b);
		}

}
