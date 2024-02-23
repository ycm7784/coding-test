package edu.study;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class 블랙잭 {
	 public static void main(String[] args) throws IOException {
		 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		 StringTokenizer st = new StringTokenizer(bf.readLine());
		 int N = Integer.parseInt(st.nextToken());
		 int M = Integer.parseInt(st.nextToken());
		 
		 int [] arr = new int[N];
		 
		 st = new StringTokenizer(bf.readLine());
		 for(int i = 0; i< N ; i++) {
			 arr[i] = Integer.parseInt(st.nextToken());
		 }
		 
		 int sum = 0;
		 int tmp = 0;
		 for(int j = 0; j< N-2 ; j++) {
			 
			 for(int k = j+1; k< N-1 ; k++) {
				 
				 for(int l = k+1; l< N ; l++) {
					 sum = arr[j]+ arr[k]+ arr[l];
					 
					 if(tmp< sum&& sum<=M) tmp = sum;
					 }
				 }
			 }
		 System.out.println(tmp);
		 
		}

}
