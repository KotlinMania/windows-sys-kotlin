@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWin32DevicesEnumerationPnpNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun swDeviceClose(hswdevice: Hswdevice) {
    if (windowsWin32DevicesEnumerationPnpNapiAddon != null) {
        windowsWin32DevicesEnumerationPnpNapiAddon.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceClose(hswdevice.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun swDeviceCreate(pszenumeratorname: Pcwstr, pszparentdeviceinstance: Pcwstr, pcreateinfo: ConstPtr<SwDeviceCreateInfo>, cpropertycount: UInt, pproperties: ConstPtr<Devproperty>, pcallback: SwDeviceCreateCallback, pcontext: ConstPtr<CVoid>, phswdevice: MutPtr<Hswdevice>): Hresult =
    if (windowsWin32DevicesEnumerationPnpNapiAddon != null) (windowsWin32DevicesEnumerationPnpNapiAddon.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceCreate(pszenumeratorname.rawAddress.toString(), pszparentdeviceinstance.rawAddress.toString(), pcreateinfo.rawAddress.toString(), cpropertycount.toInt(), pproperties.rawAddress.toString(), 0L.toString(), pcontext.rawAddress.toString(), phswdevice.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swDeviceGetLifetime(hswdevice: Hswdevice, plifetime: MutPtr<SwDeviceLifetime>): Hresult =
    if (windowsWin32DevicesEnumerationPnpNapiAddon != null) (windowsWin32DevicesEnumerationPnpNapiAddon.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceGetLifetime(hswdevice.rawAddress.toString(), plifetime.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swDeviceInterfacePropertySet(hswdevice: Hswdevice, pszdeviceinterfaceid: Pcwstr, cpropertycount: UInt, pproperties: ConstPtr<Devproperty>): Hresult =
    if (windowsWin32DevicesEnumerationPnpNapiAddon != null) (windowsWin32DevicesEnumerationPnpNapiAddon.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfacePropertySet(hswdevice.rawAddress.toString(), pszdeviceinterfaceid.rawAddress.toString(), cpropertycount.toInt(), pproperties.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swDeviceInterfaceRegister(hswdevice: Hswdevice, pinterfaceclassguid: ConstPtr<Guid>, pszreferencestring: Pcwstr, cpropertycount: UInt, pproperties: ConstPtr<Devproperty>, fenabled: Bool, ppszdeviceinterfaceid: MutPtr<Pwstr>): Hresult =
    if (windowsWin32DevicesEnumerationPnpNapiAddon != null) (windowsWin32DevicesEnumerationPnpNapiAddon.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfaceRegister(hswdevice.rawAddress.toString(), pinterfaceclassguid.rawAddress.toString(), pszreferencestring.rawAddress.toString(), cpropertycount.toInt(), pproperties.rawAddress.toString(), fenabled, ppszdeviceinterfaceid.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swDeviceInterfaceSetState(hswdevice: Hswdevice, pszdeviceinterfaceid: Pcwstr, fenabled: Bool): Hresult =
    if (windowsWin32DevicesEnumerationPnpNapiAddon != null) (windowsWin32DevicesEnumerationPnpNapiAddon.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceInterfaceSetState(hswdevice.rawAddress.toString(), pszdeviceinterfaceid.rawAddress.toString(), fenabled) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swDevicePropertySet(hswdevice: Hswdevice, cpropertycount: UInt, pproperties: ConstPtr<Devproperty>): Hresult =
    if (windowsWin32DevicesEnumerationPnpNapiAddon != null) (windowsWin32DevicesEnumerationPnpNapiAddon.windowssysWindowsWin32DevicesEnumerationPnpSwDevicePropertySet(hswdevice.rawAddress.toString(), cpropertycount.toInt(), pproperties.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swDeviceSetLifetime(hswdevice: Hswdevice, lifetime: SwDeviceLifetime): Hresult =
    if (windowsWin32DevicesEnumerationPnpNapiAddon != null) (windowsWin32DevicesEnumerationPnpNapiAddon.windowssysWindowsWin32DevicesEnumerationPnpSwDeviceSetLifetime(hswdevice.rawAddress.toString(), lifetime) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun swMemFree(pmem: ConstPtr<CVoid>) {
    if (windowsWin32DevicesEnumerationPnpNapiAddon != null) {
        windowsWin32DevicesEnumerationPnpNapiAddon.windowssysWindowsWin32DevicesEnumerationPnpSwMemFree(pmem.rawAddress.toString())
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}
