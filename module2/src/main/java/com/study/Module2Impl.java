package com.study;

import com.study.IModule2;

public class Module2Impl implements IModule2 {
    public void coveredByUnitTest() {
        System.out.println("This method has been covered by UT");
    }

    public void coveredByIntegrationTest() {
        System.out.println("This method has been covered by IT");
    }

    public void nonCovered() {
        System.out.println("This method has not been covered yet");
    }
}
