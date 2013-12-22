package net.mlcastle.remote;

public class NoIrException extends RuntimeException {
    public NoIrException() {
    }

    public NoIrException(String detailMessage) {
        super(detailMessage);
    }

    public NoIrException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }

    public NoIrException(Throwable throwable) {
        super(throwable);
    }
}
