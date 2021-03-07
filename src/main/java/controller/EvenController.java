package controller;

import service.NextEvenImpl;

import java.util.logging.Logger;

public final class EvenController {

    private static final Logger LOGGER = Logger.getLogger(EvenController.class.getName());

    private EvenController(){}

    public static void main(String[] args)
    {
        final long number = 34567L;

        NextEvenImpl nextEven = new NextEvenImpl();

        long result = nextEven.getNextEven(number);

        LOGGER.info(String.valueOf(result));
    }
}
