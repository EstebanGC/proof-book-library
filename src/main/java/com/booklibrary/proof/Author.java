package com.booklibrary.proof;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Author {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}