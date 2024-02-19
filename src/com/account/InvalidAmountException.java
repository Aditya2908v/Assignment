package com.account;

public class InvalidAmountException extends Throwable {
    public InvalidAmountException(String invalidAmount) {
        super(invalidAmount);
    }
}
