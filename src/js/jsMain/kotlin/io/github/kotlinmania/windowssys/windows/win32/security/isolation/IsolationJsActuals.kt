@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.isolation

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.PSID

private val _windowsWin32SecurityIsolationNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun CreateAppContainerProfile(pszappcontainername: PCWSTR, pszdisplayname: PCWSTR, pszdescription: PCWSTR, pcapabilities: Long, dwcapabilitycount: UInt, ppsidappcontainersid: Long): HRESULT =
    if (_windowsWin32SecurityIsolationNapiAddon != null) (_windowsWin32SecurityIsolationNapiAddon.windowssys_windows_win32_security_isolation_CreateAppContainerProfile(pszappcontainername.toString(), pszdisplayname.toString(), pszdescription.toString(), pcapabilities.toString(), dwcapabilitycount.toInt(), ppsidappcontainersid.toString()) as Int) else 0

public actual fun DeleteAppContainerProfile(pszappcontainername: PCWSTR): HRESULT =
    if (_windowsWin32SecurityIsolationNapiAddon != null) (_windowsWin32SecurityIsolationNapiAddon.windowssys_windows_win32_security_isolation_DeleteAppContainerProfile(pszappcontainername.toString()) as Int) else 0

public actual fun DeriveAppContainerSidFromAppContainerName(pszappcontainername: PCWSTR, ppsidappcontainersid: Long): HRESULT =
    if (_windowsWin32SecurityIsolationNapiAddon != null) (_windowsWin32SecurityIsolationNapiAddon.windowssys_windows_win32_security_isolation_DeriveAppContainerSidFromAppContainerName(pszappcontainername.toString(), ppsidappcontainersid.toString()) as Int) else 0

public actual fun DeriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(psidappcontainersid: PSID, pszrestrictedappcontainername: PCWSTR, ppsidrestrictedappcontainersid: Long): HRESULT =
    if (_windowsWin32SecurityIsolationNapiAddon != null) (_windowsWin32SecurityIsolationNapiAddon.windowssys_windows_win32_security_isolation_DeriveRestrictedAppContainerSidFromAppContainerSidAndRestrictedName(psidappcontainersid.toString(), pszrestrictedappcontainername.toString(), ppsidrestrictedappcontainersid.toString()) as Int) else 0

public actual fun GetAppContainerFolderPath(pszappcontainersid: PCWSTR, ppszpath: Long): HRESULT =
    if (_windowsWin32SecurityIsolationNapiAddon != null) (_windowsWin32SecurityIsolationNapiAddon.windowssys_windows_win32_security_isolation_GetAppContainerFolderPath(pszappcontainersid.toString(), ppszpath.toString()) as Int) else 0

public actual fun GetAppContainerNamedObjectPath(token: HANDLE, appcontainersid: PSID, objectpathlength: UInt, objectpath: PWSTR, returnlength: Long): BOOL =
    if (_windowsWin32SecurityIsolationNapiAddon != null) (_windowsWin32SecurityIsolationNapiAddon.windowssys_windows_win32_security_isolation_GetAppContainerNamedObjectPath(token.toString(), appcontainersid.toString(), objectpathlength.toInt(), objectpath.toString(), returnlength.toString()) as Int) else 0

public actual fun GetAppContainerRegistryLocation(desiredaccess: UInt, phappcontainerkey: Long): HRESULT =
    if (_windowsWin32SecurityIsolationNapiAddon != null) (_windowsWin32SecurityIsolationNapiAddon.windowssys_windows_win32_security_isolation_GetAppContainerRegistryLocation(desiredaccess.toInt(), phappcontainerkey.toString()) as Int) else 0

public actual fun IsCrossIsolatedEnvironmentClipboardContent(iscrossisolatedenvironmentclipboardcontent: Long): HRESULT =
    if (_windowsWin32SecurityIsolationNapiAddon != null) (_windowsWin32SecurityIsolationNapiAddon.windowssys_windows_win32_security_isolation_IsCrossIsolatedEnvironmentClipboardContent(iscrossisolatedenvironmentclipboardcontent.toString()) as Int) else 0

public actual fun IsProcessInIsolatedContainer(isprocessinisolatedcontainer: Long): HRESULT =
    if (_windowsWin32SecurityIsolationNapiAddon != null) (_windowsWin32SecurityIsolationNapiAddon.windowssys_windows_win32_security_isolation_IsProcessInIsolatedContainer(isprocessinisolatedcontainer.toString()) as Int) else 0

public actual fun IsProcessInIsolatedWindowsEnvironment(isprocessinisolatedwindowsenvironment: Long): HRESULT =
    if (_windowsWin32SecurityIsolationNapiAddon != null) (_windowsWin32SecurityIsolationNapiAddon.windowssys_windows_win32_security_isolation_IsProcessInIsolatedWindowsEnvironment(isprocessinisolatedwindowsenvironment.toString()) as Int) else 0

public actual fun IsProcessInWDAGContainer(reserved: Long, isprocessinwdagcontainer: Long): HRESULT =
    if (_windowsWin32SecurityIsolationNapiAddon != null) (_windowsWin32SecurityIsolationNapiAddon.windowssys_windows_win32_security_isolation_IsProcessInWDAGContainer(reserved.toString(), isprocessinwdagcontainer.toString()) as Int) else 0
