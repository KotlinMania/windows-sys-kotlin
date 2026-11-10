@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile

import io.github.kotlinmania.windowssys.COpaquePointer

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32SystemMemoryNonvolatileNapiAddon(): Boolean

private val _windowsWin32SystemMemoryNonvolatileNapiAvailable: Boolean = _initWindowsWin32SystemMemoryNonvolatileNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_nonvolatile_rtlDrainNonVolatileFlush(p0)")
private external fun _wasm_windowssys_windows_win32_system_memory_nonvolatile_rtlDrainNonVolatileFlush(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_nonvolatile_rtlFillNonVolatileMemory(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_memory_nonvolatile_rtlFillNonVolatileMemory(p0: String, p1: String, p2: String, p3: Int, p4: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_nonvolatile_rtlFlushNonVolatileMemory(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_memory_nonvolatile_rtlFlushNonVolatileMemory(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_nonvolatile_rtlFlushNonVolatileMemoryRanges(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_system_memory_nonvolatile_rtlFlushNonVolatileMemoryRanges(p0: String, p1: String, p2: String, p3: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_nonvolatile_rtlFreeNonVolatileToken(p0)")
private external fun _wasm_windowssys_windows_win32_system_memory_nonvolatile_rtlFreeNonVolatileToken(p0: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_nonvolatile_rtlGetNonVolatileToken(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_system_memory_nonvolatile_rtlGetNonVolatileToken(p0: String, p1: String, p2: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_system_memory_nonvolatile_rtlWriteNonVolatileMemory(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_system_memory_nonvolatile_rtlWriteNonVolatileMemory(p0: String, p1: String, p2: String, p3: String, p4: Int): Int

public actual fun rtlDrainNonVolatileFlush(nvtoken: COpaquePointer?): UInt =
    if (_windowsWin32SystemMemoryNonvolatileNapiAvailable) _wasm_windowssys_windows_win32_system_memory_nonvolatile_rtlDrainNonVolatileFlush((nvtoken?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFillNonVolatileMemory(nvtoken: COpaquePointer?, nvdestination: COpaquePointer?, size: ULong, value: UByte, flags: UInt): UInt =
    if (_windowsWin32SystemMemoryNonvolatileNapiAvailable) _wasm_windowssys_windows_win32_system_memory_nonvolatile_rtlFillNonVolatileMemory((nvtoken?.value ?: 0L).toString(), (nvdestination?.value ?: 0L).toString(), size.toString(), value.toInt(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFlushNonVolatileMemory(nvtoken: COpaquePointer?, nvbuffer: COpaquePointer?, size: ULong, flags: UInt): UInt =
    if (_windowsWin32SystemMemoryNonvolatileNapiAvailable) _wasm_windowssys_windows_win32_system_memory_nonvolatile_rtlFlushNonVolatileMemory((nvtoken?.value ?: 0L).toString(), (nvbuffer?.value ?: 0L).toString(), size.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFlushNonVolatileMemoryRanges(nvtoken: COpaquePointer?, nvranges: COpaquePointer?, numranges: ULong, flags: UInt): UInt =
    if (_windowsWin32SystemMemoryNonvolatileNapiAvailable) _wasm_windowssys_windows_win32_system_memory_nonvolatile_rtlFlushNonVolatileMemoryRanges((nvtoken?.value ?: 0L).toString(), (nvranges?.value ?: 0L).toString(), numranges.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFreeNonVolatileToken(nvtoken: COpaquePointer?): UInt =
    if (_windowsWin32SystemMemoryNonvolatileNapiAvailable) _wasm_windowssys_windows_win32_system_memory_nonvolatile_rtlFreeNonVolatileToken((nvtoken?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetNonVolatileToken(nvbuffer: COpaquePointer?, size: ULong, nvtoken: COpaquePointer?): UInt =
    if (_windowsWin32SystemMemoryNonvolatileNapiAvailable) _wasm_windowssys_windows_win32_system_memory_nonvolatile_rtlGetNonVolatileToken((nvbuffer?.value ?: 0L).toString(), size.toString(), (nvtoken?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlWriteNonVolatileMemory(nvtoken: COpaquePointer?, nvdestination: COpaquePointer?, source: COpaquePointer?, size: ULong, flags: UInt): UInt =
    if (_windowsWin32SystemMemoryNonvolatileNapiAvailable) _wasm_windowssys_windows_win32_system_memory_nonvolatile_rtlWriteNonVolatileMemory((nvtoken?.value ?: 0L).toString(), (nvdestination?.value ?: 0L).toString(), (source?.value ?: 0L).toString(), size.toString(), flags.toInt()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
