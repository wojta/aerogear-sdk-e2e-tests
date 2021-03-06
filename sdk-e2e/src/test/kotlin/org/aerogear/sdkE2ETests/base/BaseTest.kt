package org.aerogear.sdkE2ETests.base

import org.aerogear.akow.test.AkowTest
import org.aerogear.sdkE2ETests.appium
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
