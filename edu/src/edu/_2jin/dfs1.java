package edu._2jin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class dfs1 {
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	public static boolean[] visited;
	public static int[] result;
	public static int order = 1;
	public static void  dfs(int x) {
		visited[x] =true;
		result[x] = order++;
		
		for(int i = 0; i < graph.get(x).size();i++) {
			int n = graph.get(x).get(i);
			if(!visited[n])
			dfs(n);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		visited = new boolean[n + 1];
		result =  new int[n +1];
		for(int i = 0; i<=n; i++) {
			graph.add(new ArrayList<>());
		}
		for(int i = 0; i < m ; i++) {
			st =new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		
		for(int i = 0; i < graph.size();i++) {
			Collections.sort(graph.get(i));
			
		}
		
		dfs(r);
		for(int i = 1; i< result.length;i++) {
			System.out.println(result[i]);
		}
		
 	}

}
