package edu.Level1;

public class 콜라츠추측 {
	private int res =0;
	public int solution(int num) {
        
        return col(num);
	}
	public int col(long n) {
		if(n == 1) {
			
		}else if (n%2 == 0) {
			col(n/2);
			res++;
		}else {
			col(n*3+1);
			res++;
		}
		if(n == 1 && res ==0) return 0;
		if(res>=500) return -1;
		return res;
	}
	 public static void main(String[] args) {
		 콜라츠추측  a = new 콜라츠추측();
		 int b = a.solution(6);
		 System.out.println(b);
		}

}
