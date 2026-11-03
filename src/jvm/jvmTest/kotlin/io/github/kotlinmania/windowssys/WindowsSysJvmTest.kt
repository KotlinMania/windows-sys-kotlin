// port-lint: tests Windows/Win32/System/Environment/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys

import io.github.kotlinmania.windowssys.windows.win32.system.environment.ExpandEnvironmentStringsW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.FreeEnvironmentStringsW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.GetCommandLineW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.GetCurrentDirectoryW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.GetEnvironmentStringsW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.GetEnvironmentVariableW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.SetCurrentDirectoryW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.SetEnvironmentVariableW
import kotlin.test.Test
import kotlin.test.assertNotNull

class WindowsSysJvmTest {
    @Test
    fun testEnvironmentApis() {
        val cmd = GetCommandLineW()
        assertNotNull(cmd)

        val envStrings = GetEnvironmentStringsW()
        assertNotNull(envStrings)
        if (envStrings != 0L) {
            FreeEnvironmentStringsW(envStrings)
        }

        val curDirBuf = UShortArray(260)
        val curDirLen = GetCurrentDirectoryW(260u, curDirBuf)
        assertNotNull(curDirLen)
        val setCurDir = SetCurrentDirectoryW(curDirBuf)
        assertNotNull(setCurDir)

        // Null-terminated strings for Win32 API calls
        val varName = "TEST_KM_ENV\u0000".map { it.code.toUShort() }.toUShortArray()
        val varVal = "42\u0000".map { it.code.toUShort() }.toUShortArray()
        val outBuf = UShortArray(64)

        val setRes = SetEnvironmentVariableW(varName, varVal)
        assertNotNull(setRes)

        val getLen = GetEnvironmentVariableW(varName, outBuf, 64u)
        assertNotNull(getLen)

        // Delete test variable
        SetEnvironmentVariableW(varName, null)

        val srcStr = "%PATH%\u0000".map { it.code.toUShort() }.toUShortArray()
        val expLen = ExpandEnvironmentStringsW(srcStr, outBuf, 64u)
        assertNotNull(expLen)
    }
}
