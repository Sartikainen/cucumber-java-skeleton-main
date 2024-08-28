package io.cucumber.skeleton;

import io.cucumber.java.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class Hooks {
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all scenarios");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After all scenarios");
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println("Scenario failed: + " + scenario.getName());
        }
    }

    @BeforeStep
    public void beforeEveryStep() {
        System.out.println("Before every step");
    }

    @AfterStep
    public void afterEveryStep() {
        System.out.println("After every step");
    }

    @Before
    public void setUp() {
        System.out.println("Setting up the test environment");
    }

    @After
    public void tearDown() {
        System.out.println("Tearing down the test environment");
    }
}
