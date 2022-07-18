package com.bridgelabz;

public class CensusIOException extends Exception {
    public CensusIOException(String message) {
        super(message);
    }

    public enum exceptionType {
        NO_SUCH_FILE,
        INCORRECT_TYPE,
        DELIMITER_ISSUE,
        INVALID_HEADER
    }
}
