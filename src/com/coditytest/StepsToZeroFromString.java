package com.coditytest;

public class StepsToZeroFromString {
    public int solution(String S) {
        // write your code in Java SE 8

        int step = 0;
        int leadOneIndex = 0;
        for(;leadOneIndex < S.length();leadOneIndex++) {
            if (S.charAt(leadOneIndex) == '1') break;
        }

        if(leadOneIndex == S.length()) return 0;

        for(int i=S.length() - 1; i>= leadOneIndex; i--) {
            if(S.charAt(i) == '0') {
                step += 1;
            }else {
                step +=2;
            }
        }

        return step - 1;



    }

}
