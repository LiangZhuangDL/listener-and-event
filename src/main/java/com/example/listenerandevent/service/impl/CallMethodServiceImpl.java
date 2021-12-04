package com.example.listenerandevent.service.impl;

import com.example.listenerandevent.listener.CallMethodEvent;
import com.example.listenerandevent.service.CallMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CallMethodServiceImpl implements CallMethodService {

    @Autowired
    private ApplicationContext context;

    @Override
    public String callMethod() {
        context.publishEvent(new CallMethodEvent("Publish Event"));
        return "success";
    }
}
