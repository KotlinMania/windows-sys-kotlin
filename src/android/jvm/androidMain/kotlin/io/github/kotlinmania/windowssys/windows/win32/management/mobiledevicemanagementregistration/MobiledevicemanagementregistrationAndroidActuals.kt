@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_applyLocalManagementSyncML(syncmlrequest: Long, syncmlresult: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_discoverManagementService(pszupn: Long, ppmgmtinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_discoverManagementServiceEx(pszupn: Long, pszdiscoveryservicecandidate: Long, ppmgmtinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_getDeviceManagementConfigInfo(providerid: Long, configstringbufferlength: Long, configstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_getDeviceRegistrationInfo(deviceinformationclass: Int, ppdeviceregistrationinfo: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_getManagementAppHyperlink(cchhyperlink: Int, pszhyperlink: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_isDeviceRegisteredWithManagement(pfisdeviceregisteredwithmanagement: Long, cchupn: Int, pszupn: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_isManagementRegistrationAllowed(pfismanagementregistrationallowed: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_isMdmUxWithoutAadAllowed(isenrollmentallowed: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithLocalManagement(alreadyregistered: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagement(pszupn: Long, ppszmdmserviceuri: Long, ppzsaccesstoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagementUsingAADCredentials(usertoken: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagementUsingAADDeviceCredentials(): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagementUsingAADDeviceCredentials2(mdmapplicationid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_setDeviceManagementConfigInfo(providerid: Long, configstring: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_setManagedExternally(ismanagedexternally: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_unregisterDeviceWithLocalManagement(): Int

    @JvmStatic
    external fun windowssys_windows_win32_management_mobiledevicemanagementregistration_unregisterDeviceWithManagement(enrollmentid: Long): Int
}

public actual fun applyLocalManagementSyncML(syncmlrequest: Pcwstr, syncmlresult: COpaquePointer?): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_applyLocalManagementSyncML((syncmlrequest?.value ?: 0L), (syncmlresult?.value ?: 0L))

public actual fun discoverManagementService(pszupn: Pcwstr, ppmgmtinfo: COpaquePointer?): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_discoverManagementService((pszupn?.value ?: 0L), (ppmgmtinfo?.value ?: 0L))

public actual fun discoverManagementServiceEx(pszupn: Pcwstr, pszdiscoveryservicecandidate: Pcwstr, ppmgmtinfo: COpaquePointer?): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_discoverManagementServiceEx((pszupn?.value ?: 0L), (pszdiscoveryservicecandidate?.value ?: 0L), (ppmgmtinfo?.value ?: 0L))

public actual fun getDeviceManagementConfigInfo(providerid: Pcwstr, configstringbufferlength: COpaquePointer?, configstring: Pwstr): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_getDeviceManagementConfigInfo((providerid?.value ?: 0L), (configstringbufferlength?.value ?: 0L), (configstring?.value ?: 0L))

public actual fun getDeviceRegistrationInfo(deviceinformationclass: RegistrationInformationClass, ppdeviceregistrationinfo: COpaquePointer?): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_getDeviceRegistrationInfo(deviceinformationclass, (ppdeviceregistrationinfo?.value ?: 0L))

public actual fun getManagementAppHyperlink(cchhyperlink: UInt, pszhyperlink: Pwstr): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_getManagementAppHyperlink(cchhyperlink.toInt(), (pszhyperlink?.value ?: 0L))

public actual fun isDeviceRegisteredWithManagement(pfisdeviceregisteredwithmanagement: COpaquePointer?, cchupn: UInt, pszupn: Pwstr): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_isDeviceRegisteredWithManagement((pfisdeviceregisteredwithmanagement?.value ?: 0L), cchupn.toInt(), (pszupn?.value ?: 0L))

public actual fun isManagementRegistrationAllowed(pfismanagementregistrationallowed: COpaquePointer?): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_isManagementRegistrationAllowed((pfismanagementregistrationallowed?.value ?: 0L))

public actual fun isMdmUxWithoutAadAllowed(isenrollmentallowed: COpaquePointer?): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_isMdmUxWithoutAadAllowed((isenrollmentallowed?.value ?: 0L))

public actual fun registerDeviceWithLocalManagement(alreadyregistered: COpaquePointer?): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithLocalManagement((alreadyregistered?.value ?: 0L))

public actual fun registerDeviceWithManagement(pszupn: Pcwstr, ppszmdmserviceuri: Pcwstr, ppzsaccesstoken: Pcwstr): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagement((pszupn?.value ?: 0L), (ppszmdmserviceuri?.value ?: 0L), (ppzsaccesstoken?.value ?: 0L))

public actual fun registerDeviceWithManagementUsingAADCredentials(usertoken: Handle): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagementUsingAADCredentials((usertoken?.value ?: 0L))

public actual fun registerDeviceWithManagementUsingAADDeviceCredentials(): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagementUsingAADDeviceCredentials()

public actual fun registerDeviceWithManagementUsingAADDeviceCredentials2(mdmapplicationid: Pcwstr): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_registerDeviceWithManagementUsingAADDeviceCredentials2((mdmapplicationid?.value ?: 0L))

public actual fun setDeviceManagementConfigInfo(providerid: Pcwstr, configstring: Pcwstr): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_setDeviceManagementConfigInfo((providerid?.value ?: 0L), (configstring?.value ?: 0L))

public actual fun setManagedExternally(ismanagedexternally: Bool): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_setManagedExternally(ismanagedexternally)

public actual fun unregisterDeviceWithLocalManagement(): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_unregisterDeviceWithLocalManagement()

public actual fun unregisterDeviceWithManagement(enrollmentid: Pcwstr): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssys_windows_win32_management_mobiledevicemanagementregistration_unregisterDeviceWithManagement((enrollmentid?.value ?: 0L))
