package com.education_wired_;

public enum DaysOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
    public DaysOfWeek nextDay(){
        DaysOfWeek[] days = DaysOfWeek.values();

        return days[ (this.ordinal() + 1) % days.length] ;

    }
}
