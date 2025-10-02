package com.nathan422.p01ContainsDuplicates;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DuplicatesTest {
    @Test
    public void arrayWithDuplicatesShouldReturnTrue() {
        int[] values = {1,2,3,1};
        assertTrue(Duplicates.containsDuplicates(values));
    }

    @Test
    public void arrayWithoutDuplicatesShouldReturnFalse() {
        int[] value = {1,2,3,4};
        assertFalse(Duplicates.containsDuplicates(value));
    }

    @Test
    public void arrayWithManyDuplicatesShouldReturnTrue() {
        int[] value = {1,1,1,3,3,4,3,2,4,2};
        assertTrue(Duplicates.containsDuplicates(value));
    }
}