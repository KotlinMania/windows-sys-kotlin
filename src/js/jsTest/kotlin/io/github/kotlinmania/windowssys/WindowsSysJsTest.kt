package io.github.kotlinmania.windowssys

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
import kotlin.test.assertFalse
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
        closeHandle(MutPtr(0L))
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
        assertFalse(getCurrentProcess().isNull())
        assertTrue(getCurrentProcessId() != 0u)
        assertFalse(getCurrentThread().isNull())
        assertTrue(getCurrentThreadId() != 0u)
        assertFalse(getCommandLineW().isNull())
        val env = getEnvironmentStringsW()
        assertFalse(env.isNull())
        assertTrue(freeEnvironmentStringsW(env.castConst()) != 0)
    }
}
