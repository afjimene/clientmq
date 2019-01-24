package com.example.clientmq.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileToMqRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:data/inbox")
                .to("jms:messages");
    }
}
