package io.github.kotlinmania.windowssys.windows.win32.management.mobiledevicemanagementregistration

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

public fun ApplyLocalManagementSyncML(syncmlrequest: PCWSTR, syncmlresult: Long): HRESULT {
    return Win32DynamicFfi.invoke("mdmlocalmanagement.dll", "ApplyLocalManagementSyncML", longArrayOf(syncmlrequest, syncmlresult)).toInt()
}

public fun DiscoverManagementService(pszupn: PCWSTR, ppmgmtinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("mdmregistration.dll", "DiscoverManagementService", longArrayOf(pszupn, ppmgmtinfo)).toInt()
}

public fun DiscoverManagementServiceEx(pszupn: PCWSTR, pszdiscoveryservicecandidate: PCWSTR, ppmgmtinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("mdmregistration.dll", "DiscoverManagementServiceEx", longArrayOf(pszupn, pszdiscoveryservicecandidate, ppmgmtinfo)).toInt()
}

public fun GetDeviceManagementConfigInfo(providerid: PCWSTR, configstringbufferlength: Long, configstring: PWSTR): HRESULT {
    return Win32DynamicFfi.invoke("mdmregistration.dll", "GetDeviceManagementConfigInfo", longArrayOf(providerid, configstringbufferlength, configstring)).toInt()
}

public fun GetDeviceRegistrationInfo(deviceinformationclass: REGISTRATION_INFORMATION_CLASS, ppdeviceregistrationinfo: Long): HRESULT {
    return Win32DynamicFfi.invoke("mdmregistration.dll", "GetDeviceRegistrationInfo", longArrayOf(deviceinformationclass.toLong(), ppdeviceregistrationinfo)).toInt()
}

public fun GetManagementAppHyperlink(cchhyperlink: UInt, pszhyperlink: PWSTR): HRESULT {
    return Win32DynamicFfi.invoke("mdmregistration.dll", "GetManagementAppHyperlink", longArrayOf(cchhyperlink.toLong(), pszhyperlink)).toInt()
}

public fun IsDeviceRegisteredWithManagement(pfisdeviceregisteredwithmanagement: Long, cchupn: UInt, pszupn: PWSTR): HRESULT {
    return Win32DynamicFfi.invoke("mdmregistration.dll", "IsDeviceRegisteredWithManagement", longArrayOf(pfisdeviceregisteredwithmanagement, cchupn.toLong(), pszupn)).toInt()
}

public fun IsManagementRegistrationAllowed(pfismanagementregistrationallowed: Long): HRESULT {
    return Win32DynamicFfi.invoke("mdmregistration.dll", "IsManagementRegistrationAllowed", longArrayOf(pfismanagementregistrationallowed)).toInt()
}

public fun IsMdmUxWithoutAadAllowed(isenrollmentallowed: Long): HRESULT {
    return Win32DynamicFfi.invoke("mdmregistration.dll", "IsMdmUxWithoutAadAllowed", longArrayOf(isenrollmentallowed)).toInt()
}

public fun RegisterDeviceWithLocalManagement(alreadyregistered: Long): HRESULT {
    return Win32DynamicFfi.invoke("mdmlocalmanagement.dll", "RegisterDeviceWithLocalManagement", longArrayOf(alreadyregistered)).toInt()
}

public fun RegisterDeviceWithManagement(pszupn: PCWSTR, ppszmdmserviceuri: PCWSTR, ppzsaccesstoken: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("mdmregistration.dll", "RegisterDeviceWithManagement", longArrayOf(pszupn, ppszmdmserviceuri, ppzsaccesstoken)).toInt()
}

public fun RegisterDeviceWithManagementUsingAADCredentials(usertoken: HANDLE): HRESULT {
    return Win32DynamicFfi.invoke("mdmregistration.dll", "RegisterDeviceWithManagementUsingAADCredentials", longArrayOf(usertoken)).toInt()
}

public fun RegisterDeviceWithManagementUsingAADDeviceCredentials(): HRESULT {
    return Win32DynamicFfi.invoke("mdmregistration.dll", "RegisterDeviceWithManagementUsingAADDeviceCredentials", longArrayOf()).toInt()
}

public fun RegisterDeviceWithManagementUsingAADDeviceCredentials2(mdmapplicationid: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("mdmregistration.dll", "RegisterDeviceWithManagementUsingAADDeviceCredentials2", longArrayOf(mdmapplicationid)).toInt()
}

public fun SetDeviceManagementConfigInfo(providerid: PCWSTR, configstring: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("mdmregistration.dll", "SetDeviceManagementConfigInfo", longArrayOf(providerid, configstring)).toInt()
}

public fun SetManagedExternally(ismanagedexternally: BOOL): HRESULT {
    return Win32DynamicFfi.invoke("mdmregistration.dll", "SetManagedExternally", longArrayOf(ismanagedexternally.toLong())).toInt()
}

public fun UnregisterDeviceWithLocalManagement(): HRESULT {
    return Win32DynamicFfi.invoke("mdmlocalmanagement.dll", "UnregisterDeviceWithLocalManagement", longArrayOf()).toInt()
}

public fun UnregisterDeviceWithManagement(enrollmentid: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("mdmregistration.dll", "UnregisterDeviceWithManagement", longArrayOf(enrollmentid)).toInt()
}
