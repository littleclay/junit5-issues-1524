package com.foo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

final class BazTest {

    @BeforeAll
    static void setup(TestReporter reporter, TestInfo testInfo) {
        reporter.publishEntry("log", "started class  " + testInfo.getDisplayName());
    }

    @AfterAll
    static void tearDown(TestReporter reporter, TestInfo testInfo) {
        reporter.publishEntry("log", "finished class " + testInfo.getDisplayName());
    }

    @Test
    void testBaz01(TestReporter reporter, TestInfo testInfo) throws Exception {
        reporter.publishEntry("log", "started " + testInfo.getDisplayName());
        Thread.sleep(1_000);
        reporter.publishEntry("log", "finished " + testInfo.getDisplayName());
    }

    @Test
    void testBaz02(TestReporter reporter, TestInfo testInfo) throws Exception {
        reporter.publishEntry("log", "started " + testInfo.getDisplayName());
        Thread.sleep(1_000);
        reporter.publishEntry("log", "finished " + testInfo.getDisplayName());
    }

    @Test
    void testBaz03(TestReporter reporter, TestInfo testInfo) throws Exception {
        reporter.publishEntry("log", "started " + testInfo.getDisplayName());
        Thread.sleep(1_000);
        reporter.publishEntry("log", "finished " + testInfo.getDisplayName());
    }

    @Test
    void testBaz04(TestReporter reporter, TestInfo testInfo) throws Exception {
        reporter.publishEntry("log", "started " + testInfo.getDisplayName());
        Thread.sleep(1_000);
        reporter.publishEntry("log", "finished " + testInfo.getDisplayName());
    }

    @Test
    void testBaz05(TestReporter reporter, TestInfo testInfo) throws Exception {
        reporter.publishEntry("log", "started " + testInfo.getDisplayName());
        Thread.sleep(1_000);
        reporter.publishEntry("log", "finished " + testInfo.getDisplayName());
    }

    @Test
    void testBaz06(TestReporter reporter, TestInfo testInfo) throws Exception {
        reporter.publishEntry("log", "started " + testInfo.getDisplayName());
        Thread.sleep(1_000);
        reporter.publishEntry("log", "finished " + testInfo.getDisplayName());
    }

    @Test
    void testBaz07(TestReporter reporter, TestInfo testInfo) throws Exception {
        reporter.publishEntry("log", "started " + testInfo.getDisplayName());
        Thread.sleep(1_000);
        reporter.publishEntry("log", "finished " + testInfo.getDisplayName());
    }

    @Test
    void testBaz08(TestReporter reporter, TestInfo testInfo) throws Exception {
        reporter.publishEntry("log", "started " + testInfo.getDisplayName());
        Thread.sleep(1_000);
        reporter.publishEntry("log", "finished " + testInfo.getDisplayName());
    }

    @Test
    void testBaz09(TestReporter reporter, TestInfo testInfo) throws Exception {
        reporter.publishEntry("log", "started " + testInfo.getDisplayName());
        Thread.sleep(1_000);
        reporter.publishEntry("log", "finished " + testInfo.getDisplayName());
    }

    @Test
    void testBaz10(TestReporter reporter, TestInfo testInfo) throws Exception {
        reporter.publishEntry("log", "started " + testInfo.getDisplayName());
        Thread.sleep(1_000);
        reporter.publishEntry("log", "finished " + testInfo.getDisplayName());
    }
    @Test
    void testBaz11(TestReporter reporter, TestInfo testInfo) throws Exception {
        reporter.publishEntry("log", "started " + testInfo.getDisplayName());
        Thread.sleep(1_000);
        reporter.publishEntry("log", "finished " + testInfo.getDisplayName());
    }

    @Test
    void testBaz12(TestReporter reporter, TestInfo testInfo) throws Exception {
        reporter.publishEntry("log", "started " + testInfo.getDisplayName());
        Thread.sleep(1_000);
        reporter.publishEntry("log", "finished " + testInfo.getDisplayName());
    }

    @Test
    void testBaz13(TestReporter reporter, TestInfo testInfo) throws Exception {
        reporter.publishEntry("log", "started " + testInfo.getDisplayName());
        Thread.sleep(1_000);
        reporter.publishEntry("log", "finished " + testInfo.getDisplayName());
    }

    @Test
    void testBaz14(TestReporter reporter, TestInfo testInfo) throws Exception {
        reporter.publishEntry("log", "started " + testInfo.getDisplayName());
        Thread.sleep(1_000);
        reporter.publishEntry("log", "finished " + testInfo.getDisplayName());
    }

    @Test
    void testBaz15(TestReporter reporter, TestInfo testInfo) throws Exception {
        reporter.publishEntry("log", "started " + testInfo.getDisplayName());
        Thread.sleep(1_000);
        reporter.publishEntry("log", "finished " + testInfo.getDisplayName());
    }

    @Test
    void testBaz16(TestReporter reporter, TestInfo testInfo) throws Exception {
        reporter.publishEntry("log", "started " + testInfo.getDisplayName());
        Thread.sleep(1_000);
        reporter.publishEntry("log", "finished " + testInfo.getDisplayName());
    }

    @Test
    void testBaz17(TestReporter reporter, TestInfo testInfo) throws Exception {
        reporter.publishEntry("log", "started " + testInfo.getDisplayName());
        Thread.sleep(1_000);
        reporter.publishEntry("log", "finished " + testInfo.getDisplayName());
    }

    @Test
    void testBaz18(TestReporter reporter, TestInfo testInfo) throws Exception {
        reporter.publishEntry("log", "started " + testInfo.getDisplayName());
        Thread.sleep(1_000);
        reporter.publishEntry("log", "finished " + testInfo.getDisplayName());
    }

    @Test
    void testBaz19(TestReporter reporter, TestInfo testInfo) throws Exception {
        reporter.publishEntry("log", "started " + testInfo.getDisplayName());
        Thread.sleep(1_000);
        reporter.publishEntry("log", "finished " + testInfo.getDisplayName());
    }

    @Test
    void testBaz20(TestReporter reporter, TestInfo testInfo) throws Exception {
        reporter.publishEntry("log", "started " + testInfo.getDisplayName());
        Thread.sleep(1_000);
        reporter.publishEntry("log", "finished " + testInfo.getDisplayName());
    }
}
