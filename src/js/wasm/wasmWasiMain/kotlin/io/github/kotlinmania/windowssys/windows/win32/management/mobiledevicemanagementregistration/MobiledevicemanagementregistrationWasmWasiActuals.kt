@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public actual fun ApplyLocalManagementSyncML(syncmlrequest: PCWSTR, syncmlresult: Long): HRESULT =
    0

public actual fun DiscoverManagementService(pszupn: PCWSTR, ppmgmtinfo: Long): HRESULT =
    0

public actual fun DiscoverManagementServiceEx(pszupn: PCWSTR, pszdiscoveryservicecandidate: PCWSTR, ppmgmtinfo: Long): HRESULT =
    0

public actual fun GetDeviceManagementConfigInfo(providerid: PCWSTR, configstringbufferlength: Long, configstring: PWSTR): HRESULT =
    0

public actual fun GetDeviceRegistrationInfo(deviceinformationclass: REGISTRATION_INFORMATION_CLASS, ppdeviceregistrationinfo: Long): HRESULT =
    0

public actual fun GetManagementAppHyperlink(cchhyperlink: UInt, pszhyperlink: PWSTR): HRESULT =
    0

public actual fun IsDeviceRegisteredWithManagement(pfisdeviceregisteredwithmanagement: Long, cchupn: UInt, pszupn: PWSTR): HRESULT =
    0

public actual fun IsManagementRegistrationAllowed(pfismanagementregistrationallowed: Long): HRESULT =
    0

public actual fun IsMdmUxWithoutAadAllowed(isenrollmentallowed: Long): HRESULT =
    0

public actual fun RegisterDeviceWithLocalManagement(alreadyregistered: Long): HRESULT =
    0

public actual fun RegisterDeviceWithManagement(pszupn: PCWSTR, ppszmdmserviceuri: PCWSTR, ppzsaccesstoken: PCWSTR): HRESULT =
    0

public actual fun RegisterDeviceWithManagementUsingAADCredentials(usertoken: HANDLE): HRESULT =
    0

public actual fun RegisterDeviceWithManagementUsingAADDeviceCredentials(): HRESULT =
    0

public actual fun RegisterDeviceWithManagementUsingAADDeviceCredentials2(mdmapplicationid: PCWSTR): HRESULT =
    0

public actual fun SetDeviceManagementConfigInfo(providerid: PCWSTR, configstring: PCWSTR): HRESULT =
    0

public actual fun SetManagedExternally(ismanagedexternally: BOOL): HRESULT =
    0

public actual fun UnregisterDeviceWithLocalManagement(): HRESULT =
    0

public actual fun UnregisterDeviceWithManagement(enrollmentid: PCWSTR): HRESULT =
    0
