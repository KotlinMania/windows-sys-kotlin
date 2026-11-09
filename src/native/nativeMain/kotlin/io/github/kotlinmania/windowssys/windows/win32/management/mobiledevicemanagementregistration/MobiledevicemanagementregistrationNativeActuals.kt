@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun ApplyLocalManagementSyncML(syncmlrequest: PCWSTR, syncmlresult: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_ApplyLocalManagementSyncML(syncmlrequest.toCPointer<ByteVar>(), syncmlresult.toCPointer<ByteVar>())

public actual fun DiscoverManagementService(pszupn: PCWSTR, ppmgmtinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_DiscoverManagementService(pszupn.toCPointer<ByteVar>(), ppmgmtinfo.toCPointer<ByteVar>())

public actual fun DiscoverManagementServiceEx(pszupn: PCWSTR, pszdiscoveryservicecandidate: PCWSTR, ppmgmtinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_DiscoverManagementServiceEx(pszupn.toCPointer<ByteVar>(), pszdiscoveryservicecandidate.toCPointer<ByteVar>(), ppmgmtinfo.toCPointer<ByteVar>())

public actual fun GetDeviceManagementConfigInfo(providerid: PCWSTR, configstringbufferlength: Long, configstring: PWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_GetDeviceManagementConfigInfo(providerid.toCPointer<ByteVar>(), configstringbufferlength.toCPointer<ByteVar>(), configstring.toCPointer<ByteVar>())

public actual fun GetDeviceRegistrationInfo(deviceinformationclass: REGISTRATION_INFORMATION_CLASS, ppdeviceregistrationinfo: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_GetDeviceRegistrationInfo(deviceinformationclass, ppdeviceregistrationinfo.toCPointer<ByteVar>())

public actual fun GetManagementAppHyperlink(cchhyperlink: UInt, pszhyperlink: PWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_GetManagementAppHyperlink(cchhyperlink, pszhyperlink.toCPointer<ByteVar>())

public actual fun IsDeviceRegisteredWithManagement(pfisdeviceregisteredwithmanagement: Long, cchupn: UInt, pszupn: PWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_IsDeviceRegisteredWithManagement(pfisdeviceregisteredwithmanagement.toCPointer<ByteVar>(), cchupn, pszupn.toCPointer<ByteVar>())

public actual fun IsManagementRegistrationAllowed(pfismanagementregistrationallowed: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_IsManagementRegistrationAllowed(pfismanagementregistrationallowed.toCPointer<ByteVar>())

public actual fun IsMdmUxWithoutAadAllowed(isenrollmentallowed: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_IsMdmUxWithoutAadAllowed(isenrollmentallowed.toCPointer<ByteVar>())

public actual fun RegisterDeviceWithLocalManagement(alreadyregistered: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithLocalManagement(alreadyregistered.toCPointer<ByteVar>())

public actual fun RegisterDeviceWithManagement(pszupn: PCWSTR, ppszmdmserviceuri: PCWSTR, ppzsaccesstoken: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithManagement(pszupn.toCPointer<ByteVar>(), ppszmdmserviceuri.toCPointer<ByteVar>(), ppzsaccesstoken.toCPointer<ByteVar>())

public actual fun RegisterDeviceWithManagementUsingAADCredentials(usertoken: HANDLE): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithManagementUsingAADCredentials(usertoken.toCPointer<ByteVar>())

public actual fun RegisterDeviceWithManagementUsingAADDeviceCredentials(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithManagementUsingAADDeviceCredentials()

public actual fun RegisterDeviceWithManagementUsingAADDeviceCredentials2(mdmapplicationid: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithManagementUsingAADDeviceCredentials2(mdmapplicationid.toCPointer<ByteVar>())

public actual fun SetDeviceManagementConfigInfo(providerid: PCWSTR, configstring: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_SetDeviceManagementConfigInfo(providerid.toCPointer<ByteVar>(), configstring.toCPointer<ByteVar>())

public actual fun SetManagedExternally(ismanagedexternally: BOOL): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_SetManagedExternally(ismanagedexternally)

public actual fun UnregisterDeviceWithLocalManagement(): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_UnregisterDeviceWithLocalManagement()

public actual fun UnregisterDeviceWithManagement(enrollmentid: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration.cinterop.windowssys_windows_win32_management_mobiledevicemanagementregistration_UnregisterDeviceWithManagement(enrollmentid.toCPointer<ByteVar>())
