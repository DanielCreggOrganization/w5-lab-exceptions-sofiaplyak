package ie.atu.exceptions;

public class calculateGrade {
    public static char calculateGrades(int score){
        if(score < 0 || score > 100){
            throw new IllegalArgumentException("Invalid score");
        } 
        
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else if (score >= 60) return 'D';
        else return 'F';
  

       
    }

    public static void main(String[] args) {
        try{
            int score = 105;
            char grade = calculateGrades(score);
            System.out.println("Grade: " + grade);
        }catch (IllegalArgumentException e ){
            System.out.println(e.getMessage());
        }
    }
}
