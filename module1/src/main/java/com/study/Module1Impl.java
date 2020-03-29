package com.study;

public class Module1Impl implements IModule1 {
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
