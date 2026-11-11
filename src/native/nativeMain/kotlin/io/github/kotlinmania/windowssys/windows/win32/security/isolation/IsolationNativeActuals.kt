@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.isolation

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.Psid
import io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssys_windows_win32_security_isolation_createAppContainerProfile
import io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssys_windows_win32_security_isolation_deleteAppContainerProfile
import io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssys_windows_win32_security_isolation_deriveAppContainerSidFromAppContainerName
import io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssys_windows_win32_security_isolation_deriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName
import io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssys_windows_win32_security_isolation_getAppContainerFolderPath
import io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssys_windows_win32_security_isolation_getAppContainerNamedObjectPath
import io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssys_windows_win32_security_isolation_getAppContainerRegistryLocation
import io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssys_windows_win32_security_isolation_isCrossIsolatedEnvironmentClipboardContent
import io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssys_windows_win32_security_isolation_isProcessInIsolatedContainer
import io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssys_windows_win32_security_isolation_isProcessInIsolatedWindowsEnvironment
import io.github.kotlinmania.windowssys.windows.win32.security.isolation.cinterop.windowssys_windows_win32_security_isolation_isProcessInWDAGContainer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun createAppContainerProfile(pszappcontainername: Pcwstr, pszdisplayname: Pcwstr, pszdescription: Pcwstr, pcapabilities: COpaquePointer?, dwcapabilitycount: UInt, ppsidappcontainersid: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_isolation_createAppContainerProfile(pszappcontainername?.value?.toCPointer<ByteVar>(), pszdisplayname?.value?.toCPointer<ByteVar>(), pszdescription?.value?.toCPointer<ByteVar>(), pcapabilities?.value?.toCPointer<ByteVar>(), dwcapabilitycount, ppsidappcontainersid?.value?.toCPointer<ByteVar>())

public actual fun deleteAppContainerProfile(pszappcontainername: Pcwstr): Hresult =
    windowssys_windows_win32_security_isolation_deleteAppContainerProfile(pszappcontainername?.value?.toCPointer<ByteVar>())

public actual fun deriveAppContainerSidFromAppContainerName(pszappcontainername: Pcwstr, ppsidappcontainersid: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_isolation_deriveAppContainerSidFromAppContainerName(pszappcontainername?.value?.toCPointer<ByteVar>(), ppsidappcontainersid?.value?.toCPointer<ByteVar>())

public actual fun deriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(psidappcontainersid: Psid, pszrestrictedappcontainername: Pcwstr, ppsidrestrictedappcontainersid: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_isolation_deriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(psidappcontainersid?.value?.toCPointer<ByteVar>(), pszrestrictedappcontainername?.value?.toCPointer<ByteVar>(), ppsidrestrictedappcontainersid?.value?.toCPointer<ByteVar>())

public actual fun getAppContainerFolderPath(pszappcontainersid: Pcwstr, ppszpath: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_isolation_getAppContainerFolderPath(pszappcontainersid?.value?.toCPointer<ByteVar>(), ppszpath?.value?.toCPointer<ByteVar>())

public actual fun getAppContainerNamedObjectPath(token: Handle, appcontainersid: Psid, objectpathlength: UInt, objectpath: Pwstr, returnlength: COpaquePointer?): Bool =
    windowssys_windows_win32_security_isolation_getAppContainerNamedObjectPath(token?.value?.toCPointer<ByteVar>(), appcontainersid?.value?.toCPointer<ByteVar>(), objectpathlength, objectpath?.value?.toCPointer<ByteVar>(), returnlength?.value?.toCPointer<ByteVar>())

public actual fun getAppContainerRegistryLocation(desiredaccess: UInt, phappcontainerkey: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_isolation_getAppContainerRegistryLocation(desiredaccess, phappcontainerkey?.value?.toCPointer<ByteVar>())

public actual fun isCrossIsolatedEnvironmentClipboardContent(iscrossisolatedenvironmentclipboardcontent: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_isolation_isCrossIsolatedEnvironmentClipboardContent(iscrossisolatedenvironmentclipboardcontent?.value?.toCPointer<ByteVar>())

public actual fun isProcessInIsolatedContainer(isprocessinisolatedcontainer: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_isolation_isProcessInIsolatedContainer(isprocessinisolatedcontainer?.value?.toCPointer<ByteVar>())

public actual fun isProcessInIsolatedWindowsEnvironment(isprocessinisolatedwindowsenvironment: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_isolation_isProcessInIsolatedWindowsEnvironment(isprocessinisolatedwindowsenvironment?.value?.toCPointer<ByteVar>())

public actual fun isProcessInWDAGContainer(reserved: COpaquePointer?, isprocessinwdagcontainer: COpaquePointer?): Hresult =
    windowssys_windows_win32_security_isolation_isProcessInWDAGContainer(reserved?.value?.toCPointer<ByteVar>(), isprocessinwdagcontainer?.value?.toCPointer<ByteVar>())
