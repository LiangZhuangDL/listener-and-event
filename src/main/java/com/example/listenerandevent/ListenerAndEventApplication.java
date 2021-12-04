package com.example.listenerandevent;

import com.example.listenerandevent.listener.CallMethodEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ListenerAndEventApplication {

    public static void main(String[] args) {
        SpringApplication.run(ListenerAndEventApplication.class, args);
    }

}
