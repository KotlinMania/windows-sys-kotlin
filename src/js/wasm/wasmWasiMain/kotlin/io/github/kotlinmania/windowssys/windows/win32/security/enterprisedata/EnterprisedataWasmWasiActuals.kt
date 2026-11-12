@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.security.enterprisedata

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun protectFileToEnterpriseIdentity(fileorfolderpath: Pcwstr, identity: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityEnterprisedataProtectFileToEnterpriseIdentity")

public actual fun srpCloseThreadNetworkContext(threadnetworkcontext: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityEnterprisedataSrpCloseThreadNetworkContext")

public actual fun srpCreateThreadNetworkContext(enterpriseid: Pcwstr, threadnetworkcontext: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityEnterprisedataSrpCreateThreadNetworkContext")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityEnterprisedataSrpDisablePermissiveModeFileEncryption")
private external fun wasiWindowssysWindowsWin32SecurityEnterprisedataSrpDisablePermissiveModeFileEncryption(): Int

public actual fun srpDisablePermissiveModeFileEncryption(): Hresult =
    wasiWindowssysWindowsWin32SecurityEnterprisedataSrpDisablePermissiveModeFileEncryption()

public actual fun srpDoesPolicyAllowAppExecution(packageid: ConstPtr, isallowed: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityEnterprisedataSrpDoesPolicyAllowAppExecution")

public actual fun srpEnablePermissiveModeFileEncryption(enterpriseid: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityEnterprisedataSrpEnablePermissiveModeFileEncryption")

public actual fun srpGetEnterpriseIds(tokenhandle: Handle, numberofbytes: MutPtr, enterpriseids: MutPtr, enterpriseidcount: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityEnterprisedataSrpGetEnterpriseIds")

public actual fun srpGetEnterprisePolicy(tokenhandle: Handle, policyflags: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityEnterprisedataSrpGetEnterprisePolicy")

public actual fun srpHostingInitialize(version: SrphostingVersion, type: SrphostingType, pvdata: ConstPtr, cbdata: UInt): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityEnterprisedataSrpHostingInitialize")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32SecurityEnterprisedataSrpHostingTerminate")
private external fun wasiWindowssysWindowsWin32SecurityEnterprisedataSrpHostingTerminate(type: Int): Unit

public actual fun srpHostingTerminate(type: SrphostingType): Unit =
    wasiWindowssysWindowsWin32SecurityEnterprisedataSrpHostingTerminate(type)

public actual fun srpIsTokenService(tokenhandle: Handle, istokenservice: MutPtr): Ntstatus =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityEnterprisedataSrpIsTokenService")

public actual fun srpSetTokenEnterpriseId(tokenhandle: Handle, enterpriseid: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityEnterprisedataSrpSetTokenEnterpriseId")

public actual fun unprotectFile(fileorfolderpath: Pcwstr, options: ConstPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32SecurityEnterprisedataUnprotectFile")
