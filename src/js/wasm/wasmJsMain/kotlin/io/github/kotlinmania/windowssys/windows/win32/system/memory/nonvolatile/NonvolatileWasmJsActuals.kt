@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32SystemMemoryNonvolatileNapiAddon(): Boolean

private val windowsWin32SystemMemoryNonvolatileNapiAvailable: Boolean = initWindowsWin32SystemMemoryNonvolatileNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryNonvolatileRtlDrainNonVolatileFlush(p0)")
private external fun wasmWindowssysWindowsWin32SystemMemoryNonvolatileRtlDrainNonVolatileFlush(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryNonvolatileRtlFillNonVolatileMemory(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemMemoryNonvolatileRtlFillNonVolatileMemory(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryNonvolatileRtlFlushNonVolatileMemory(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemMemoryNonvolatileRtlFlushNonVolatileMemory(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryNonvolatileRtlFlushNonVolatileMemoryRanges(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32SystemMemoryNonvolatileRtlFlushNonVolatileMemoryRanges(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryNonvolatileRtlFreeNonVolatileToken(p0)")
private external fun wasmWindowssysWindowsWin32SystemMemoryNonvolatileRtlFreeNonVolatileToken(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryNonvolatileRtlGetNonVolatileToken(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32SystemMemoryNonvolatileRtlGetNonVolatileToken(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32SystemMemoryNonvolatileRtlWriteNonVolatileMemory(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32SystemMemoryNonvolatileRtlWriteNonVolatileMemory(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

public actual fun rtlDrainNonVolatileFlush(nvtoken: ConstPtr<CVoid>): UInt =
    if (windowsWin32SystemMemoryNonvolatileNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryNonvolatileRtlDrainNonVolatileFlush(nvtoken.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFillNonVolatileMemory(nvtoken: ConstPtr<CVoid>, nvdestination: MutPtr<CVoid>, size: ULong, value: UByte, flags: UInt): UInt =
    if (windowsWin32SystemMemoryNonvolatileNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryNonvolatileRtlFillNonVolatileMemory(nvtoken.rawAddress.toString(), nvdestination.rawAddress.toString(), size.toString(), value.toInt(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFlushNonVolatileMemory(nvtoken: ConstPtr<CVoid>, nvbuffer: ConstPtr<CVoid>, size: ULong, flags: UInt): UInt =
    if (windowsWin32SystemMemoryNonvolatileNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryNonvolatileRtlFlushNonVolatileMemory(nvtoken.rawAddress.toString(), nvbuffer.rawAddress.toString(), size.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFlushNonVolatileMemoryRanges(nvtoken: ConstPtr<CVoid>, nvranges: ConstPtr<NvMemoryRange>, numranges: ULong, flags: UInt): UInt =
    if (windowsWin32SystemMemoryNonvolatileNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryNonvolatileRtlFlushNonVolatileMemoryRanges(nvtoken.rawAddress.toString(), nvranges.rawAddress.toString(), numranges.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFreeNonVolatileToken(nvtoken: ConstPtr<CVoid>): UInt =
    if (windowsWin32SystemMemoryNonvolatileNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryNonvolatileRtlFreeNonVolatileToken(nvtoken.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetNonVolatileToken(nvbuffer: ConstPtr<CVoid>, size: ULong, nvtoken: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32SystemMemoryNonvolatileNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryNonvolatileRtlGetNonVolatileToken(nvbuffer.rawAddress.toString(), size.toString(), nvtoken.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlWriteNonVolatileMemory(nvtoken: ConstPtr<CVoid>, nvdestination: MutPtr<CVoid>, source: ConstPtr<CVoid>, size: ULong, flags: UInt): UInt =
    if (windowsWin32SystemMemoryNonvolatileNapiAvailable) wasmWindowssysWindowsWin32SystemMemoryNonvolatileRtlWriteNonVolatileMemory(nvtoken.rawAddress.toString(), nvdestination.rawAddress.toString(), source.rawAddress.toString(), size.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
