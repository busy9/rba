package org.rba.producer.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class RandomGeneratorTest {

    private RandomGenerator generator;

    @BeforeEach
    public void setUp() {
        generator = new RandomGenerator();
    }

    @Test
    public void generate10RandomIntegers() {
        List<Integer> integers = IntStream.range(0, 10)
                .map(i -> generator.getNext())
                .boxed()
                .collect(Collectors.toList());
        assertAll(
                () -> assertTrue(integers != null),
                () -> assertFalse(integers.isEmpty()),
                () -> assertEquals(10, integers.size())
        );
    }

}