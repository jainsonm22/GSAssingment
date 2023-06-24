package Demo.example.demo.exception;

public class EmailAlreadyInUseException extends  RuntimeException{

    private String message;

    public EmailAlreadyInUseException() {}

    public EmailAlreadyInUseException(String msg)
    {
        super(msg);
        this.message = msg;
    }

}
