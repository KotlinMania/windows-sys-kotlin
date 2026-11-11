@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_createToolhelp32Snapshot
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_heap32First
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_heap32ListFirst
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_heap32ListNext
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_heap32Next
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_module32First
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_module32FirstW
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_module32Next
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_module32NextW
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_process32First
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_process32FirstW
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_process32Next
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_process32NextW
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_thread32First
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_thread32Next
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssys_windows_win32_system_diagnostics_toolhelp_toolhelp32ReadProcessMemory
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun createToolhelp32Snapshot(dwflags: CreateToolhelpSnapshotFlags, th32processid: UInt): Handle =
    windowssys_windows_win32_system_diagnostics_toolhelp_createToolhelp32Snapshot(dwflags, th32processid)?.let { COpaquePointer(it.toLong()) }

public actual fun heap32First(lphe: COpaquePointer?, th32processid: UInt, th32heapid: ULong): Bool =
    windowssys_windows_win32_system_diagnostics_toolhelp_heap32First(lphe?.value?.toCPointer<ByteVar>(), th32processid, th32heapid)

public actual fun heap32ListFirst(hsnapshot: Handle, lphl: COpaquePointer?): Bool =
    windowssys_windows_win32_system_diagnostics_toolhelp_heap32ListFirst(hsnapshot?.value?.toCPointer<ByteVar>(), lphl?.value?.toCPointer<ByteVar>())

public actual fun heap32ListNext(hsnapshot: Handle, lphl: COpaquePointer?): Bool =
    windowssys_windows_win32_system_diagnostics_toolhelp_heap32ListNext(hsnapshot?.value?.toCPointer<ByteVar>(), lphl?.value?.toCPointer<ByteVar>())

public actual fun heap32Next(lphe: COpaquePointer?): Bool =
    windowssys_windows_win32_system_diagnostics_toolhelp_heap32Next(lphe?.value?.toCPointer<ByteVar>())

public actual fun module32First(hsnapshot: Handle, lpme: COpaquePointer?): Bool =
    windowssys_windows_win32_system_diagnostics_toolhelp_module32First(hsnapshot?.value?.toCPointer<ByteVar>(), lpme?.value?.toCPointer<ByteVar>())

public actual fun module32FirstW(hsnapshot: Handle, lpme: COpaquePointer?): Bool =
    windowssys_windows_win32_system_diagnostics_toolhelp_module32FirstW(hsnapshot?.value?.toCPointer<ByteVar>(), lpme?.value?.toCPointer<ByteVar>())

public actual fun module32Next(hsnapshot: Handle, lpme: COpaquePointer?): Bool =
    windowssys_windows_win32_system_diagnostics_toolhelp_module32Next(hsnapshot?.value?.toCPointer<ByteVar>(), lpme?.value?.toCPointer<ByteVar>())

public actual fun module32NextW(hsnapshot: Handle, lpme: COpaquePointer?): Bool =
    windowssys_windows_win32_system_diagnostics_toolhelp_module32NextW(hsnapshot?.value?.toCPointer<ByteVar>(), lpme?.value?.toCPointer<ByteVar>())

public actual fun process32First(hsnapshot: Handle, lppe: COpaquePointer?): Bool =
    windowssys_windows_win32_system_diagnostics_toolhelp_process32First(hsnapshot?.value?.toCPointer<ByteVar>(), lppe?.value?.toCPointer<ByteVar>())

public actual fun process32FirstW(hsnapshot: Handle, lppe: COpaquePointer?): Bool =
    windowssys_windows_win32_system_diagnostics_toolhelp_process32FirstW(hsnapshot?.value?.toCPointer<ByteVar>(), lppe?.value?.toCPointer<ByteVar>())

public actual fun process32Next(hsnapshot: Handle, lppe: COpaquePointer?): Bool =
    windowssys_windows_win32_system_diagnostics_toolhelp_process32Next(hsnapshot?.value?.toCPointer<ByteVar>(), lppe?.value?.toCPointer<ByteVar>())

public actual fun process32NextW(hsnapshot: Handle, lppe: COpaquePointer?): Bool =
    windowssys_windows_win32_system_diagnostics_toolhelp_process32NextW(hsnapshot?.value?.toCPointer<ByteVar>(), lppe?.value?.toCPointer<ByteVar>())

public actual fun thread32First(hsnapshot: Handle, lpte: COpaquePointer?): Bool =
    windowssys_windows_win32_system_diagnostics_toolhelp_thread32First(hsnapshot?.value?.toCPointer<ByteVar>(), lpte?.value?.toCPointer<ByteVar>())

public actual fun thread32Next(hsnapshot: Handle, lpte: COpaquePointer?): Bool =
    windowssys_windows_win32_system_diagnostics_toolhelp_thread32Next(hsnapshot?.value?.toCPointer<ByteVar>(), lpte?.value?.toCPointer<ByteVar>())

public actual fun toolhelp32ReadProcessMemory(th32processid: UInt, lpbaseaddress: COpaquePointer?, lpbuffer: COpaquePointer?, cbread: ULong, lpnumberofbytesread: COpaquePointer?): Bool =
    windowssys_windows_win32_system_diagnostics_toolhelp_toolhelp32ReadProcessMemory(th32processid, lpbaseaddress?.value?.toCPointer<ByteVar>(), lpbuffer?.value?.toCPointer<ByteVar>(), cbread, lpnumberofbytesread?.value?.toCPointer<ByteVar>())
