package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class DivisibleByFilterTest {
    @Test
    void acceptDivisibleBy7(){
        DivisibleByFilter filter = new DivisibleByFilter(7);
        List<Integer> divisors = Arrays.asList(7, 14, 21, 28, 35, 42, 49);
        List<Integer> notDivisors = Arrays.asList(3, 4, 6, 23, 24, 29, 71, 78);

        for(int i : divisors){
            Assertions.assertTrue(filter.accept(i));
        }

        for(int i : notDivisors){
            Assertions.assertFalse(filter.accept(i));
        }
    }

    @Test
    void acceptDivisibleBy5(){
        DivisibleByFilter filter = new DivisibleByFilter(5);
        List<Integer> divisors = Arrays.asList(5, 10, 15, 20, 25, 30, 35);
        List<Integer> notDivisors = Arrays.asList(3, 4, 6, 23, 24, 29, 71, 78);

        for(int i : divisors){
            Assertions.assertTrue(filter.accept(i));
        }

        for(int i : notDivisors){
            Assertions.assertFalse(filter.accept(i));
        }
    }
}
