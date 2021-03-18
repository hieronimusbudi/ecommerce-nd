package com.example.demo;

import com.example.demo.controllers.CartControllerTest;
import com.example.demo.controllers.ItemControllerTest;
import com.example.demo.controllers.OrderControllerTest;
import com.example.demo.controllers.UserControllerTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        SareetaApplicationTests.class,
        UserControllerTest.class,
        OrderControllerTest.class,
        ItemControllerTest.class,
        CartControllerTest.class,
})
/**
 * Run this class to run all tests or check all tests coverage.
 */
public class AllTests {

}
