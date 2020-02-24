package com.education_wired_.work13;

import com.education_wired_.DaysOfWeek;

public class Main {
    public static void main(String[] args) {
        TrainSchedule schedule = new TrainSchedule(10);
        schedule.addTrain(createTrain());
        schedule.addTrain(createTrain());

        schedule.printTRains();
    }

    public static Train createTrain(){
        Train train = new Train();
        train.setStationDispatch("Kyiv");
        train.setStationArrival("Lviv");
        train.setTimeDispatch("12:00");
        train.setTimeArrival("13:00");
        train.setDays(new DaysOfWeek[]{DaysOfWeek.MONDAY,DaysOfWeek.WEDNESDAY,DaysOfWeek.FRIDAY});
        return train;

    }

}
