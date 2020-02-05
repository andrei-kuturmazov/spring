package com.springDemo;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Hello for fortune service";
    }
}
