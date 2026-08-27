// port-lint: tests windows-sys/src/Windows/Win32/Foundation/mod.rs
package io.github.kotlinmania.windowssys

import io.github.kotlinmania.windowssys.windows.win32.foundation.FALSE
import io.github.kotlinmania.windowssys.windows.win32.foundation.INVALID_HANDLE_VALUE
import io.github.kotlinmania.windowssys.windows.win32.foundation.TRUE
import kotlin.test.Test
import kotlin.test.assertEquals

class FoundationBoolTest {
    @Test
    fun testBoolConstants() {
        assertEquals(0, FALSE)
        assertEquals(1, TRUE)
    }

    @Test
    fun testInvalidHandleValue() {
        assertEquals(-1L, INVALID_HANDLE_VALUE)
    }
}
