package com.se498;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoSession;
import org.mockito.quality.Strictness;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;
import static org.mockito.Mockito.*;

public class AgeRestrictionTest {


    @Test
    public void testAgeRestrictionException(){
        //TODO: Implement Throws Assertion test given invalid age
    }

    @TestFactory
    public Stream<DynamicTest> testDynamicInvalidAge() {
        //TODO: Implement Dynamic Assertions test given dynamic invalid inputs
        return IntStream.iterate(1, number -> number + 1).limit(17)
                .mapToObj(number -> dynamicTest("Checking" + number, () -> assertEquals(number, number)));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "", "", ""})
    public void testValidAge() {
        //TODO: Implement Parametrized Assertions test given four valid inputs
    }


    @Test
    public void testUSDateConversion(){
        //TODO: Implement Spy test verifying US date format conversion
    }

    @Test
    public void testEUDateConversion(){
        //TODO: Implement Stub test verifying EU date format conversion
    }
}
