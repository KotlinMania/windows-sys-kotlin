@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.isolation

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.PSID

private object WindowsWin32SecurityIsolationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_isolation_CreateAppContainerProfile(pszappcontainername: Long, pszdisplayname: Long, pszdescription: Long, pcapabilities: Long, dwcapabilitycount: Int, ppsidappcontainersid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_isolation_DeleteAppContainerProfile(pszappcontainername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_isolation_DeriveAppContainerSidFromAppContainerName(pszappcontainername: Long, ppsidappcontainersid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_isolation_DeriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(psidappcontainersid: Long, pszrestrictedappcontainername: Long, ppsidrestrictedappcontainersid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_isolation_GetAppContainerFolderPath(pszappcontainersid: Long, ppszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_isolation_GetAppContainerNamedObjectPath(token: Long, appcontainersid: Long, objectpathlength: Int, objectpath: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_isolation_GetAppContainerRegistryLocation(desiredaccess: Int, phappcontainerkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_isolation_IsCrossIsolatedEnvironmentClipboardContent(iscrossisolatedenvironmentclipboardcontent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_isolation_IsProcessInIsolatedContainer(isprocessinisolatedcontainer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_isolation_IsProcessInIsolatedWindowsEnvironment(isprocessinisolatedwindowsenvironment: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_isolation_IsProcessInWDAGContainer(reserved: Long, isprocessinwdagcontainer: Long): Int
}

public actual fun CreateAppContainerProfile(pszappcontainername: PCWSTR, pszdisplayname: PCWSTR, pszdescription: PCWSTR, pcapabilities: Long, dwcapabilitycount: UInt, ppsidappcontainersid: Long): HRESULT =
    WindowsWin32SecurityIsolationJniBridge.windowssys_windows_win32_security_isolation_CreateAppContainerProfile(pszappcontainername, pszdisplayname, pszdescription, pcapabilities, dwcapabilitycount.toInt(), ppsidappcontainersid)

public actual fun DeleteAppContainerProfile(pszappcontainername: PCWSTR): HRESULT =
    WindowsWin32SecurityIsolationJniBridge.windowssys_windows_win32_security_isolation_DeleteAppContainerProfile(pszappcontainername)

public actual fun DeriveAppContainerSidFromAppContainerName(pszappcontainername: PCWSTR, ppsidappcontainersid: Long): HRESULT =
    WindowsWin32SecurityIsolationJniBridge.windowssys_windows_win32_security_isolation_DeriveAppContainerSidFromAppContainerName(pszappcontainername, ppsidappcontainersid)

public actual fun DeriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(psidappcontainersid: PSID, pszrestrictedappcontainername: PCWSTR, ppsidrestrictedappcontainersid: Long): HRESULT =
    WindowsWin32SecurityIsolationJniBridge.windowssys_windows_win32_security_isolation_DeriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(psidappcontainersid, pszrestrictedappcontainername, ppsidrestrictedappcontainersid)

public actual fun GetAppContainerFolderPath(pszappcontainersid: PCWSTR, ppszpath: Long): HRESULT =
    WindowsWin32SecurityIsolationJniBridge.windowssys_windows_win32_security_isolation_GetAppContainerFolderPath(pszappcontainersid, ppszpath)

public actual fun GetAppContainerNamedObjectPath(token: HANDLE, appcontainersid: PSID, objectpathlength: UInt, objectpath: PWSTR, returnlength: Long): BOOL =
    WindowsWin32SecurityIsolationJniBridge.windowssys_windows_win32_security_isolation_GetAppContainerNamedObjectPath(token, appcontainersid, objectpathlength.toInt(), objectpath, returnlength)

public actual fun GetAppContainerRegistryLocation(desiredaccess: UInt, phappcontainerkey: Long): HRESULT =
    WindowsWin32SecurityIsolationJniBridge.windowssys_windows_win32_security_isolation_GetAppContainerRegistryLocation(desiredaccess.toInt(), phappcontainerkey)

public actual fun IsCrossIsolatedEnvironmentClipboardContent(iscrossisolatedenvironmentclipboardcontent: Long): HRESULT =
    WindowsWin32SecurityIsolationJniBridge.windowssys_windows_win32_security_isolation_IsCrossIsolatedEnvironmentClipboardContent(iscrossisolatedenvironmentclipboardcontent)

public actual fun IsProcessInIsolatedContainer(isprocessinisolatedcontainer: Long): HRESULT =
    WindowsWin32SecurityIsolationJniBridge.windowssys_windows_win32_security_isolation_IsProcessInIsolatedContainer(isprocessinisolatedcontainer)

public actual fun IsProcessInIsolatedWindowsEnvironment(isprocessinisolatedwindowsenvironment: Long): HRESULT =
    WindowsWin32SecurityIsolationJniBridge.windowssys_windows_win32_security_isolation_IsProcessInIsolatedWindowsEnvironment(isprocessinisolatedwindowsenvironment)

public actual fun IsProcessInWDAGContainer(reserved: Long, isprocessinwdagcontainer: Long): HRESULT =
    WindowsWin32SecurityIsolationJniBridge.windowssys_windows_win32_security_isolation_IsProcessInWDAGContainer(reserved, isprocessinwdagcontainer)
