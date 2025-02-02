package model.exceptions;

public class EnoughBalanceException extends RuntimeException {
    public EnoughBalanceException(String message) {
        super(message);
    }
}
