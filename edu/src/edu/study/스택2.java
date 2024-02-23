package edu.study;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


public class 스택2 {
	 public static void main(String[] args) throws IOException{
		 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st = new StringTokenizer(bf.readLine());
		 int N = Integer.parseInt(st.nextToken());
		 Stack<Integer> Stack = new Stack<>();
		 int num =0;
		 int add = 0;
		 for(int i =0; i< N;i++) {
			 st = new StringTokenizer(bf.readLine());
			 num = Integer.parseInt(st.nextToken());
			 if(num == 1) {
				 add = Integer.parseInt(st.nextToken());
				 Stack.push(add);
			 }else if (num == 2) {
				 if(Stack.empty()) {
						System.out.println(-1);
					}else {
						
						System.out.println(Stack.pop());
					}
			}else if (num == 3) {
				System.out.println(Stack.size());
			}else if (num == 4) {
				if(Stack.empty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}else if (num == 5) {
				if(Stack.empty()) {
					System.out.println(-1);
				}else {
					
					System.out.println(Stack.peek());
				}
			}			 
		 }
		}

}
