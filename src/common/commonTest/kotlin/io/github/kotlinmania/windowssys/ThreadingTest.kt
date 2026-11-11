package io.github.kotlinmania.windowssys

import io.github.kotlinmania.windowssys.windows.win32.system.threading.INFINITE
import io.github.kotlinmania.windowssys.windows.win32.system.threading.PROCESS_ALL_ACCESS
import io.github.kotlinmania.windowssys.windows.win32.system.threading.PROCESS_QUERY_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.system.threading.PROCESS_QUERY_LIMITED_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.system.threading.PROCESS_TERMINATE
import io.github.kotlinmania.windowssys.windows.win32.system.threading.getCurrentProcessId
import io.github.kotlinmania.windowssys.windows.win32.system.threading.getCurrentThreadId
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ThreadingTest {
    @Test
    fun testProcessAccessRights() {
        assertEquals(1u, PROCESS_TERMINATE)
        assertEquals(1024u, PROCESS_QUERY_INFORMATION)
        assertEquals(4096u, PROCESS_QUERY_LIMITED_INFORMATION)
        assertEquals(2097151u, PROCESS_ALL_ACCESS)
    }

    @Test
    fun testInfinite() {
        assertEquals(4294967295u, INFINITE)
    }

    @Test
    fun testLiveCurrentProcessAndThreadIds() {
        val pid = getCurrentProcessId()
        val tid = getCurrentThreadId()
        assertTrue((pid == 0u && tid == 0u) || (pid > 0u && tid > 0u))
    }
}
