package com.epam.springtest2.model;

import org.springframework.stereotype.Service;

/**
 * Created by student on 28.01.2019.
 */
@Service
public class Message {
    private String info;

    public Message() {
    }

    public Message(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
