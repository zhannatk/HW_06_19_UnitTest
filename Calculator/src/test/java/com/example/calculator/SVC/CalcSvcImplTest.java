package com.example.calculator.SVC;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcSvcImplTest {
    private final CalcSVC svc =new CalcSvcImpl();
    @Test
    void shouldReturnCorrectPlus() {
        assertEquals(10,svc.plus(5,5));
        assertEquals(0,svc.plus(0,0));
    }

    @Test
    void shouldReturnCorrectMinus() {
        assertEquals(0,svc.minus(5,5));
        assertEquals(0,svc.minus(5,5));

    }

    @Test
    void shouldReturnCorrectMultiply() {
        assertEquals(25,svc.multiply(5,5));
        assertEquals(0,svc.multiply(0,5));
    }

    @Test
    void shouldReturnCorrectDivide() {
        assertEquals(1.0,svc.divide(5,5));
        assertEquals(0.0,svc.divide(0,5));
    }

    @Test
    void shouldSayNoParam() {

        assertAll(
                ()-> assertEquals("Где все параметры?", svc.checkParams(5,null)),
                ()-> assertEquals("Где все параметры?", svc.checkParams(null,5)),
                ()-> assertEquals("Где все параметры?", svc.checkParams(null,null))
        );



    }
    @Test
    void shouldTrowIllegal() {
        assertThrows(IllegalArgumentException.class,()-> svc.divide(28,0));
    }
}