@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pwstr

public actual fun getDeviceID(pbwindowsaik: COpaquePointer?, cbwindowsaik: UInt, pcbresult: COpaquePointer?, pfprotectedbytpm: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDeviceIDString(pszwindowsaik: Pwstr, cchwindowsaik: UInt, pcchresult: COpaquePointer?, pfprotectedbytpm: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tbsiContextCreate(pcontextparams: COpaquePointer?, phcontext: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tbsiCreateWindowsKey(keyhandle: UInt): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tbsiGetDeviceInfo(size: UInt, info: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tbsiGetOwnerAuth(hcontext: COpaquePointer?, ownerauthtype: UInt, poutputbuf: COpaquePointer?, poutputbuflen: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tbsiGetTcgLog(hcontext: COpaquePointer?, poutputbuf: COpaquePointer?, poutputbuflen: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tbsiGetTcgLogEx(logtype: UInt, pboutput: COpaquePointer?, pcboutput: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tbsiIsTpmPresent(): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tbsiPhysicalPresenceCommand(hcontext: COpaquePointer?, pabinput: COpaquePointer?, cbinput: UInt, paboutput: COpaquePointer?, pcboutput: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tbsiRevokeAttestation(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tbsipCancelCommands(hcontext: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tbsipContextClose(hcontext: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun tbsipSubmitCommand(hcontext: COpaquePointer?, locality: TbsCommandLocality, priority: TbsCommandPriority, pabcommand: COpaquePointer?, cbcommand: UInt, pabresult: COpaquePointer?, pcbresult: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
