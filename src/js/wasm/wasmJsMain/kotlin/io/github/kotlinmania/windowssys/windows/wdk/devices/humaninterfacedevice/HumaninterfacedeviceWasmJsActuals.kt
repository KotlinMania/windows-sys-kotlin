@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.devices.humaninterfacedevice

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWdkDevicesHumaninterfacedeviceNapiAddon(): Boolean

private val windowsWdkDevicesHumaninterfacedeviceNapiAvailable: Boolean = initWindowsWdkDevicesHumaninterfacedeviceNapiAddon()

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkDevicesHumaninterfacedeviceVhfAsyncOperationComplete(p0, p1)")
private external fun wasmWindowssysWindowsWdkDevicesHumaninterfacedeviceVhfAsyncOperationComplete(p0: String, p1: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkDevicesHumaninterfacedeviceVhfCreate(p0, p1)")
private external fun wasmWindowssysWindowsWdkDevicesHumaninterfacedeviceVhfCreate(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkDevicesHumaninterfacedeviceVhfDelete(p0, p1)")
private external fun wasmWindowssysWindowsWdkDevicesHumaninterfacedeviceVhfDelete(p0: String, p1: Boolean)

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkDevicesHumaninterfacedeviceVhfReadReportSubmit(p0, p1)")
private external fun wasmWindowssysWindowsWdkDevicesHumaninterfacedeviceVhfReadReportSubmit(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkDevicesHumaninterfacedeviceVhfStart(p0)")
private external fun wasmWindowssysWindowsWdkDevicesHumaninterfacedeviceVhfStart(p0: String): Int

public actual fun vhfAsyncOperationComplete(vhfoperationhandle: ConstPtr, completionstatus: Ntstatus): Ntstatus =
    if (windowsWdkDevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWdkDevicesHumaninterfacedeviceVhfAsyncOperationComplete(vhfoperationhandle.rawAddress.toString(), completionstatus) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vhfCreate(vhfconfig: ConstPtr, vhfhandle: MutPtr): Ntstatus =
    if (windowsWdkDevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWdkDevicesHumaninterfacedeviceVhfCreate(vhfconfig.rawAddress.toString(), vhfhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vhfDelete(vhfhandle: ConstPtr, wait: Boolean) {
    if (windowsWdkDevicesHumaninterfacedeviceNapiAvailable) {
        wasmWindowssysWindowsWdkDevicesHumaninterfacedeviceVhfDelete(vhfhandle.rawAddress.toString(), wait)
    } else {
        throw UnsupportedOperationException("Native FFI addon is not available")
    }
}

public actual fun vhfReadReportSubmit(vhfhandle: ConstPtr, hidtransferpacket: ConstPtr): Ntstatus =
    if (windowsWdkDevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWdkDevicesHumaninterfacedeviceVhfReadReportSubmit(vhfhandle.rawAddress.toString(), hidtransferpacket.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun vhfStart(vhfhandle: ConstPtr): Ntstatus =
    if (windowsWdkDevicesHumaninterfacedeviceNapiAvailable) wasmWindowssysWindowsWdkDevicesHumaninterfacedeviceVhfStart(vhfhandle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
