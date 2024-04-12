package edu.Level1;

import java.util.*;

public class 같은숫자는싫어 {
	public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i< arr.length; i++) {
        	if(stack.isEmpty()) {
        		stack.push(arr[i]);
        	}else {
        		if(stack.peek()!=arr[i]) {
        			stack.push(arr[i]);
        		}
        	}
        }
        int [] answer = new int[stack.size()];
        
        for(int i = stack.size()-1; i>=0;i--) {
        	answer[i] = stack.pop();
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
	
	 public static void main(String[] args) {
		 같은숫자는싫어  a = new 같은숫자는싫어();
		 int[] arr = {4,3,2,1};
		 int[] b = a.solution(arr);
		 System.out.println(b);
		}

}
