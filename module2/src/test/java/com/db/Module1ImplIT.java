package com.db;

import com.study.IModule1;
import com.study.Module1Impl;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Module1ImplIT {
    private IModule1 module1 = new Module1Impl();

    @Test
    public void coveredByUnitTest() {
        module1.coveredByIntegrationTest();
        assertTrue(true);
    }
}