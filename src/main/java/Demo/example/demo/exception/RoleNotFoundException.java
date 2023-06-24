package Demo.example.demo.exception;

public class RoleNotFoundException extends RuntimeException{
    private String message;

    public RoleNotFoundException() {}

    public RoleNotFoundException(String msg)
    {
        super(msg);
        this.message = msg;
    }

}
