// port-lint: tests Windows/Win32/UI/Shell/mod.rs
@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys

import io.github.kotlinmania.windowssys.windows.win32.globalization.MUI_LANGUAGE_ID
import io.github.kotlinmania.windowssys.windows.win32.globalization.MUI_LANGUAGE_NAME
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.LOAD_LIBRARY_SEARCH_DEFAULT_DIRS
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.LOAD_LIBRARY_SEARCH_SYSTEM32
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.ComputerNameDnsFullyQualified
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.ComputerNameDnsHostname
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.ComputerNameNetBIOS
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.ComputerNamePhysicalDnsHostname
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.FOLDERID_Desktop
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.FOLDERID_Documents
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.FOLDERID_Downloads
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.FOLDERID_LocalAppData
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.FOLDERID_Profile
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.FOLDERID_RoamingAppData
import kotlin.test.Test
import kotlin.test.assertEquals

class DownstreamWin32Test {
    @Test
    fun testShellKnownFolderGuids() {
        assertEquals(0xB4BFCC3Au, FOLDERID_Desktop.data1)
        assertEquals(0xFDD39AD0u, FOLDERID_Documents.data1)
        assertEquals(0x374DE290u, FOLDERID_Downloads.data1)
        assertEquals(0xF1B32785u, FOLDERID_LocalAppData.data1)
        assertEquals(0x5E6C858Fu, FOLDERID_Profile.data1)
        assertEquals(0x3EB685DBu, FOLDERID_RoamingAppData.data1)
    }

    @Test
    fun testGlobalizationConstants() {
        assertEquals(4u, MUI_LANGUAGE_ID)
        assertEquals(8u, MUI_LANGUAGE_NAME)
    }

    @Test
    fun testLibraryLoaderConstants() {
        assertEquals(2048u, LOAD_LIBRARY_SEARCH_SYSTEM32)
        assertEquals(4096u, LOAD_LIBRARY_SEARCH_DEFAULT_DIRS)
    }

    @Test
    fun testComputerNameFormats() {
        assertEquals(0, ComputerNameNetBIOS)
        assertEquals(1, ComputerNameDnsHostname)
        assertEquals(3, ComputerNameDnsFullyQualified)
        assertEquals(5, ComputerNamePhysicalDnsHostname)
    }
}
