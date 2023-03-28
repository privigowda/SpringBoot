package com.example.age;

import java.time.LocalDate;
import java.time.Period;
public class calculateAge {

    public Age getAge(int year, int month, int day) {
        LocalDate l = LocalDate.of(year,month,day);
        LocalDate now = LocalDate.now();
        Period diff = Period.between(l,now);
        Age age = new Age();
        age.setYears(diff.getYears()) ;
        age.setMonths(diff.getMonths()) ;
        age.setDays(diff.getDays()) ;
        return age;
    }
}
