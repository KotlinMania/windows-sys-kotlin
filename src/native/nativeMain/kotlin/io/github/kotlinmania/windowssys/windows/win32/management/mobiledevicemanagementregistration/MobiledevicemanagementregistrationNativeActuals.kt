@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun applyLocalManagementSyncML(syncmlrequest: Pcwstr, syncmlresult: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_applyLocalManagementSyncML(syncmlrequest?.value?.toCPointer<ByteVar>(), syncmlresult?.value?.toCPointer<ByteVar>())

public actual fun discoverManagementService(pszupn: Pcwstr, ppmgmtinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_discoverManagementService(pszupn?.value?.toCPointer<ByteVar>(), ppmgmtinfo?.value?.toCPointer<ByteVar>())

public actual fun discoverManagementServiceEx(pszupn: Pcwstr, pszdiscoveryservicecandidate: Pcwstr, ppmgmtinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_discoverManagementServiceEx(pszupn?.value?.toCPointer<ByteVar>(), pszdiscoveryservicecandidate?.value?.toCPointer<ByteVar>(), ppmgmtinfo?.value?.toCPointer<ByteVar>())

public actual fun getDeviceManagementConfigInfo(providerid: Pcwstr, configstringbufferlength: COpaquePointer?, configstring: Pwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_getDeviceManagementConfigInfo(providerid?.value?.toCPointer<ByteVar>(), configstringbufferlength?.value?.toCPointer<ByteVar>(), configstring?.value?.toCPointer<ByteVar>())

public actual fun getDeviceRegistrationInfo(deviceinformationclass: RegistrationInformationClass, ppdeviceregistrationinfo: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_getDeviceRegistrationInfo(deviceinformationclass, ppdeviceregistrationinfo?.value?.toCPointer<ByteVar>())

public actual fun getManagementAppHyperlink(cchhyperlink: UInt, pszhyperlink: Pwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_getManagementAppHyperlink(cchhyperlink, pszhyperlink?.value?.toCPointer<ByteVar>())

public actual fun isDeviceRegisteredWithManagement(pfisdeviceregisteredwithmanagement: COpaquePointer?, cchupn: UInt, pszupn: Pwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_isDeviceRegisteredWithManagement(pfisdeviceregisteredwithmanagement?.value?.toCPointer<ByteVar>(), cchupn, pszupn?.value?.toCPointer<ByteVar>())

public actual fun isManagementRegistrationAllowed(pfismanagementregistrationallowed: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_isManagementRegistrationAllowed(pfismanagementregistrationallowed?.value?.toCPointer<ByteVar>())

public actual fun isMdmUxWithoutAadAllowed(isenrollmentallowed: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_isMdmUxWithoutAadAllowed(isenrollmentallowed?.value?.toCPointer<ByteVar>())

public actual fun registerDeviceWithLocalManagement(alreadyregistered: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithLocalManagement(alreadyregistered?.value?.toCPointer<ByteVar>())

public actual fun registerDeviceWithManagement(pszupn: Pcwstr, ppszmdmserviceuri: Pcwstr, ppzsaccesstoken: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagement(pszupn?.value?.toCPointer<ByteVar>(), ppszmdmserviceuri?.value?.toCPointer<ByteVar>(), ppzsaccesstoken?.value?.toCPointer<ByteVar>())

public actual fun registerDeviceWithManagementUsingAADCredentials(usertoken: Handle): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagementUsingAADCredentials(usertoken?.value?.toCPointer<ByteVar>())

public actual fun registerDeviceWithManagementUsingAADDeviceCredentials(): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagementUsingAADDeviceCredentials()

public actual fun registerDeviceWithManagementUsingAADDeviceCredentials2(mdmapplicationid: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagementUsingAADDeviceCredentials2(mdmapplicationid?.value?.toCPointer<ByteVar>())

public actual fun setDeviceManagementConfigInfo(providerid: Pcwstr, configstring: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_setDeviceManagementConfigInfo(providerid?.value?.toCPointer<ByteVar>(), configstring?.value?.toCPointer<ByteVar>())

public actual fun setManagedExternally(ismanagedexternally: Bool): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_setManagedExternally(ismanagedexternally)

public actual fun unregisterDeviceWithLocalManagement(): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_unregisterDeviceWithLocalManagement()

public actual fun unregisterDeviceWithManagement(enrollmentid: Pcwstr): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_unregisterDeviceWithManagement(enrollmentid?.value?.toCPointer<ByteVar>())
