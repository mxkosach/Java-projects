package by.bsu.taxicompany.exception;

import java.util.NoSuchElementException;

public class NoSuchValueException extends NoSuchElementException {


    public NoSuchValueException(String s) {
        super(s);
    }

    public NoSuchValueException() {
        super();
    }

    @Override
    public String toString() {
        return getMessage() + " is not in a list";
    }
}
