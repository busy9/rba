package org.rba.rest.service;

import org.springframework.stereotype.Service;

@Service
public class RbaService {

    public String parseIntToRBA(int n) {

        boolean divisibleBy3 = isDivisibleBy3(n);
        boolean divisibleBy5 = isDivisibleBy5(n);

        if (divisibleBy3 && divisibleBy5){
            return "RBA";
        }

        if (divisibleBy3){
            return "R";
        }

        if (divisibleBy5){
            return "B";
        }

        return null;
    }

    private boolean isDivisibleBy3(int n) {
        return n % 3 == 0;
    }

    private boolean isDivisibleBy5(int n) {
        return n % 5 == 0;
    }
}
