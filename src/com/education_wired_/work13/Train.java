package com.education_wired_.work13;

import com.education_wired_.DaysOfWeek;

import java.util.Arrays;

public class Train {
    private static int nextNumb = 0;
    private int number;
    private String stationDispatch;
    private String stationArrival;
    private String timeDispatch;
    private String timeArrival;
    private DaysOfWeek[] days;

    public Train(int number) {
        this.number = number;
        nextNumb++;
    }

    public static int getNextNumb(){
        return nextNumb;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStationDispatch() {
        return stationDispatch;
    }

    public void setStationDispatch(String stationDispatch) {
        this.stationDispatch = stationDispatch;
    }

    public String getStationArrival() {
        return stationArrival;
    }

    public void setStationArrival(String stationArrival) {
        this.stationArrival = stationArrival;
    }

    public String getTimeDispatch() {
        return timeDispatch;
    }

    public void setTimeDispatch(String timeDispatch) {
        this.timeDispatch = timeDispatch;
    }

    public String getTimeArrival() {
        return timeArrival;
    }

    public void setTimeArrival(String timeArrival) {
        this.timeArrival = timeArrival;
    }

    public DaysOfWeek[] getDays() {
        return days;
    }

    public void setDays(DaysOfWeek[] days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "Train{" +
                "number=" + number +
                ", stationDispatch='" + stationDispatch + '\'' +
                ", stationArrival='" + stationArrival + '\'' +
                ", timeDispatch='" + timeDispatch + '\'' +
                ", timeArrival='" + timeArrival + '\'' +
                ", days=" + Arrays.toString(days) +
                '}';
    }
}
