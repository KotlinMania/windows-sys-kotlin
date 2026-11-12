package io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

public expect fun applyLocalManagementSyncML(syncmlrequest: Pcwstr, syncmlresult: MutPtr<Pwstr>): Hresult

public expect fun discoverManagementService(pszupn: Pcwstr, ppmgmtinfo: MutPtr<MutPtr<ManagementServiceInfo>>): Hresult

public expect fun discoverManagementServiceEx(pszupn: Pcwstr, pszdiscoveryservicecandidate: Pcwstr, ppmgmtinfo: MutPtr<MutPtr<ManagementServiceInfo>>): Hresult

public expect fun getDeviceManagementConfigInfo(providerid: Pcwstr, configstringbufferlength: MutPtr<UInt>, configstring: Pwstr): Hresult

public expect fun getDeviceRegistrationInfo(deviceinformationclass: RegistrationInformationClass, ppdeviceregistrationinfo: MutPtr<MutPtr<CVoid>>): Hresult

public expect fun getManagementAppHyperlink(cchhyperlink: UInt, pszhyperlink: Pwstr): Hresult

public expect fun isDeviceRegisteredWithManagement(pfisdeviceregisteredwithmanagement: MutPtr<Bool>, cchupn: UInt, pszupn: Pwstr): Hresult

public expect fun isManagementRegistrationAllowed(pfismanagementregistrationallowed: MutPtr<Bool>): Hresult

public expect fun isMdmUxWithoutAadAllowed(isenrollmentallowed: MutPtr<Bool>): Hresult

public expect fun registerDeviceWithLocalManagement(alreadyregistered: MutPtr<Bool>): Hresult

public expect fun registerDeviceWithManagement(pszupn: Pcwstr, ppszmdmserviceuri: Pcwstr, ppzsaccesstoken: Pcwstr): Hresult

public expect fun registerDeviceWithManagementUsingAADCredentials(usertoken: Handle): Hresult

public expect fun registerDeviceWithManagementUsingAADDeviceCredentials(): Hresult

public expect fun registerDeviceWithManagementUsingAADDeviceCredentials2(mdmapplicationid: Pcwstr): Hresult

public expect fun setDeviceManagementConfigInfo(providerid: Pcwstr, configstring: Pcwstr): Hresult

public expect fun setManagedExternally(ismanagedexternally: Bool): Hresult

public expect fun unregisterDeviceWithLocalManagement(): Hresult

public expect fun unregisterDeviceWithManagement(enrollmentid: Pcwstr): Hresult
