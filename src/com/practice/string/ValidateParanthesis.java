package com.practice.string;

import java.util.Deque;
import java.util.LinkedList;

public class ValidateParanthesis {
    public static void main(String[] args) {
        String s ="{}[]()";
        Deque<Character> deque =new LinkedList<>();
        char[] arrayChar= s.toCharArray();
        for(char c:arrayChar){
            if(c=='{' || c=='[' || c=='('){
               deque.add(c);
            }
            else{
                if(!(deque.isEmpty())){
                    if((deque.peekFirst()=='{' && c=='}' ) || (deque.peekFirst()=='[' && c==']')
                            || (deque.peekFirst()=='(' && c==')'))
                    {
                        deque.removeFirst();
                    }
                }

                else{
                    System.out.println("Not Balanced");
                }
            }
            System.out.println("Balanced");
        }

    }
}
