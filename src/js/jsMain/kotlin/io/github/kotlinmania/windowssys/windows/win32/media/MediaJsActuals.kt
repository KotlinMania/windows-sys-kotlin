@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.media

private val _windowsWin32MediaNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun timeBeginPeriod(uperiod: UInt): UInt =
    if (_windowsWin32MediaNapiAddon != null) (_windowsWin32MediaNapiAddon.windowssys_windows_win32_media_timeBeginPeriod(uperiod.toInt()) as Int).toUInt() else 0u

public actual fun timeEndPeriod(uperiod: UInt): UInt =
    if (_windowsWin32MediaNapiAddon != null) (_windowsWin32MediaNapiAddon.windowssys_windows_win32_media_timeEndPeriod(uperiod.toInt()) as Int).toUInt() else 0u

public actual fun timeGetDevCaps(ptc: Long, cbtc: UInt): UInt =
    if (_windowsWin32MediaNapiAddon != null) (_windowsWin32MediaNapiAddon.windowssys_windows_win32_media_timeGetDevCaps(ptc.toString(), cbtc.toInt()) as Int).toUInt() else 0u

public actual fun timeGetSystemTime(pmmt: Long, cbmmt: UInt): UInt =
    if (_windowsWin32MediaNapiAddon != null) (_windowsWin32MediaNapiAddon.windowssys_windows_win32_media_timeGetSystemTime(pmmt.toString(), cbmmt.toInt()) as Int).toUInt() else 0u

public actual fun timeGetTime(): UInt =
    if (_windowsWin32MediaNapiAddon != null) (_windowsWin32MediaNapiAddon.windowssys_windows_win32_media_timeGetTime() as Int).toUInt() else 0u

public actual fun timeKillEvent(utimerid: UInt): UInt =
    if (_windowsWin32MediaNapiAddon != null) (_windowsWin32MediaNapiAddon.windowssys_windows_win32_media_timeKillEvent(utimerid.toInt()) as Int).toUInt() else 0u

public actual fun timeSetEvent(udelay: UInt, uresolution: UInt, fptc: LPTIMECALLBACK, dwuser: ULong, fuevent: UInt): UInt =
    if (_windowsWin32MediaNapiAddon != null) (_windowsWin32MediaNapiAddon.windowssys_windows_win32_media_timeSetEvent(udelay.toInt(), uresolution.toInt(), fptc.toLong().toString(), dwuser.toString(), fuevent.toInt()) as Int).toUInt() else 0u
