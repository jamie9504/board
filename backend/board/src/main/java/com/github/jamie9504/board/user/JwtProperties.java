package com.github.jamie9504.board.user;

public class JwtProperties {

    public static final String SECRET = "jamie";
    public static final int EXPIRATION_TIME = 864000000; // 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
}
