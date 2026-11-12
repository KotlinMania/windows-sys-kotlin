@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private val windowsWin32NetworkmanagementWebdavNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun davAddConnection(connectionhandle: MutPtr, remotename: Pcwstr, username: Pcwstr, password: Pcwstr, clientcert: ConstPtr, certsize: UInt): UInt =
    if (windowsWin32NetworkmanagementWebdavNapiAddon != null) (windowsWin32NetworkmanagementWebdavNapiAddon.windowssysWindowsWin32NetworkmanagementWebdavDavAddConnection(connectionhandle.rawAddress.toString(), remotename.rawAddress.toString(), username.rawAddress.toString(), password.rawAddress.toString(), clientcert.rawAddress.toString(), certsize.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun davCancelConnectionsToServer(lpname: Pcwstr, fforce: Bool): UInt =
    if (windowsWin32NetworkmanagementWebdavNapiAddon != null) (windowsWin32NetworkmanagementWebdavNapiAddon.windowssysWindowsWin32NetworkmanagementWebdavDavCancelConnectionsToServer(lpname.rawAddress.toString(), fforce) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun davDeleteConnection(connectionhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWebdavNapiAddon != null) (windowsWin32NetworkmanagementWebdavNapiAddon.windowssysWindowsWin32NetworkmanagementWebdavDavDeleteConnection(connectionhandle.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun davFlushFile(hfile: Handle): UInt =
    if (windowsWin32NetworkmanagementWebdavNapiAddon != null) (windowsWin32NetworkmanagementWebdavNapiAddon.windowssysWindowsWin32NetworkmanagementWebdavDavFlushFile(hfile.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun davGetExtendedError(hfile: Handle, exterror: MutPtr, exterrorstring: Pwstr, cchsize: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWebdavNapiAddon != null) (windowsWin32NetworkmanagementWebdavNapiAddon.windowssysWindowsWin32NetworkmanagementWebdavDavGetExtendedError(hfile.rawAddress.toString(), exterror.rawAddress.toString(), exterrorstring.rawAddress.toString(), cchsize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun davGetHTTPFromUNCPath(uncpath: Pcwstr, url: Pwstr, lpsize: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWebdavNapiAddon != null) (windowsWin32NetworkmanagementWebdavNapiAddon.windowssysWindowsWin32NetworkmanagementWebdavDavGetHTTPFromUNCPath(uncpath.rawAddress.toString(), url.rawAddress.toString(), lpsize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun davGetTheLockOwnerOfTheFile(filename: Pcwstr, lockownername: Pwstr, lockownernamelengthinbytes: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWebdavNapiAddon != null) (windowsWin32NetworkmanagementWebdavNapiAddon.windowssysWindowsWin32NetworkmanagementWebdavDavGetTheLockOwnerOfTheFile(filename.rawAddress.toString(), lockownername.rawAddress.toString(), lockownernamelengthinbytes.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun davGetUNCFromHTTPPath(url: Pcwstr, uncpath: Pwstr, lpsize: MutPtr): UInt =
    if (windowsWin32NetworkmanagementWebdavNapiAddon != null) (windowsWin32NetworkmanagementWebdavNapiAddon.windowssysWindowsWin32NetworkmanagementWebdavDavGetUNCFromHTTPPath(url.rawAddress.toString(), uncpath.rawAddress.toString(), lpsize.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun davInvalidateCache(urlname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementWebdavNapiAddon != null) (windowsWin32NetworkmanagementWebdavNapiAddon.windowssysWindowsWin32NetworkmanagementWebdavDavInvalidateCache(urlname.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun davRegisterAuthCallback(callback: Pfndavauthcallback, version: UInt): UInt =
    if (windowsWin32NetworkmanagementWebdavNapiAddon != null) (windowsWin32NetworkmanagementWebdavNapiAddon.windowssysWindowsWin32NetworkmanagementWebdavDavRegisterAuthCallback(0L.toString(), version.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun davUnregisterAuthCallback(hcallback: UInt) {
    if (windowsWin32NetworkmanagementWebdavNapiAddon != null) {
        windowsWin32NetworkmanagementWebdavNapiAddon.windowssysWindowsWin32NetworkmanagementWebdavDavUnregisterAuthCallback(hcallback.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
