package com.github.jamie9504.board.common.exception;

public class NonexistentUser extends IllegalArgumentException {

    public NonexistentUser(String message) {
        super(message);
    }
}
