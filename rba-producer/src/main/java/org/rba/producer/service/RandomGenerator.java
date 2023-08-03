package org.rba.producer.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomGenerator {

    private final Random rand = new Random(System.currentTimeMillis());

    public int getNext(){
        int next = rand.nextInt();
        return next;
    }

}
