package edu.Level1;

public class 제일작은수제거하기 {
	 public int[] solution(int[] arr) {
		int min = arr[0];
		int minnum = -1;
		for(int i =0; i<arr.length;i++) {
			if(min>arr[i]) {
				min = arr[i];
				minnum = i;
			}
		}
		int[] answer;
	 	if(arr.length == 1) {
	 		answer = new int[arr.length];
	 		answer[0] =-1;
	 	}else {
	 		answer = new int[arr.length-1];
	 		for(int i = 0; i< answer.length;i++) {
	 			if(minnum<=i) {
	 				answer[i] = arr[i+1];
	 			}else {
	 				answer[i] = arr[i];
	 			}
	 		}
	 	}
	 		return answer;
	    }
	
	 public static void main(String[] args) {
		 제일작은수제거하기  a = new 제일작은수제거하기();
		 int[] arr = {4,3,2,1};
		 int[] b = a.solution(arr);
		 System.out.println(b);
		}

}
