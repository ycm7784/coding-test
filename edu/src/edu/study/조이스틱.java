package edu.study;
public class 조이스틱 {
	public int solution(String name) {
        int answer = 0;
        int index = 0;
        int move = name.length() - 1;
        
        for(int i = 0; i< name.length(); i++) {
        	int min = 0;
        	if(name.charAt(i)-'A'<'Z'-name.charAt(i)+1) {
        		min = name.charAt(i)-'A';
        	}else {
        		min = 'Z'-name.charAt(i)+1;
        	}
        	answer += min;
        	
        	index = i + 1;
            // 연속되는 A 갯수 확인
            while(index < name.length() && name.charAt(index) == 'A'){
                index++;
            }
            // 순서대로 가는 것과, 뒤로 돌아가는 것 중 이동수가 적은 것을 선택
            move = Math.min(move, i * 2 + name.length() - index);
            move = Math.min(move, (name.length() - index) * 2 + i);
            
            
        }
        
        return answer+move;
    }
	 public static void main(String[] args) {
		 조이스틱  a = new 조이스틱();
		 String arr ="JAN";
		 int b = a.solution(arr);
		 System.out.println(b);
		}

}
