package org.example.zoo.exceptions;

public class NoChoiceFriendException extends IllegalArgumentException{
    public NoChoiceFriendException() {
        super();
    }

    public NoChoiceFriendException(String s) {
        super(s);
    }

    public NoChoiceFriendException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoChoiceFriendException(Throwable cause) {
        super(cause);
    }
}
