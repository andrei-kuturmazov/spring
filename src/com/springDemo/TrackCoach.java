package com.springDemo;

public class TrackCoach implements Coach {

    private HappyFortuneService fortuneService;

    public TrackCoach(HappyFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "New implementation";
    }
}
