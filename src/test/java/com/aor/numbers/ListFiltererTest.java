package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

public class ListFiltererTest {
    @Test
    void filter() {
        GenericListFilter filter = Mockito.mock(GenericListFilter.class);
        Mockito.when(filter.accept(7)).thenReturn(true);
        Mockito.when(filter.accept(11)).thenReturn(false);
        Mockito.when(filter.accept(32)).thenReturn(true);
        Mockito.when(filter.accept(4)).thenReturn(false);
        Mockito.when(filter.accept(59)).thenReturn(true);
        Mockito.when(filter.accept(5)).thenReturn(true);
        Mockito.when(filter.accept(1)).thenReturn(true);

        ListFilterer filterer = new ListFilterer(filter);
        Assertions.assertEquals(Arrays.asList(7, 32, 59, 5, 1), filterer.filter(Arrays.asList(7, 11, 32, 4, 59, 5, 1)));
    }
}
