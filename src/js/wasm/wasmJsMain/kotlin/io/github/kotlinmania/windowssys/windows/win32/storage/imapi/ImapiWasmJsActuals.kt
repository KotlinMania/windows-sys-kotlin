@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.imapi

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpallocatebuffer
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpallocatemore
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpfreebuffer

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32StorageImapiNapiAddon(): Boolean

private val windowsWin32StorageImapiNapiAvailable: Boolean = initWindowsWin32StorageImapiNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageImapiCloseIMsgSession(p0)")
private external fun wasmWindowssysWindowsWin32StorageImapiCloseIMsgSession(p0: String)

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageImapiGetAttribIMsgOnIStg(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageImapiGetAttribIMsgOnIStg(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageImapiMapStorageSCode(p0)")
private external fun wasmWindowssysWindowsWin32StorageImapiMapStorageSCode(p0: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageImapiOpenIMsgSession(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageImapiOpenIMsgSession(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageImapiSetAttribIMsgOnIStg(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32StorageImapiSetAttribIMsgOnIStg(p0: String, p1: String, p2: String, p3: String): Int

public actual fun closeIMsgSession(lpmsgsess: Lpmsgsess) {
    if (windowsWin32StorageImapiNapiAvailable) {
        wasmWindowssysWindowsWin32StorageImapiCloseIMsgSession(lpmsgsess.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getAttribIMsgOnIStg(lpobject: MutPtr, lpproptagarray: MutPtr, lpppropattrarray: MutPtr): Hresult =
    if (windowsWin32StorageImapiNapiAvailable) wasmWindowssysWindowsWin32StorageImapiGetAttribIMsgOnIStg(lpobject.rawAddress.toString(), lpproptagarray.rawAddress.toString(), lpppropattrarray.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mapStorageSCode(stgscode: Int): Int =
    if (windowsWin32StorageImapiNapiAvailable) wasmWindowssysWindowsWin32StorageImapiMapStorageSCode(stgscode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openIMsgOnIStg(lpmsgsess: Lpmsgsess, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpmalloc: MutPtr, lpmapisup: MutPtr, lpstg: MutPtr, lpfmsgcallrelease: MutPtr, ulcallerdata: UInt, ulflags: UInt, lppmsg: MutPtr): Int =
    throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openIMsgSession(lpmalloc: MutPtr, ulflags: UInt, lppmsgsess: MutPtr): Int =
    if (windowsWin32StorageImapiNapiAvailable) wasmWindowssysWindowsWin32StorageImapiOpenIMsgSession(lpmalloc.rawAddress.toString(), ulflags.toInt(), lppmsgsess.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setAttribIMsgOnIStg(lpobject: MutPtr, lpproptags: MutPtr, lppropattrs: MutPtr, lpppropproblems: MutPtr): Hresult =
    if (windowsWin32StorageImapiNapiAvailable) wasmWindowssysWindowsWin32StorageImapiSetAttribIMsgOnIStg(lpobject.rawAddress.toString(), lpproptags.rawAddress.toString(), lppropattrs.rawAddress.toString(), lpppropproblems.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
