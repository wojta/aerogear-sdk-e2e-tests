package org.aerogear.sdk_e2e_tests.base

import org.aerogear.akow.test.AkowTest
import org.aerogear.sdk_e2e_tests.appium
import org.junit.runners.Parameterized

/**
 * Base test for all tests, extend your tests from this.
 */
abstract class BaseTest : AkowTest(appium) {

    companion object {
        @Parameterized.Parameters(name = "{0}")
        @JvmStatic
        fun applications() = appium.applications.asList()
    }

}
