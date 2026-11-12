@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWdkSystemSysteminformationNapiAddon(): Boolean

private val windowsWdkSystemSysteminformationNapiAvailable: Boolean = initWindowsWdkSystemSysteminformationNapiAddon()

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSysteminformationNtQuerySystemInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSysteminformationNtQuerySystemInformation(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSysteminformationNtQuerySystemTime(p0)")
private external fun wasmWindowssysWindowsWdkSystemSysteminformationNtQuerySystemTime(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSysteminformationNtQueryTimerResolution(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSysteminformationNtQueryTimerResolution(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSysteminformationZwQuerySystemInformation(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWdkSystemSysteminformationZwQuerySystemInformation(p0: Int, p1: String, p2: Int, p3: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSysteminformationZwQuerySystemTime(p0)")
private external fun wasmWindowssysWindowsWdkSystemSysteminformationZwQuerySystemTime(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemSysteminformationZwQueryTimerResolution(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemSysteminformationZwQueryTimerResolution(p0: String, p1: String, p2: String): Int

public actual fun ntQuerySystemInformation(systeminformationclass: SystemInformationClass, systeminformation: MutPtr<CVoid>, systeminformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSysteminformationNapiAvailable) wasmWindowssysWindowsWdkSystemSysteminformationNtQuerySystemInformation(systeminformationclass, systeminformation.rawAddress.toString(), systeminformationlength.toInt(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQuerySystemTime(systemtime: MutPtr<Long>): Ntstatus =
    if (windowsWdkSystemSysteminformationNapiAvailable) wasmWindowssysWindowsWdkSystemSysteminformationNtQuerySystemTime(systemtime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryTimerResolution(maximumtime: MutPtr<UInt>, minimumtime: MutPtr<UInt>, currenttime: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSysteminformationNapiAvailable) wasmWindowssysWindowsWdkSystemSysteminformationNtQueryTimerResolution(maximumtime.rawAddress.toString(), minimumtime.rawAddress.toString(), currenttime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQuerySystemInformation(systeminformationclass: SystemInformationClass, systeminformation: MutPtr<CVoid>, systeminformationlength: UInt, returnlength: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSysteminformationNapiAvailable) wasmWindowssysWindowsWdkSystemSysteminformationZwQuerySystemInformation(systeminformationclass, systeminformation.rawAddress.toString(), systeminformationlength.toInt(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQuerySystemTime(systemtime: MutPtr<Long>): Ntstatus =
    if (windowsWdkSystemSysteminformationNapiAvailable) wasmWindowssysWindowsWdkSystemSysteminformationZwQuerySystemTime(systemtime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwQueryTimerResolution(maximumtime: MutPtr<UInt>, minimumtime: MutPtr<UInt>, currenttime: MutPtr<UInt>): Ntstatus =
    if (windowsWdkSystemSysteminformationNapiAvailable) wasmWindowssysWindowsWdkSystemSysteminformationZwQueryTimerResolution(maximumtime.rawAddress.toString(), minimumtime.rawAddress.toString(), currenttime.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
