package com.study.p6_1.strategy_pattern;

public class MessageSendTest {
    public static void main(String[] args) {
        MessageSender sender = new MessageSender(1l, "test");
        System.out.println(sender.send("email"));
    }
}
