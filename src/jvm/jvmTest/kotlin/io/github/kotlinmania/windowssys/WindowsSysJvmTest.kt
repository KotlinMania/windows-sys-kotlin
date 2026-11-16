package io.github.kotlinmania.windowssys

import io.github.kotlinmania.windowssys.windows.win32.system.environment.freeEnvironmentStringsW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.getCommandLineW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.getEnvironmentStringsW
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class WindowsSysJvmTest {
    private val isWindowsHost: Boolean =
        System
            .getProperty("os.name")
            .orEmpty()
            .lowercase()
            .contains("win")

    @Test
    fun testEnvironmentApis() {
        if (!isWindowsHost) {
            assertTrue(getCommandLineW().isNull())
            return
        }

        val cmd = getCommandLineW()
        assertFalse(cmd.isNull())

        val envStrings = getEnvironmentStringsW()
        assertFalse(envStrings.isNull())
        assertTrue(freeEnvironmentStringsW(envStrings.castConst()) != 0)
    }
}
