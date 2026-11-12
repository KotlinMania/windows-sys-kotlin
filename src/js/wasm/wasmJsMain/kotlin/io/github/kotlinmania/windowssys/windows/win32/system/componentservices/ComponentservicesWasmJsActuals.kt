@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.componentservices

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.system.com.Apttype

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemComponentservicesNapiAddon(): Boolean

private val windowsWin32SystemComponentservicesNapiAvailable: Boolean = initWindowsWin32SystemComponentservicesNapiAddon()

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComponentservicesCoCreateActivity(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComponentservicesCoCreateActivity(p0: String, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComponentservicesCoEnterServiceDomain(p0)")
private external fun wasmWindowssysWindowsWin32SystemComponentservicesCoEnterServiceDomain(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComponentservicesCoGetDefaultContext(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemComponentservicesCoGetDefaultContext(p0: Int, p1: String, p2: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComponentservicesCoLeaveServiceDomain(p0)")
private external fun wasmWindowssysWindowsWin32SystemComponentservicesCoLeaveServiceDomain(p0: String)

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComponentservicesGetDispenserManager(p0)")
private external fun wasmWindowssysWindowsWin32SystemComponentservicesGetDispenserManager(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComponentservicesGetManagedExtensions(p0)")
private external fun wasmWindowssysWindowsWin32SystemComponentservicesGetManagedExtensions(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComponentservicesMTSCreateActivity(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComponentservicesMTSCreateActivity(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComponentservicesRecycleSurrogate(p0)")
private external fun wasmWindowssysWindowsWin32SystemComponentservicesRecycleSurrogate(p0: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemComponentservicesSafeRef(p0, p1)")
private external fun wasmWindowssysWindowsWin32SystemComponentservicesSafeRef(p0: String, p1: String): String

public actual fun coCreateActivity(piunknown: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppobj: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComponentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemComponentservicesCoCreateActivity(piunknown.rawAddress.toString(), riid.rawAddress.toString(), ppobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coEnterServiceDomain(pconfigobject: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemComponentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemComponentservicesCoEnterServiceDomain(pconfigobject.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetDefaultContext(apttype: Apttype, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComponentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemComponentservicesCoGetDefaultContext(apttype, riid.rawAddress.toString(), ppv.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coLeaveServiceDomain(punkstatus: MutPtr<CVoid>) {
    if (windowsWin32SystemComponentservicesNapiAvailable) {
        wasmWindowssysWindowsWin32SystemComponentservicesCoLeaveServiceDomain(punkstatus.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getDispenserManager(param0: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComponentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemComponentservicesGetDispenserManager(param0.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getManagedExtensions(dwexts: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComponentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemComponentservicesGetManagedExtensions(dwexts.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mTSCreateActivity(riid: ConstPtr<Guid>, ppobj: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComponentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemComponentservicesMTSCreateActivity(riid.rawAddress.toString(), ppobj.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recycleSurrogate(lreasoncode: Int): Hresult =
    if (windowsWin32SystemComponentservicesNapiAvailable) wasmWindowssysWindowsWin32SystemComponentservicesRecycleSurrogate(lreasoncode) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeRef(rid: ConstPtr<Guid>, punk: MutPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWin32SystemComponentservicesNapiAvailable) MutPtr(wasmWindowssysWindowsWin32SystemComponentservicesSafeRef(rid.rawAddress.toString(), punk.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
