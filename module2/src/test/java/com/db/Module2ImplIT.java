package com.db;

import com.study.IModule2;
import com.study.Module2Impl;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Module2ImplIT {
    private IModule2 module2 = new Module2Impl();

    @Test
    public void coveredByUnitTest() {
        module2.coveredByIntegrationTest();
        assertTrue(true);
    }
}