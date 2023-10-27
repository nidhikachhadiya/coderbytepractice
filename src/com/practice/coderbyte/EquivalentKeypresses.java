package com.practice.coderbyte;

/**
 * Equivalent Keypresses
 * Have the function EquivalentKeypresses(strArr) read the array of strings stored in strArr which will contain 2 strings representing two comma separated lists of keypresses. Your goal is to return the string true if the keypresses produce the same printable string and the string false if they do not. A keypress can be either a printable character or a backspace represented by -B. You can produce a printable string from such a string of keypresses by having backspaces erase one preceding character.
 * Examples
 * Input: new String[] {"a,b,c,d", "a,b,c,d,-B,d"}
 * Output: true
 * Input: new String[] {"c,a,r,d", "c,a,-B,r,d"}
 * Output: false
 */
public class EquivalentKeypresses {

    public static String EquivalentKeypresses(String[] strArr) {
        // code goes here
        for(int i=0;i<strArr.length;i++){
            strArr[i]=strArr[i].replaceAll("([a-z])([,])([-])([B])([,])","");
            strArr[i]=strArr[i].replaceAll("([,])([a-z])([,])([-])([B])","");
            strArr[i]=strArr[i].replaceAll("([-])([B])([,])","");
            strArr[i]=strArr[i].replaceAll("([-])([B])","");
        }
        return String.valueOf(strArr[0].equals(strArr[1]));
    }

    public static void main (String[] args) {
        // keep this function call here
        String s[]=new String[] {"q,w,e,r,t,y", "-B,-B,q,w,w,-B,e,r,t,y"};
        System.out.print(EquivalentKeypresses(s));
    }

}
