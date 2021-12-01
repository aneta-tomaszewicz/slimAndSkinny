package com.example.slimandskinny.service;

import com.example.slimandskinny.entity.Days;

import java.text.SimpleDateFormat;
import java.util.*;

public class CalendarService {

   /* public List<Days>getCalendar(int month, int year){
        List<Days> calendars = new ArrayList<>();
        java.util.Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.YEAR,year);

        int dayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);


        for(int i = 1; i<= dayOfMonth; i++){
            Days days = new Days();
            days.setDayOfMonth(i);
            days.setDayOfWeek(dayOfWeek);
            calendars.add(days);
            calendar.

        }
        return calendars;

    }*/

    public static void main(String[] args) {

        Date date = new Date();
        SimpleDateFormat month = new SimpleDateFormat("M");
        SimpleDateFormat currentYear = new SimpleDateFormat("yyyy");

        String[] week = {"Nie", "Pon", "Wto", "Śro", "Czw", "Pia", "Sob"};
        int countYear, countDay = 0, mnth = 0;

        try {
            mnth = Integer.parseInt(args[0]);
        } catch (Exception e) {
            mnth = Integer.parseInt(month.format(date));
        }
        int year = 0000, startWeekDay;
        try {
            year = Integer.parseInt(args[1]);
        } catch (Exception e) {
            year = Integer.parseInt(currentYear.format(date));
        }
        System.out.print("\n\n\t\t.......Calendar of " + mnth + ", " + year + "......\n\n\n\t");

        for (int i = 0; i < 7; i++) {
            System.out.print(week[i] + "\t");
        }
        System.out.print("\n\t");
        int weekNo = 1, amountOfDays[], countLeapYear = 0;
        amountOfDays = new int[12];
        amountOfDays[0] = 31;
        amountOfDays[1] = 28;
        amountOfDays[2] = 31;
        amountOfDays[3] = 30;
        amountOfDays[4] = 31;
        amountOfDays[5] = 30;
        amountOfDays[6] = 31;
        amountOfDays[7] = 31;
        amountOfDays[8] = 30;
        amountOfDays[9] = 31;
        amountOfDays[10] = 30;
        amountOfDays[11] = 31;

        if (year % 4 == 0) amountOfDays[1] = 29;
        else amountOfDays[1] = 28;



       /* if (year < 2011)
        {
            countYear = 2011 - year - 1;
            for (int j = 12; j > mnth; j--) {
                countDay += amountOfDays[j - 1];
            }
            for (int j = 2010; j > year; j--) {
                if (j%4 == 0) countLeapYear++;
            }
            countDay += (countYear * 365) + countLeapYear;
            startWeekDay = 7 - (countDay % 7);
        }
        else {
            countYear = year - 2011;
            for (int j = 1; j < mnth; j++) countDay += amountOfDays[j - 1];
            for (int j = 2011; j < year; j++) {
                if (j%4==0) countLeapYear++;
            }
            countDay += (countYear * 365) + countLeapYear;
            startWeekDay = (countDay % 7);
            if (startWeekDay == 0) startWeekDay = 7;

        }
        for (int k = 1; k < startWeekDay; k++) System.out.print("\t");
        weekNo = startWeekDay;
        for (int i = 1; i < amountOfDays[mnth - 1]; i++)
        {
            if ((weekNo%7) == 0) {
                weekNo = 0;
                System.out.print("\t" +i);
            } else {
                System.out.print("\t" +i);
                weekNo++;
            }
        }*/
    }
}
