package edu.study;
import java.util.Arrays;
public class HIndex {
	    public int solution(int[] citations) {
	        int h = 0;
	        Arrays.sort(citations);
	        for(int i = 0;i<citations.length;i++){
	            h =Math.max(h,Math.min(citations[i],citations.length-i));
	        }
	        return h;
	    }
	 public static void main(String[] args) {
		 HIndex  a = new HIndex();
		 int[] arr ={3, 0, 6, 1, 5};
		 int b = a.solution(arr);
		 System.out.println(b);
		}

}
  		// h번 인용된 논문이 h편 이상일 때
        // h의 값은 무조건 (0 ~ citations.length) 이다.
 
        // [9, 7, 6, 5, 1, 0]의 배열을 순회하면
        // 9(h)번 이상 인용된 논문은 1(h)편 이상이다. -> h = 1
        // 7(h)번 이상 인용된 논문은 2(h)편 이상이다. -> h = 2
        // 6(h)번 이상 인용된 논문은 3(h)편 이상이다. -> h = 3
        // 5(h)번 이상 인용된 논문은 4(h)편 이상이다. -> h = 4 -> 제일 큰 h
        // 1(h)번 이상 인용된 논문은 5(h)편 이상이다. -> h = 1
        // 0(h)번 이상 인용된 논문은 6(h)편 이상이다. -> h = 0
 
        // 문장마다 있는 두개의 h중 작은값이 결국 진짜 h가 된다.
        // 결국 배열를 순회하여 구한 h중에서 최댓값 구하면 된다.