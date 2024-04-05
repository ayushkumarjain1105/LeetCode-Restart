package com.leetcode.Leetcode;

import java.util.Stack;

public class ValidParentheses {
    public static boolean parentheses(String s){
        Stack<Character> stack = new Stack();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' ){
                stack.push(s.charAt(i));
                }else{
                if(stack.isEmpty())return false;
                else{
                    char c = stack.peek();
                    stack.pop();
                    if(s.charAt(i) == ')' && c == '(' || s.charAt(i) == '}' && c == '{' || s.charAt(i) == ']' && c == '['){
                        continue;
                    }else {
                        return false;
                    }
                }
            }
            }
        if(!stack.isEmpty())return false;
        return true;
        }
    public static void main(String[] args) {

        System.out.println( parentheses("[()"));
    }
}
