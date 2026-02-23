package ie.atu.exceptions;
import java.util.Scanner;

public class TryWithResourcesDemo {
    public static void main(String[] args){
        // try(Scanner scanner = new Scanner(System.in)){
        //     System.out.print("Enter your name: ");
        //     String name = scanner.nextLine();
        //     System.out.println("Hello, " + name + "!");
        // }


        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println("Your number: " + (num*num) + " is squared!");
        }catch (Exception e){
            System.out.println("Invalid input! Please enter a number");
        }
    }
}
