package com.company;

public class Casting {
    public static void main(String[] args) {
        float price = 25.5F;
        float finalprice = price+20;                //Implicit Casting
        System.out.println(finalprice);

        int price2 = 100;
        int final_price = price2 + (int) 18.20;    //Explicit Casting
        System.out.println(final_price);

    }
}
