package com.infoshareacademy.ex_1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CarTest {

    @Mock
    public Type type;

    @InjectMocks
    public Car car;

    @Test
    public void test() {

        //GIVEN
        int expectedAge = 12;
        String expectedModel = "BMW";

        String expected = "Age is: 12, Model is: BMW";

        //WHEN
        Mockito.when(type.getAge()).thenReturn(12);
        Mockito.when(type.getModel()).thenReturn("BMW");

        int resultAge = car.getTyp().getAge();
        String resultModel = car.getTyp().getModel();

        String result = car.showType(type);

        //THEN
        Mockito.verify(type, Mockito.times(2)).getAge();
        Mockito.verify(type, Mockito.times(2)).getModel();
        assertEquals(expectedAge, resultAge);
        assertEquals(expectedModel, resultModel);
        assertEquals(expected, result);
    }
}


