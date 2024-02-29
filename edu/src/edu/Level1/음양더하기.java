package edu.Level1;

public class 음양더하기 {
	 public int solution(int[] absolutes, boolean[] signs) {
	        int answer = 0;
	        for(int i = 0; i< signs.length; i++){
	            if(signs[i]){
	                answer += absolutes[i];
	            }else{
	                answer -= absolutes[i];
	            }
	            
	        }
	        return answer;
	    }
	 public static void main(String[] args) {
		 음양더하기  a = new 음양더하기();
		 int [] absolutes = {4,7,12};
		 boolean [] signs = {true,false,true};
 		 long b = a.solution(absolutes,signs);
		 System.out.println(b);
		}

}
