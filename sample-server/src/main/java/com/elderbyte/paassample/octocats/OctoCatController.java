package com.elderbyte.paassample.octocats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("api/octocats")
public class OctoCatController {

    @Autowired
    private OctoCatService octoCatService;


    @RequestMapping(method = RequestMethod.GET)
    public Iterable<OctoCat> getAll(){
        return octoCatService.getAll();
    }

    @RequestMapping(
            value = "/create",
            method = RequestMethod.GET)
    public ResponseEntity<OctoCat> create(@RequestParam(value = "name") String name){

        OctoCat octoCat = octoCatService.create(name);
        octoCatService.save(octoCat);
        return ResponseEntity.ok(octoCat);
    }


}
