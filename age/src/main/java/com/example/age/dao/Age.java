package com.example.age.dao;

public class Age {
    private int days;
    private int months;
    private int years;

    public Age(int days, int months, int years)
    {
        this.days = days;
        this.months = months;
        this.years = years;
    }

    public Age() {

    }

    public void setYears(int years) {
        this.years = years;
    }
    public int getDays()
    {
        return this.days;
    }

    public int getMonths()
    {
        return this.months;
    }

    public int getYears()
    {
        return this.years;
    }

    @Override
    public String toString()
    {
        return years + " Years, " + months + " Months, " + days + " Days";
    }


    public void setMonths(int months) {
        this.months = months;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
