package com.leetcode.queueandstack.conclusion;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<Character> characterStack = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            char curr = s.charAt(i);
            if(curr != ']') {
                characterStack.push(curr);
            }else {
                List<Character> decodedSubString = new ArrayList<>();
                while(characterStack.peek() != '[') {
                    decodedSubString.add(characterStack.pop());
                }

                //pop out "["
                characterStack.pop();
                int k = 0;
                int m = 1;

                while (!characterStack.isEmpty() &&  Character.isDigit(characterStack.peek())) {
                    k += (characterStack.pop() -'0') * m;
                    m *= 10;
                }

                while (k != 0) {
                    for(int j=decodedSubString.size() - 1; j>=0; j--) {
                        characterStack.push(decodedSubString.get(j));
                    }
                    k--;
                }
            }
        }

        char[] result = new char[characterStack.size()];

        for(int i=result.length - 1; i>=0; i--) {
            result[i] = characterStack.pop();
        }

        return new String(result);
    }
}
