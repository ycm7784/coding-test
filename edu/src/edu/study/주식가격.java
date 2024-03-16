package edu.study;

import java.util.Stack;

public class 주식가격 {
	 public int[] solution(int[] prices) {
		 int[] answer = new int[prices.length];
			Stack<Integer> stack = new Stack<>();

			for (int i = 0; i < prices.length; i++) {
				while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
					answer[stack.peek()] = i - stack.peek();
					stack.pop();
				}
				stack.push(i);
			}

			while (!stack.isEmpty()) {
				answer[stack.peek()] = prices.length - stack.peek() - 1;
				stack.pop();
			}
			return answer;
		}
	 public static void main(String[] args) {
		 주식가격  a = new 주식가격();
		 int [] arr = {1, 2, 3, 2, 3};
		 int[] b = a.solution(arr);
		 System.out.println(b);
		}

}
