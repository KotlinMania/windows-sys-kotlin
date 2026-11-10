@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.restartmanager

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

public actual fun rmAddFilter(dwsessionhandle: UInt, strmodulename: Pcwstr, pprocess: COpaquePointer?, strserviceshortname: Pcwstr, filteraction: RmFilterAction): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rmCancelCurrentTask(dwsessionhandle: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rmEndSession(dwsessionhandle: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rmGetFilterList(dwsessionhandle: UInt, pbfilterbuf: COpaquePointer?, cbfilterbuf: UInt, cbfilterbufneeded: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rmGetList(dwsessionhandle: UInt, pnprocinfoneeded: COpaquePointer?, pnprocinfo: COpaquePointer?, rgaffectedapps: COpaquePointer?, lpdwrebootreasons: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rmJoinSession(psessionhandle: COpaquePointer?, strsessionkey: Pcwstr): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rmRegisterResources(dwsessionhandle: UInt, nfiles: UInt, rgsfilenames: COpaquePointer?, napplications: UInt, rgapplications: COpaquePointer?, nservices: UInt, rgsservicenames: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rmRemoveFilter(dwsessionhandle: UInt, strmodulename: Pcwstr, pprocess: COpaquePointer?, strserviceshortname: Pcwstr): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rmRestart(dwsessionhandle: UInt, dwrestartflags: UInt, fnstatus: RmWriteStatusCallback): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rmShutdown(dwsessionhandle: UInt, lactionflags: UInt, fnstatus: RmWriteStatusCallback): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun rmStartSession(psessionhandle: COpaquePointer?, dwsessionflags: UInt, strsessionkey: Pwstr): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
