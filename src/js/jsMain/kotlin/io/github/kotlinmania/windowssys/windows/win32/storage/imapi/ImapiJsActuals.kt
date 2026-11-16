@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.imapi

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpallocatebuffer
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpallocatemore
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpfreebuffer

private val windowsWin32StorageImapiNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun closeIMsgSession(lpmsgsess: Lpmsgsess) {
    if (windowsWin32StorageImapiNapiAddon != null) {
        windowsWin32StorageImapiNapiAddon.windowssysWindowsWin32StorageImapiCloseIMsgSession(lpmsgsess.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getAttribIMsgOnIStg(lpobject: MutPtr, lpproptagarray: MutPtr, lpppropattrarray: MutPtr): Hresult =
    if (windowsWin32StorageImapiNapiAddon != null) (windowsWin32StorageImapiNapiAddon.windowssysWindowsWin32StorageImapiGetAttribIMsgOnIStg(lpobject.rawAddress.toString(), lpproptagarray.rawAddress.toString(), lpppropattrarray.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapStorageSCode(stgscode: Int): Int =
    if (windowsWin32StorageImapiNapiAddon != null) (windowsWin32StorageImapiNapiAddon.windowssysWindowsWin32StorageImapiMapStorageSCode(stgscode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openIMsgOnIStg(lpmsgsess: Lpmsgsess, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpmalloc: MutPtr, lpmapisup: MutPtr, lpstg: MutPtr, lpfmsgcallrelease: MutPtr, ulcallerdata: UInt, ulflags: UInt, lppmsg: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openIMsgSession(lpmalloc: MutPtr, ulflags: UInt, lppmsgsess: MutPtr): Int =
    if (windowsWin32StorageImapiNapiAddon != null) (windowsWin32StorageImapiNapiAddon.windowssysWindowsWin32StorageImapiOpenIMsgSession(lpmalloc.rawAddress.toString(), ulflags.toInt(), lppmsgsess.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setAttribIMsgOnIStg(lpobject: MutPtr, lpproptags: MutPtr, lppropattrs: MutPtr, lpppropproblems: MutPtr): Hresult =
    if (windowsWin32StorageImapiNapiAddon != null) (windowsWin32StorageImapiNapiAddon.windowssysWindowsWin32StorageImapiSetAttribIMsgOnIStg(lpobject.rawAddress.toString(), lpproptags.rawAddress.toString(), lppropattrs.rawAddress.toString(), lpppropproblems.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
