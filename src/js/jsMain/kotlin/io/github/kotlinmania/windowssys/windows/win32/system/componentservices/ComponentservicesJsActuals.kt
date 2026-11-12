@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.componentservices

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.system.com.Apttype

private val windowsWin32SystemComponentservicesNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun coCreateActivity(piunknown: MutPtr<CVoid>, riid: ConstPtr<Guid>, ppobj: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComponentservicesNapiAddon != null) (windowsWin32SystemComponentservicesNapiAddon.windowssysWindowsWin32SystemComponentservicesCoCreateActivity(piunknown.rawAddress.toString(), riid.rawAddress.toString(), ppobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coEnterServiceDomain(pconfigobject: MutPtr<CVoid>): Hresult =
    if (windowsWin32SystemComponentservicesNapiAddon != null) (windowsWin32SystemComponentservicesNapiAddon.windowssysWindowsWin32SystemComponentservicesCoEnterServiceDomain(pconfigobject.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coGetDefaultContext(apttype: Apttype, riid: ConstPtr<Guid>, ppv: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComponentservicesNapiAddon != null) (windowsWin32SystemComponentservicesNapiAddon.windowssysWindowsWin32SystemComponentservicesCoGetDefaultContext(apttype, riid.rawAddress.toString(), ppv.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun coLeaveServiceDomain(punkstatus: MutPtr<CVoid>) {
    if (windowsWin32SystemComponentservicesNapiAddon != null) {
        windowsWin32SystemComponentservicesNapiAddon.windowssysWindowsWin32SystemComponentservicesCoLeaveServiceDomain(punkstatus.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun getDispenserManager(param0: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComponentservicesNapiAddon != null) (windowsWin32SystemComponentservicesNapiAddon.windowssysWindowsWin32SystemComponentservicesGetDispenserManager(param0.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getManagedExtensions(dwexts: MutPtr<UInt>): Hresult =
    if (windowsWin32SystemComponentservicesNapiAddon != null) (windowsWin32SystemComponentservicesNapiAddon.windowssysWindowsWin32SystemComponentservicesGetManagedExtensions(dwexts.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun mTSCreateActivity(riid: ConstPtr<Guid>, ppobj: MutPtr<MutPtr<CVoid>>): Hresult =
    if (windowsWin32SystemComponentservicesNapiAddon != null) (windowsWin32SystemComponentservicesNapiAddon.windowssysWindowsWin32SystemComponentservicesMTSCreateActivity(riid.rawAddress.toString(), ppobj.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun recycleSurrogate(lreasoncode: Int): Hresult =
    if (windowsWin32SystemComponentservicesNapiAddon != null) (windowsWin32SystemComponentservicesNapiAddon.windowssysWindowsWin32SystemComponentservicesRecycleSurrogate(lreasoncode) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun safeRef(rid: ConstPtr<Guid>, punk: MutPtr<CVoid>): MutPtr<CVoid> =
    if (windowsWin32SystemComponentservicesNapiAddon != null) MutPtr((windowsWin32SystemComponentservicesNapiAddon.windowssysWindowsWin32SystemComponentservicesSafeRef(rid.rawAddress.toString(), punk.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")
