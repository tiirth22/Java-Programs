public class Prac25 {
    public static void main(String[] args) {
        try {
            
            throw new Exception("This is a manually thrown exception.");
        } 
        catch (Exception e) {
            
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}


