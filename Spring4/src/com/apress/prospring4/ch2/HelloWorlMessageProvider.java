package com.apress.prospring4.ch2;

public class HelloWorlMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello world";
    }
}
