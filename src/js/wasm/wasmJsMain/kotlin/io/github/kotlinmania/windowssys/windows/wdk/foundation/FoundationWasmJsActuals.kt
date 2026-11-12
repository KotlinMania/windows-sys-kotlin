@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.foundation

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWdkFoundationNapiAddon(): Boolean

private val windowsWdkFoundationNapiAvailable: Boolean = initWindowsWdkFoundationNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWdkFoundationNtClose(p0)")
private external fun wasmWindowssysWindowsWdkFoundationNtClose(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWdkFoundationNtQueryObject(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWdkFoundationNtQueryObject(p0: String, p1: Int, p2: String, p3: Int, p4: String): Int

public actual fun ntClose(handle: Handle): Ntstatus =
    if (windowsWdkFoundationNapiAvailable) wasmWindowssysWindowsWdkFoundationNtClose(handle.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntQueryObject(handle: Handle, objectinformationclass: ObjectInformationClass, objectinformation: MutPtr, objectinformationlength: UInt, returnlength: MutPtr): Ntstatus =
    if (windowsWdkFoundationNapiAvailable) wasmWindowssysWindowsWdkFoundationNtQueryObject(handle.rawAddress.toString(), objectinformationclass, objectinformation.rawAddress.toString(), objectinformationlength.toInt(), returnlength.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
