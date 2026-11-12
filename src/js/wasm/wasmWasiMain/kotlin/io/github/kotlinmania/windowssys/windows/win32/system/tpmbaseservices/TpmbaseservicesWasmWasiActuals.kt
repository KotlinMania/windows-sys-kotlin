@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.tpmbaseservices

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pwstr

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun getDeviceID(pbwindowsaik: MutPtr, cbwindowsaik: UInt, pcbresult: MutPtr, pfprotectedbytpm: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTpmbaseservicesGetDeviceID")

public actual fun getDeviceIDString(pszwindowsaik: Pwstr, cchwindowsaik: UInt, pcchresult: MutPtr, pfprotectedbytpm: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTpmbaseservicesGetDeviceIDString")

public actual fun tbsiContextCreate(pcontextparams: ConstPtr, phcontext: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTpmbaseservicesTbsiContextCreate")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemTpmbaseservicesTbsiCreateWindowsKey")
private external fun wasiWindowssysWindowsWin32SystemTpmbaseservicesTbsiCreateWindowsKey(keyhandle: Int): Int

public actual fun tbsiCreateWindowsKey(keyhandle: UInt): UInt =
    wasiWindowssysWindowsWin32SystemTpmbaseservicesTbsiCreateWindowsKey(keyhandle.toInt()).toUInt()

public actual fun tbsiGetDeviceInfo(size: UInt, info: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTpmbaseservicesTbsiGetDeviceInfo")

public actual fun tbsiGetOwnerAuth(hcontext: ConstPtr, ownerauthtype: UInt, poutputbuf: MutPtr, poutputbuflen: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTpmbaseservicesTbsiGetOwnerAuth")

public actual fun tbsiGetTcgLog(hcontext: ConstPtr, poutputbuf: MutPtr, poutputbuflen: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTpmbaseservicesTbsiGetTcgLog")

public actual fun tbsiGetTcgLogEx(logtype: UInt, pboutput: MutPtr, pcboutput: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTpmbaseservicesTbsiGetTcgLogEx")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemTpmbaseservicesTbsiIsTpmPresent")
private external fun wasiWindowssysWindowsWin32SystemTpmbaseservicesTbsiIsTpmPresent(): Int

public actual fun tbsiIsTpmPresent(): Bool =
    wasiWindowssysWindowsWin32SystemTpmbaseservicesTbsiIsTpmPresent()

public actual fun tbsiPhysicalPresenceCommand(hcontext: ConstPtr, pabinput: ConstPtr, cbinput: UInt, paboutput: MutPtr, pcboutput: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTpmbaseservicesTbsiPhysicalPresenceCommand")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SystemTpmbaseservicesTbsiRevokeAttestation")
private external fun wasiWindowssysWindowsWin32SystemTpmbaseservicesTbsiRevokeAttestation(): Int

public actual fun tbsiRevokeAttestation(): UInt =
    wasiWindowssysWindowsWin32SystemTpmbaseservicesTbsiRevokeAttestation().toUInt()

public actual fun tbsipCancelCommands(hcontext: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTpmbaseservicesTbsipCancelCommands")

public actual fun tbsipContextClose(hcontext: ConstPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTpmbaseservicesTbsipContextClose")

public actual fun tbsipSubmitCommand(hcontext: ConstPtr, locality: TbsCommandLocality, priority: TbsCommandPriority, pabcommand: ConstPtr, cbcommand: UInt, pabresult: MutPtr, pcbresult: MutPtr): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SystemTpmbaseservicesTbsipSubmitCommand")
