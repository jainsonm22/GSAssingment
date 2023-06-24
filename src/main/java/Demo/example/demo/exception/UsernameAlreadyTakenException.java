package Demo.example.demo.exception;

public class UsernameAlreadyTakenException  extends  RuntimeException{

    private String message;

    public UsernameAlreadyTakenException() {}

    public UsernameAlreadyTakenException(String msg)
    {
        super(msg);
        this.message = msg;
    }

}
