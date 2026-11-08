package io.github.kotlinmania.windowssys.windows.win32.storage.xps

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC

public fun interface FnCallback {
    public operator fun invoke(param0: HDC, param1: Int): BOOL
}

public fun AbortDoc(hdc: HDC): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "AbortDoc", longArrayOf(hdc)).toInt()
}

public fun DeviceCapabilitiesA(pdevice: PCSTR, pport: PCSTR, fwcapability: PRINTER_DEVICE_CAPABILITIES, poutput: PSTR, pdevmode: Long): Int {
    return Win32DynamicFfi.invoke("winspool.drv", "DeviceCapabilitiesA", longArrayOf(pdevice, pport, fwcapability.toLong(), poutput, pdevmode)).toInt()
}

public fun DeviceCapabilitiesW(pdevice: PCWSTR, pport: PCWSTR, fwcapability: PRINTER_DEVICE_CAPABILITIES, poutput: PWSTR, pdevmode: Long): Int {
    return Win32DynamicFfi.invoke("winspool.drv", "DeviceCapabilitiesW", longArrayOf(pdevice, pport, fwcapability.toLong(), poutput, pdevmode)).toInt()
}

public fun EndDoc(hdc: HDC): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "EndDoc", longArrayOf(hdc)).toInt()
}

public fun EndPage(hdc: HDC): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "EndPage", longArrayOf(hdc)).toInt()
}

public fun Escape(hdc: HDC, iescape: Int, cjin: Int, pvin: PCSTR, pvout: Long): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "Escape", longArrayOf(hdc, iescape.toLong(), cjin.toLong(), pvin, pvout)).toInt()
}

public fun ExtEscape(hdc: HDC, iescape: Int, cjinput: Int, lpindata: PCSTR, cjoutput: Int, lpoutdata: PSTR): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "ExtEscape", longArrayOf(hdc, iescape.toLong(), cjinput.toLong(), lpindata, cjoutput.toLong(), lpoutdata)).toInt()
}

public fun PrintWindow(hwnd: HWND, hdcblt: HDC, nflags: PRINT_WINDOW_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "PrintWindow", longArrayOf(hwnd, hdcblt, nflags.toLong())).toInt()
}

public fun SetAbortProc(hdc: HDC, proc: ABORTPROC): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetAbortProc", longArrayOf(hdc, Win32DynamicFfi.objectSlot(proc))).toInt()
}

public fun StartDocA(hdc: HDC, lpdi: Long): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "StartDocA", longArrayOf(hdc, lpdi)).toInt()
}

public fun StartDocW(hdc: HDC, lpdi: Long): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "StartDocW", longArrayOf(hdc, lpdi)).toInt()
}

public fun StartPage(hdc: HDC): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "StartPage", longArrayOf(hdc)).toInt()
}
