@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun applyLocalManagementSyncML(syncmlrequest: Pcwstr, syncmlresult: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32ManagementMobiledevicemanagementregistrationApplyLocalManagementSyncML")

public actual fun discoverManagementService(pszupn: Pcwstr, ppmgmtinfo: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32ManagementMobiledevicemanagementregistrationDiscoverManagementService")

public actual fun discoverManagementServiceEx(pszupn: Pcwstr, pszdiscoveryservicecandidate: Pcwstr, ppmgmtinfo: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32ManagementMobiledevicemanagementregistrationDiscoverManagementServiceEx")

public actual fun getDeviceManagementConfigInfo(providerid: Pcwstr, configstringbufferlength: MutPtr, configstring: Pwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32ManagementMobiledevicemanagementregistrationGetDeviceManagementConfigInfo")

public actual fun getDeviceRegistrationInfo(deviceinformationclass: RegistrationInformationClass, ppdeviceregistrationinfo: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32ManagementMobiledevicemanagementregistrationGetDeviceRegistrationInfo")

public actual fun getManagementAppHyperlink(cchhyperlink: UInt, pszhyperlink: Pwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32ManagementMobiledevicemanagementregistrationGetManagementAppHyperlink")

public actual fun isDeviceRegisteredWithManagement(pfisdeviceregisteredwithmanagement: MutPtr, cchupn: UInt, pszupn: Pwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32ManagementMobiledevicemanagementregistrationIsDeviceRegisteredWithManagement")

public actual fun isManagementRegistrationAllowed(pfismanagementregistrationallowed: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32ManagementMobiledevicemanagementregistrationIsManagementRegistrationAllowed")

public actual fun isMdmUxWithoutAadAllowed(isenrollmentallowed: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32ManagementMobiledevicemanagementregistrationIsMdmUxWithoutAadAllowed")

public actual fun registerDeviceWithLocalManagement(alreadyregistered: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithLocalManagement")

public actual fun registerDeviceWithManagement(pszupn: Pcwstr, ppszmdmserviceuri: Pcwstr, ppzsaccesstoken: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithManagement")

public actual fun registerDeviceWithManagementUsingAADCredentials(usertoken: Handle): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithManagementUsingAADCredentials")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithManagementUsingAADDeviceCredentials")
private external fun wasiWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithManagementUsingAADDeviceCredentials(): Int

public actual fun registerDeviceWithManagementUsingAADDeviceCredentials(): Hresult =
    wasiWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithManagementUsingAADDeviceCredentials()

public actual fun registerDeviceWithManagementUsingAADDeviceCredentials2(mdmapplicationid: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithManagementUsingAADDeviceCredentials2")

public actual fun setDeviceManagementConfigInfo(providerid: Pcwstr, configstring: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32ManagementMobiledevicemanagementregistrationSetDeviceManagementConfigInfo")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32ManagementMobiledevicemanagementregistrationSetManagedExternally")
private external fun wasiWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationSetManagedExternally(ismanagedexternally: Int): Int

public actual fun setManagedExternally(ismanagedexternally: Bool): Hresult =
    wasiWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationSetManagedExternally(ismanagedexternally)

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32ManagementMobiledevicemanagementregistrationUnregisterDeviceWithLocalManagement")
private external fun wasiWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationUnregisterDeviceWithLocalManagement(): Int

public actual fun unregisterDeviceWithLocalManagement(): Hresult =
    wasiWindowssysWindowsWin32ManagementMobiledevicemanagementregistrationUnregisterDeviceWithLocalManagement()

public actual fun unregisterDeviceWithManagement(enrollmentid: Pcwstr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32ManagementMobiledevicemanagementregistrationUnregisterDeviceWithManagement")
