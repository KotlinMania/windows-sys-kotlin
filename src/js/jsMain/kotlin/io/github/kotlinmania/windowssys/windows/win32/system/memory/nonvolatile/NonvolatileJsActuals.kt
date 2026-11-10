@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile

import io.github.kotlinmania.windowssys.COpaquePointer

private val _windowsWin32SystemMemoryNonvolatileNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun rtlDrainNonVolatileFlush(nvtoken: COpaquePointer?): UInt =
    if (_windowsWin32SystemMemoryNonvolatileNapiAddon != null) (_windowsWin32SystemMemoryNonvolatileNapiAddon.windowssys_windows_win32_system_memory_nonvolatile_rtlDrainNonVolatileFlush((nvtoken?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFillNonVolatileMemory(nvtoken: COpaquePointer?, nvdestination: COpaquePointer?, size: ULong, value: UByte, flags: UInt): UInt =
    if (_windowsWin32SystemMemoryNonvolatileNapiAddon != null) (_windowsWin32SystemMemoryNonvolatileNapiAddon.windowssys_windows_win32_system_memory_nonvolatile_rtlFillNonVolatileMemory((nvtoken?.value ?: 0L).toString(), (nvdestination?.value ?: 0L).toString(), size.toString(), value.toInt(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFlushNonVolatileMemory(nvtoken: COpaquePointer?, nvbuffer: COpaquePointer?, size: ULong, flags: UInt): UInt =
    if (_windowsWin32SystemMemoryNonvolatileNapiAddon != null) (_windowsWin32SystemMemoryNonvolatileNapiAddon.windowssys_windows_win32_system_memory_nonvolatile_rtlFlushNonVolatileMemory((nvtoken?.value ?: 0L).toString(), (nvbuffer?.value ?: 0L).toString(), size.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFlushNonVolatileMemoryRanges(nvtoken: COpaquePointer?, nvranges: COpaquePointer?, numranges: ULong, flags: UInt): UInt =
    if (_windowsWin32SystemMemoryNonvolatileNapiAddon != null) (_windowsWin32SystemMemoryNonvolatileNapiAddon.windowssys_windows_win32_system_memory_nonvolatile_rtlFlushNonVolatileMemoryRanges((nvtoken?.value ?: 0L).toString(), (nvranges?.value ?: 0L).toString(), numranges.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFreeNonVolatileToken(nvtoken: COpaquePointer?): UInt =
    if (_windowsWin32SystemMemoryNonvolatileNapiAddon != null) (_windowsWin32SystemMemoryNonvolatileNapiAddon.windowssys_windows_win32_system_memory_nonvolatile_rtlFreeNonVolatileToken((nvtoken?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetNonVolatileToken(nvbuffer: COpaquePointer?, size: ULong, nvtoken: COpaquePointer?): UInt =
    if (_windowsWin32SystemMemoryNonvolatileNapiAddon != null) (_windowsWin32SystemMemoryNonvolatileNapiAddon.windowssys_windows_win32_system_memory_nonvolatile_rtlGetNonVolatileToken((nvbuffer?.value ?: 0L).toString(), size.toString(), (nvtoken?.value ?: 0L).toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlWriteNonVolatileMemory(nvtoken: COpaquePointer?, nvdestination: COpaquePointer?, source: COpaquePointer?, size: ULong, flags: UInt): UInt =
    if (_windowsWin32SystemMemoryNonvolatileNapiAddon != null) (_windowsWin32SystemMemoryNonvolatileNapiAddon.windowssys_windows_win32_system_memory_nonvolatile_rtlWriteNonVolatileMemory((nvtoken?.value ?: 0L).toString(), (nvdestination?.value ?: 0L).toString(), (source?.value ?: 0L).toString(), size.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
