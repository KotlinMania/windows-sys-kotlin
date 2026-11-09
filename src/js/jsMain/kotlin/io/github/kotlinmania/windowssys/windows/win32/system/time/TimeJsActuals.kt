@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.time

import io.github.kotlinmania.windowssys.core.BOOL

private val _windowsWin32SystemTimeNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun EnumDynamicTimeZoneInformation(dwindex: UInt, lptimezoneinformation: Long): UInt =
    if (_windowsWin32SystemTimeNapiAddon != null) (_windowsWin32SystemTimeNapiAddon.windowssys_windows_win32_system_time_EnumDynamicTimeZoneInformation(dwindex.toInt(), lptimezoneinformation.toString()) as Int).toUInt() else 0u

public actual fun FileTimeToSystemTime(lpfiletime: Long, lpsystemtime: Long): BOOL =
    if (_windowsWin32SystemTimeNapiAddon != null) (_windowsWin32SystemTimeNapiAddon.windowssys_windows_win32_system_time_FileTimeToSystemTime(lpfiletime.toString(), lpsystemtime.toString()) as Int) else 0

public actual fun GetDynamicTimeZoneInformation(ptimezoneinformation: Long): UInt =
    if (_windowsWin32SystemTimeNapiAddon != null) (_windowsWin32SystemTimeNapiAddon.windowssys_windows_win32_system_time_GetDynamicTimeZoneInformation(ptimezoneinformation.toString()) as Int).toUInt() else 0u

public actual fun GetDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation: Long, firstyear: Long, lastyear: Long): UInt =
    if (_windowsWin32SystemTimeNapiAddon != null) (_windowsWin32SystemTimeNapiAddon.windowssys_windows_win32_system_time_GetDynamicTimeZoneInformationEffectiveYears(lptimezoneinformation.toString(), firstyear.toString(), lastyear.toString()) as Int).toUInt() else 0u

public actual fun GetTimeZoneInformation(lptimezoneinformation: Long): UInt =
    if (_windowsWin32SystemTimeNapiAddon != null) (_windowsWin32SystemTimeNapiAddon.windowssys_windows_win32_system_time_GetTimeZoneInformation(lptimezoneinformation.toString()) as Int).toUInt() else 0u

public actual fun GetTimeZoneInformationForYear(wyear: UShort, pdtzi: Long, ptzi: Long): BOOL =
    if (_windowsWin32SystemTimeNapiAddon != null) (_windowsWin32SystemTimeNapiAddon.windowssys_windows_win32_system_time_GetTimeZoneInformationForYear(wyear.toInt(), pdtzi.toString(), ptzi.toString()) as Int) else 0

public actual fun LocalFileTimeToLocalSystemTime(timezoneinformation: Long, localfiletime: Long, localsystemtime: Long): BOOL =
    if (_windowsWin32SystemTimeNapiAddon != null) (_windowsWin32SystemTimeNapiAddon.windowssys_windows_win32_system_time_LocalFileTimeToLocalSystemTime(timezoneinformation.toString(), localfiletime.toString(), localsystemtime.toString()) as Int) else 0

public actual fun LocalSystemTimeToLocalFileTime(timezoneinformation: Long, localsystemtime: Long, localfiletime: Long): BOOL =
    if (_windowsWin32SystemTimeNapiAddon != null) (_windowsWin32SystemTimeNapiAddon.windowssys_windows_win32_system_time_LocalSystemTimeToLocalFileTime(timezoneinformation.toString(), localsystemtime.toString(), localfiletime.toString()) as Int) else 0

public actual fun SetDynamicTimeZoneInformation(lptimezoneinformation: Long): BOOL =
    if (_windowsWin32SystemTimeNapiAddon != null) (_windowsWin32SystemTimeNapiAddon.windowssys_windows_win32_system_time_SetDynamicTimeZoneInformation(lptimezoneinformation.toString()) as Int) else 0

public actual fun SetTimeZoneInformation(lptimezoneinformation: Long): BOOL =
    if (_windowsWin32SystemTimeNapiAddon != null) (_windowsWin32SystemTimeNapiAddon.windowssys_windows_win32_system_time_SetTimeZoneInformation(lptimezoneinformation.toString()) as Int) else 0

public actual fun SystemTimeToFileTime(lpsystemtime: Long, lpfiletime: Long): BOOL =
    if (_windowsWin32SystemTimeNapiAddon != null) (_windowsWin32SystemTimeNapiAddon.windowssys_windows_win32_system_time_SystemTimeToFileTime(lpsystemtime.toString(), lpfiletime.toString()) as Int) else 0

public actual fun SystemTimeToTzSpecificLocalTime(lptimezoneinformation: Long, lpuniversaltime: Long, lplocaltime: Long): BOOL =
    if (_windowsWin32SystemTimeNapiAddon != null) (_windowsWin32SystemTimeNapiAddon.windowssys_windows_win32_system_time_SystemTimeToTzSpecificLocalTime(lptimezoneinformation.toString(), lpuniversaltime.toString(), lplocaltime.toString()) as Int) else 0

public actual fun SystemTimeToTzSpecificLocalTimeEx(lptimezoneinformation: Long, lpuniversaltime: Long, lplocaltime: Long): BOOL =
    if (_windowsWin32SystemTimeNapiAddon != null) (_windowsWin32SystemTimeNapiAddon.windowssys_windows_win32_system_time_SystemTimeToTzSpecificLocalTimeEx(lptimezoneinformation.toString(), lpuniversaltime.toString(), lplocaltime.toString()) as Int) else 0

public actual fun TzSpecificLocalTimeToSystemTime(lptimezoneinformation: Long, lplocaltime: Long, lpuniversaltime: Long): BOOL =
    if (_windowsWin32SystemTimeNapiAddon != null) (_windowsWin32SystemTimeNapiAddon.windowssys_windows_win32_system_time_TzSpecificLocalTimeToSystemTime(lptimezoneinformation.toString(), lplocaltime.toString(), lpuniversaltime.toString()) as Int) else 0

public actual fun TzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation: Long, lplocaltime: Long, lpuniversaltime: Long): BOOL =
    if (_windowsWin32SystemTimeNapiAddon != null) (_windowsWin32SystemTimeNapiAddon.windowssys_windows_win32_system_time_TzSpecificLocalTimeToSystemTimeEx(lptimezoneinformation.toString(), lplocaltime.toString(), lpuniversaltime.toString()) as Int) else 0
