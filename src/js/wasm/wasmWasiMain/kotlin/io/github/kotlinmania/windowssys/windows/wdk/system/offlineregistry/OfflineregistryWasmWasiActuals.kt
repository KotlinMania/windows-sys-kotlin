@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.offlineregistry

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Win32Error
import io.github.kotlinmania.windowssys.windows.win32.security.PsecurityDescriptor

public actual fun oRCloseHive(handle: Orhkey): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun oRCloseKey(keyhandle: Orhkey): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun oRCreateHive(horkey: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun oRCreateKey(keyhandle: Orhkey, lpsubkey: Pcwstr, lpclass: Pcwstr, dwoptions: UInt, psecuritydescriptor: PsecurityDescriptor, phkresult: COpaquePointer?, pdwdisposition: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun oRDeleteKey(handle: Orhkey, lpsubkey: Pcwstr): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun oRDeleteValue(handle: Orhkey, lpvaluename: Pcwstr): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun oREnumKey(handle: Orhkey, dwindex: UInt, lpname: Pwstr, lpcname: COpaquePointer?, lpclass: Pwstr, lpcclass: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun oREnumValue(handle: Orhkey, dwindex: UInt, lpvaluename: Pwstr, lpcvaluename: COpaquePointer?, lptype: COpaquePointer?, lpdata: COpaquePointer?, lpcbdata: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun oRGetKeySecurity(handle: Orhkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor, lpcbsecuritydescriptor: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun oRGetValue(handle: Orhkey, lpsubkey: Pcwstr, lpvalue: Pcwstr, pdwtype: COpaquePointer?, pvdata: COpaquePointer?, pcbdata: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun oRGetVersion(pdwmajorversion: COpaquePointer?, pdwminorversion: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun oRGetVirtualFlags(handle: Orhkey, pdwflags: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun oRMergeHives(hivehandles: COpaquePointer?, hivecount: UInt, phkresult: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun oROpenHive(filepath: Pcwstr, horkey: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun oROpenHiveByHandle(filehandle: Handle, horkey: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun oROpenKey(handle: Orhkey, lpsubkey: Pcwstr, phkresult: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun oRQueryInfoKey(handle: Orhkey, lpclass: Pwstr, lpcclass: COpaquePointer?, lpcsubkeys: COpaquePointer?, lpcmaxsubkeylen: COpaquePointer?, lpcmaxclasslen: COpaquePointer?, lpcvalues: COpaquePointer?, lpcmaxvaluenamelen: COpaquePointer?, lpcmaxvaluelen: COpaquePointer?, lpcbsecuritydescriptor: COpaquePointer?, lpftlastwritetime: COpaquePointer?): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun oRRenameKey(handle: Orhkey, lpnewname: Pcwstr): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun oRSaveHive(horkey: Orhkey, hivepath: Pcwstr, osmajorversion: UInt, osminorversion: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun oRSetKeySecurity(handle: Orhkey, securityinformation: UInt, psecuritydescriptor: PsecurityDescriptor): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun oRSetValue(handle: Orhkey, lpvaluename: Pcwstr, dwtype: UInt, lpdata: COpaquePointer?, cbdata: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun oRSetVirtualFlags(handle: Orhkey, dwflags: UInt): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun oRShutdown(): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun oRStart(): Win32Error =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
