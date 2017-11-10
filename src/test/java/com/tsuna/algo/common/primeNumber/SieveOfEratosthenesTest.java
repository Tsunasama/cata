/*
 * Copyright (c) 2017.
 * Project : kata
 * File : SieveOfEratosthenesTest.java
 * Date : 17-11-7 下午3:45
 * Tsunasama All rights reserved.
 */

package com.tsuna.algo.common.primeNumber;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SieveOfEratosthenesTest {
    @Test
    public void testFind() throws Exception {
        List<Integer> result = SieveOfEratosthenes.find(25);
        Assert.assertEquals("[2, 3, 5, 7, 11, 13, 17, 19, 23, 25]", result.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindWithParameterBelow2() {
        SieveOfEratosthenes.find(1);
    }

    @Test
    public void testCleanMultiplication() throws Exception {
        List<Integer> result = SieveOfEratosthenes.cleanMultiplication(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 11, 12), 3);
        Assert.assertEquals("[2, 3, 4, 5, 7, 8, 11]", result.toString());
    }

}