package edu.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 돌게임_백준 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String answer = "";
		String sk = "SK";
	    String cy = "CY";
		answer = (n % 2 == 1) ? sk : cy;
 
		System.out.print(answer);
	}
		
}
