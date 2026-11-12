@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.networkmanagement.webdav

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32NetworkmanagementWebdavNapiAddon(): Boolean

private val windowsWin32NetworkmanagementWebdavNapiAvailable: Boolean = initWindowsWin32NetworkmanagementWebdavNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWebdavDavAddConnection(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWebdavDavAddConnection(p0: String, p1: String, p2: String, p3: String, p4: String, p5: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWebdavDavCancelConnectionsToServer(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWebdavDavCancelConnectionsToServer(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWebdavDavDeleteConnection(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWebdavDavDeleteConnection(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWebdavDavFlushFile(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWebdavDavFlushFile(p0: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWebdavDavGetExtendedError(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWebdavDavGetExtendedError(p0: String, p1: String, p2: String, p3: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWebdavDavGetHTTPFromUNCPath(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWebdavDavGetHTTPFromUNCPath(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWebdavDavGetTheLockOwnerOfTheFile(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWebdavDavGetTheLockOwnerOfTheFile(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWebdavDavGetUNCFromHTTPPath(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWebdavDavGetUNCFromHTTPPath(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWebdavDavInvalidateCache(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWebdavDavInvalidateCache(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWebdavDavRegisterAuthCallback(p0, p1)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWebdavDavRegisterAuthCallback(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32NetworkmanagementWebdavDavUnregisterAuthCallback(p0)")
private external fun wasmWindowssysWindowsWin32NetworkmanagementWebdavDavUnregisterAuthCallback(p0: Int)

public actual fun davAddConnection(connectionhandle: MutPtr<Handle>, remotename: Pcwstr, username: Pcwstr, password: Pcwstr, clientcert: ConstPtr<UByte>, certsize: UInt): UInt =
    if (windowsWin32NetworkmanagementWebdavNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWebdavDavAddConnection(connectionhandle.rawAddress.toString(), remotename.rawAddress.toString(), username.rawAddress.toString(), password.rawAddress.toString(), clientcert.rawAddress.toString(), certsize.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun davCancelConnectionsToServer(lpname: Pcwstr, fforce: Bool): UInt =
    if (windowsWin32NetworkmanagementWebdavNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWebdavDavCancelConnectionsToServer(lpname.rawAddress.toString(), fforce).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun davDeleteConnection(connectionhandle: Handle): UInt =
    if (windowsWin32NetworkmanagementWebdavNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWebdavDavDeleteConnection(connectionhandle.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun davFlushFile(hfile: Handle): UInt =
    if (windowsWin32NetworkmanagementWebdavNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWebdavDavFlushFile(hfile.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun davGetExtendedError(hfile: Handle, exterror: MutPtr<UInt>, exterrorstring: Pwstr, cchsize: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWebdavNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWebdavDavGetExtendedError(hfile.rawAddress.toString(), exterror.rawAddress.toString(), exterrorstring.rawAddress.toString(), cchsize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun davGetHTTPFromUNCPath(uncpath: Pcwstr, url: Pwstr, lpsize: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWebdavNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWebdavDavGetHTTPFromUNCPath(uncpath.rawAddress.toString(), url.rawAddress.toString(), lpsize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun davGetTheLockOwnerOfTheFile(filename: Pcwstr, lockownername: Pwstr, lockownernamelengthinbytes: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWebdavNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWebdavDavGetTheLockOwnerOfTheFile(filename.rawAddress.toString(), lockownername.rawAddress.toString(), lockownernamelengthinbytes.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun davGetUNCFromHTTPPath(url: Pcwstr, uncpath: Pwstr, lpsize: MutPtr<UInt>): UInt =
    if (windowsWin32NetworkmanagementWebdavNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWebdavDavGetUNCFromHTTPPath(url.rawAddress.toString(), uncpath.rawAddress.toString(), lpsize.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun davInvalidateCache(urlname: Pcwstr): UInt =
    if (windowsWin32NetworkmanagementWebdavNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWebdavDavInvalidateCache(urlname.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun davRegisterAuthCallback(callback: Pfndavauthcallback, version: UInt): UInt =
    if (windowsWin32NetworkmanagementWebdavNapiAvailable) wasmWindowssysWindowsWin32NetworkmanagementWebdavDavRegisterAuthCallback(0L.toString(), version.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun davUnregisterAuthCallback(hcallback: UInt) {
    if (windowsWin32NetworkmanagementWebdavNapiAvailable) {
        wasmWindowssysWindowsWin32NetworkmanagementWebdavDavUnregisterAuthCallback(hcallback.toInt())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
