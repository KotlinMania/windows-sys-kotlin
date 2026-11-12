@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.wintrust

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun openPersonalTrustDBDialog(hwndparent: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityWintrustOpenPersonalTrustDBDialog")

public actual fun openPersonalTrustDBDialogEx(hwndparent: Hwnd, dwflags: UInt, pvreserved: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityWintrustOpenPersonalTrustDBDialogEx")

public actual fun wTHelperCertCheckValidSignature(pprovdata: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityWintrustWTHelperCertCheckValidSignature")

public actual fun wTHelperCertIsSelfSigned(dwencoding: UInt, pcert: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityWintrustWTHelperCertIsSelfSigned")

public actual fun wTHelperGetProvCertFromChain(psgnr: MutPtr, idxcert: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityWintrustWTHelperGetProvCertFromChain")

public actual fun wTHelperGetProvPrivateDataFromChain(pprovdata: MutPtr, pgproviderid: MutPtr): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityWintrustWTHelperGetProvPrivateDataFromChain")

public actual fun wTHelperGetProvSignerFromChain(pprovdata: MutPtr, idxsigner: UInt, fcountersigner: Bool, idxcountersigner: UInt): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityWintrustWTHelperGetProvSignerFromChain")

public actual fun wTHelperProvDataFromStateData(hstatedata: Handle): MutPtr =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityWintrustWTHelperProvDataFromStateData")

public actual fun winVerifyTrust(hwnd: Hwnd, pgactionid: MutPtr, pwvtdata: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityWintrustWinVerifyTrust")

public actual fun winVerifyTrustEx(hwnd: Hwnd, pgactionid: MutPtr, pwintrustdata: MutPtr): Int =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityWintrustWinVerifyTrustEx")

public actual fun wintrustAddActionID(pgactionid: ConstPtr, fdwflags: UInt, psprovinfo: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityWintrustWintrustAddActionID")

public actual fun wintrustAddDefaultForUsage(pszusageoid: Pcstr, psdefusage: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityWintrustWintrustAddDefaultForUsage")

public actual fun wintrustGetDefaultForUsage(dwaction: WintrustGetDefaultForUsageAction, pszusageoid: Pcstr, psusage: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityWintrustWintrustGetDefaultForUsage")

public actual fun wintrustGetRegPolicyFlags(pdwpolicyflags: MutPtr): Unit = throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityWintrustWintrustGetRegPolicyFlags")

public actual fun wintrustLoadFunctionPointers(pgactionid: MutPtr, ppfns: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityWintrustWintrustLoadFunctionPointers")

public actual fun wintrustRemoveActionID(pgactionid: ConstPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityWintrustWintrustRemoveActionID")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityWintrustWintrustSetDefaultIncludePEPageHashes")
private external fun wasiWindowssysWindowsWin32SecurityWintrustWintrustSetDefaultIncludePEPageHashes(fincludepepagehashes: Int): Unit

public actual fun wintrustSetDefaultIncludePEPageHashes(fincludepepagehashes: Bool): Unit =
    wasiWindowssysWindowsWin32SecurityWintrustWintrustSetDefaultIncludePEPageHashes(fincludepepagehashes)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityWintrustWintrustSetRegPolicyFlags")
private external fun wasiWindowssysWindowsWin32SecurityWintrustWintrustSetRegPolicyFlags(dwpolicyflags: Int): Int

public actual fun wintrustSetRegPolicyFlags(dwpolicyflags: WintrustPolicyFlags): Bool =
    wasiWindowssysWindowsWin32SecurityWintrustWintrustSetRegPolicyFlags(dwpolicyflags.toInt())
