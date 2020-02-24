package com.education_wired_.work12;

import com.education_wired_.DaysOfWeek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        for ( DaysOfWeek day: DaysOfWeek.values()) {
            System.out.println(day);
        }
        System.out.println("----day study----");
        for ( DaysOfWeek day: DaysOfWeek.values()) {
            switch (day) {
                case MONDAY: case FRIDAY:case WEDNESDAY:
                    System.out.println(day);
            }
        }
        System.out.println("----nextDay----");
        System.out.println(DaysOfWeek.SATURDAY.nextDay());
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day of week -> ");
        String day = sc.next().toUpperCase();
        System.out.println(DaysOfWeek.valueOf(day).nextDay());
    }
}
