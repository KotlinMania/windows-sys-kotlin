@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public actual fun applyLocalManagementSyncML(syncmlrequest: Pcwstr, syncmlresult: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun discoverManagementService(pszupn: Pcwstr, ppmgmtinfo: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun discoverManagementServiceEx(pszupn: Pcwstr, pszdiscoveryservicecandidate: Pcwstr, ppmgmtinfo: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDeviceManagementConfigInfo(providerid: Pcwstr, configstringbufferlength: COpaquePointer?, configstring: Pwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDeviceRegistrationInfo(deviceinformationclass: RegistrationInformationClass, ppdeviceregistrationinfo: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getManagementAppHyperlink(cchhyperlink: UInt, pszhyperlink: Pwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isDeviceRegisteredWithManagement(pfisdeviceregisteredwithmanagement: COpaquePointer?, cchupn: UInt, pszupn: Pwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isManagementRegistrationAllowed(pfismanagementregistrationallowed: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isMdmUxWithoutAadAllowed(isenrollmentallowed: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerDeviceWithLocalManagement(alreadyregistered: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerDeviceWithManagement(pszupn: Pcwstr, ppszmdmserviceuri: Pcwstr, ppzsaccesstoken: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerDeviceWithManagementUsingAADCredentials(usertoken: Handle): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerDeviceWithManagementUsingAADDeviceCredentials(): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun registerDeviceWithManagementUsingAADDeviceCredentials2(mdmapplicationid: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setDeviceManagementConfigInfo(providerid: Pcwstr, configstring: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setManagedExternally(ismanagedexternally: Bool): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unregisterDeviceWithLocalManagement(): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun unregisterDeviceWithManagement(enrollmentid: Pcwstr): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
