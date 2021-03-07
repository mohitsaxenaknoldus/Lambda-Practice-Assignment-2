package service;

import static org.junit.Assert.*;

public class NextEvenImplTest {

    @org.junit.Test
    public void getNextEven() {
        NextEvenImpl nextEven = new NextEvenImpl();

        assertEquals(nextEven.getNextEven(123456), 123458L);
        assertEquals(nextEven.getNextEven(123455), 123456L);
    }
}