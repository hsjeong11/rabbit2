package com.example.demo;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
// import org.springframework.messaging.MessageHandler;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @ServiceActivator(inputChannel = "test1Input")
    public void handleTest1(Message<?> message) {
        System.out.println("Received message from test1: " + message.getPayload());
    }

    @ServiceActivator(inputChannel = "test2Input")
    public void handleTest2(Message<?> message) {
        System.out.println("Received message from test2: " + message.getPayload());
    }

    @ServiceActivator(inputChannel = "test3Input")
    public void handleTest3(Message<?> message) {
        System.out.println("Received message from test3: " + message.getPayload());
    }

    @ServiceActivator(inputChannel = "emailBroker1Input")
    public void handleEmailBroker1(Message<?> message) {
        System.out.println("Received message from email-broker1: " + message.getPayload());
    }

    @ServiceActivator(inputChannel = "emailBroker2Input")
    public void handleEmailBroker2(Message<?> message) {
        System.out.println("Received message from email-broker2: " + message.getPayload());
    }

    @ServiceActivator(inputChannel = "outputExchange")
    public void handleOutputExchange(Message<?> message) {
        System.out.println("Received message for output exchange: " + message.getPayload());
        // 이 메서드에서는 메시지를 처리한 후 응답을 보내지 않습니다.
    }
}
