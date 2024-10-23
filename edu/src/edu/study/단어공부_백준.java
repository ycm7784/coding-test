package edu.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class 단어공부_백준 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int[] arr = new int[26]; // 영문자의 개수는 26개
 
		for (int i = 0; i < s.length(); i++){
 
			if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') { // 대문자 범위
				arr[s.charAt(i) - 'A']++;	
			}
    
			else {	// 소문자 범위
				arr[s.charAt(i) - 'a']++;
			}
		}
 
 
		int max = -1;
		char ch = '?';
 
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65); // 대문자로출력 아스키 코드
			}
			else if (arr[i] == max) {
				ch = '?';
			}
		}
 
		System.out.print(ch);
	}
		
}
