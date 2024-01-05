package main.exceptions;

public class IncorrectAgeException extends RuntimeException{
    public IncorrectAgeException() {
        super();
    }

    public IncorrectAgeException(String message) {
        super(message);
    }

    public IncorrectAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectAgeException(Throwable cause) {
        super(cause);
    }

    public IncorrectAgeException(String message, Throwable cause,
                        boolean enableSuppression,
                        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
