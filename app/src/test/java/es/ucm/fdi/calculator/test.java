package es.ucm.fdi.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class test {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, Suma.add(2, 2));
    }
}
