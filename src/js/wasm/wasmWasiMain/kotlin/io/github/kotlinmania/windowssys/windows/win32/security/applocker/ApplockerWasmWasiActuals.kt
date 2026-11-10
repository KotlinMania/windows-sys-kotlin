@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.applocker

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SaferLevelHandle

public actual fun saferCloseLevel(hlevelhandle: SaferLevelHandle): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun saferComputeTokenFromLevel(levelhandle: SaferLevelHandle, inaccesstoken: Handle, outaccesstoken: COpaquePointer?, dwflags: SaferComputeTokenFromLevelFlags, lpreserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun saferCreateLevel(dwscopeid: UInt, dwlevelid: UInt, openflags: UInt, plevelhandle: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun saferGetLevelInformation(levelhandle: SaferLevelHandle, dwinfotype: SaferObjectInfoClass, lpquerybuffer: COpaquePointer?, dwinbuffersize: UInt, lpdwoutbuffersize: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun saferGetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SaferPolicyInfoClass, infobuffersize: UInt, infobuffer: COpaquePointer?, infobufferretsize: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun saferIdentifyLevel(dwnumproperties: UInt, pcodeproperties: COpaquePointer?, plevelhandle: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun saferRecordEventLogEntry(hlevel: SaferLevelHandle, sztargetpath: Pcwstr, lpreserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun saferSetLevelInformation(levelhandle: SaferLevelHandle, dwinfotype: SaferObjectInfoClass, lpquerybuffer: COpaquePointer?, dwinbuffersize: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun saferSetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SaferPolicyInfoClass, infobuffersize: UInt, infobuffer: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun saferiIsExecutableFileType(szfullpathname: Pcwstr, bfromshellexecute: Boolean): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
