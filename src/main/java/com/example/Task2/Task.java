package com.example.Task2;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public abstract class Task<T> {
    private String id;
    private Map<String, String> headers;

    public abstract void apply(T arg);

    

    protected void setHeader(String header, String headerValue) {
        if (headers == null) {
            headers = new HashMap<>();
        }
        headers.put(header, headerValue);
    }


    public void freeze() {
        id = UUID.randomUUID().toString();
    }
    
    public String getHeader(String header) {
        return headers.get(header);
    }

    public String getId() {
        return id;
    }
}
