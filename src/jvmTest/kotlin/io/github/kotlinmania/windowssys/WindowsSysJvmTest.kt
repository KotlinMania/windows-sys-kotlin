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
        assertNotNull(SetEnvironmentVariableW(0L, 0L))
        assertNotNull(GetEnvironmentVariableW(0L, 0L, 0u))
        assertNotNull(GetCurrentDirectoryW(0u, 0L))
        assertNotNull(SetCurrentDirectoryW(0L))
        assertNotNull(GetCommandLineW())
        assertNotNull(GetEnvironmentStringsW())
        assertNotNull(FreeEnvironmentStringsW(0L))
        assertNotNull(ExpandEnvironmentStringsW(0L, 0L, 0u))

        // Buffer overloads
        val emptyShorts = UShortArray(0)
        assertNotNull(SetEnvironmentVariableW(emptyShorts, null))
        assertNotNull(GetEnvironmentVariableW(emptyShorts, null, 0u))
        assertNotNull(GetCurrentDirectoryW(0u, emptyShorts))
        assertNotNull(SetCurrentDirectoryW(emptyShorts))
        assertNotNull(ExpandEnvironmentStringsW(emptyShorts, null, 0u))
    }
}
