@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.memory.nonvolatile

private val _windowsWin32SystemMemoryNonvolatileNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun RtlDrainNonVolatileFlush(nvtoken: Long): UInt =
    if (_windowsWin32SystemMemoryNonvolatileNapiAddon != null) (_windowsWin32SystemMemoryNonvolatileNapiAddon.windowssys_windows_win32_system_memory_nonvolatile_RtlDrainNonVolatileFlush(nvtoken.toString()) as Int).toUInt() else 0u

public actual fun RtlFillNonVolatileMemory(nvtoken: Long, nvdestination: Long, size: ULong, value: UByte, flags: UInt): UInt =
    if (_windowsWin32SystemMemoryNonvolatileNapiAddon != null) (_windowsWin32SystemMemoryNonvolatileNapiAddon.windowssys_windows_win32_system_memory_nonvolatile_RtlFillNonVolatileMemory(nvtoken.toString(), nvdestination.toString(), size.toString(), value.toInt(), flags.toInt()) as Int).toUInt() else 0u

public actual fun RtlFlushNonVolatileMemory(nvtoken: Long, nvbuffer: Long, size: ULong, flags: UInt): UInt =
    if (_windowsWin32SystemMemoryNonvolatileNapiAddon != null) (_windowsWin32SystemMemoryNonvolatileNapiAddon.windowssys_windows_win32_system_memory_nonvolatile_RtlFlushNonVolatileMemory(nvtoken.toString(), nvbuffer.toString(), size.toString(), flags.toInt()) as Int).toUInt() else 0u

public actual fun RtlFlushNonVolatileMemoryRanges(nvtoken: Long, nvranges: Long, numranges: ULong, flags: UInt): UInt =
    if (_windowsWin32SystemMemoryNonvolatileNapiAddon != null) (_windowsWin32SystemMemoryNonvolatileNapiAddon.windowssys_windows_win32_system_memory_nonvolatile_RtlFlushNonVolatileMemoryRanges(nvtoken.toString(), nvranges.toString(), numranges.toString(), flags.toInt()) as Int).toUInt() else 0u

public actual fun RtlFreeNonVolatileToken(nvtoken: Long): UInt =
    if (_windowsWin32SystemMemoryNonvolatileNapiAddon != null) (_windowsWin32SystemMemoryNonvolatileNapiAddon.windowssys_windows_win32_system_memory_nonvolatile_RtlFreeNonVolatileToken(nvtoken.toString()) as Int).toUInt() else 0u

public actual fun RtlGetNonVolatileToken(nvbuffer: Long, size: ULong, nvtoken: Long): UInt =
    if (_windowsWin32SystemMemoryNonvolatileNapiAddon != null) (_windowsWin32SystemMemoryNonvolatileNapiAddon.windowssys_windows_win32_system_memory_nonvolatile_RtlGetNonVolatileToken(nvbuffer.toString(), size.toString(), nvtoken.toString()) as Int).toUInt() else 0u

public actual fun RtlWriteNonVolatileMemory(nvtoken: Long, nvdestination: Long, source: Long, size: ULong, flags: UInt): UInt =
    if (_windowsWin32SystemMemoryNonvolatileNapiAddon != null) (_windowsWin32SystemMemoryNonvolatileNapiAddon.windowssys_windows_win32_system_memory_nonvolatile_RtlWriteNonVolatileMemory(nvtoken.toString(), nvdestination.toString(), source.toString(), size.toString(), flags.toInt()) as Int).toUInt() else 0u
