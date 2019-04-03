package pl.maciejwasiak.magazyn;

public class TooManyItemsException extends Exception {

    public TooManyItemsException(String message) {
        super(message);
    }
}
