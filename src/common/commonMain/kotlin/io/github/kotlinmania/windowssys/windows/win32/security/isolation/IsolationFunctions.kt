package io.github.kotlinmania.windowssys.windows.win32.security.isolation

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.security.PSID

public fun CreateAppContainerProfile(pszappcontainername: PCWSTR, pszdisplayname: PCWSTR, pszdescription: PCWSTR, pcapabilities: Long, dwcapabilitycount: UInt, ppsidappcontainersid: Long): HRESULT {
    return Win32DynamicFfi.invoke("userenv.dll", "CreateAppContainerProfile", longArrayOf(pszappcontainername, pszdisplayname, pszdescription, pcapabilities, dwcapabilitycount.toLong(), ppsidappcontainersid)).toInt()
}

public fun DeleteAppContainerProfile(pszappcontainername: PCWSTR): HRESULT {
    return Win32DynamicFfi.invoke("userenv.dll", "DeleteAppContainerProfile", longArrayOf(pszappcontainername)).toInt()
}

public fun DeriveAppContainerSidFromAppContainerName(pszappcontainername: PCWSTR, ppsidappcontainersid: Long): HRESULT {
    return Win32DynamicFfi.invoke("userenv.dll", "DeriveAppContainerSidFromAppContainerName", longArrayOf(pszappcontainername, ppsidappcontainersid)).toInt()
}

public fun DeriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(psidappcontainersid: PSID, pszrestrictedappcontainername: PCWSTR, ppsidrestrictedappcontainersid: Long): HRESULT {
    return Win32DynamicFfi.invoke("userenv.dll", "DeriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName", longArrayOf(psidappcontainersid, pszrestrictedappcontainername, ppsidrestrictedappcontainersid)).toInt()
}

public fun GetAppContainerFolderPath(pszappcontainersid: PCWSTR, ppszpath: Long): HRESULT {
    return Win32DynamicFfi.invoke("userenv.dll", "GetAppContainerFolderPath", longArrayOf(pszappcontainersid, ppszpath)).toInt()
}

public fun GetAppContainerNamedObjectPath(token: Foundation.HANDLE, appcontainersid: PSID, objectpathlength: UInt, objectpath: PWSTR, returnlength: Long): BOOL {
    return Win32DynamicFfi.invoke("kernel32.dll", "GetAppContainerNamedObjectPath", longArrayOf(Win32DynamicFfi.objectSlot(token), appcontainersid, objectpathlength.toLong(), objectpath, returnlength)).toInt()
}

public fun GetAppContainerRegistryLocation(desiredaccess: UInt, phappcontainerkey: Long): HRESULT {
    return Win32DynamicFfi.invoke("userenv.dll", "GetAppContainerRegistryLocation", longArrayOf(desiredaccess.toLong(), phappcontainerkey)).toInt()
}

public fun IsCrossIsolatedEnvironmentClipboardContent(iscrossisolatedenvironmentclipboardcontent: Long): HRESULT {
    return Win32DynamicFfi.invoke("isolatedwindowsenvironmentutils.dll", "IsCrossIsolatedEnvironmentClipboardContent", longArrayOf(iscrossisolatedenvironmentclipboardcontent)).toInt()
}

public fun IsProcessInIsolatedContainer(isprocessinisolatedcontainer: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-security-isolatedcontainer-l1-1-0.dll", "IsProcessInIsolatedContainer", longArrayOf(isprocessinisolatedcontainer)).toInt()
}

public fun IsProcessInIsolatedWindowsEnvironment(isprocessinisolatedwindowsenvironment: Long): HRESULT {
    return Win32DynamicFfi.invoke("isolatedwindowsenvironmentutils.dll", "IsProcessInIsolatedWindowsEnvironment", longArrayOf(isprocessinisolatedwindowsenvironment)).toInt()
}

public fun IsProcessInWDAGContainer(reserved: Long, isprocessinwdagcontainer: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-security-isolatedcontainer-l1-1-1.dll", "IsProcessInWDAGContainer", longArrayOf(reserved, isprocessinwdagcontainer)).toInt()
}
