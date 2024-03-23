package edu.Level1;

public class 약수의개수와덧셈 {
	public int solution(int left, int right) {
        int answer = 0;
        for(int i = 0; i< right-left+1;i++) {
        	int count = 0;
        	// 약수의 개수 구하기
        	for(int j = 1; j*j <=left+i;j++) {
        		if(j*j ==left+i)count++;
        		else if((left+i)%j==0) count+=2;
        	}
        	
        	if(count%2 == 0) {
        		answer += left+i;
        	}else {
        		answer -= left+i;
        	}
        }
        return answer;
    }
	 public static void main(String[] args) {
		 약수의개수와덧셈  a = new 약수의개수와덧셈();
		 int b = a.solution(13,17);
		 System.out.println(b);
		}

}
