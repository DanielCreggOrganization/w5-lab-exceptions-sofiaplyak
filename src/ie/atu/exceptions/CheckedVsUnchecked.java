package ie.atu.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class CheckedVsUnchecked {
    public static void main(String[] args) {
        //checked exception
        try{
            FileReader reader = new FileReader("none.txt");
            System.out.println("File opened successfully");
        }catch (IOException e){
            System.out.println("Caught exception: " + e.getMessage());
        }


        //unchecked exception
        try{
            int nums[]={};
            System.out.println(nums[8]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}