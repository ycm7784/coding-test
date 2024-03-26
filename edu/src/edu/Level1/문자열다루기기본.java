package edu.Level1;

public class 문자열다루기기본 {
	public boolean solution(String s) {
        boolean answer = true;
        if(s.length() ==4 || s.length() == 6) {
        	 for(int i = 0; i< s.length();i++) {
             	if(s.charAt(i)<=57&&s.charAt(i)>= 48) {
             		answer = true;
             	}else {
             		answer = false;
             		break;
             	}
             }
        }else {
        	answer = false;
        }
       
        return answer;
    }
	 public static void main(String[] args) {
		 문자열다루기기본  a = new 문자열다루기기본();
		 boolean b = a.solution("a234");
		 System.out.println(b);
		}

}
