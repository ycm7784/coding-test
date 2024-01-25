package edu.Level1;

public class 하샤드수 {
	public boolean solution(int x) {
		 	boolean answer = true;
	        String a = ""+x;
	        int[] num = new int[a.length()];
	        int sum =0;
	        int y = x;
	        for(int i=0; i<a.length();i++){
	        	num[i]= y%10;
	        	y/=10;
	            sum += num[i];
	        }
	        if(x%sum!=0){
	            answer = false;
	        }
        return answer;
    }
	 public static void main(String[] args) {
		 하샤드수  a = new 하샤드수();
		 boolean b = a.solution(790);
		 System.out.println(b);
		}

}
