@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun CreateToolhelp32Snapshot(dwflags: CREATE_TOOLHELP_SNAPSHOT_FLAGS, th32processid: UInt): HANDLE =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_CreateToolhelp32Snapshot(dwflags, th32processid)?.toLong() ?: 0L

public actual fun Heap32First(lphe: Long, th32processid: UInt, th32heapid: ULong): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_Heap32First(lphe.toCPointer<ByteVar>(), th32processid, th32heapid)

public actual fun Heap32ListFirst(hsnapshot: HANDLE, lphl: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_Heap32ListFirst(hsnapshot.toCPointer<ByteVar>(), lphl.toCPointer<ByteVar>())

public actual fun Heap32ListNext(hsnapshot: HANDLE, lphl: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_Heap32ListNext(hsnapshot.toCPointer<ByteVar>(), lphl.toCPointer<ByteVar>())

public actual fun Heap32Next(lphe: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_Heap32Next(lphe.toCPointer<ByteVar>())

public actual fun Module32First(hsnapshot: HANDLE, lpme: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_Module32First(hsnapshot.toCPointer<ByteVar>(), lpme.toCPointer<ByteVar>())

public actual fun Module32FirstW(hsnapshot: HANDLE, lpme: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_Module32FirstW(hsnapshot.toCPointer<ByteVar>(), lpme.toCPointer<ByteVar>())

public actual fun Module32Next(hsnapshot: HANDLE, lpme: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_Module32Next(hsnapshot.toCPointer<ByteVar>(), lpme.toCPointer<ByteVar>())

public actual fun Module32NextW(hsnapshot: HANDLE, lpme: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_Module32NextW(hsnapshot.toCPointer<ByteVar>(), lpme.toCPointer<ByteVar>())

public actual fun Process32First(hsnapshot: HANDLE, lppe: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_Process32First(hsnapshot.toCPointer<ByteVar>(), lppe.toCPointer<ByteVar>())

public actual fun Process32FirstW(hsnapshot: HANDLE, lppe: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_Process32FirstW(hsnapshot.toCPointer<ByteVar>(), lppe.toCPointer<ByteVar>())

public actual fun Process32Next(hsnapshot: HANDLE, lppe: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_Process32Next(hsnapshot.toCPointer<ByteVar>(), lppe.toCPointer<ByteVar>())

public actual fun Process32NextW(hsnapshot: HANDLE, lppe: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_Process32NextW(hsnapshot.toCPointer<ByteVar>(), lppe.toCPointer<ByteVar>())

public actual fun Thread32First(hsnapshot: HANDLE, lpte: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_Thread32First(hsnapshot.toCPointer<ByteVar>(), lpte.toCPointer<ByteVar>())

public actual fun Thread32Next(hsnapshot: HANDLE, lpte: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_Thread32Next(hsnapshot.toCPointer<ByteVar>(), lpte.toCPointer<ByteVar>())

public actual fun Toolhelp32ReadProcessMemory(th32processid: UInt, lpbaseaddress: Long, lpbuffer: Long, cbread: ULong, lpnumberofbytesread: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_Toolhelp32ReadProcessMemory(th32processid, lpbaseaddress.toCPointer<ByteVar>(), lpbuffer.toCPointer<ByteVar>(), cbread, lpnumberofbytesread.toCPointer<ByteVar>())
