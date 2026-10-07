// port-lint: tests N/A
package io.github.kotlinmania.windowssys

import io.github.kotlinmania.windowssys.windows.win32.foundation.CloseHandle
import io.github.kotlinmania.windowssys.windows.win32.foundation.GetLastError
import io.github.kotlinmania.windowssys.windows.win32.foundation.SetLastError
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
}
