@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys

import io.github.kotlinmania.windowssys.windows.win32.globalization.MUI_LANGUAGE_ID
import io.github.kotlinmania.windowssys.windows.win32.globalization.MUI_LANGUAGE_NAME
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.LOAD_LIBRARY_SEARCH_DEFAULT_DIRS
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.LOAD_LIBRARY_SEARCH_SYSTEM32
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.COMPUTER_NAME_DNS_FULLY_QUALIFIED
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.COMPUTER_NAME_DNS_HOSTNAME
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.COMPUTER_NAME_NET_BIOS
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.COMPUTER_NAME_PHYSICAL_DNS_HOSTNAME
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.FOLDERID_DESKTOP
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.FOLDERID_DOCUMENTS
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.FOLDERID_DOWNLOADS
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.FOLDERID_LOCAL_APP_DATA
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.FOLDERID_PROFILE
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.FOLDERID_ROAMING_APP_DATA
import kotlin.test.Test
import kotlin.test.assertEquals

class DownstreamWin32Test {
    @Test
    fun testShellKnownFolderGuids() {
        assertEquals(0xB4BFCC3Au, FOLDERID_DESKTOP.data1)
        assertEquals(0xFDD39AD0u, FOLDERID_DOCUMENTS.data1)
        assertEquals(0x374DE290u, FOLDERID_DOWNLOADS.data1)
        assertEquals(0xF1B32785u, FOLDERID_LOCAL_APP_DATA.data1)
        assertEquals(0x5E6C858Fu, FOLDERID_PROFILE.data1)
        assertEquals(0x3EB685DBu, FOLDERID_ROAMING_APP_DATA.data1)
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
        assertEquals(0, COMPUTER_NAME_NET_BIOS)
        assertEquals(1, COMPUTER_NAME_DNS_HOSTNAME)
        assertEquals(3, COMPUTER_NAME_DNS_FULLY_QUALIFIED)
        assertEquals(5, COMPUTER_NAME_PHYSICAL_DNS_HOSTNAME)
    }
}
