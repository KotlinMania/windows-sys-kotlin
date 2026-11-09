package io.github.kotlinmania.windowssys

import io.github.kotlinmania.windowssys.windows.win32.foundation.CloseHandle
import io.github.kotlinmania.windowssys.windows.win32.foundation.GetLastError
import io.github.kotlinmania.windowssys.windows.win32.foundation.SetLastError
import io.github.kotlinmania.windowssys.windows.win32.system.environment.FreeEnvironmentStringsW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.GetCommandLineW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.GetEnvironmentStringsW
import io.github.kotlinmania.windowssys.windows.win32.system.threading.GetCurrentProcess
import io.github.kotlinmania.windowssys.windows.win32.system.threading.GetCurrentProcessId
import io.github.kotlinmania.windowssys.windows.win32.system.threading.GetCurrentThread
import io.github.kotlinmania.windowssys.windows.win32.system.threading.GetCurrentThreadId
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

private fun isNodeWindowsHost(): Boolean =
    js("typeof process !== 'undefined' && process.versions != null && process.versions.node != null && process.platform === 'win32'") as Boolean

class WindowsSysJsTest {
    @Test
    fun testCloseHandleAndLastError() {
        if (!isNodeWindowsHost()) {
            assertEquals(0u, GetLastError())
            return
        }
        CloseHandle(0L)
        SetLastError(0u)
        assertEquals(0u, GetLastError())
    }

    @Test
    fun testThreadingAndEnvironmentFunctions() {
        if (!isNodeWindowsHost()) {
            assertEquals(0u, GetCurrentProcessId())
            return
        }
        assertTrue(GetCurrentProcess() != 0L)
        assertTrue(GetCurrentProcessId() != 0u)
        assertTrue(GetCurrentThread() != 0L)
        assertTrue(GetCurrentThreadId() != 0u)
        assertTrue(GetCommandLineW() != 0L)
        val env = GetEnvironmentStringsW()
        assertTrue(env != 0L)
        assertTrue(FreeEnvironmentStringsW(env) != 0)
    }
}
