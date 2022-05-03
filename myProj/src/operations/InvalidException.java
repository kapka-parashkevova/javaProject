package operations;

public class InvalidException extends Exception {
    public InvalidException(String errorMessage){
        System.out.println(errorMessage);
    }
}
