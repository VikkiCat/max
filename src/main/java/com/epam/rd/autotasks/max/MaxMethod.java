package com.epam.rd.autotasks.max;

public class MaxMethod {
    public static int max(int[] values) {

        int Max = Integer.MIN_VALUE;
        for (int i = 0; i < values.length; i++) {
            if(values[i]>Max){
                Max = values[i];
            }
        }
        return Max;
    }
}
