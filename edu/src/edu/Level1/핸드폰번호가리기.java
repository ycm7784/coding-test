package edu.Level1;

public class 핸드폰번호가리기 {
	public String solution(String phone_number) {
        String answer = "";
        for(int i = 0; i<phone_number.length();i++) {
        	if(phone_number.length()-i <5) {
        		answer+= phone_number.charAt(i);
        	}else {
        		answer+= "*";
        	}
        }
        return answer;
    }
	 public static void main(String[] args) {
		 핸드폰번호가리기  a = new 핸드폰번호가리기();
		 String b = a.solution("01033334444");
		 System.out.println(b);
		}

}
