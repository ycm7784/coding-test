package edu.study;

import java.util.Stack;

public class ValidParentheses {
		boolean solution(String s) {
			Stack<Character> stack = new Stack<>();
			for(int i = 0; i< s.length();i++) {
				if(s.charAt(i)== ')'){
					if(stack.isEmpty()) { // 비어 있으면 peek 사용불가 에러
						stack.push(s.charAt(i));
					}else if(stack.peek() == '(') {
						stack.pop();
					}else stack.push(s.charAt(i)); 
					
				}else if(s.charAt(i)== '}'){
					if(stack.isEmpty()) {
						stack.push(s.charAt(i));
					}else if(stack.peek() == '{') {
						stack.pop();
					}else stack.push(s.charAt(i));
					
				}else if(s.charAt(i)== ']'){
					if(stack.isEmpty()) {  
						stack.push(s.charAt(i));
					}else if(stack.peek() == '[') {
						stack.pop();
                    }else stack.push(s.charAt(i));
					
				}else stack.push(s.charAt(i));
			}
			
			return stack.isEmpty();

    }
	 public static void main(String[] args) {
		 ValidParentheses  a = new ValidParentheses();
		 String arr ="()[]{}";
		 boolean b = a.solution(arr);
		 System.out.println(b);
		}

}
