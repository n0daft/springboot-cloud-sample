package com.elderbyte.paassample.octocats;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class OctoCatService {

    // *************************************************************
    // Fields
    // *************************************************************

    private static AtomicInteger counter = new AtomicInteger();

    private Set<OctoCat> octoCats = new HashSet<>();

    // *************************************************************
    // Public API
    // *************************************************************

    public Iterable<OctoCat> getAll(){
        return this.octoCats;
    }

    public void save(OctoCat o){
        this.octoCats.add(o);
    }

    public OctoCat create(String name){

        OctoCat octoCat = new OctoCat(counter.incrementAndGet());
        octoCat.setName(name);
        octoCat.setDateOfBirth(LocalDateTime.now());

        return octoCat;
    }


}
