package com.foo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

final class BarTest {

    @BeforeAll
    static void setup(TestReporter reporter, TestInfo testInfo) {
        reporter.publishEntry("log", "started class  " + testInfo.getDisplayName());
    }

    @AfterAll
    static void tearDown(TestReporter reporter, TestInfo testInfo) {
        reporter.publishEntry("log", "finished class " + testInfo.getDisplayName());
    }

    @Test
    void testBar1(TestReporter reporter, TestInfo testInfo) throws Exception {
        reporter.publishEntry("log", "started " + testInfo.getDisplayName());
        Thread.sleep(1_000);
        reporter.publishEntry("log", "finished " + testInfo.getDisplayName());
    }

    @Test
    void testBar2(TestReporter reporter, TestInfo testInfo) throws Exception {
        reporter.publishEntry("log", "started " + testInfo.getDisplayName());
        Thread.sleep(1_000);
        reporter.publishEntry("log", "finished " + testInfo.getDisplayName());
    }
}
