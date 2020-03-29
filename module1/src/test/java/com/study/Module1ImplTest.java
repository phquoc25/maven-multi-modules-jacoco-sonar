package com.study;

import org.junit.Assert;
import org.junit.Test;

public class Module1ImplTest {
    private IModule1 module1 = new Module1Impl();

    @Test
    public void coveredByUnitTest() {
        module1.coveredByUnitTest();
        Assert.assertTrue(true);
    }
}