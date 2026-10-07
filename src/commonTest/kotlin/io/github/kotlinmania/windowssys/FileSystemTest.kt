// port-lint: tests Windows/Win32/Storage/FileSystem/mod.rs
package io.github.kotlinmania.windowssys

import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.CREATE_ALWAYS
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.CREATE_NEW
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_ATTRIBUTE_DIRECTORY
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_ATTRIBUTE_NORMAL
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_ATTRIBUTE_READONLY
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_BEGIN
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_CURRENT
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_END
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_GENERIC_READ
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_GENERIC_WRITE
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_SHARE_READ
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FILE_SHARE_WRITE
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.OPEN_ALWAYS
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.OPEN_EXISTING
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.TRUNCATE_EXISTING
import kotlin.test.Test
import kotlin.test.assertEquals

class FileSystemTest {
    @Test
    fun testFilePointerMoveMethods() {
        assertEquals(0u, FILE_BEGIN)
        assertEquals(1u, FILE_CURRENT)
        assertEquals(2u, FILE_END)
    }

    @Test
    fun testFileCreationDisposition() {
        assertEquals(1u, CREATE_NEW)
        assertEquals(2u, CREATE_ALWAYS)
        assertEquals(3u, OPEN_EXISTING)
        assertEquals(4u, OPEN_ALWAYS)
        assertEquals(5u, TRUNCATE_EXISTING)
    }

    @Test
    fun testFileShareModes() {
        assertEquals(1u, FILE_SHARE_READ)
        assertEquals(2u, FILE_SHARE_WRITE)
    }

    @Test
    fun testFileFlagsAndAttributes() {
        assertEquals(1u, FILE_ATTRIBUTE_READONLY)
        assertEquals(16u, FILE_ATTRIBUTE_DIRECTORY)
        assertEquals(128u, FILE_ATTRIBUTE_NORMAL)
    }

    @Test
    fun testFileAccessRights() {
        assertEquals(1179785u, FILE_GENERIC_READ)
        assertEquals(1179926u, FILE_GENERIC_WRITE)
    }
}
