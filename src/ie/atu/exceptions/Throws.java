package ie.atu.exceptions;

public class Throws {
    public static void main(String[] args) {
        try{
            performOperation();
        }catch (Exception e){
            System.out.println("Exception handled: " + e.getMessage());
        }
    }

    public static void performOperation() throws Exception{
        throw new Exception("errrooorrrr occured!!!!!");
    }
}
