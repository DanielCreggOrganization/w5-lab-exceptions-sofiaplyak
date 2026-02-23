package ie.atu.exceptions;

public class CommonExceptions {
    public static void main(String[] args) {
        // String text = null;

        // try{
        //     int length = text.length();
        //     System.out.println("Length: " + length);
        // }catch(NullPointerException e){
        //     System.out.println("Caught NullPointerException: " + e.getMessage());
        // }

        int sum;

        try{
            sum = 12/0;
            System.out.println("Sum: " + sum);
        }catch (ArithmeticException e){
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
}
