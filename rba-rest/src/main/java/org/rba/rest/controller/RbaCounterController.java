package org.rba.rest.controller;

import org.rba.rest.persistence.BRepository;
import org.rba.rest.persistence.RRepository;
import org.rba.rest.persistence.RbaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/count")
public class RbaCounterController {

    @Autowired
    private RbaRepository rbaRepository;

    @Autowired
    private RRepository rRepository;

    @Autowired
    private BRepository bRepository;

    @GetMapping("/r")
    public Long getR() {
        return rRepository.count();
    }

    @GetMapping("/b")
    public Long getB() {
        return bRepository.count();
    }

    @GetMapping("/rba")
    public Long getRba() {
        return rbaRepository.count();
    }

}
