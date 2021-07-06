package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class mini_project {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int usernumber=0;
         int number = (int) (Math.random()*100);
         do{
             System.out.println("Guss the no. :");
             usernumber = sc.nextInt();
             if(usernumber == number)
             {
                 System.out.println("Good job dude you choose Right no!!!");
                 break;

             }
           else if (usernumber>number)
             {
                 System.out.println("Your no is too large...");
             }
           else
           {
               System.out.println("Your no. is too short");
           }
         } while(usernumber>=0);
        System.out.println(number);

    }

}
