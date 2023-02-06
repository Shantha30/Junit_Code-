package com.junit.sample;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class) //used to run all the classes in one shot
//@SuiteClasses({AdactinLoginPage.class, Sample.class}) //collection of classes that is going to be combined execute in one shot
@SuiteClasses(AdactinLoginPage.class)

public class RunnerClass {

}
