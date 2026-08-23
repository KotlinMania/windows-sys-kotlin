// port-lint: tests Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys

import io.github.kotlinmania.windowssys.windows.win32.foundation.ERROR_ALREADY_EXISTS
import io.github.kotlinmania.windowssys.windows.win32.foundation.ERROR_FILE_NOT_FOUND
import io.github.kotlinmania.windowssys.windows.win32.foundation.ERROR_INSUFFICIENT_BUFFER
import io.github.kotlinmania.windowssys.windows.win32.foundation.ERROR_IO_PENDING
import io.github.kotlinmania.windowssys.windows.win32.foundation.ERROR_NOT_FOUND
import io.github.kotlinmania.windowssys.windows.win32.foundation.ERROR_SUCCESS
import kotlin.test.Test
import kotlin.test.assertEquals

class WindowsSysTest {
    @Test
    fun testWin32Errors() {
        assertEquals(0u, ERROR_SUCCESS)
        assertEquals(2u, ERROR_FILE_NOT_FOUND)
        assertEquals(122u, ERROR_INSUFFICIENT_BUFFER)
        assertEquals(183u, ERROR_ALREADY_EXISTS)
        assertEquals(997u, ERROR_IO_PENDING)
        assertEquals(1168u, ERROR_NOT_FOUND)
    }
}
