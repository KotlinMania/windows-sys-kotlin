@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.memory

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWdkSystemMemoryNapiAddon(): Boolean

private val windowsWdkSystemMemoryNapiAvailable: Boolean = initWindowsWdkSystemMemoryNapiAddon()

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemMemoryNtMapViewOfSection(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWdkSystemMemoryNtMapViewOfSection(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: Int, p9: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemMemoryNtOpenSection(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemMemoryNtOpenSection(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemMemoryNtUnmapViewOfSection(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemMemoryNtUnmapViewOfSection(p0: String, p1: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemMemoryZwMapViewOfSection(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9)")
private external fun wasmWindowssysWindowsWdkSystemMemoryZwMapViewOfSection(p0: String, p1: String, p2: String, p3: String, p4: String, p5: String, p6: String, p7: Int, p8: Int, p9: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemMemoryZwOpenSection(p0, p1, p2)")
private external fun wasmWindowssysWindowsWdkSystemMemoryZwOpenSection(p0: String, p1: Int, p2: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWdkSystemMemoryZwUnmapViewOfSection(p0, p1)")
private external fun wasmWindowssysWindowsWdkSystemMemoryZwUnmapViewOfSection(p0: String, p1: String): Int

public actual fun ntMapViewOfSection(sectionhandle: Handle, processhandle: Handle, baseaddress: MutPtr, zerobits: ULong, commitsize: ULong, sectionoffset: MutPtr, viewsize: MutPtr, inheritdisposition: SectionInherit, allocationtype: UInt, win32protect: UInt): Ntstatus =
    if (windowsWdkSystemMemoryNapiAvailable) wasmWindowssysWindowsWdkSystemMemoryNtMapViewOfSection(sectionhandle.rawAddress.toString(), processhandle.rawAddress.toString(), baseaddress.rawAddress.toString(), zerobits.toString(), commitsize.toString(), sectionoffset.rawAddress.toString(), viewsize.rawAddress.toString(), inheritdisposition, allocationtype.toInt(), win32protect.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntOpenSection(sectionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    if (windowsWdkSystemMemoryNapiAvailable) wasmWindowssysWindowsWdkSystemMemoryNtOpenSection(sectionhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun ntUnmapViewOfSection(processhandle: Handle, baseaddress: ConstPtr): Ntstatus =
    if (windowsWdkSystemMemoryNapiAvailable) wasmWindowssysWindowsWdkSystemMemoryNtUnmapViewOfSection(processhandle.rawAddress.toString(), baseaddress.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwMapViewOfSection(sectionhandle: Handle, processhandle: Handle, baseaddress: MutPtr, zerobits: ULong, commitsize: ULong, sectionoffset: MutPtr, viewsize: MutPtr, inheritdisposition: SectionInherit, allocationtype: UInt, win32protect: UInt): Ntstatus =
    if (windowsWdkSystemMemoryNapiAvailable) wasmWindowssysWindowsWdkSystemMemoryZwMapViewOfSection(sectionhandle.rawAddress.toString(), processhandle.rawAddress.toString(), baseaddress.rawAddress.toString(), zerobits.toString(), commitsize.toString(), sectionoffset.rawAddress.toString(), viewsize.rawAddress.toString(), inheritdisposition, allocationtype.toInt(), win32protect.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwOpenSection(sectionhandle: MutPtr, desiredaccess: UInt, objectattributes: ConstPtr): Ntstatus =
    if (windowsWdkSystemMemoryNapiAvailable) wasmWindowssysWindowsWdkSystemMemoryZwOpenSection(sectionhandle.rawAddress.toString(), desiredaccess.toInt(), objectattributes.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun zwUnmapViewOfSection(processhandle: Handle, baseaddress: ConstPtr): Ntstatus =
    if (windowsWdkSystemMemoryNapiAvailable) wasmWindowssysWindowsWdkSystemMemoryZwUnmapViewOfSection(processhandle.rawAddress.toString(), baseaddress.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
