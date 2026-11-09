@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private object WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_ApplyLocalManagementSyncML(syncmlrequest: Long, syncmlresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_DiscoverManagementService(pszupn: Long, ppmgmtinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_DiscoverManagementServiceEx(pszupn: Long, pszdiscoveryservicecandidate: Long, ppmgmtinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_GetDeviceManagementConfigInfo(providerid: Long, configstringbufferlength: Long, configstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_GetDeviceRegistrationInfo(deviceinformationclass: Int, ppdeviceregistrationinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_GetManagementAppHyperlink(cchhyperlink: Int, pszhyperlink: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_IsDeviceRegisteredWithManagement(pfisdeviceregisteredwithmanagement: Long, cchupn: Int, pszupn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_IsManagementRegistrationAllowed(pfismanagementregistrationallowed: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_IsMdmUxWithoutAadAllowed(isenrollmentallowed: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithLocalManagement(alreadyregistered: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithManagement(pszupn: Long, ppszmdmserviceuri: Long, ppzsaccesstoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithManagementUsingAADCredentials(usertoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithManagementUsingAADDeviceCredentials(): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithManagementUsingAADDeviceCredentials2(mdmapplicationid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_SetDeviceManagementConfigInfo(providerid: Long, configstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_SetManagedExternally(ismanagedexternally: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_UnregisterDeviceWithLocalManagement(): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_UnregisterDeviceWithManagement(enrollmentid: Long): Int
}

public actual fun ApplyLocalManagementSyncML(syncmlrequest: PCWSTR, syncmlresult: Long): HRESULT =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_ApplyLocalManagementSyncML(syncmlrequest, syncmlresult)

public actual fun DiscoverManagementService(pszupn: PCWSTR, ppmgmtinfo: Long): HRESULT =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_DiscoverManagementService(pszupn, ppmgmtinfo)

public actual fun DiscoverManagementServiceEx(pszupn: PCWSTR, pszdiscoveryservicecandidate: PCWSTR, ppmgmtinfo: Long): HRESULT =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_DiscoverManagementServiceEx(pszupn, pszdiscoveryservicecandidate, ppmgmtinfo)

public actual fun GetDeviceManagementConfigInfo(providerid: PCWSTR, configstringbufferlength: Long, configstring: PWSTR): HRESULT =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_GetDeviceManagementConfigInfo(providerid, configstringbufferlength, configstring)

public actual fun GetDeviceRegistrationInfo(deviceinformationclass: REGISTRATION_INFORMATION_CLASS, ppdeviceregistrationinfo: Long): HRESULT =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_GetDeviceRegistrationInfo(deviceinformationclass, ppdeviceregistrationinfo)

public actual fun GetManagementAppHyperlink(cchhyperlink: UInt, pszhyperlink: PWSTR): HRESULT =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_GetManagementAppHyperlink(cchhyperlink.toInt(), pszhyperlink)

public actual fun IsDeviceRegisteredWithManagement(pfisdeviceregisteredwithmanagement: Long, cchupn: UInt, pszupn: PWSTR): HRESULT =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_IsDeviceRegisteredWithManagement(pfisdeviceregisteredwithmanagement, cchupn.toInt(), pszupn)

public actual fun IsManagementRegistrationAllowed(pfismanagementregistrationallowed: Long): HRESULT =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_IsManagementRegistrationAllowed(pfismanagementregistrationallowed)

public actual fun IsMdmUxWithoutAadAllowed(isenrollmentallowed: Long): HRESULT =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_IsMdmUxWithoutAadAllowed(isenrollmentallowed)

public actual fun RegisterDeviceWithLocalManagement(alreadyregistered: Long): HRESULT =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithLocalManagement(alreadyregistered)

public actual fun RegisterDeviceWithManagement(pszupn: PCWSTR, ppszmdmserviceuri: PCWSTR, ppzsaccesstoken: PCWSTR): HRESULT =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithManagement(pszupn, ppszmdmserviceuri, ppzsaccesstoken)

public actual fun RegisterDeviceWithManagementUsingAADCredentials(usertoken: HANDLE): HRESULT =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithManagementUsingAADCredentials(usertoken)

public actual fun RegisterDeviceWithManagementUsingAADDeviceCredentials(): HRESULT =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithManagementUsingAADDeviceCredentials()

public actual fun RegisterDeviceWithManagementUsingAADDeviceCredentials2(mdmapplicationid: PCWSTR): HRESULT =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_RegisterDeviceWithManagementUsingAADDeviceCredentials2(mdmapplicationid)

public actual fun SetDeviceManagementConfigInfo(providerid: PCWSTR, configstring: PCWSTR): HRESULT =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_SetDeviceManagementConfigInfo(providerid, configstring)

public actual fun SetManagedExternally(ismanagedexternally: BOOL): HRESULT =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_SetManagedExternally(ismanagedexternally)

public actual fun UnregisterDeviceWithLocalManagement(): HRESULT =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_UnregisterDeviceWithLocalManagement()

public actual fun UnregisterDeviceWithManagement(enrollmentid: PCWSTR): HRESULT =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_UnregisterDeviceWithManagement(enrollmentid)
