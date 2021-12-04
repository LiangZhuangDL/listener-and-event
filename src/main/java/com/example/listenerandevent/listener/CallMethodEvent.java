package com.example.listenerandevent.listener;

import org.springframework.context.ApplicationEvent;

public class CallMethodEvent extends ApplicationEvent {

    public CallMethodEvent(Object source) {
        super(source);
    }
}
