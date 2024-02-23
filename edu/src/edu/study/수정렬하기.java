package edu.study;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class 수정렬하기 {
	 public static void main(String[] args) throws IOException {
		 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st = new StringTokenizer(bf.readLine());
		 int N = Integer.parseInt(st.nextToken());
		 int [] arr = new int[N];
		 for(int i =0; i< N;i++) {
			 st = new StringTokenizer(bf.readLine());
			 arr[i] = Integer.parseInt(st.nextToken());
		 }
		 Arrays.sort(arr);
		 for(int i =0; i< N;i++) {
			 System.out.println(arr[i]);
		 }
		}

}
