package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListDeduplicatorTest {

    @Test
    public void deduplicate() {
        ListDeduplicator deduplicator = new ListDeduplicator();
        List<Integer> distinct = deduplicator.deduplicate(helper(1,2,4,2,5));

        Assertions.assertEquals(helper(1,2,4,5), distinct);
    }
    private List<Integer> helper(Integer... intList){
        return Arrays.asList(intList);
    }
}
