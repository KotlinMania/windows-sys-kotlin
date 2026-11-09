package io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public expect fun ApplyLocalManagementSyncML(syncmlrequest: PCWSTR, syncmlresult: Long): HRESULT

public expect fun DiscoverManagementService(pszupn: PCWSTR, ppmgmtinfo: Long): HRESULT

public expect fun DiscoverManagementServiceEx(pszupn: PCWSTR, pszdiscoveryservicecandidate: PCWSTR, ppmgmtinfo: Long): HRESULT

public expect fun GetDeviceManagementConfigInfo(providerid: PCWSTR, configstringbufferlength: Long, configstring: PWSTR): HRESULT

public expect fun GetDeviceRegistrationInfo(deviceinformationclass: REGISTRATION_INFORMATION_CLASS, ppdeviceregistrationinfo: Long): HRESULT

public expect fun GetManagementAppHyperlink(cchhyperlink: UInt, pszhyperlink: PWSTR): HRESULT

public expect fun IsDeviceRegisteredWithManagement(pfisdeviceregisteredwithmanagement: Long, cchupn: UInt, pszupn: PWSTR): HRESULT

public expect fun IsManagementRegistrationAllowed(pfismanagementregistrationallowed: Long): HRESULT

public expect fun IsMdmUxWithoutAadAllowed(isenrollmentallowed: Long): HRESULT

public expect fun RegisterDeviceWithLocalManagement(alreadyregistered: Long): HRESULT

public expect fun RegisterDeviceWithManagement(pszupn: PCWSTR, ppszmdmserviceuri: PCWSTR, ppzsaccesstoken: PCWSTR): HRESULT

public expect fun RegisterDeviceWithManagementUsingAADCredentials(usertoken: HANDLE): HRESULT

public expect fun RegisterDeviceWithManagementUsingAADDeviceCredentials(): HRESULT

public expect fun RegisterDeviceWithManagementUsingAADDeviceCredentials2(mdmapplicationid: PCWSTR): HRESULT

public expect fun SetDeviceManagementConfigInfo(providerid: PCWSTR, configstring: PCWSTR): HRESULT

public expect fun SetManagedExternally(ismanagedexternally: BOOL): HRESULT

public expect fun UnregisterDeviceWithLocalManagement(): HRESULT

public expect fun UnregisterDeviceWithManagement(enrollmentid: PCWSTR): HRESULT
