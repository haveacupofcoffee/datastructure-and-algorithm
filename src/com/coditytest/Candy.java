package com.coditytest;

import java.util.HashSet;
import java.util.Set;

public class Candy {
    public int solution(int[] T) {
        // write your code in Java SE 8

        Set<Integer> candies = new HashSet<>();

        for(int i=0 ; i<T.length; i++) {
            candies.add(T[i]);
        }

        if(candies.size() >  T.length /2) {
            return T.length / 2;
        }else {
            return candies.size();
        }

    }
}
