package JavaOOPHWLesson6.ConnectionRetryAccount;

public class AccountExpiredException extends AccountException {
    public AccountExpiredException(String message) {
        super(message);
    }

    public AccountExpiredException(String message, Throwable cause) {
        super(message, cause);
    }
}
