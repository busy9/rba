package org.rba.rest.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RbaServiceTest {

    private RbaService rbaService;

    @BeforeEach
    public void setup() {
        rbaService = new RbaService();
    }

    @Test
    public void canParseR(){
        String result1 = rbaService.parseIntToRBA(3);
        String result2 = rbaService.parseIntToRBA(6);
        String result3 = rbaService.parseIntToRBA(9);

        assertAll(
                () -> assertEquals("R", result1),
                () -> assertEquals("R", result2),
                () -> assertEquals("R", result3)
        );

    }

    @Test
    public void canParseB(){
        String result1 = rbaService.parseIntToRBA(5);
        String result2 = rbaService.parseIntToRBA(10);
        String result3 = rbaService.parseIntToRBA(20);

        assertAll(
                () -> assertEquals("B", result1),
                () -> assertEquals("B", result2),
                () -> assertEquals("B", result3)
        );

    }

    @Test
    public void canParseRBA(){
        String result1 = rbaService.parseIntToRBA(15);
        String result2 = rbaService.parseIntToRBA(30);
        String result3 = rbaService.parseIntToRBA(60);

        assertAll(
                () -> assertEquals("RBA", result1),
                () -> assertEquals("RBA", result2),
                () -> assertEquals("RBA", result3)
        );

    }

}