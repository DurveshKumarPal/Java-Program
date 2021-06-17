import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int num1 = sc.nextByte();
        System.out.println("enter the number 2");
        int num2 = sc.nextByte();
        int sum = num1 + num2;
        System.out.print("The sum of two no:");
        System.out.println(sum);

    }
}
