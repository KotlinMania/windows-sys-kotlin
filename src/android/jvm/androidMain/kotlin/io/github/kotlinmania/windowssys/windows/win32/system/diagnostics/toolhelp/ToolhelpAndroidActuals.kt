@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private object WindowsWin32SystemDiagnosticsToolhelpJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_CreateToolhelp32Snapshot(dwflags: Int, th32processid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_Heap32First(lphe: Long, th32processid: Int, th32heapid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_Heap32ListFirst(hsnapshot: Long, lphl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_Heap32ListNext(hsnapshot: Long, lphl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_Heap32Next(lphe: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_Module32First(hsnapshot: Long, lpme: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_Module32FirstW(hsnapshot: Long, lpme: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_Module32Next(hsnapshot: Long, lpme: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_Module32NextW(hsnapshot: Long, lpme: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_Process32First(hsnapshot: Long, lppe: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_Process32FirstW(hsnapshot: Long, lppe: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_Process32Next(hsnapshot: Long, lppe: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_Process32NextW(hsnapshot: Long, lppe: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_Thread32First(hsnapshot: Long, lpte: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_Thread32Next(hsnapshot: Long, lpte: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_Toolhelp32ReadProcessMemory(th32processid: Int, lpbaseaddress: Long, lpbuffer: Long, cbread: Long, lpnumberofbytesread: Long): Int
}

public actual fun CreateToolhelp32Snapshot(dwflags: CREATE_TOOLHELP_SNAPSHOT_FLAGS, th32processid: UInt): HANDLE =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_CreateToolhelp32Snapshot(dwflags.toInt(), th32processid.toInt())

public actual fun Heap32First(lphe: Long, th32processid: UInt, th32heapid: ULong): BOOL =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_Heap32First(lphe, th32processid.toInt(), th32heapid.toLong())

public actual fun Heap32ListFirst(hsnapshot: HANDLE, lphl: Long): BOOL =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_Heap32ListFirst(hsnapshot, lphl)

public actual fun Heap32ListNext(hsnapshot: HANDLE, lphl: Long): BOOL =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_Heap32ListNext(hsnapshot, lphl)

public actual fun Heap32Next(lphe: Long): BOOL =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_Heap32Next(lphe)

public actual fun Module32First(hsnapshot: HANDLE, lpme: Long): BOOL =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_Module32First(hsnapshot, lpme)

public actual fun Module32FirstW(hsnapshot: HANDLE, lpme: Long): BOOL =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_Module32FirstW(hsnapshot, lpme)

public actual fun Module32Next(hsnapshot: HANDLE, lpme: Long): BOOL =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_Module32Next(hsnapshot, lpme)

public actual fun Module32NextW(hsnapshot: HANDLE, lpme: Long): BOOL =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_Module32NextW(hsnapshot, lpme)

public actual fun Process32First(hsnapshot: HANDLE, lppe: Long): BOOL =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_Process32First(hsnapshot, lppe)

public actual fun Process32FirstW(hsnapshot: HANDLE, lppe: Long): BOOL =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_Process32FirstW(hsnapshot, lppe)

public actual fun Process32Next(hsnapshot: HANDLE, lppe: Long): BOOL =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_Process32Next(hsnapshot, lppe)

public actual fun Process32NextW(hsnapshot: HANDLE, lppe: Long): BOOL =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_Process32NextW(hsnapshot, lppe)

public actual fun Thread32First(hsnapshot: HANDLE, lpte: Long): BOOL =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_Thread32First(hsnapshot, lpte)

public actual fun Thread32Next(hsnapshot: HANDLE, lpte: Long): BOOL =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_Thread32Next(hsnapshot, lpte)

public actual fun Toolhelp32ReadProcessMemory(th32processid: UInt, lpbaseaddress: Long, lpbuffer: Long, cbread: ULong, lpnumberofbytesread: Long): BOOL =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_Toolhelp32ReadProcessMemory(th32processid.toInt(), lpbaseaddress, lpbuffer, cbread.toLong(), lpnumberofbytesread)
