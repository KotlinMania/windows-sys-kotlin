@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun oRCloseHive(handle: Orhkey): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemOfflineregistryORCloseHive")

public actual fun oRCloseKey(keyhandle: Orhkey): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemOfflineregistryORCloseKey")

public actual fun oRCreateHive(horkey: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemOfflineregistryORCreateHive")

public actual fun oRCreateKey(keyhandle: Orhkey, lpsubkey: Pcwstr, lpclass: Pcwstr, dwoptions: UInt, psecuritydescriptor: PsecurityDescriptor, phkresult: MutPtr, pdwdisposition: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemOfflineregistryORCreateKey")

public actual fun oRDeleteKey(handle: Orhkey, lpsubkey: Pcwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemOfflineregistryORDeleteKey")

public actual fun oRDeleteValue(handle: Orhkey, lpvaluename: Pcwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemOfflineregistryORDeleteValue")

public actual fun oREnumKey(handle: Orhkey, dwindex: UInt, lpname: Pwstr, lpcname: MutPtr, lpclass: Pwstr, lpcclass: MutPtr, lpftlastwritetime: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemOfflineregistryOREnumKey")

public actual fun oREnumValue(handle: Orhkey, dwindex: UInt, lpvaluename: Pwstr, lpcvaluename: MutPtr, lptype: MutPtr, lpdata: MutPtr, lpcbdata: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemOfflineregistryOREnumValue")

public actual fun oRGetKeySecurity(handle: Orhkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor, lpcbsecuritydescriptor: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemOfflineregistryORGetKeySecurity")

public actual fun oRGetValue(handle: Orhkey, lpsubkey: Pcwstr, lpvalue: Pcwstr, pdwtype: MutPtr, pvdata: MutPtr, pcbdata: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemOfflineregistryORGetValue")

public actual fun oRGetVersion(pdwmajorversion: MutPtr, pdwminorversion: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemOfflineregistryORGetVersion")

public actual fun oRGetVirtualFlags(handle: Orhkey, pdwflags: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemOfflineregistryORGetVirtualFlags")

public actual fun oRMergeHives(hivehandles: ConstPtr, hivecount: UInt, phkresult: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemOfflineregistryORMergeHives")

public actual fun oROpenHive(filepath: Pcwstr, horkey: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemOfflineregistryOROpenHive")

public actual fun oROpenHiveByHandle(filehandle: Handle, horkey: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemOfflineregistryOROpenHiveByHandle")

public actual fun oROpenKey(handle: Orhkey, lpsubkey: Pcwstr, phkresult: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemOfflineregistryOROpenKey")

public actual fun oRQueryInfoKey(handle: Orhkey, lpclass: Pwstr, lpcclass: MutPtr, lpcsubkeys: MutPtr, lpcmaxsubkeylen: MutPtr, lpcmaxclasslen: MutPtr, lpcvalues: MutPtr, lpcmaxvaluenamelen: MutPtr, lpcmaxvaluelen: MutPtr, lpcbsecuritydescriptor: MutPtr, lpftlastwritetime: MutPtr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemOfflineregistryORQueryInfoKey")

public actual fun oRRenameKey(handle: Orhkey, lpnewname: Pcwstr): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemOfflineregistryORRenameKey")

public actual fun oRSaveHive(horkey: Orhkey, hivepath: Pcwstr, osmajorversion: UInt, osminorversion: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemOfflineregistryORSaveHive")

public actual fun oRSetKeySecurity(handle: Orhkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemOfflineregistryORSetKeySecurity")

public actual fun oRSetValue(handle: Orhkey, lpvaluename: Pcwstr, dwtype: UInt, lpdata: ConstPtr, cbdata: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemOfflineregistryORSetValue")

public actual fun oRSetVirtualFlags(handle: Orhkey, dwflags: UInt): Win32Error =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWdkSystemOfflineregistryORSetVirtualFlags")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemOfflineregistryORShutdown")
private external fun wasiWindowssysWindowsWdkSystemOfflineregistryORShutdown(): Int

public actual fun oRShutdown(): Win32Error =
    wasiWindowssysWindowsWdkSystemOfflineregistryORShutdown().toUInt()

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWdkSystemOfflineregistryORStart")
private external fun wasiWindowssysWindowsWdkSystemOfflineregistryORStart(): Int

public actual fun oRStart(): Win32Error =
    wasiWindowssysWindowsWdkSystemOfflineregistryORStart().toUInt()
