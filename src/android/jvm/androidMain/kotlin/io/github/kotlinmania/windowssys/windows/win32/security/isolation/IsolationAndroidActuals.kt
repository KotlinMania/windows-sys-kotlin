@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.isolation

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.SidAndAttributes
import io.github.kotlinmania.windowssys.windows.win32.system.registry.Hkey

private object WindowsWin32SecurityIsolationJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32SecurityIsolationCreateAppContainerProfile(pszappcontainername: Long, pszdisplayname: Long, pszdescription: Long, pcapabilities: Long, dwcapabilitycount: Int, ppsidappcontainersid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityIsolationDeleteAppContainerProfile(pszappcontainername: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityIsolationDeriveAppContainerSidFromAppContainerName(pszappcontainername: Long, ppsidappcontainersid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityIsolationDeriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(psidappcontainersid: Long, pszrestrictedappcontainername: Long, ppsidrestrictedappcontainersid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityIsolationGetAppContainerFolderPath(pszappcontainersid: Long, ppszpath: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityIsolationGetAppContainerNamedObjectPath(token: Long, appcontainersid: Long, objectpathlength: Int, objectpath: Long, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityIsolationGetAppContainerRegistryLocation(desiredaccess: Int, phappcontainerkey: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityIsolationIsCrossIsolatedEnvironmentClipboardContent(iscrossisolatedenvironmentclipboardcontent: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityIsolationIsProcessInIsolatedContainer(isprocessinisolatedcontainer: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityIsolationIsProcessInIsolatedWindowsEnvironment(isprocessinisolatedwindowsenvironment: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityIsolationIsProcessInWDAGContainer(reserved: Long, isprocessinwdagcontainer: Long): Int
}

public actual fun createAppContainerProfile(pszappcontainername: Pcwstr, pszdisplayname: Pcwstr, pszdescription: Pcwstr, pcapabilities: ConstPtr<SidAndAttributes>, dwcapabilitycount: UInt, ppsidappcontainersid: MutPtr<Psid>): Hresult =
    WindowsWin32SecurityIsolationJniBridge.windowssysWindowsWin32SecurityIsolationCreateAppContainerProfile(pszappcontainername.rawAddress, pszdisplayname.rawAddress, pszdescription.rawAddress, pcapabilities.rawAddress, dwcapabilitycount.toInt(), ppsidappcontainersid.rawAddress)

public actual fun deleteAppContainerProfile(pszappcontainername: Pcwstr): Hresult =
    WindowsWin32SecurityIsolationJniBridge.windowssysWindowsWin32SecurityIsolationDeleteAppContainerProfile(pszappcontainername.rawAddress)

public actual fun deriveAppContainerSidFromAppContainerName(pszappcontainername: Pcwstr, ppsidappcontainersid: MutPtr<Psid>): Hresult =
    WindowsWin32SecurityIsolationJniBridge.windowssysWindowsWin32SecurityIsolationDeriveAppContainerSidFromAppContainerName(pszappcontainername.rawAddress, ppsidappcontainersid.rawAddress)

public actual fun deriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(psidappcontainersid: Psid, pszrestrictedappcontainername: Pcwstr, ppsidrestrictedappcontainersid: MutPtr<Psid>): Hresult =
    WindowsWin32SecurityIsolationJniBridge.windowssysWindowsWin32SecurityIsolationDeriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(psidappcontainersid.rawAddress, pszrestrictedappcontainername.rawAddress, ppsidrestrictedappcontainersid.rawAddress)

public actual fun getAppContainerFolderPath(pszappcontainersid: Pcwstr, ppszpath: MutPtr<Pwstr>): Hresult =
    WindowsWin32SecurityIsolationJniBridge.windowssysWindowsWin32SecurityIsolationGetAppContainerFolderPath(pszappcontainersid.rawAddress, ppszpath.rawAddress)

public actual fun getAppContainerNamedObjectPath(token: Handle, appcontainersid: Psid, objectpathlength: UInt, objectpath: Pwstr, returnlength: MutPtr<UInt>): Bool =
    WindowsWin32SecurityIsolationJniBridge.windowssysWindowsWin32SecurityIsolationGetAppContainerNamedObjectPath(token.rawAddress, appcontainersid.rawAddress, objectpathlength.toInt(), objectpath.rawAddress, returnlength.rawAddress)

public actual fun getAppContainerRegistryLocation(desiredaccess: UInt, phappcontainerkey: MutPtr<Hkey>): Hresult =
    WindowsWin32SecurityIsolationJniBridge.windowssysWindowsWin32SecurityIsolationGetAppContainerRegistryLocation(desiredaccess.toInt(), phappcontainerkey.rawAddress)

public actual fun isCrossIsolatedEnvironmentClipboardContent(iscrossisolatedenvironmentclipboardcontent: MutPtr<Bool>): Hresult =
    WindowsWin32SecurityIsolationJniBridge.windowssysWindowsWin32SecurityIsolationIsCrossIsolatedEnvironmentClipboardContent(iscrossisolatedenvironmentclipboardcontent.rawAddress)

public actual fun isProcessInIsolatedContainer(isprocessinisolatedcontainer: MutPtr<Bool>): Hresult =
    WindowsWin32SecurityIsolationJniBridge.windowssysWindowsWin32SecurityIsolationIsProcessInIsolatedContainer(isprocessinisolatedcontainer.rawAddress)

public actual fun isProcessInIsolatedWindowsEnvironment(isprocessinisolatedwindowsenvironment: MutPtr<Bool>): Hresult =
    WindowsWin32SecurityIsolationJniBridge.windowssysWindowsWin32SecurityIsolationIsProcessInIsolatedWindowsEnvironment(isprocessinisolatedwindowsenvironment.rawAddress)

public actual fun isProcessInWDAGContainer(reserved: ConstPtr<CVoid>, isprocessinwdagcontainer: MutPtr<Bool>): Hresult =
    WindowsWin32SecurityIsolationJniBridge.windowssysWindowsWin32SecurityIsolationIsProcessInWDAGContainer(reserved.rawAddress, isprocessinwdagcontainer.rawAddress)
