@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.restartmanager

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun rmAddFilter(dwsessionhandle: UInt, strmodulename: Pcwstr, pprocess: ConstPtr, strserviceshortname: Pcwstr, filteraction: RmFilterAction): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRestartmanagerRmAddFilter")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRestartmanagerRmCancelCurrentTask")
private external fun wasiWindowssysWindowsWin32SystemRestartmanagerRmCancelCurrentTask(dwsessionhandle: Int): Int

public actual fun rmCancelCurrentTask(dwsessionhandle: UInt): Win32Error =
    wasiWindowssysWindowsWin32SystemRestartmanagerRmCancelCurrentTask(dwsessionhandle.toInt()).toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemRestartmanagerRmEndSession")
private external fun wasiWindowssysWindowsWin32SystemRestartmanagerRmEndSession(dwsessionhandle: Int): Int

public actual fun rmEndSession(dwsessionhandle: UInt): Win32Error =
    wasiWindowssysWindowsWin32SystemRestartmanagerRmEndSession(dwsessionhandle.toInt()).toUInt()

public actual fun rmGetFilterList(dwsessionhandle: UInt, pbfilterbuf: MutPtr, cbfilterbuf: UInt, cbfilterbufneeded: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRestartmanagerRmGetFilterList")

public actual fun rmGetList(dwsessionhandle: UInt, pnprocinfoneeded: MutPtr, pnprocinfo: MutPtr, rgaffectedapps: MutPtr, lpdwrebootreasons: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRestartmanagerRmGetList")

public actual fun rmJoinSession(psessionhandle: MutPtr, strsessionkey: Pcwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRestartmanagerRmJoinSession")

public actual fun rmRegisterResources(dwsessionhandle: UInt, nfiles: UInt, rgsfilenames: ConstPtr, napplications: UInt, rgapplications: ConstPtr, nservices: UInt, rgsservicenames: ConstPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRestartmanagerRmRegisterResources")

public actual fun rmRemoveFilter(dwsessionhandle: UInt, strmodulename: Pcwstr, pprocess: ConstPtr, strserviceshortname: Pcwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRestartmanagerRmRemoveFilter")

public actual fun rmRestart(dwsessionhandle: UInt, dwrestartflags: UInt, fnstatus: RmWriteStatusCallback): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRestartmanagerRmRestart")

public actual fun rmShutdown(dwsessionhandle: UInt, lactionflags: UInt, fnstatus: RmWriteStatusCallback): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRestartmanagerRmShutdown")

public actual fun rmStartSession(psessionhandle: MutPtr, dwsessionflags: UInt, strsessionkey: Pwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemRestartmanagerRmStartSession")
