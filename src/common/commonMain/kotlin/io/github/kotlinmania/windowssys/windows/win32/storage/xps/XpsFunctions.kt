package io.github.kotlinmania.windowssys.windows.win32.storage.xps

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC

public expect fun AbortDoc(hdc: HDC): Int

public expect fun DeviceCapabilitiesA(pdevice: PCSTR, pport: PCSTR, fwcapability: PRINTER_DEVICE_CAPABILITIES, poutput: PSTR, pdevmode: Long): Int

public expect fun DeviceCapabilitiesW(pdevice: PCWSTR, pport: PCWSTR, fwcapability: PRINTER_DEVICE_CAPABILITIES, poutput: PWSTR, pdevmode: Long): Int

public expect fun EndDoc(hdc: HDC): Int

public expect fun EndPage(hdc: HDC): Int

public expect fun Escape(hdc: HDC, iescape: Int, cjin: Int, pvin: PCSTR, pvout: Long): Int

public expect fun ExtEscape(hdc: HDC, iescape: Int, cjinput: Int, lpindata: PCSTR, cjoutput: Int, lpoutdata: PSTR): Int

public expect fun PrintWindow(hwnd: HWND, hdcblt: HDC, nflags: PRINT_WINDOW_FLAGS): BOOL

public expect fun SetAbortProc(hdc: HDC, proc: ABORTPROC): Int

public expect fun StartDocA(hdc: HDC, lpdi: Long): Int

public expect fun StartDocW(hdc: HDC, lpdi: Long): Int

public expect fun StartPage(hdc: HDC): Int
