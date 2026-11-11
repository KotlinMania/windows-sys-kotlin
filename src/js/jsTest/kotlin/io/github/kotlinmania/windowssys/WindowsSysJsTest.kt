package io.github.kotlinmania.windowssys

import io.github.kotlinmania.windowssys.windows.win32.foundation.closeHandle
import io.github.kotlinmania.windowssys.windows.win32.foundation.getLastError
import io.github.kotlinmania.windowssys.windows.win32.foundation.setLastError
import io.github.kotlinmania.windowssys.windows.win32.system.environment.freeEnvironmentStringsW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.getCommandLineW
import io.github.kotlinmania.windowssys.windows.win32.system.environment.getEnvironmentStringsW
import io.github.kotlinmania.windowssys.windows.win32.system.threading.getCurrentProcess
import io.github.kotlinmania.windowssys.windows.win32.system.threading.getCurrentProcessId
import io.github.kotlinmania.windowssys.windows.win32.system.threading.getCurrentThread
import io.github.kotlinmania.windowssys.windows.win32.system.threading.getCurrentThreadId
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

private fun isNodeWindowsHost(): Boolean =
    js("typeof process !== 'undefined' && process.versions != null && process.versions.node != null && process.platform === 'win32'") as Boolean

class WindowsSysJsTest {
    @Test
    fun testCloseHandleAndLastError() {
        if (!testSupportsHostFfi()) {
            assertFailsWith<UnsupportedOperationException> { getLastError() }
            return
        }
        if (!isNodeWindowsHost()) {
            assertEquals(0u, getLastError())
            return
        }
        closeHandle(null)
        setLastError(0u)
        assertEquals(0u, getLastError())
    }

    @Test
    fun testThreadingAndEnvironmentFunctions() {
        if (!testSupportsHostFfi()) {
            assertFailsWith<UnsupportedOperationException> { getCurrentProcessId() }
            return
        }
        if (!isNodeWindowsHost()) {
            assertEquals(0u, getCurrentProcessId())
            return
        }
        assertNotNull(getCurrentProcess())
        assertTrue(getCurrentProcessId() != 0u)
        assertNotNull(getCurrentThread())
        assertTrue(getCurrentThreadId() != 0u)
        assertNotNull(getCommandLineW())
        val env = getEnvironmentStringsW()
        assertNotNull(env)
        assertTrue(freeEnvironmentStringsW(env) != 0)
    }
}
