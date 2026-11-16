package io.github.kotlinmania.windowssys.windows.win32.security.isolation

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

public expect fun createAppContainerProfile(pszappcontainername: Pcwstr, pszdisplayname: Pcwstr, pszdescription: Pcwstr, pcapabilities: ConstPtr, dwcapabilitycount: UInt, ppsidappcontainersid: MutPtr): Hresult

public expect fun deleteAppContainerProfile(pszappcontainername: Pcwstr): Hresult

public expect fun deriveAppContainerSidFromAppContainerName(pszappcontainername: Pcwstr, ppsidappcontainersid: MutPtr): Hresult

public expect fun deriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(psidappcontainersid: Psid, pszrestrictedappcontainername: Pcwstr, ppsidrestrictedappcontainersid: MutPtr): Hresult

public expect fun getAppContainerFolderPath(pszappcontainersid: Pcwstr, ppszpath: MutPtr): Hresult

public expect fun getAppContainerNamedObjectPath(token: Handle, appcontainersid: Psid, objectpathlength: UInt, objectpath: Pwstr, returnlength: MutPtr): Bool

public expect fun getAppContainerRegistryLocation(desiredaccess: UInt, phappcontainerkey: MutPtr): Hresult

public expect fun isCrossIsolatedEnvironmentClipboardContent(iscrossisolatedenvironmentclipboardcontent: MutPtr): Hresult

public expect fun isProcessInIsolatedContainer(isprocessinisolatedcontainer: MutPtr): Hresult

public expect fun isProcessInIsolatedWindowsEnvironment(isprocessinisolatedwindowsenvironment: MutPtr): Hresult

public expect fun isProcessInWDAGContainer(reserved: ConstPtr, isprocessinwdagcontainer: MutPtr): Hresult
