@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE

private val _windowsWin32NetworkmanagementWebdavNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun DavAddConnection(connectionhandle: Long, remotename: PCWSTR, username: PCWSTR, password: PCWSTR, clientcert: Long, certsize: UInt): UInt =
    if (_windowsWin32NetworkmanagementWebdavNapiAddon != null) (_windowsWin32NetworkmanagementWebdavNapiAddon.windowssys_windows_win32_networkmanagement_webdav_DavAddConnection(connectionhandle.toString(), remotename.toString(), username.toString(), password.toString(), clientcert.toString(), certsize.toInt()) as Int).toUInt() else 0u

public actual fun DavCancelConnectionsToServer(lpname: PCWSTR, fforce: BOOL): UInt =
    if (_windowsWin32NetworkmanagementWebdavNapiAddon != null) (_windowsWin32NetworkmanagementWebdavNapiAddon.windowssys_windows_win32_networkmanagement_webdav_DavCancelConnectionsToServer(lpname.toString(), fforce) as Int).toUInt() else 0u

public actual fun DavDeleteConnection(connectionhandle: HANDLE): UInt =
    if (_windowsWin32NetworkmanagementWebdavNapiAddon != null) (_windowsWin32NetworkmanagementWebdavNapiAddon.windowssys_windows_win32_networkmanagement_webdav_DavDeleteConnection(connectionhandle.toString()) as Int).toUInt() else 0u

public actual fun DavFlushFile(hfile: HANDLE): UInt =
    if (_windowsWin32NetworkmanagementWebdavNapiAddon != null) (_windowsWin32NetworkmanagementWebdavNapiAddon.windowssys_windows_win32_networkmanagement_webdav_DavFlushFile(hfile.toString()) as Int).toUInt() else 0u

public actual fun DavGetExtendedError(hfile: HANDLE, exterror: Long, exterrorstring: PWSTR, cchsize: Long): UInt =
    if (_windowsWin32NetworkmanagementWebdavNapiAddon != null) (_windowsWin32NetworkmanagementWebdavNapiAddon.windowssys_windows_win32_networkmanagement_webdav_DavGetExtendedError(hfile.toString(), exterror.toString(), exterrorstring.toString(), cchsize.toString()) as Int).toUInt() else 0u

public actual fun DavGetHTTPFromUNCPath(uncpath: PCWSTR, url: PWSTR, lpsize: Long): UInt =
    if (_windowsWin32NetworkmanagementWebdavNapiAddon != null) (_windowsWin32NetworkmanagementWebdavNapiAddon.windowssys_windows_win32_networkmanagement_webdav_DavGetHTTPFromUNCPath(uncpath.toString(), url.toString(), lpsize.toString()) as Int).toUInt() else 0u

public actual fun DavGetTheLockOwnerOfTheFile(filename: PCWSTR, lockownername: PWSTR, lockownernamelengthinbytes: Long): UInt =
    if (_windowsWin32NetworkmanagementWebdavNapiAddon != null) (_windowsWin32NetworkmanagementWebdavNapiAddon.windowssys_windows_win32_networkmanagement_webdav_DavGetTheLockOwnerOfTheFile(filename.toString(), lockownername.toString(), lockownernamelengthinbytes.toString()) as Int).toUInt() else 0u

public actual fun DavGetUNCFromHTTPPath(url: PCWSTR, uncpath: PWSTR, lpsize: Long): UInt =
    if (_windowsWin32NetworkmanagementWebdavNapiAddon != null) (_windowsWin32NetworkmanagementWebdavNapiAddon.windowssys_windows_win32_networkmanagement_webdav_DavGetUNCFromHTTPPath(url.toString(), uncpath.toString(), lpsize.toString()) as Int).toUInt() else 0u

public actual fun DavInvalidateCache(urlname: PCWSTR): UInt =
    if (_windowsWin32NetworkmanagementWebdavNapiAddon != null) (_windowsWin32NetworkmanagementWebdavNapiAddon.windowssys_windows_win32_networkmanagement_webdav_DavInvalidateCache(urlname.toString()) as Int).toUInt() else 0u

public actual fun DavRegisterAuthCallback(callback: PFNDAVAUTHCALLBACK, version: UInt): UInt =
    if (_windowsWin32NetworkmanagementWebdavNapiAddon != null) (_windowsWin32NetworkmanagementWebdavNapiAddon.windowssys_windows_win32_networkmanagement_webdav_DavRegisterAuthCallback(callback.toLong().toString(), version.toInt()) as Int).toUInt() else 0u

public actual fun DavUnregisterAuthCallback(hcallback: UInt) {
    if (_windowsWin32NetworkmanagementWebdavNapiAddon != null) {
        _windowsWin32NetworkmanagementWebdavNapiAddon.windowssys_windows_win32_networkmanagement_webdav_DavUnregisterAuthCallback(hcallback.toInt())
    }
}
