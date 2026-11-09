package io.github.kotlinmania.windowssys

import io.github.kotlinmania.windowssys.windows.win32.system.environment.FreeEnvironmentStringsW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.GetCommandLineW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.GetEnvironmentStringsW
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class WindowsSysJvmTest {
    private val isWindowsHost: Boolean =
        System.getProperty("os.name").orEmpty().lowercase().contains("win")

    @Test
    fun testEnvironmentApis() {
        if (!isWindowsHost) {
            assertEquals(0L, GetCommandLineW())
            return
        }

        val cmd = GetCommandLineW()
        assertTrue(cmd != 0L)

        val envStrings = GetEnvironmentStringsW()
        assertTrue(envStrings != 0L)
        assertTrue(FreeEnvironmentStringsW(envStrings) != 0)
    }
}
