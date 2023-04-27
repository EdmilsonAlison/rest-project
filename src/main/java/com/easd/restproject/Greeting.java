package com.easd.restproject;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Greeting {

    private final long Id;
    private final String content;

    public Greeting(long id, String content) {
        Id = id;
        this.content = content;
    }
}
