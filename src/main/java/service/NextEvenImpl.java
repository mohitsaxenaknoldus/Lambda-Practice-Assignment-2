package service;

public class NextEvenImpl implements NextEven{
    /**
     * getNextEven
     * @param number
     * @return Returns the next even number
     */
    @Override
    public long getNextEven(long number) {
        NextEven nextEven = (long num) -> (num % 2 == 0) ? (num + 2) : (num + 1);

        return nextEven.getNextEven(number);
    }
}
