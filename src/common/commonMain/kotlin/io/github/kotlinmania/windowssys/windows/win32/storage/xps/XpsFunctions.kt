package io.github.kotlinmania.windowssys.windows.win32.storage.xps

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR

public fun interface FnCallback {
    public operator fun invoke(param0: Graphics.Gdi.HDC, param1: Int): BOOL
}

public fun AbortDoc(hdc: Graphics.Gdi.HDC): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "AbortDoc", longArrayOf(Win32DynamicFfi.objectSlot(hdc))).toInt()
}

public fun DeviceCapabilitiesA(pdevice: PCSTR, pport: PCSTR, fwcapability: PRINTER_DEVICE_CAPABILITIES, poutput: PSTR, pdevmode: Long): Int {
    return Win32DynamicFfi.invoke("winspool.drv", "DeviceCapabilitiesA", longArrayOf(pdevice, pport, fwcapability.toLong(), poutput, pdevmode)).toInt()
}

public fun DeviceCapabilitiesW(pdevice: PCWSTR, pport: PCWSTR, fwcapability: PRINTER_DEVICE_CAPABILITIES, poutput: PWSTR, pdevmode: Long): Int {
    return Win32DynamicFfi.invoke("winspool.drv", "DeviceCapabilitiesW", longArrayOf(pdevice, pport, fwcapability.toLong(), poutput, pdevmode)).toInt()
}

public fun EndDoc(hdc: Graphics.Gdi.HDC): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "EndDoc", longArrayOf(Win32DynamicFfi.objectSlot(hdc))).toInt()
}

public fun EndPage(hdc: Graphics.Gdi.HDC): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "EndPage", longArrayOf(Win32DynamicFfi.objectSlot(hdc))).toInt()
}

public fun Escape(hdc: Graphics.Gdi.HDC, iescape: Int, cjin: Int, pvin: PCSTR, pvout: Long): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "Escape", longArrayOf(Win32DynamicFfi.objectSlot(hdc), iescape.toLong(), cjin.toLong(), pvin, pvout)).toInt()
}

public fun ExtEscape(hdc: Graphics.Gdi.HDC, iescape: Int, cjinput: Int, lpindata: PCSTR, cjoutput: Int, lpoutdata: PSTR): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "ExtEscape", longArrayOf(Win32DynamicFfi.objectSlot(hdc), iescape.toLong(), cjinput.toLong(), lpindata, cjoutput.toLong(), lpoutdata)).toInt()
}

public fun PrintWindow(hwnd: Foundation.HWND, hdcblt: Graphics.Gdi.HDC, nflags: PRINT_WINDOW_FLAGS): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "PrintWindow", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), Win32DynamicFfi.objectSlot(hdcblt), nflags.toLong())).toInt()
}

public fun SetAbortProc(hdc: Graphics.Gdi.HDC, proc: ABORTPROC): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "SetAbortProc", longArrayOf(Win32DynamicFfi.objectSlot(hdc), Win32DynamicFfi.objectSlot(proc))).toInt()
}

public fun StartDocA(hdc: Graphics.Gdi.HDC, lpdi: Long): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "StartDocA", longArrayOf(Win32DynamicFfi.objectSlot(hdc), lpdi)).toInt()
}

public fun StartDocW(hdc: Graphics.Gdi.HDC, lpdi: Long): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "StartDocW", longArrayOf(Win32DynamicFfi.objectSlot(hdc), lpdi)).toInt()
}

public fun StartPage(hdc: Graphics.Gdi.HDC): Int {
    return Win32DynamicFfi.invoke("gdi32.dll", "StartPage", longArrayOf(Win32DynamicFfi.objectSlot(hdc))).toInt()
}
