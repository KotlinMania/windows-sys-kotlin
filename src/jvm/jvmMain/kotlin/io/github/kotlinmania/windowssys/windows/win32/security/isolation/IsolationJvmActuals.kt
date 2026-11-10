@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.isolation

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

private object WindowsWin32SecurityIsolationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_isolation_createAppContainerProfile(pszappcontainername: Long, pszdisplayname: Long, pszdescription: Long, pcapabilities: Long, dwcapabilitycount: Int, ppsidappcontainersid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_isolation_deleteAppContainerProfile(pszappcontainername: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_isolation_deriveAppContainerSidFromAppContainerName(pszappcontainername: Long, ppsidappcontainersid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_isolation_deriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(psidappcontainersid: Long, pszrestrictedappcontainername: Long, ppsidrestrictedappcontainersid: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_isolation_getAppContainerFolderPath(pszappcontainersid: Long, ppszpath: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_isolation_getAppContainerNamedObjectPath(token: Long, appcontainersid: Long, objectpathlength: Int, objectpath: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_isolation_getAppContainerRegistryLocation(desiredaccess: Int, phappcontainerkey: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_isolation_isCrossIsolatedEnvironmentClipboardContent(iscrossisolatedenvironmentclipboardcontent: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_isolation_isProcessInIsolatedContainer(isprocessinisolatedcontainer: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_isolation_isProcessInIsolatedWindowsEnvironment(isprocessinisolatedwindowsenvironment: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_isolation_isProcessInWDAGContainer(reserved: Long, isprocessinwdagcontainer: Long): Int
}

public actual fun createAppContainerProfile(pszappcontainername: Pcwstr, pszdisplayname: Pcwstr, pszdescription: Pcwstr, pcapabilities: COpaquePointer?, dwcapabilitycount: UInt, ppsidappcontainersid: COpaquePointer?): Hresult =
    WindowsWin32SecurityIsolationJniBridge.windowssys_windows_win32_security_isolation_createAppContainerProfile((pszappcontainername?.value ?: 0L), (pszdisplayname?.value ?: 0L), (pszdescription?.value ?: 0L), (pcapabilities?.value ?: 0L), dwcapabilitycount.toInt(), (ppsidappcontainersid?.value ?: 0L))

public actual fun deleteAppContainerProfile(pszappcontainername: Pcwstr): Hresult =
    WindowsWin32SecurityIsolationJniBridge.windowssys_windows_win32_security_isolation_deleteAppContainerProfile((pszappcontainername?.value ?: 0L))

public actual fun deriveAppContainerSidFromAppContainerName(pszappcontainername: Pcwstr, ppsidappcontainersid: COpaquePointer?): Hresult =
    WindowsWin32SecurityIsolationJniBridge.windowssys_windows_win32_security_isolation_deriveAppContainerSidFromAppContainerName((pszappcontainername?.value ?: 0L), (ppsidappcontainersid?.value ?: 0L))

public actual fun deriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(psidappcontainersid: Psid, pszrestrictedappcontainername: Pcwstr, ppsidrestrictedappcontainersid: COpaquePointer?): Hresult =
    WindowsWin32SecurityIsolationJniBridge.windowssys_windows_win32_security_isolation_deriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName((psidappcontainersid?.value ?: 0L), (pszrestrictedappcontainername?.value ?: 0L), (ppsidrestrictedappcontainersid?.value ?: 0L))

public actual fun getAppContainerFolderPath(pszappcontainersid: Pcwstr, ppszpath: COpaquePointer?): Hresult =
    WindowsWin32SecurityIsolationJniBridge.windowssys_windows_win32_security_isolation_getAppContainerFolderPath((pszappcontainersid?.value ?: 0L), (ppszpath?.value ?: 0L))

public actual fun getAppContainerNamedObjectPath(token: Handle, appcontainersid: Psid, objectpathlength: UInt, objectpath: Pwstr, returnlength: COpaquePointer?): Bool =
    WindowsWin32SecurityIsolationJniBridge.windowssys_windows_win32_security_isolation_getAppContainerNamedObjectPath((token?.value ?: 0L), (appcontainersid?.value ?: 0L), objectpathlength.toInt(), (objectpath?.value ?: 0L), (returnlength?.value ?: 0L))

public actual fun getAppContainerRegistryLocation(desiredaccess: UInt, phappcontainerkey: COpaquePointer?): Hresult =
    WindowsWin32SecurityIsolationJniBridge.windowssys_windows_win32_security_isolation_getAppContainerRegistryLocation(desiredaccess.toInt(), (phappcontainerkey?.value ?: 0L))

public actual fun isCrossIsolatedEnvironmentClipboardContent(iscrossisolatedenvironmentclipboardcontent: COpaquePointer?): Hresult =
    WindowsWin32SecurityIsolationJniBridge.windowssys_windows_win32_security_isolation_isCrossIsolatedEnvironmentClipboardContent((iscrossisolatedenvironmentclipboardcontent?.value ?: 0L))

public actual fun isProcessInIsolatedContainer(isprocessinisolatedcontainer: COpaquePointer?): Hresult =
    WindowsWin32SecurityIsolationJniBridge.windowssys_windows_win32_security_isolation_isProcessInIsolatedContainer((isprocessinisolatedcontainer?.value ?: 0L))

public actual fun isProcessInIsolatedWindowsEnvironment(isprocessinisolatedwindowsenvironment: COpaquePointer?): Hresult =
    WindowsWin32SecurityIsolationJniBridge.windowssys_windows_win32_security_isolation_isProcessInIsolatedWindowsEnvironment((isprocessinisolatedwindowsenvironment?.value ?: 0L))

public actual fun isProcessInWDAGContainer(reserved: COpaquePointer?, isprocessinwdagcontainer: COpaquePointer?): Hresult =
    WindowsWin32SecurityIsolationJniBridge.windowssys_windows_win32_security_isolation_isProcessInWDAGContainer((reserved?.value ?: 0L), (isprocessinwdagcontainer?.value ?: 0L))
