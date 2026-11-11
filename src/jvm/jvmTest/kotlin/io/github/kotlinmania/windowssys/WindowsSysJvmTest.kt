package io.github.kotlinmania.windowssys

import io.github.kotlinmania.windowssys.windows.win32.system.environment.freeEnvironmentStringsW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.getCommandLineW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.getEnvironmentStringsW
import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertNull
import kotlin.test.assertTrue

class WindowsSysJvmTest {
    private val isWindowsHost: Boolean =
        System.getProperty("os.name").orEmpty().lowercase().contains("win")

    @Test
    fun testEnvironmentApis() {
        if (!isWindowsHost) {
            assertNull(getCommandLineW())
            return
        }

        val cmd = getCommandLineW()
        assertNotNull(cmd)

        val envStrings = getEnvironmentStringsW()
        assertNotNull(envStrings)
        assertTrue(freeEnvironmentStringsW(envStrings) != 0)
    }
}
