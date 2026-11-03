package io.github.kotlinmania.windowssys

import io.github.kotlinmania.windowssys.core.w
import io.github.kotlinmania.windowssys.windows.win32.system.environment.ExpandEnvironmentStringsW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.FreeEnvironmentStringsW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.GetCommandLineW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.GetCurrentDirectoryW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.GetEnvironmentStringsW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.GetEnvironmentVariableW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.SetCurrentDirectoryW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.SetEnvironmentVariableW
import kotlin.test.Test
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

class WindowsSysJvmTest {
    private val isWindowsHost: Boolean =
        System.getProperty("os.name").orEmpty().lowercase().contains("win")

    @Test
    fun testEnvironmentApis() {
        if (!isWindowsHost) {
            assertFailsWith<UnsupportedOperationException> {
                GetCommandLineW()
            }
            return
        }

        val cmd = GetCommandLineW()
        assertTrue(cmd != 0L)

        val envStrings = GetEnvironmentStringsW()
        assertTrue(envStrings != 0L)
        assertTrue(FreeEnvironmentStringsW(envStrings) != 0)

        val curDirBuf = Win32DynamicFfi.allocZeroed(520)
        val outBuf = Win32DynamicFfi.allocZeroed(256)
        try {
            val curDirLen = GetCurrentDirectoryW(260u, curDirBuf)
            assertTrue(curDirLen > 0u)
            assertTrue(SetCurrentDirectoryW(curDirBuf) != 0)

            val varName = w("TEST_KM_ENV")
            val varVal = w("42")
            assertTrue(SetEnvironmentVariableW(varName, varVal) != 0)

            val getLen = GetEnvironmentVariableW(varName, outBuf, 64u)
            assertTrue(getLen > 0u)

            SetEnvironmentVariableW(varName, 0L)

            val srcStr = w("%PATH%")
            val expLen = ExpandEnvironmentStringsW(srcStr, outBuf, 64u)
            assertTrue(expLen > 0u)
        } finally {
            Win32DynamicFfi.freeMem(curDirBuf)
            Win32DynamicFfi.freeMem(outBuf)
        }
    }
}
