package io.github.kotlinmania.windowssys.windows.win32.security.isolation

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.Psid

public expect fun createAppContainerProfile(pszappcontainername: Pcwstr, pszdisplayname: Pcwstr, pszdescription: Pcwstr, pcapabilities: COpaquePointer?, dwcapabilitycount: UInt, ppsidappcontainersid: COpaquePointer?): Hresult

public expect fun deleteAppContainerProfile(pszappcontainername: Pcwstr): Hresult

public expect fun deriveAppContainerSidFromAppContainerName(pszappcontainername: Pcwstr, ppsidappcontainersid: COpaquePointer?): Hresult

public expect fun deriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(psidappcontainersid: Psid, pszrestrictedappcontainername: Pcwstr, ppsidrestrictedappcontainersid: COpaquePointer?): Hresult

public expect fun getAppContainerFolderPath(pszappcontainersid: Pcwstr, ppszpath: COpaquePointer?): Hresult

public expect fun getAppContainerNamedObjectPath(token: Handle, appcontainersid: Psid, objectpathlength: UInt, objectpath: Pwstr, returnlength: COpaquePointer?): Bool

public expect fun getAppContainerRegistryLocation(desiredaccess: UInt, phappcontainerkey: COpaquePointer?): Hresult

public expect fun isCrossIsolatedEnvironmentClipboardContent(iscrossisolatedenvironmentclipboardcontent: COpaquePointer?): Hresult

public expect fun isProcessInIsolatedContainer(isprocessinisolatedcontainer: COpaquePointer?): Hresult

public expect fun isProcessInIsolatedWindowsEnvironment(isprocessinisolatedwindowsenvironment: COpaquePointer?): Hresult

public expect fun isProcessInWDAGContainer(reserved: COpaquePointer?, isprocessinwdagcontainer: COpaquePointer?): Hresult
