package com.example.demo;

// import org.springframework.cloud.stream.annotation.EnableBinding;
// import org.springframework.cloud.stream.annotation.Input;
// import org.springframework.cloud.stream.annotation.Output;
import org.springframework.context.annotation.Bean;
// import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public class StreamProcessor {

    @Bean
    public MessageChannel test1Input() {
        return new DirectChannel();
    }

    @Bean
    public MessageChannel test2Input() {
        return new DirectChannel();
    }

    @Bean
    public MessageChannel test3Input() {
        return new DirectChannel();
    }

    @Bean
    public MessageChannel emailBroker1Input() {
        return new DirectChannel();
    }

    @Bean
    public MessageChannel emailBroker2Input() {
        return new DirectChannel();
    }

    @Bean
    public MessageChannel outputExchange() {
        return new DirectChannel();
    }
}
