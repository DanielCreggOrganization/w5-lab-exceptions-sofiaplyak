package ie.atu.exceptions;

public class ErrorEsceptionsDemo {
    public static void main(String[] args) {
        try{
            //throw new StackOverflowError("Simulated Error");
        }catch(Exception e){
            System.out.println("Caught exception: " + e.getMessage());

        }
        System.out.println("Program continues normally.");
    }
}