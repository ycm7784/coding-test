package edu._2jin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로탐색 {
	
	static class Node{
		private int x;
		private int y;
		
		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}

		
	}
	
	public static int[] dx = {0,1,0,-1};
	public static int[] dy = {-1,0,1,0};
	
	
	
	public static void bfs(int[][] arr, int x, int y) {
		Queue<Node> q = new LinkedList<>();
		
		q.offer(new Node(x,y));
		
		while(!q.isEmpty()) {
			Node node = q.poll();
			x = node.getX();
			y = node.getY();
			
			for(int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(nx < 0|| ny < 0|| nx >= arr.length|| ny >= arr[nx].length)
					continue;
				if(arr[nx][ny] == 0)
					continue;
				if(arr[nx][ny]== 0)
					continue;
				if(arr[nx][ny] == 1) {
					arr[nx][ny] = arr[x][y] + 1;
					q.offer(new Node(nx,ny));
				}
				
			}
			
		}
		
	}
	public static void main(String[] args) throws IOException {
		
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	int n = Integer.parseInt(st.nextToken());
	int m = Integer.parseInt(st.nextToken());
	
	int[][] arr =  new int[n][m];
	
	for(int i = 0; i < n; i++) {
		String[] s = br.readLine().split("");
		for(int j = 0;j < m; j++) {
			arr[i][j] = Integer.parseInt(s[j]);
			}
		}
	bfs(arr,0, 0);
	System.out.println(arr[n-1][m-1]);
	
	}
}