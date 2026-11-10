@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32SystemDiagnosticsToolhelpJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_createToolhelp32Snapshot(dwflags: Int, th32processid: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_heap32First(lphe: Long, th32processid: Int, th32heapid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_heap32ListFirst(hsnapshot: Long, lphl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_heap32ListNext(hsnapshot: Long, lphl: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_heap32Next(lphe: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_module32First(hsnapshot: Long, lpme: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_module32FirstW(hsnapshot: Long, lpme: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_module32Next(hsnapshot: Long, lpme: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_module32NextW(hsnapshot: Long, lpme: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_process32First(hsnapshot: Long, lppe: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_process32FirstW(hsnapshot: Long, lppe: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_process32Next(hsnapshot: Long, lppe: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_process32NextW(hsnapshot: Long, lppe: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_thread32First(hsnapshot: Long, lpte: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_thread32Next(hsnapshot: Long, lpte: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_system_diagnostics_toolhelp_toolhelp32ReadProcessMemory(th32processid: Int, lpbaseaddress: Long, lpbuffer: Long, cbread: Long, lpnumberofbytesread: Long): Int
}

public actual fun createToolhelp32Snapshot(dwflags: CreateToolhelpSnapshotFlags, th32processid: UInt): Handle =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_createToolhelp32Snapshot(dwflags.toInt(), th32processid.toInt()).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun heap32First(lphe: COpaquePointer?, th32processid: UInt, th32heapid: ULong): Bool =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_heap32First((lphe?.value ?: 0L), th32processid.toInt(), th32heapid.toLong())

public actual fun heap32ListFirst(hsnapshot: Handle, lphl: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_heap32ListFirst((hsnapshot?.value ?: 0L), (lphl?.value ?: 0L))

public actual fun heap32ListNext(hsnapshot: Handle, lphl: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_heap32ListNext((hsnapshot?.value ?: 0L), (lphl?.value ?: 0L))

public actual fun heap32Next(lphe: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_heap32Next((lphe?.value ?: 0L))

public actual fun module32First(hsnapshot: Handle, lpme: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_module32First((hsnapshot?.value ?: 0L), (lpme?.value ?: 0L))

public actual fun module32FirstW(hsnapshot: Handle, lpme: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_module32FirstW((hsnapshot?.value ?: 0L), (lpme?.value ?: 0L))

public actual fun module32Next(hsnapshot: Handle, lpme: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_module32Next((hsnapshot?.value ?: 0L), (lpme?.value ?: 0L))

public actual fun module32NextW(hsnapshot: Handle, lpme: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_module32NextW((hsnapshot?.value ?: 0L), (lpme?.value ?: 0L))

public actual fun process32First(hsnapshot: Handle, lppe: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_process32First((hsnapshot?.value ?: 0L), (lppe?.value ?: 0L))

public actual fun process32FirstW(hsnapshot: Handle, lppe: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_process32FirstW((hsnapshot?.value ?: 0L), (lppe?.value ?: 0L))

public actual fun process32Next(hsnapshot: Handle, lppe: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_process32Next((hsnapshot?.value ?: 0L), (lppe?.value ?: 0L))

public actual fun process32NextW(hsnapshot: Handle, lppe: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_process32NextW((hsnapshot?.value ?: 0L), (lppe?.value ?: 0L))

public actual fun thread32First(hsnapshot: Handle, lpte: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_thread32First((hsnapshot?.value ?: 0L), (lpte?.value ?: 0L))

public actual fun thread32Next(hsnapshot: Handle, lpte: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_thread32Next((hsnapshot?.value ?: 0L), (lpte?.value ?: 0L))

public actual fun toolhelp32ReadProcessMemory(th32processid: UInt, lpbaseaddress: COpaquePointer?, lpbuffer: COpaquePointer?, cbread: ULong, lpnumberofbytesread: COpaquePointer?): Bool =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssys_windows_win32_system_diagnostics_toolhelp_toolhelp32ReadProcessMemory(th32processid.toInt(), (lpbaseaddress?.value ?: 0L), (lpbuffer?.value ?: 0L), cbread.toLong(), (lpnumberofbytesread?.value ?: 0L))
