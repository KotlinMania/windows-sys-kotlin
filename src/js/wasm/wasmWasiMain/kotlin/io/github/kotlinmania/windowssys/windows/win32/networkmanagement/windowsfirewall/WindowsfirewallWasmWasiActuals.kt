@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.windowsfirewall

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

public actual fun ncFreeNetconProperties(pprops: COpaquePointer?) {
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
}

public actual fun ncIsValidConnectionName(pszwname: Pcwstr): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun networkIsolationDiagnoseConnectFailureAndGetInfo(wszservername: Pcwstr, netisoerror: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun networkIsolationEnumAppContainers(flags: UInt, pdwnumpublicappcs: COpaquePointer?, pppublicappcs: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun networkIsolationEnumerateAppContainerRules(newenum: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun networkIsolationFreeAppContainers(ppublicappcs: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun networkIsolationGetAppContainerConfig(pdwnumpublicappcs: COpaquePointer?, appcontainersids: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun networkIsolationGetEnterpriseIdAsync(wszservername: Pcwstr, dwflags: UInt, context: COpaquePointer?, callback: PnetisoEdpIdCallbackFn, hoperation: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun networkIsolationGetEnterpriseIdClose(hoperation: Handle, bwaitforoperation: Bool): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun networkIsolationRegisterForAppContainerChanges(flags: UInt, callback: PacChangesCallbackFn, context: COpaquePointer?, registrationobject: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun networkIsolationSetAppContainerConfig(dwnumpublicappcs: UInt, appcontainersids: COpaquePointer?): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun networkIsolationSetupAppContainerBinaries(applicationcontainersid: Psid, packagefullname: Pcwstr, packagefolder: Pcwstr, displayname: Pcwstr, bbinariesfullycomputed: Bool, binaries: COpaquePointer?, binariescount: UInt): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun networkIsolationUnregisterForAppContainerChanges(registrationobject: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
