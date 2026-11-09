@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.isolation

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.PSID

public actual fun CreateAppContainerProfile(pszappcontainername: PCWSTR, pszdisplayname: PCWSTR, pszdescription: PCWSTR, pcapabilities: Long, dwcapabilitycount: UInt, ppsidappcontainersid: Long): HRESULT =
    0

public actual fun DeleteAppContainerProfile(pszappcontainername: PCWSTR): HRESULT =
    0

public actual fun DeriveAppContainerSidFromAppContainerName(pszappcontainername: PCWSTR, ppsidappcontainersid: Long): HRESULT =
    0

public actual fun DeriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(psidappcontainersid: PSID, pszrestrictedappcontainername: PCWSTR, ppsidrestrictedappcontainersid: Long): HRESULT =
    0

public actual fun GetAppContainerFolderPath(pszappcontainersid: PCWSTR, ppszpath: Long): HRESULT =
    0

public actual fun GetAppContainerNamedObjectPath(token: HANDLE, appcontainersid: PSID, objectpathlength: UInt, objectpath: PWSTR, returnlength: Long): BOOL =
    0

public actual fun GetAppContainerRegistryLocation(desiredaccess: UInt, phappcontainerkey: Long): HRESULT =
    0

public actual fun IsCrossIsolatedEnvironmentClipboardContent(iscrossisolatedenvironmentclipboardcontent: Long): HRESULT =
    0

public actual fun IsProcessInIsolatedContainer(isprocessinisolatedcontainer: Long): HRESULT =
    0

public actual fun IsProcessInIsolatedWindowsEnvironment(isprocessinisolatedwindowsenvironment: Long): HRESULT =
    0

public actual fun IsProcessInWDAGContainer(reserved: Long, isprocessinwdagcontainer: Long): HRESULT =
    0
