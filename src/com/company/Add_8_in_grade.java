package com.company;

public class Add_8_in_grade {
    public static void main(String[] args)
    {
        char grade = 'B';
        grade = (char)(grade+8);
        System.out.println(grade);
        // Decrypting the grade
        grade = (char)(grade-8);
        System.out.println(grade);
    }
}
