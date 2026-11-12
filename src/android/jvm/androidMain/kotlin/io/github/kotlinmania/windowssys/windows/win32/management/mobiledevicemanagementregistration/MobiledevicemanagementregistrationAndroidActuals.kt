@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
    external fun windowssysWindowsWin32ManagementMobiledevicemanagementregistrationApplyLocalManagementSyncML(syncmlrequest: Long, syncmlresult: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32ManagementMobiledevicemanagementregistrationDiscoverManagementService(pszupn: Long, ppmgmtinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32ManagementMobiledevicemanagementregistrationDiscoverManagementServiceEx(pszupn: Long, pszdiscoveryservicecandidate: Long, ppmgmtinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32ManagementMobiledevicemanagementregistrationGetDeviceManagementConfigInfo(providerid: Long, configstringbufferlength: Long, configstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32ManagementMobiledevicemanagementregistrationGetDeviceRegistrationInfo(deviceinformationclass: Int, ppdeviceregistrationinfo: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32ManagementMobiledevicemanagementregistrationGetManagementAppHyperlink(cchhyperlink: Int, pszhyperlink: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32ManagementMobiledevicemanagementregistrationIsDeviceRegisteredWithManagement(pfisdeviceregisteredwithmanagement: Long, cchupn: Int, pszupn: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32ManagementMobiledevicemanagementregistrationIsManagementRegistrationAllowed(pfismanagementregistrationallowed: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32ManagementMobiledevicemanagementregistrationIsMdmUxWithoutAadAllowed(isenrollmentallowed: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithLocalManagement(alreadyregistered: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithManagement(pszupn: Long, ppszmdmserviceuri: Long, ppzsaccesstoken: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithManagementUsingAADCredentials(usertoken: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithManagementUsingAADDeviceCredentials(): Int

    @JvmStatic
    external fun windowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithManagementUsingAADDeviceCredentials2(mdmapplicationid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32ManagementMobiledevicemanagementregistrationSetDeviceManagementConfigInfo(providerid: Long, configstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32ManagementMobiledevicemanagementregistrationSetManagedExternally(ismanagedexternally: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32ManagementMobiledevicemanagementregistrationUnregisterDeviceWithLocalManagement(): Int

    @JvmStatic
    external fun windowssysWindowsWin32ManagementMobiledevicemanagementregistrationUnregisterDeviceWithManagement(enrollmentid: Long): Int
}

public actual fun applyLocalManagementSyncML(syncmlrequest: Pcwstr, syncmlresult: MutPtr): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationApplyLocalManagementSyncML(syncmlrequest.rawAddress, syncmlresult.rawAddress)

public actual fun discoverManagementService(pszupn: Pcwstr, ppmgmtinfo: MutPtr): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationDiscoverManagementService(pszupn.rawAddress, ppmgmtinfo.rawAddress)

public actual fun discoverManagementServiceEx(pszupn: Pcwstr, pszdiscoveryservicecandidate: Pcwstr, ppmgmtinfo: MutPtr): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationDiscoverManagementServiceEx(pszupn.rawAddress, pszdiscoveryservicecandidate.rawAddress, ppmgmtinfo.rawAddress)

public actual fun getDeviceManagementConfigInfo(providerid: Pcwstr, configstringbufferlength: MutPtr, configstring: Pwstr): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationGetDeviceManagementConfigInfo(providerid.rawAddress, configstringbufferlength.rawAddress, configstring.rawAddress)

public actual fun getDeviceRegistrationInfo(deviceinformationclass: RegistrationInformationClass, ppdeviceregistrationinfo: MutPtr): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationGetDeviceRegistrationInfo(deviceinformationclass, ppdeviceregistrationinfo.rawAddress)

public actual fun getManagementAppHyperlink(cchhyperlink: UInt, pszhyperlink: Pwstr): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationGetManagementAppHyperlink(cchhyperlink.toInt(), pszhyperlink.rawAddress)

public actual fun isDeviceRegisteredWithManagement(pfisdeviceregisteredwithmanagement: MutPtr, cchupn: UInt, pszupn: Pwstr): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationIsDeviceRegisteredWithManagement(pfisdeviceregisteredwithmanagement.rawAddress, cchupn.toInt(), pszupn.rawAddress)

public actual fun isManagementRegistrationAllowed(pfismanagementregistrationallowed: MutPtr): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationIsManagementRegistrationAllowed(pfismanagementregistrationallowed.rawAddress)

public actual fun isMdmUxWithoutAadAllowed(isenrollmentallowed: MutPtr): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationIsMdmUxWithoutAadAllowed(isenrollmentallowed.rawAddress)

public actual fun registerDeviceWithLocalManagement(alreadyregistered: MutPtr): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithLocalManagement(alreadyregistered.rawAddress)

public actual fun registerDeviceWithManagement(pszupn: Pcwstr, ppszmdmserviceuri: Pcwstr, ppzsaccesstoken: Pcwstr): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithManagement(pszupn.rawAddress, ppszmdmserviceuri.rawAddress, ppzsaccesstoken.rawAddress)

public actual fun registerDeviceWithManagementUsingAADCredentials(usertoken: Handle): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithManagementUsingAADCredentials(usertoken.rawAddress)

public actual fun registerDeviceWithManagementUsingAADDeviceCredentials(): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithManagementUsingAADDeviceCredentials()

public actual fun registerDeviceWithManagementUsingAADDeviceCredentials2(mdmapplicationid: Pcwstr): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationRegisterDeviceWithManagementUsingAADDeviceCredentials2(mdmapplicationid.rawAddress)

public actual fun setDeviceManagementConfigInfo(providerid: Pcwstr, configstring: Pcwstr): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationSetDeviceManagementConfigInfo(providerid.rawAddress, configstring.rawAddress)

public actual fun setManagedExternally(ismanagedexternally: Bool): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationSetManagedExternally(ismanagedexternally)

public actual fun unregisterDeviceWithLocalManagement(): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationUnregisterDeviceWithLocalManagement()

public actual fun unregisterDeviceWithManagement(enrollmentid: Pcwstr): Hresult =
    WindowsWin32ManagementMobiledevicemanagementregistrationJniBridge.windowssysWindowsWin32ManagementMobiledevicemanagementregistrationUnregisterDeviceWithManagement(enrollmentid.rawAddress)
