// port-lint: tests N/A
package io.github.kotlinmania.windowssys

import io.github.kotlinmania.windowssys.windows.win32.foundation.CloseHandle
import io.github.kotlinmania.windowssys.windows.win32.foundation.FILETIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.GetLastError
import io.github.kotlinmania.windowssys.windows.win32.foundation.SYSTEMTIME
import io.github.kotlinmania.windowssys.windows.win32.foundation.SetLastError
import io.github.kotlinmania.windowssys.windows.win32.globalization.GetUserPreferredUILanguages
import io.github.kotlinmania.windowssys.windows.win32.globalization.MUI_LANGUAGE_NAME
import io.github.kotlinmania.windowssys.windows.win32.globalization.lstrlenW
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.AreFileApisANSI
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.BY_HANDLE_FILE_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.FlushFileBuffers
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.GetFileInformationByHandle
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.GetFileType
import io.github.kotlinmania.windowssys.windows.win32.storage.filesystem.GetFullPathNameW
import io.github.kotlinmania.windowssys.windows.win32.system.com.CoTaskMemFree
import io.github.kotlinmania.windowssys.windows.win32.system.console.CONSOLE_CURSOR_INFO
import io.github.kotlinmania.windowssys.windows.win32.system.console.CONSOLE_SCREEN_BUFFER_INFO
import io.github.kotlinmania.windowssys.windows.win32.system.console.COORD
import io.github.kotlinmania.windowssys.windows.win32.system.console.GetConsoleCursorInfo
import io.github.kotlinmania.windowssys.windows.win32.system.console.GetConsoleMode
import io.github.kotlinmania.windowssys.windows.win32.system.console.GetConsoleScreenBufferInfo
import io.github.kotlinmania.windowssys.windows.win32.system.console.GetNumberOfConsoleInputEvents
import io.github.kotlinmania.windowssys.windows.win32.system.console.GetStdHandle
import io.github.kotlinmania.windowssys.windows.win32.system.console.ReadConsoleInputW
import io.github.kotlinmania.windowssys.windows.win32.system.console.STD_OUTPUT_HANDLE
import io.github.kotlinmania.windowssys.windows.win32.system.console.SetConsoleCursorInfo
import io.github.kotlinmania.windowssys.windows.win32.system.console.SetConsoleCursorPosition
import io.github.kotlinmania.windowssys.windows.win32.system.console.SetConsoleMode
import io.github.kotlinmania.windowssys.windows.win32.system.console.SetConsoleTextAttribute
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.FreeLibrary
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.GetModuleHandleW
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.GetProcAddress
import io.github.kotlinmania.windowssys.windows.win32.system.libraryloader.LoadLibraryW
import io.github.kotlinmania.windowssys.windows.win32.system.pipes.DisconnectNamedPipe
import io.github.kotlinmania.windowssys.windows.win32.system.processstatus.K32EmptyWorkingSet
import io.github.kotlinmania.windowssys.windows.win32.system.shutdown.LockWorkStation
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.ComputerNameDnsHostname
import io.github.kotlinmania.windowssys.windows.win32.system.systeminformation.GetComputerNameExW
import io.github.kotlinmania.windowssys.windows.win32.system.threading.GetCurrentProcess
import io.github.kotlinmania.windowssys.windows.win32.system.threading.GetCurrentProcessId
import io.github.kotlinmania.windowssys.windows.win32.system.threading.GetCurrentThread
import io.github.kotlinmania.windowssys.windows.win32.system.threading.GetCurrentThreadId
import io.github.kotlinmania.windowssys.windows.win32.system.time.GetTimeZoneInformation
import io.github.kotlinmania.windowssys.windows.win32.system.time.GetTimeZoneInformationForYear
import io.github.kotlinmania.windowssys.windows.win32.system.time.SystemTimeToFileTime
import io.github.kotlinmania.windowssys.windows.win32.system.time.SystemTimeToTzSpecificLocalTime
import io.github.kotlinmania.windowssys.windows.win32.system.time.TIME_ZONE_INFORMATION
import io.github.kotlinmania.windowssys.windows.win32.system.time.TzSpecificLocalTimeToSystemTime
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.FOLDERID_Profile
import io.github.kotlinmania.windowssys.windows.win32.ui.shell.SHGetKnownFolderPath
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

@OptIn(kotlin.ExperimentalUnsignedTypes::class)
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
        val ft = GetFileType(0L)
        assertNotNull(ft)
        val info = BY_HANDLE_FILE_INFORMATION()
        val infoRes = GetFileInformationByHandle(0L, info)
        assertNotNull(infoRes)
        val pathLen = GetFullPathNameW(0L, 0u, 0L, null)
        assertNotNull(pathLen)
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
        val tzi = TIME_ZONE_INFORMATION()
        val tzYear = GetTimeZoneInformationForYear(2026u, null, tzi)
        assertNotNull(tzYear)
        val st = SYSTEMTIME(wYear = 2026u, wMonth = 1u, wDay = 1u)
        val ft = FILETIME()
        assertNotNull(SystemTimeToFileTime(st, ft))
        val localSt = SYSTEMTIME()
        assertNotNull(SystemTimeToTzSpecificLocalTime(null, st, localSt))
        assertNotNull(TzSpecificLocalTimeToSystemTime(null, localSt, st))
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

    @Test
    fun testShellComGlobalizationFunctions() {
        val outPath = LongArray(1)
        val hr = SHGetKnownFolderPath(FOLDERID_Profile, 0u, 0L, outPath)
        assertNotNull(hr)
        CoTaskMemFree(0L)
        assertEquals(0, lstrlenW(0L))
        val numLangs = UIntArray(1)
        val cchBuf = UIntArray(1)
        assertNotNull(GetUserPreferredUILanguages(MUI_LANGUAGE_NAME, numLangs, null, cchBuf))
    }

    @Test
    fun testConsoleLibraryLoaderSystemInfoFunctions() {
        val stdOut = GetStdHandle(STD_OUTPUT_HANDLE)
        assertNotNull(stdOut)
        val mode = UIntArray(1)
        assertNotNull(GetConsoleMode(0L, mode))
        assertNotNull(SetConsoleMode(0L, 0u))
        val csbi = CONSOLE_SCREEN_BUFFER_INFO()
        assertNotNull(GetConsoleScreenBufferInfo(0L, csbi))
        assertNotNull(SetConsoleTextAttribute(0L, 0u))
        val cci = CONSOLE_CURSOR_INFO()
        assertNotNull(GetConsoleCursorInfo(0L, cci))
        assertNotNull(SetConsoleCursorInfo(0L, cci))
        assertNotNull(SetConsoleCursorPosition(0L, COORD(0, 0)))
        val events = UIntArray(1)
        assertNotNull(GetNumberOfConsoleInputEvents(0L, events))
        assertNotNull(ReadConsoleInputW(0L, 0L, 0u, events))

        assertNotNull(LoadLibraryW(0L))
        assertNotNull(FreeLibrary(0L))
        val proc = GetProcAddress(0L, 0L)
        assertEquals(null, proc)
        assertNotNull(GetModuleHandleW(0L))

        val nSize = UIntArray(1)
        assertNotNull(GetComputerNameExW(ComputerNameDnsHostname, null, nSize))
    }
}
