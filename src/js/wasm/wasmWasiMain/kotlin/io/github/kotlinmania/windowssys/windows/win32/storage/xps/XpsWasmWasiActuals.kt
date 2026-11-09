@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.xps

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC

public actual fun AbortDoc(hdc: HDC): Int =
    0

public actual fun DeviceCapabilitiesA(pdevice: PCSTR, pport: PCSTR, fwcapability: PRINTER_DEVICE_CAPABILITIES, poutput: PSTR, pdevmode: Long): Int =
    0

public actual fun DeviceCapabilitiesW(pdevice: PCWSTR, pport: PCWSTR, fwcapability: PRINTER_DEVICE_CAPABILITIES, poutput: PWSTR, pdevmode: Long): Int =
    0

public actual fun EndDoc(hdc: HDC): Int =
    0

public actual fun EndPage(hdc: HDC): Int =
    0

public actual fun Escape(hdc: HDC, iescape: Int, cjin: Int, pvin: PCSTR, pvout: Long): Int =
    0

public actual fun ExtEscape(hdc: HDC, iescape: Int, cjinput: Int, lpindata: PCSTR, cjoutput: Int, lpoutdata: PSTR): Int =
    0

public actual fun PrintWindow(hwnd: HWND, hdcblt: HDC, nflags: PRINT_WINDOW_FLAGS): BOOL =
    0

public actual fun SetAbortProc(hdc: HDC, proc: ABORTPROC): Int =
    0

public actual fun StartDocA(hdc: HDC, lpdi: Long): Int =
    0

public actual fun StartDocW(hdc: HDC, lpdi: Long): Int =
    0

public actual fun StartPage(hdc: HDC): Int =
    0
