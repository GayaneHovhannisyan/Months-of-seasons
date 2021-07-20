package com.company.months;

public enum Months {
    JAN("Winter","january",31),
    FEB("Winter","february",28),
    MAR("Spring","march",31),
    APR("Spring","april",30),
    MAY("Spring","may",31),
    JUN("Summer","june",30),
    JUL("Summer","july",31),
    AUG("Summer","august",31),
    SEP("Autumn","september",30),
    OCT("Autumn","october",31),
    NOV("Autumn","november",30),
    DES("Winter","desember",31)
    ;
    String season;
    String monthsName;
    int deyOfMonths;

    Months(String season, String monthsName, int deyOfMonths) {
        this.season = season;
        this.monthsName = monthsName;
        this.deyOfMonths = deyOfMonths;
    }

    public String getSeason() {
        return season;
    }

    public String getMonthsName() {
        return monthsName;
    }

    public int getDeyOfMonths() {
        return deyOfMonths;
    }
}
