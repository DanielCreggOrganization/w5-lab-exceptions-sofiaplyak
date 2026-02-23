package ie.atu.exceptions;

public class Throw {
    public static void main(String[] args) {
        try{
            validateAge(15);
        }catch (IllegalArgumentException e){
            System.out.println("caught exception: " + e.getMessage());
        }
    }

    public static void validateAge(int age){
        if(age < 18){
            throw new IllegalArgumentException("Age must be at least 18!");
        }
        System.out.println("Age is valid!");
    }
}
