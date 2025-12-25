package com.craftinginterpreters.lox;

public class Token {
    final TokenType type;
    // aka the string of chars that represent the token.
    final String lexeme;
    // As token is identified, we can also get an object representation
    // for a literal type of token.
    final Object literal;
    final int line;

    Token(TokenType type, String lexeme, Object literal, int line) {
        this.type = type;
        this.lexeme = lexeme;
        this.literal = literal;
        this.line = line;
    }

    @Override
    public String toString() {
        return type + " " + lexeme + " " + literal;
    }
}
