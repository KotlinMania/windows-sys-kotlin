@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssysWindowsWin32SystemDiagnosticsToolhelpCreateToolhelp32Snapshot
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32First
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32ListFirst
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32ListNext
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32Next
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssysWindowsWin32SystemDiagnosticsToolhelpModule32First
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssysWindowsWin32SystemDiagnosticsToolhelpModule32FirstW
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssysWindowsWin32SystemDiagnosticsToolhelpModule32Next
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssysWindowsWin32SystemDiagnosticsToolhelpModule32NextW
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32First
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32FirstW
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32Next
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32NextW
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssysWindowsWin32SystemDiagnosticsToolhelpThread32First
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssysWindowsWin32SystemDiagnosticsToolhelpThread32Next
import io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp.cinterop.windowssysWindowsWin32SystemDiagnosticsToolhelpToolhelp32ReadProcessMemory
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun createToolhelp32Snapshot(dwflags: CreateToolhelpSnapshotFlags, th32processid: UInt): Handle =
    MutPtr(windowssysWindowsWin32SystemDiagnosticsToolhelpCreateToolhelp32Snapshot(dwflags, th32processid)?.toLong() ?: 0L)

public actual fun heap32First(lphe: MutPtr, th32processid: UInt, th32heapid: ULong): Bool =
    windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32First(lphe.rawAddress.toCPointer<ByteVar>(), th32processid, th32heapid)

public actual fun heap32ListFirst(hsnapshot: Handle, lphl: MutPtr): Bool =
    windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32ListFirst(hsnapshot.rawAddress.toCPointer<ByteVar>(), lphl.rawAddress.toCPointer<ByteVar>())

public actual fun heap32ListNext(hsnapshot: Handle, lphl: MutPtr): Bool =
    windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32ListNext(hsnapshot.rawAddress.toCPointer<ByteVar>(), lphl.rawAddress.toCPointer<ByteVar>())

public actual fun heap32Next(lphe: MutPtr): Bool =
    windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32Next(lphe.rawAddress.toCPointer<ByteVar>())

public actual fun module32First(hsnapshot: Handle, lpme: MutPtr): Bool =
    windowssysWindowsWin32SystemDiagnosticsToolhelpModule32First(hsnapshot.rawAddress.toCPointer<ByteVar>(), lpme.rawAddress.toCPointer<ByteVar>())

public actual fun module32FirstW(hsnapshot: Handle, lpme: MutPtr): Bool =
    windowssysWindowsWin32SystemDiagnosticsToolhelpModule32FirstW(hsnapshot.rawAddress.toCPointer<ByteVar>(), lpme.rawAddress.toCPointer<ByteVar>())

public actual fun module32Next(hsnapshot: Handle, lpme: MutPtr): Bool =
    windowssysWindowsWin32SystemDiagnosticsToolhelpModule32Next(hsnapshot.rawAddress.toCPointer<ByteVar>(), lpme.rawAddress.toCPointer<ByteVar>())

public actual fun module32NextW(hsnapshot: Handle, lpme: MutPtr): Bool =
    windowssysWindowsWin32SystemDiagnosticsToolhelpModule32NextW(hsnapshot.rawAddress.toCPointer<ByteVar>(), lpme.rawAddress.toCPointer<ByteVar>())

public actual fun process32First(hsnapshot: Handle, lppe: MutPtr): Bool =
    windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32First(hsnapshot.rawAddress.toCPointer<ByteVar>(), lppe.rawAddress.toCPointer<ByteVar>())

public actual fun process32FirstW(hsnapshot: Handle, lppe: MutPtr): Bool =
    windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32FirstW(hsnapshot.rawAddress.toCPointer<ByteVar>(), lppe.rawAddress.toCPointer<ByteVar>())

public actual fun process32Next(hsnapshot: Handle, lppe: MutPtr): Bool =
    windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32Next(hsnapshot.rawAddress.toCPointer<ByteVar>(), lppe.rawAddress.toCPointer<ByteVar>())

public actual fun process32NextW(hsnapshot: Handle, lppe: MutPtr): Bool =
    windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32NextW(hsnapshot.rawAddress.toCPointer<ByteVar>(), lppe.rawAddress.toCPointer<ByteVar>())

public actual fun thread32First(hsnapshot: Handle, lpte: MutPtr): Bool =
    windowssysWindowsWin32SystemDiagnosticsToolhelpThread32First(hsnapshot.rawAddress.toCPointer<ByteVar>(), lpte.rawAddress.toCPointer<ByteVar>())

public actual fun thread32Next(hsnapshot: Handle, lpte: MutPtr): Bool =
    windowssysWindowsWin32SystemDiagnosticsToolhelpThread32Next(hsnapshot.rawAddress.toCPointer<ByteVar>(), lpte.rawAddress.toCPointer<ByteVar>())

public actual fun toolhelp32ReadProcessMemory(th32processid: UInt, lpbaseaddress: ConstPtr, lpbuffer: MutPtr, cbread: ULong, lpnumberofbytesread: MutPtr): Bool =
    windowssysWindowsWin32SystemDiagnosticsToolhelpToolhelp32ReadProcessMemory(th32processid, lpbaseaddress.rawAddress.toCPointer<ByteVar>(), lpbuffer.rawAddress.toCPointer<ByteVar>(), cbread, lpnumberofbytesread.rawAddress.toCPointer<ByteVar>())
