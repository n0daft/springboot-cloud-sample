package com.elderbyte.paassample;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController("api/counter")
public class CounterRestController {

    private static AtomicInteger counter = new AtomicInteger();

    @RequestMapping(method = RequestMethod.GET)
    public int incrementAndGet(){
        return counter.incrementAndGet();
    }

}
