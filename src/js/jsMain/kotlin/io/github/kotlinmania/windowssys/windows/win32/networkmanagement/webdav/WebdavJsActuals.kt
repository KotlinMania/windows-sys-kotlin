@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val _windowsWin32NetworkmanagementWebdavNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun davAddConnection(connectionhandle: COpaquePointer?, remotename: Pcwstr, username: Pcwstr, password: Pcwstr, clientcert: COpaquePointer?, certsize: UInt): UInt =
    if (_windowsWin32NetworkmanagementWebdavNapiAddon != null) (_windowsWin32NetworkmanagementWebdavNapiAddon.windowssys_windows_win32_networkmanagement_webdav_davAddConnection((connectionhandle?.value ?: 0L).toString(), (remotename?.value ?: 0L).toString(), (username?.value ?: 0L).toString(), (password?.value ?: 0L).toString(), (clientcert?.value ?: 0L).toString(), certsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun davCancelConnectionsToServer(lpname: Pcwstr, fforce: Bool): UInt =
    if (_windowsWin32NetworkmanagementWebdavNapiAddon != null) (_windowsWin32NetworkmanagementWebdavNapiAddon.windowssys_windows_win32_networkmanagement_webdav_davCancelConnectionsToServer((lpname?.value ?: 0L).toString(), fforce) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun davDeleteConnection(connectionhandle: Handle): UInt =
    if (_windowsWin32NetworkmanagementWebdavNapiAddon != null) (_windowsWin32NetworkmanagementWebdavNapiAddon.windowssys_windows_win32_networkmanagement_webdav_davDeleteConnection((connectionhandle?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun davFlushFile(hfile: Handle): UInt =
    if (_windowsWin32NetworkmanagementWebdavNapiAddon != null) (_windowsWin32NetworkmanagementWebdavNapiAddon.windowssys_windows_win32_networkmanagement_webdav_davFlushFile((hfile?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun davGetExtendedError(hfile: Handle, exterror: COpaquePointer?, exterrorstring: Pwstr, cchsize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWebdavNapiAddon != null) (_windowsWin32NetworkmanagementWebdavNapiAddon.windowssys_windows_win32_networkmanagement_webdav_davGetExtendedError((hfile?.value ?: 0L).toString(), (exterror?.value ?: 0L).toString(), (exterrorstring?.value ?: 0L).toString(), (cchsize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun davGetHTTPFromUNCPath(uncpath: Pcwstr, url: Pwstr, lpsize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWebdavNapiAddon != null) (_windowsWin32NetworkmanagementWebdavNapiAddon.windowssys_windows_win32_networkmanagement_webdav_davGetHTTPFromUNCPath((uncpath?.value ?: 0L).toString(), (url?.value ?: 0L).toString(), (lpsize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun davGetTheLockOwnerOfTheFile(filename: Pcwstr, lockownername: Pwstr, lockownernamelengthinbytes: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWebdavNapiAddon != null) (_windowsWin32NetworkmanagementWebdavNapiAddon.windowssys_windows_win32_networkmanagement_webdav_davGetTheLockOwnerOfTheFile((filename?.value ?: 0L).toString(), (lockownername?.value ?: 0L).toString(), (lockownernamelengthinbytes?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun davGetUNCFromHTTPPath(url: Pcwstr, uncpath: Pwstr, lpsize: COpaquePointer?): UInt =
    if (_windowsWin32NetworkmanagementWebdavNapiAddon != null) (_windowsWin32NetworkmanagementWebdavNapiAddon.windowssys_windows_win32_networkmanagement_webdav_davGetUNCFromHTTPPath((url?.value ?: 0L).toString(), (uncpath?.value ?: 0L).toString(), (lpsize?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun davInvalidateCache(urlname: Pcwstr): UInt =
    if (_windowsWin32NetworkmanagementWebdavNapiAddon != null) (_windowsWin32NetworkmanagementWebdavNapiAddon.windowssys_windows_win32_networkmanagement_webdav_davInvalidateCache((urlname?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun davRegisterAuthCallback(callback: Pfndavauthcallback, version: UInt): UInt =
    if (_windowsWin32NetworkmanagementWebdavNapiAddon != null) (_windowsWin32NetworkmanagementWebdavNapiAddon.windowssys_windows_win32_networkmanagement_webdav_davRegisterAuthCallback(0L.toString(), version.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun davUnregisterAuthCallback(hcallback: UInt) {
    if (_windowsWin32NetworkmanagementWebdavNapiAddon != null) {
        _windowsWin32NetworkmanagementWebdavNapiAddon.windowssys_windows_win32_networkmanagement_webdav_davUnregisterAuthCallback(hcallback.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
