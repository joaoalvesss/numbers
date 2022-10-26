package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class PositiveFilterTest {
    @Test
    void accept(){
        PositiveFilter filter = new PositiveFilter();
        List<Integer> positives = Arrays.asList(1, 12, 32, 103, 1004, 10987, Integer.MAX_VALUE);
        List<Integer> notPositives = Arrays.asList(0, -1, -12, -32, -103, -1004, -10987, Integer.MIN_VALUE);

        for(int i: positives){
            Assertions.assertTrue(filter.accept(i));
        }

        for(int i : notPositives){
            Assertions.assertFalse(filter.accept(i));
        }
    }
}
