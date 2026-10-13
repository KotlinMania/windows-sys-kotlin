// port-lint: tests N/A
package io.github.kotlinmania.windowssys

import io.github.kotlinmania.windowssys.windows.win32.foundation.CloseHandle
import io.github.kotlinmania.windowssys.windows.win32.foundation.GetLastError
import io.github.kotlinmania.windowssys.windows.win32.foundation.SetLastError
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.AreFileApisANSI
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FlushFileBuffers
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.DisconnectNamedPipe
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.K32EmptyWorkingSet
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.LockWorkStation
import io.github.kotlinmania.windowssys.windows.win32.system.threading.GetCurrentProcess
import io.github.kotlinmania.windowssys.windows.win32.system.threading.GetCurrentProcessId
import io.github.kotlinmania.windowssys.windows.win32.system.threading.GetCurrentThread
import io.github.kotlinmania.windowssys.windows.win32.system.threading.GetCurrentThreadId
import io.github.kotlinmania.windowssys.windows.win32.system.time.GetTimeZoneInformation
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class WindowsSysJsTest {
    @Test
    fun testNativeModuleLoaded() {
        assertNotNull(WindowsSysNative)
    }

    @Test
    fun testCloseHandleAndLastError() {
        val result = CloseHandle(0L)
        assertNotNull(result)
        SetLastError(0u)
        val err = GetLastError()
        assertEquals(0u, err)
    }

    @Test
    fun testFileSystemFunctions() {
        val ansi = AreFileApisANSI()
        assertNotNull(ansi)
        val flush = FlushFileBuffers(0L)
        assertNotNull(flush)
    }

    @Test
    fun testThreadingFunctions() {
        val proc = GetCurrentProcess()
        assertNotNull(proc)
        val pid = GetCurrentProcessId()
        assertNotNull(pid)
        val thread = GetCurrentThread()
        assertNotNull(thread)
        val tid = GetCurrentThreadId()
        assertNotNull(tid)
    }

    @Test
    fun testProcessStatusFunctions() {
        val res = K32EmptyWorkingSet(0L)
        assertNotNull(res)
    }

    @Test
    fun testTimeFunctions() {
        val tz = GetTimeZoneInformation(0L)
        assertNotNull(tz)
    }

    @Test
    fun testShutdownFunctions() {
        val lock = LockWorkStation()
        assertNotNull(lock)
    }

    @Test
    fun testPipesFunctions() {
        val pipe = DisconnectNamedPipe(0L)
        assertNotNull(pipe)
    }
}
