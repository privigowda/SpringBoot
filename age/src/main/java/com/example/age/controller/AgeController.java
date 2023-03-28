package com.example.age.controller;

import com.example.age.dao.Age;
import com.example.age.helper.calculateAge;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class AgeController {

    @RequestMapping(value="/age")
    public Age getAge(){
        calculateAge age = new calculateAge();
        log.info("AGE METHOD CALLED");
        return age.getAge(1997,03,06);
    }

//    @RequestMapping(value="/postage", method = RequestMethod.POST)
    @PostMapping(value = "/postage")
    public Age postAge(@RequestBody Age userAge){
        calculateAge age = new calculateAge();
        log.info("Post AGE METHOD CALLED");
        return age.getAge(userAge.getYears(), userAge.getMonths(),userAge.getDays());
    }
}
