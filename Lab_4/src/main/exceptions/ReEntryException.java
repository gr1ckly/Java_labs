package main.exceptions;

public class ReEntryException extends Exception {
    public ReEntryException() {
        super();
    }

    public ReEntryException(String message) {
        super(message);
    }

    public ReEntryException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReEntryException(Throwable cause) {
        super(cause);
    }

    public ReEntryException(String message, Throwable cause,
                            boolean enableSuppression,
                            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}