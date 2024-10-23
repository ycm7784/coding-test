package edu.study;
public class ValidPalindrome {
		boolean solution(String s) {
	        String p = "";
	        String e = "";
	        for(int i = 0; i< s.length(); i++){
	            if(s.charAt(i)>=48 && s.charAt(i)<=57 ||s.charAt(i) >= 97 && s.charAt(i)<=122){
	                p += s.charAt(i);
	            }else if(65<= s.charAt(i)&& s.charAt(i) <= 90){
	                p += Character.toLowerCase(s.charAt(i));
	            }
	        }
	        for(int i = p.length()-1; i>= 0; i--){
	            e += p.charAt(i);
	        }
	        return e.equals(p);
    }
	 public static void main(String[] args) {
		 ValidPalindrome  a = new ValidPalindrome();
		 String arr ="A man, a plan, a canal: Panama";
		 boolean b = a.solution(arr);
		 System.out.println(b);
		}

}
