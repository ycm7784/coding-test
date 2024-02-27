package edu.study;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;
public class 스택3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>(); 

        int times = Integer.parseInt(br.readLine());

        for(int i = 0; i < times; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken()); 

            //1

            if(command ==1) {
                int command2 = Integer.parseInt(st.nextToken());
                stack.push(command2);

            }
            //2
            else if(command ==2) {
                if(!stack.isEmpty())
                    bw.write(stack.pop() + "\n");

                else {
                    bw.write(-1 + "\n");
                }
            }

            else if(command ==3) {

                bw.write(stack.size() + "\n");
            }

            else if(command == 4) {

                if(stack.isEmpty())
                    bw.write(1 + "\n");

                else
                    bw.write(0 + "\n");

            }

            else if(command ==5) {

                if(stack.size()>=1)
                    bw.write(stack.peek() + "\n");

                else
                    bw.write(-1 + "\n");
            }
        }
        bw.close();
    }
}