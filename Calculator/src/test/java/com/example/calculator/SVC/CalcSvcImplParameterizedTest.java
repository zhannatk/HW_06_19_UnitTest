package com.example.calculator.SVC;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.example.calculator.constans.TestConstants.*;
import static org.junit.jupiter.api.Assertions.*;

class CalcSvcImplParameterizedTest {
    private final CalcSVC svc = new CalcSvcImpl();

    @ParameterizedTest
    @MethodSource("paramProviderForPlus")
    public void shouldReturnSum(Integer n1, Integer n2, Integer expRes) {
        assertEquals(expRes, svc.plus(n1, n2));

    }

    private static Stream<Arguments> paramProviderForPlus() {
        return Stream.of(
                Arguments.of(CORRECT_NUM1, CORRECT_NUM2, CORRECT_SUM),
                Arguments.of(0, 0, 0),
                Arguments.of(1, 2, 3),
                Arguments.of(5, -5, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("paramProviderForMinus")
    public void shouldReturnMinus(Integer n1, Integer n2, Integer expRes) {
        assertEquals(expRes, svc.minus(n1, n2));

    }
    private static Stream<Arguments> paramProviderForMinus() {
        return Stream.of(
                Arguments.of(CORRECT_NUM1, CORRECT_NUM2, CORRECT_DIFF),
                Arguments.of(0, 0, 0),
                Arguments.of(1, 2, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("paramProviderForMultiply")
    public void shouldReturnMultiply(Integer n1, Integer n2, Integer expRes) {
        assertEquals(expRes, svc.multiply(n1, n2));

    }

    @ParameterizedTest
    @MethodSource("paramProviderForDivide")
    public void shouldReturnDivide(Integer n1, Integer n2, Number expRes) {
        assertEquals(expRes, svc.divide(n1, n2));

    }




    private static Stream<Arguments> paramProviderForMultiply() {
        return Stream.of(
                Arguments.of(CORRECT_NUM1, CORRECT_NUM2, CORRECT_MULT),
                Arguments.of(0, 0, 0),
                Arguments.of(1, 2, 2)
        );
    }

    private static Stream<Arguments> paramProviderForDivide() {
        return Stream.of(
                Arguments.of(CORRECT_NUM1, CORRECT_NUM2, CORRECT_DIV),
                Arguments.of(0, 1, 0.0),
                Arguments.of(1, 2, 0.5)
        );
    }

}