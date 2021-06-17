import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        byte english;
        byte maths;
        byte science;
        byte hindi;
        byte sst;
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the subject marks");
        System.out.println("Enter the english marks");
        english=src.nextByte();
        System.out.println("Enter the maths marks");
        maths =src.nextByte();
        System.out.println("Enter the science marks");
        science = src.nextByte();
        System.out.println("Enter the hindi marks");
        hindi = src.nextByte();
        System.out.println("Enter the sst marks");
        sst = src.nextByte();
        System.out.println("enter the out of marks");
        byte outoff = src.nextByte();
        float percentage = (english+maths+science+hindi+sst)*100/(outoff*5);
        System.out.print("The percentage of Student is: ");
        System.out.println(percentage);
    }
}
