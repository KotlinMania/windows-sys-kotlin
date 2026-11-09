@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private val _windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun ApplyLocalManagementSyncML(syncmlrequest: PCWSTR, syncmlresult: Long): HRESULT =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_ApplyLocalManagementSyncML(syncmlrequest.toString(), syncmlresult.toString()) as Int) else 0

public actual fun DiscoverManagementService(pszupn: PCWSTR, ppmgmtinfo: Long): HRESULT =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_DiscoverManagementService(pszupn.toString(), ppmgmtinfo.toString()) as Int) else 0

public actual fun DiscoverManagementServiceEx(pszupn: PCWSTR, pszdiscoveryservicecandidate: PCWSTR, ppmgmtinfo: Long): HRESULT =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_DiscoverManagementServiceEx(pszupn.toString(), pszdiscoveryservicecandidate.toString(), ppmgmtinfo.toString()) as Int) else 0

public actual fun GetDeviceManagementConfigInfo(providerid: PCWSTR, configstringbufferlength: Long, configstring: PWSTR): HRESULT =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_GetDeviceManagementConfigInfo(providerid.toString(), configstringbufferlength.toString(), configstring.toString()) as Int) else 0

public actual fun GetDeviceRegistrationInfo(deviceinformationclass: REGISTRATION_INFORMATION_CLASS, ppdeviceregistrationinfo: Long): HRESULT =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_GetDeviceRegistrationInfo(deviceinformationclass, ppdeviceregistrationinfo.toString()) as Int) else 0

public actual fun GetManagementAppHyperlink(cchhyperlink: UInt, pszhyperlink: PWSTR): HRESULT =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_GetManagementAppHyperlink(cchhyperlink.toInt(), pszhyperlink.toString()) as Int) else 0

public actual fun IsDeviceRegisteredWithManagement(pfisdeviceregisteredwithmanagement: Long, cchupn: UInt, pszupn: PWSTR): HRESULT =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_IsDeviceRegisteredWithManagement(pfisdeviceregisteredwithmanagement.toString(), cchupn.toInt(), pszupn.toString()) as Int) else 0

public actual fun IsManagementRegistrationAllowed(pfismanagementregistrationallowed: Long): HRESULT =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_IsManagementRegistrationAllowed(pfismanagementregistrationallowed.toString()) as Int) else 0

public actual fun IsMdmUxWithoutAadAllowed(isenrollmentallowed: Long): HRESULT =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_IsMdmUxWithoutAadAllowed(isenrollmentallowed.toString()) as Int) else 0

public actual fun RegisterDeviceWithLocalManagement(alreadyregistered: Long): HRESULT =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithLocalManagement(alreadyregistered.toString()) as Int) else 0

public actual fun RegisterDeviceWithManagement(pszupn: PCWSTR, ppszmdmserviceuri: PCWSTR, ppzsaccesstoken: PCWSTR): HRESULT =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithManagement(pszupn.toString(), ppszmdmserviceuri.toString(), ppzsaccesstoken.toString()) as Int) else 0

public actual fun RegisterDeviceWithManagementUsingAADCredentials(usertoken: HANDLE): HRESULT =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithManagementUsingAADCredentials(usertoken.toString()) as Int) else 0

public actual fun RegisterDeviceWithManagementUsingAADDeviceCredentials(): HRESULT =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithManagementUsingAADDeviceCredentials() as Int) else 0

public actual fun RegisterDeviceWithManagementUsingAADDeviceCredentials2(mdmapplicationid: PCWSTR): HRESULT =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithManagementUsingAADDeviceCredentials2(mdmapplicationid.toString()) as Int) else 0

public actual fun SetDeviceManagementConfigInfo(providerid: PCWSTR, configstring: PCWSTR): HRESULT =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_SetDeviceManagementConfigInfo(providerid.toString(), configstring.toString()) as Int) else 0

public actual fun SetManagedExternally(ismanagedexternally: BOOL): HRESULT =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_SetManagedExternally(ismanagedexternally) as Int) else 0

public actual fun UnregisterDeviceWithLocalManagement(): HRESULT =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_UnregisterDeviceWithLocalManagement() as Int) else 0

public actual fun UnregisterDeviceWithManagement(enrollmentid: PCWSTR): HRESULT =
    if (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon != null) (_windowsWin32ManagementMobiledevicemanagementregistrationNapiAddon.windowssys_windows_win32_management_mobiledevicemanagementregistration_UnregisterDeviceWithManagement(enrollmentid.toString()) as Int) else 0
