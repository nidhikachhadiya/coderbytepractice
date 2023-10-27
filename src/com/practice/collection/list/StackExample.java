package com.practice.collection.list;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> st =new Stack<>();
        st.push("Nidhi");
        st.push("Ravi");
        st.push("Nidhiii");
        st.push("Kachhadiya");
        System.out.println(st);
        st.pop();
        System.out.println(st);
      String s=  st.peek();
        System.out.println(s);

    }
}
