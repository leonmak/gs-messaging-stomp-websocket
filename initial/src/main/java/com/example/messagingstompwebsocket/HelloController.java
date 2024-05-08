package com.example.messagingstompwebsocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class HelloController {
    @MessageMapping("hello") // js send ws msg to /app/hello => respond in /topic/greetings
    @SendTo("/topic/greetings")
    public Greeting greet(Hello msg) {
        var name = HtmlUtils.htmlEscape(msg.getName());
        var response = "Hello yo "+ name;
        return new Greeting(response);
    }
}
