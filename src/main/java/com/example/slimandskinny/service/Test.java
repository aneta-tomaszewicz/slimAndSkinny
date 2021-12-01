package com.example.slimandskinny.service;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.set(Calendar.YEAR, 2009);
        calendar.set(Calendar.MONTH, 1);
        System.out.println("Liczba dni: " + daysInMonth((GregorianCalendar) calendar));

        String[] daysOfTheWeek = new String[]{"", "Niedziela", "Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota"};
        Calendar calendar1 = new GregorianCalendar(2009, Calendar.APRIL, 1);
        System.out.println("Pierwszy marca to: " + daysOfTheWeek[calendar1.get(Calendar.DAY_OF_WEEK)]);
    }

    public static int daysInMonth(GregorianCalendar c) {
        final int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        daysInMonths[1] += c.isLeapYear(c.get(GregorianCalendar.YEAR)) ? 1 : 0;
        return daysInMonths[c.get(GregorianCalendar.MONTH)];
    }
}