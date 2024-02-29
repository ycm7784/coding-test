package edu.Level1;

public class 콜라츠추측 {
	private int res;
	public int solution(int num) {
        int answer = 0;
        col(num);
        
        return col(num);
	}
	public int col(int n) {
		System.out.println(n);
		if(n == 1 && res ==0) return 0;
		if(res>=500) return -1;
		if(n == 1) {
			res++;
		}else if (n%2 == 0) {
			col(n/2);
			res++;
		}else {
			col(n*3+1);
			res++;
		}
		return res;
	}
	 public static void main(String[] args) {
		 콜라츠추측  a = new 콜라츠추측();
		 int b = a.solution(6);
		 System.out.println(b);
		}

}
