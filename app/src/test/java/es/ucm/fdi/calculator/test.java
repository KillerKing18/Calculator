package es.ucm.fdi.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class test {
    @Test
    public void addition_isCorrect() {
        assertEquals(2 + 2, (long)Calculator.add(2, 2));
    }
}
