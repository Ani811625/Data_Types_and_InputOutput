import java.util.Scanner;

public class User_input {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name=k.nextLine();//String input
        System.out.println("Please "+name+" enter your age:");
        int age=k.nextInt();
        System.out.println("Please "+name+" also enter your 10th percentage:");
        float percentage=k.nextFloat();

        System.out.println("Your details are:");
        System.out.println("Your NAME: "+name);//Concatenating both strings
        System.out.println("Age: "+age);
        System.out.println("Marks: "+percentage);
    }
}
