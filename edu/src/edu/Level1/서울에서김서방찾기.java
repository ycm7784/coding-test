package edu.Level1;

public class 서울에서김서방찾기 {
	public String solution(String[] seoul) {
        String answer = "";
        for(int i = 0; i < seoul.length;i++) {
        	//문자열 비교은 equals 사용해야한다.
        	if(seoul[i].equals("Kim")) {
        		answer = "김서방은 "+i+"에 있다";
        	}
        }
        return answer;
    }
	
	 public static void main(String[] args) {
		 서울에서김서방찾기  a = new 서울에서김서방찾기();
		 String[] arr = {"Jane", "Kim"};
		 String b = a.solution(arr);
		 System.out.println(b);
		}

}
