package edu.study;

import java.util.ArrayList;

public class 전력망을둘로나누기 {
		static ArrayList<Integer>[] graph;
		static int min;
	    public int solution(int n, int[][] wires) {
	    	//graph는 노드 개수 n에 따른 그래프의 인접 리스트를 저장하기 위한 배열이다.
	    	//min은 트리의 최소 크기
	        graph = new ArrayList[n+1];
	        min = Integer.MAX_VALUE;
	        // 그래프 ArrayList 초기화. 노드 개수만큼 ArrayList 생성
	        for(int i = 1; i <=n; i++) {
	        	graph[i] = new ArrayList<>();
	        }
	        //양방향 간선으로 이루어진 그래프 자료구조이다. wirees 배열을 순회하면서 간선 정보를 graph 배열에 추가하고, add를 두 번 해준다.
	        for(int i = 0; i< wires.length; i++) {
	        	int v1 = wires[i][0];
	        	int v2 = wires[i][1];
	        	graph[v1].add(v2);
	        	graph[v2].add(v1);
	        }
	        
	        for(int i = 0; i <wires.length; i++) {
	        	int v1 = wires[i][0];
	        	int v2 = wires[i][1];
	        	
	        	//visited 배열은 방문 여부를 나타내기 위한 배열로, 각 노드의 방문 상태를 저장한다.
	            boolean[] visited = new boolean[n + 1];
	            
	            // 해당 간선을 그래프에서 제거
	            graph[v1].remove(Integer.valueOf(v2));
	            graph[v2].remove(Integer.valueOf(v1));
	            
	            int cnt = dfs(1, visited); // 임의의 시작점에서 dfs 탐색
	            
	            int diff = Math.abs(cnt - (n - cnt));
	            min = Math.min(min, diff);
	 
	            // 그래프에 다시 간선 추가
	            graph[v1].add(v2);
	            graph[v2].add(v1);
	        }
	        
	        
	        return min;
	    }
	    static int dfs(int v, boolean[] visited) {
	        visited[v] = true;
	        int cnt = 1;
	 
	        for (int next : graph[v]) {
	            if (!visited[next]) {
	                cnt += dfs(next, visited);
	            }
	        }
	        return cnt;
	    }
	 public static void main(String[] args) {
		 전력망을둘로나누기  a = new 전력망을둘로나누기();
		 int [][] arr = {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};
		 int n = 9;
		 int b = a.solution(n,arr);
		 System.out.println(b);
		}

}
