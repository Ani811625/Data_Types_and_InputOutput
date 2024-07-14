import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Enter the first number:");
        long a=k.nextLong();
        System.out.println("Enter the second number:");
        long b=k.nextLong();
        long c=a+b;
        System.out.println("The Addition of "+a+" and "+b+" is: "+c);
    }
}
