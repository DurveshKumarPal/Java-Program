package com.company;

import java.util.Arrays;

public class Using_Length_Function {
    public static void main(String[] args){
        int marks[] = {15,1,7,38,19,23};
        //  LENGTH
        System.out.println(marks.length);
        //  SHORT
        System.out.println(Arrays.stream(marks).max());       //MAX
        System.out.println(Arrays.stream(marks).min());       //MIN
        
    }
}
