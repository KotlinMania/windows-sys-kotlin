@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.xps

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC

private val _windowsWin32StorageXpsNapiAddon: dynamic =
    js("(function() { if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var req = (new Function('t', 'return typeof require === t ? require : null'))('function'); if (!req) return null; var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; for (var d = 0; d < 8; d++) { var c1 = path.resolve(dir, 'build/node-ffi/windows_sys_native.node'); if (fs.existsSync(c1)) return req(c1); var c2 = path.resolve(dir, 'src/js/node-windows_sys/build/Release/windows_sys_native.node'); if (fs.existsSync(c2)) return req(c2); var c3 = path.resolve(dir, 'src/js/node-windows_sys/build/Debug/windows_sys_native.node'); if (fs.existsSync(c3)) return req(c3); var c4 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Release/windows_sys_native.node'); if (fs.existsSync(c4)) return req(c4); var c5 = path.resolve(dir, 'src/js/node-windows_sys/dist/build/Debug/windows_sys_native.node'); if (fs.existsSync(c5)) return req(c5); var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } return null; })()")

public actual fun AbortDoc(hdc: HDC): Int =
    if (_windowsWin32StorageXpsNapiAddon != null) (_windowsWin32StorageXpsNapiAddon.windowssys_windows_win32_storage_xps_AbortDoc(hdc.toString()) as Int) else 0

public actual fun DeviceCapabilitiesA(pdevice: PCSTR, pport: PCSTR, fwcapability: PRINTER_DEVICE_CAPABILITIES, poutput: PSTR, pdevmode: Long): Int =
    if (_windowsWin32StorageXpsNapiAddon != null) (_windowsWin32StorageXpsNapiAddon.windowssys_windows_win32_storage_xps_DeviceCapabilitiesA(pdevice.toString(), pport.toString(), fwcapability.toInt(), poutput.toString(), pdevmode.toString()) as Int) else 0

public actual fun DeviceCapabilitiesW(pdevice: PCWSTR, pport: PCWSTR, fwcapability: PRINTER_DEVICE_CAPABILITIES, poutput: PWSTR, pdevmode: Long): Int =
    if (_windowsWin32StorageXpsNapiAddon != null) (_windowsWin32StorageXpsNapiAddon.windowssys_windows_win32_storage_xps_DeviceCapabilitiesW(pdevice.toString(), pport.toString(), fwcapability.toInt(), poutput.toString(), pdevmode.toString()) as Int) else 0

public actual fun EndDoc(hdc: HDC): Int =
    if (_windowsWin32StorageXpsNapiAddon != null) (_windowsWin32StorageXpsNapiAddon.windowssys_windows_win32_storage_xps_EndDoc(hdc.toString()) as Int) else 0

public actual fun EndPage(hdc: HDC): Int =
    if (_windowsWin32StorageXpsNapiAddon != null) (_windowsWin32StorageXpsNapiAddon.windowssys_windows_win32_storage_xps_EndPage(hdc.toString()) as Int) else 0

public actual fun Escape(hdc: HDC, iescape: Int, cjin: Int, pvin: PCSTR, pvout: Long): Int =
    if (_windowsWin32StorageXpsNapiAddon != null) (_windowsWin32StorageXpsNapiAddon.windowssys_windows_win32_storage_xps_Escape(hdc.toString(), iescape, cjin, pvin.toString(), pvout.toString()) as Int) else 0

public actual fun ExtEscape(hdc: HDC, iescape: Int, cjinput: Int, lpindata: PCSTR, cjoutput: Int, lpoutdata: PSTR): Int =
    if (_windowsWin32StorageXpsNapiAddon != null) (_windowsWin32StorageXpsNapiAddon.windowssys_windows_win32_storage_xps_ExtEscape(hdc.toString(), iescape, cjinput, lpindata.toString(), cjoutput, lpoutdata.toString()) as Int) else 0

public actual fun PrintWindow(hwnd: HWND, hdcblt: HDC, nflags: PRINT_WINDOW_FLAGS): BOOL =
    if (_windowsWin32StorageXpsNapiAddon != null) (_windowsWin32StorageXpsNapiAddon.windowssys_windows_win32_storage_xps_PrintWindow(hwnd.toString(), hdcblt.toString(), nflags.toInt()) as Int) else 0

public actual fun SetAbortProc(hdc: HDC, proc: ABORTPROC): Int =
    if (_windowsWin32StorageXpsNapiAddon != null) (_windowsWin32StorageXpsNapiAddon.windowssys_windows_win32_storage_xps_SetAbortProc(hdc.toString(), proc.toLong().toString()) as Int) else 0

public actual fun StartDocA(hdc: HDC, lpdi: Long): Int =
    if (_windowsWin32StorageXpsNapiAddon != null) (_windowsWin32StorageXpsNapiAddon.windowssys_windows_win32_storage_xps_StartDocA(hdc.toString(), lpdi.toString()) as Int) else 0

public actual fun StartDocW(hdc: HDC, lpdi: Long): Int =
    if (_windowsWin32StorageXpsNapiAddon != null) (_windowsWin32StorageXpsNapiAddon.windowssys_windows_win32_storage_xps_StartDocW(hdc.toString(), lpdi.toString()) as Int) else 0

public actual fun StartPage(hdc: HDC): Int =
    if (_windowsWin32StorageXpsNapiAddon != null) (_windowsWin32StorageXpsNapiAddon.windowssys_windows_win32_storage_xps_StartPage(hdc.toString()) as Int) else 0
