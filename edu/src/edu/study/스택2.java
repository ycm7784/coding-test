package edu.study;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;


public class 스택2 {
	 public static void main(String[] args) throws IOException{
		 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		 int N = Integer.parseInt(bf.readLine());
		 Stack<Integer> Stack = new Stack<>();
		 int num = 0;
		 int add = 0;
		 
		 for(int i =0; i< N;i++) {
			 StringTokenizer st = new StringTokenizer(bf.readLine());
			 num = Integer.parseInt(st.nextToken());
			 if(num == 1) {
				 add = Integer.parseInt(st.nextToken());
				 Stack.push(add);
			 }else if (num == 2) {
				 if(Stack.empty()) {
					 	bw.write(-1 + "\n");
					}else {
						 bw.write(Stack.pop() + "\n");
					}
			}else if (num == 3) {
				bw.write(Stack.size() + "\n");
			}else if (num == 4) {
				if(Stack.empty()) {
					bw.write(1 + "\n");
				}else {
					bw.write(0 + "\n");
				}
			}else if (num == 5) {
				if(Stack.empty()) {
					bw.write(-1 + "\n");
				}else {
					bw.write(Stack.peek() + "\n");
				}
			}			 
		 }
		 bw.close(); 
	}

}
