package edu.Level1;

public class 문자열내p와y의개수 {
	boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        for(int i = 0; i<s.length();i++) {
        	if('p'==s.charAt(i)||'P'==s.charAt(i)) {
        		p++;
        	}else if('y'==s.charAt(i)||'Y'==s.charAt(i)) {
        		y++;
        	}
        }
        if(p == y) answer = true;
        else answer = false;
        System.out.println("Hello Java");

        return answer;
    }
	 public static void main(String[] args) {
		 
		}

}
