@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.isolation

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.PSID
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun CreateAppContainerProfile(pszappcontainername: PCWSTR, pszdisplayname: PCWSTR, pszdescription: PCWSTR, pcapabilities: Long, dwcapabilitycount: UInt, ppsidappcontainersid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssys_windows_win32_security_isolation_CreateAppContainerProfile(pszappcontainername.toCPointer<ByteVar>(), pszdisplayname.toCPointer<ByteVar>(), pszdescription.toCPointer<ByteVar>(), pcapabilities.toCPointer<ByteVar>(), dwcapabilitycount, ppsidappcontainersid.toCPointer<ByteVar>())

public actual fun DeleteAppContainerProfile(pszappcontainername: PCWSTR): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssys_windows_win32_security_isolation_DeleteAppContainerProfile(pszappcontainername.toCPointer<ByteVar>())

public actual fun DeriveAppContainerSidFromAppContainerName(pszappcontainername: PCWSTR, ppsidappcontainersid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssys_windows_win32_security_isolation_DeriveAppContainerSidFromAppContainerName(pszappcontainername.toCPointer<ByteVar>(), ppsidappcontainersid.toCPointer<ByteVar>())

public actual fun DeriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(psidappcontainersid: PSID, pszrestrictedappcontainername: PCWSTR, ppsidrestrictedappcontainersid: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssys_windows_win32_security_isolation_DeriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(psidappcontainersid.toCPointer<ByteVar>(), pszrestrictedappcontainername.toCPointer<ByteVar>(), ppsidrestrictedappcontainersid.toCPointer<ByteVar>())

public actual fun GetAppContainerFolderPath(pszappcontainersid: PCWSTR, ppszpath: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssys_windows_win32_security_isolation_GetAppContainerFolderPath(pszappcontainersid.toCPointer<ByteVar>(), ppszpath.toCPointer<ByteVar>())

public actual fun GetAppContainerNamedObjectPath(token: HANDLE, appcontainersid: PSID, objectpathlength: UInt, objectpath: PWSTR, returnlength: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssys_windows_win32_security_isolation_GetAppContainerNamedObjectPath(token.toCPointer<ByteVar>(), appcontainersid.toCPointer<ByteVar>(), objectpathlength, objectpath.toCPointer<ByteVar>(), returnlength.toCPointer<ByteVar>())

public actual fun GetAppContainerRegistryLocation(desiredaccess: UInt, phappcontainerkey: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssys_windows_win32_security_isolation_GetAppContainerRegistryLocation(desiredaccess, phappcontainerkey.toCPointer<ByteVar>())

public actual fun IsCrossIsolatedEnvironmentClipboardContent(iscrossisolatedenvironmentclipboardcontent: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssys_windows_win32_security_isolation_IsCrossIsolatedEnvironmentClipboardContent(iscrossisolatedenvironmentclipboardcontent.toCPointer<ByteVar>())

public actual fun IsProcessInIsolatedContainer(isprocessinisolatedcontainer: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssys_windows_win32_security_isolation_IsProcessInIsolatedContainer(isprocessinisolatedcontainer.toCPointer<ByteVar>())

public actual fun IsProcessInIsolatedWindowsEnvironment(isprocessinisolatedwindowsenvironment: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssys_windows_win32_security_isolation_IsProcessInIsolatedWindowsEnvironment(isprocessinisolatedwindowsenvironment.toCPointer<ByteVar>())

public actual fun IsProcessInWDAGContainer(reserved: Long, isprocessinwdagcontainer: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssys_windows_win32_security_isolation_IsProcessInWDAGContainer(reserved.toCPointer<ByteVar>(), isprocessinwdagcontainer.toCPointer<ByteVar>())
