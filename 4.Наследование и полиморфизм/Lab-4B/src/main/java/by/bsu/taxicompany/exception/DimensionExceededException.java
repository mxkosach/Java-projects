package by.bsu.taxicompany.exception;

public class DimensionExceededException extends ArrayIndexOutOfBoundsException {
    @Override
    public String toString() {
        return "Your linked list is full. Remove element before insert";
    }
}
