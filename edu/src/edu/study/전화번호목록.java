package edu.study;
import java.util.Arrays;
public class 전화번호목록 {
	 public boolean solution(String[] phone_book) {
	        boolean answer = true;
	        Arrays.sort(phone_book);
	        //sort함수는 문자열을 정렬할때 첫번째 인덱스의 문자 기준 
	        //{'3','1117','213','123456789'}를 이렇게 바꾼다{'1117','123456789','213','3'}
	        for(int i =0; i<phone_book.length-1; i++){
	           if(phone_book[i+1].startsWith(phone_book[i])){
	        	   // boolean startsWith(String prefix) 문자열이 (prefix)값으로 시작되는지 여부파악 boolean 형식으로 리턴
	               answer = false;
	           }
	        }
	        return answer;
	    }
	 public static void main(String[] args) {
		 전화번호목록  a = new 전화번호목록();
		 String[] arr ={"119", "97674223", "1195524421"};
		 boolean b = a.solution(arr);
		 System.out.println(b);
		}

}
