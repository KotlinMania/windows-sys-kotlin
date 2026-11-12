@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.devices.enumeration.pnp

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Guid
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.devices.properties.Devproperty

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32DevicesEnumerationPnpNapiAddon(): Boolean

private val windowsWin32DevicesEnumerationPnpNapiAvailable: Boolean = initWindowsWin32DevicesEnumerationPnpNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceClose(p0)")
private external fun wasmWindowssysWindowsWin32DevicesEnumerationPnpSwDeviceClose(p0: String)

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceCreate(p0, p1, p2, p3, p4, p5, p6, p7)")
private external fun wasmWindowssysWindowsWin32DevicesEnumerationPnpSwDeviceCreate(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: String, p6: String, p7: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceGetLifetime(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesEnumerationPnpSwDeviceGetLifetime(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfacePropertySet(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfacePropertySet(p0: String, p1: String, p2: Int, p3: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfaceRegister(p0, p1, p2, p3, p4, p5, p6)")
private external fun wasmWindowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfaceRegister(p0: String, p1: String, p2: String, p3: Int, p4: String, p5: Int, p6: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfaceSetState(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfaceSetState(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesEnumerationPnpSwDevicePropertySet(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32DevicesEnumerationPnpSwDevicePropertySet(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceSetLifetime(p0, p1)")
private external fun wasmWindowssysWindowsWin32DevicesEnumerationPnpSwDeviceSetLifetime(p0: String, p1: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32DevicesEnumerationPnpSwMemFree(p0)")
private external fun wasmWindowssysWindowsWin32DevicesEnumerationPnpSwMemFree(p0: String)

public actual fun swDeviceClose(hswdevice: Hswdevice) {
    if (windowsWin32DevicesEnumerationPnpNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesEnumerationPnpSwDeviceClose(hswdevice.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun swDeviceCreate(pszenumeratorname: Pcwstr, pszparentdeviceinstance: Pcwstr, pcreateinfo: ConstPtr<SwDeviceCreateInfo>, cpropertycount: UInt, pproperties: ConstPtr<Devproperty>, pcallback: SwDeviceCreateCallback, pcontext: ConstPtr<CVoid>, phswdevice: MutPtr<Hswdevice>): Hresult =
    if (windowsWin32DevicesEnumerationPnpNapiAvailable) wasmWindowssysWindowsWin32DevicesEnumerationPnpSwDeviceCreate(pszenumeratorname.rawAddress.toString(), pszparentdeviceinstance.rawAddress.toString(), pcreateinfo.rawAddress.toString(), cpropertycount.toInt(), pproperties.rawAddress.toString(), 0L.toString(), pcontext.rawAddress.toString(), phswdevice.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swDeviceGetLifetime(hswdevice: Hswdevice, plifetime: MutPtr<SwDeviceLifetime>): Hresult =
    if (windowsWin32DevicesEnumerationPnpNapiAvailable) wasmWindowssysWindowsWin32DevicesEnumerationPnpSwDeviceGetLifetime(hswdevice.rawAddress.toString(), plifetime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swDeviceInterfacePropertySet(hswdevice: Hswdevice, pszdeviceinterfaceid: Pcwstr, cpropertycount: UInt, pproperties: ConstPtr<Devproperty>): Hresult =
    if (windowsWin32DevicesEnumerationPnpNapiAvailable) wasmWindowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfacePropertySet(hswdevice.rawAddress.toString(), pszdeviceinterfaceid.rawAddress.toString(), cpropertycount.toInt(), pproperties.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swDeviceInterfaceRegister(hswdevice: Hswdevice, pinterfaceclassguid: ConstPtr<Guid>, pszreferencestring: Pcwstr, cpropertycount: UInt, pproperties: ConstPtr<Devproperty>, fenabled: Bool, ppszdeviceinterfaceid: MutPtr<Pwstr>): Hresult =
    if (windowsWin32DevicesEnumerationPnpNapiAvailable) wasmWindowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfaceRegister(hswdevice.rawAddress.toString(), pinterfaceclassguid.rawAddress.toString(), pszreferencestring.rawAddress.toString(), cpropertycount.toInt(), pproperties.rawAddress.toString(), fenabled, ppszdeviceinterfaceid.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swDeviceInterfaceSetState(hswdevice: Hswdevice, pszdeviceinterfaceid: Pcwstr, fenabled: Bool): Hresult =
    if (windowsWin32DevicesEnumerationPnpNapiAvailable) wasmWindowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfaceSetState(hswdevice.rawAddress.toString(), pszdeviceinterfaceid.rawAddress.toString(), fenabled) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swDevicePropertySet(hswdevice: Hswdevice, cpropertycount: UInt, pproperties: ConstPtr<Devproperty>): Hresult =
    if (windowsWin32DevicesEnumerationPnpNapiAvailable) wasmWindowssysWindowsWin32DevicesEnumerationPnpSwDevicePropertySet(hswdevice.rawAddress.toString(), cpropertycount.toInt(), pproperties.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swDeviceSetLifetime(hswdevice: Hswdevice, lifetime: SwDeviceLifetime): Hresult =
    if (windowsWin32DevicesEnumerationPnpNapiAvailable) wasmWindowssysWindowsWin32DevicesEnumerationPnpSwDeviceSetLifetime(hswdevice.rawAddress.toString(), lifetime) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swMemFree(pmem: ConstPtr<CVoid>) {
    if (windowsWin32DevicesEnumerationPnpNapiAvailable) {
        wasmWindowssysWindowsWin32DevicesEnumerationPnpSwMemFree(pmem.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
