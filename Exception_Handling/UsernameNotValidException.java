package Exception_Handling;

public class UsernameNotValidException extends RuntimeException{
    public UsernameNotValidException(String msg){
        super(msg); //call the constructor of RuntimeException class
    }
}
