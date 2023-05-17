package by.bsu.taxicompany.exception;

public class IndexOutOfStorageException extends IndexOutOfBoundsException {

    public IndexOutOfStorageException() {
        super();
    }

    public IndexOutOfStorageException(String s) {
        super(s);
    }

    @Override
    public String toString() {
        return "There is no element with such index: "+ getMessage();
    }
}
