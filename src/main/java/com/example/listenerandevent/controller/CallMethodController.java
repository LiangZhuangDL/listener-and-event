package com.example.listenerandevent.controller;

import com.example.listenerandevent.service.CallMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallMethodController {

    @Autowired
    private CallMethodService callMethodService;

    @GetMapping("/call")
    public String call(){
        return callMethodService.callMethod();
    }
}
