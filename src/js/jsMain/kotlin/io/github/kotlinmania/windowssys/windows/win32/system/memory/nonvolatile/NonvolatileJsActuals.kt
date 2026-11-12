@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private val windowsWin32SystemMemoryNonvolatileNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun rtlDrainNonVolatileFlush(nvtoken: ConstPtr<CVoid>): UInt =
    if (windowsWin32SystemMemoryNonvolatileNapiAddon != null) (windowsWin32SystemMemoryNonvolatileNapiAddon.windowssysWindowsWin32SystemMemoryNonvolatileRtlDrainNonVolatileFlush(nvtoken.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFillNonVolatileMemory(nvtoken: ConstPtr<CVoid>, nvdestination: MutPtr<CVoid>, size: ULong, value: UByte, flags: UInt): UInt =
    if (windowsWin32SystemMemoryNonvolatileNapiAddon != null) (windowsWin32SystemMemoryNonvolatileNapiAddon.windowssysWindowsWin32SystemMemoryNonvolatileRtlFillNonVolatileMemory(nvtoken.rawAddress.toString(), nvdestination.rawAddress.toString(), size.toString(), value.toInt(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFlushNonVolatileMemory(nvtoken: ConstPtr<CVoid>, nvbuffer: ConstPtr<CVoid>, size: ULong, flags: UInt): UInt =
    if (windowsWin32SystemMemoryNonvolatileNapiAddon != null) (windowsWin32SystemMemoryNonvolatileNapiAddon.windowssysWindowsWin32SystemMemoryNonvolatileRtlFlushNonVolatileMemory(nvtoken.rawAddress.toString(), nvbuffer.rawAddress.toString(), size.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFlushNonVolatileMemoryRanges(nvtoken: ConstPtr<CVoid>, nvranges: ConstPtr<NvMemoryRange>, numranges: ULong, flags: UInt): UInt =
    if (windowsWin32SystemMemoryNonvolatileNapiAddon != null) (windowsWin32SystemMemoryNonvolatileNapiAddon.windowssysWindowsWin32SystemMemoryNonvolatileRtlFlushNonVolatileMemoryRanges(nvtoken.rawAddress.toString(), nvranges.rawAddress.toString(), numranges.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlFreeNonVolatileToken(nvtoken: ConstPtr<CVoid>): UInt =
    if (windowsWin32SystemMemoryNonvolatileNapiAddon != null) (windowsWin32SystemMemoryNonvolatileNapiAddon.windowssysWindowsWin32SystemMemoryNonvolatileRtlFreeNonVolatileToken(nvtoken.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlGetNonVolatileToken(nvbuffer: ConstPtr<CVoid>, size: ULong, nvtoken: MutPtr<MutPtr<CVoid>>): UInt =
    if (windowsWin32SystemMemoryNonvolatileNapiAddon != null) (windowsWin32SystemMemoryNonvolatileNapiAddon.windowssysWindowsWin32SystemMemoryNonvolatileRtlGetNonVolatileToken(nvbuffer.rawAddress.toString(), size.toString(), nvtoken.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun rtlWriteNonVolatileMemory(nvtoken: ConstPtr<CVoid>, nvdestination: MutPtr<CVoid>, source: ConstPtr<CVoid>, size: ULong, flags: UInt): UInt =
    if (windowsWin32SystemMemoryNonvolatileNapiAddon != null) (windowsWin32SystemMemoryNonvolatileNapiAddon.windowssysWindowsWin32SystemMemoryNonvolatileRtlWriteNonVolatileMemory(nvtoken.rawAddress.toString(), nvdestination.rawAddress.toString(), source.rawAddress.toString(), size.toString(), flags.toInt()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")
