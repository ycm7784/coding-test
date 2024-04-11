package edu.study;

public class 피로도 {
	public int answer; //최대 던전 수
	public boolean[] visited; // 방문여부
	
	public int solution(int k, int[][] dungeons) {
		//dungeons 배열의 길이만큼 방문 여부 배열 선언
		visited = new boolean[dungeons.length];
		 // dfs 메서드 호출
        dfs(0, k, dungeons);

        return answer;
    }
	public void dfs(int depth, int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            // 방문하지 않은 상태면서 k가 최소 필요 피로도보다 크거나 같은 경우
            if (!visited[i] && dungeons[i][0] <= k) {
                visited[i] = true; // 방문 처리
                dfs(depth + 1, k - dungeons[i][1], dungeons); // 재귀 호출
                visited[i] = false; // 방문 초기화
            }
        }
        
        answer = Math.max(answer, depth);
    }
	 public static void main(String[] args) {
		 피로도  a = new 피로도();
		 int[][] arr ={{0,20},{50,40},{30,10}};
		 int b = a.solution(80,arr);
		 System.out.println(b);
		}

}
