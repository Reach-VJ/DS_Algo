package com.cip.java.lib.stack;

import com.corejava.p1.A;

import java.util.ArrayDeque;

public class CheckBalancedParenthesis {
    public static void main(String [] args) {
        String parenthesis = "{(([])}";
        System.out.println("Is balnaced parenthesis ? "+parenthesis+" : "+CheckBalancedParenthesis.isBalanced(parenthesis));
    }

    //String parenthesis = "{(([])}";
    public static boolean isBalanced(String parenthesis) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i <parenthesis.length(); i++) {
            char ch = parenthesis.charAt(i);
            if(ch =='{' || ch == '[' || ch == '(')
                stack.push(ch);
            else { //Will enter if bracket is closing.
                if(stack.isEmpty() == true) // It will catch if are extra closing brackets.
                    return false;
                else if(isMatching(stack.peek(),ch) == false) // It will catch if previous open bracket matches with closing bracket.
                    return false;
                else
                    stack.pop();
            }
        }
        return stack.isEmpty(); // It will catch if there extra opening brackets.
    }
    public static boolean isMatching(char a, char b) {
        return (a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}');
    }
}
