package io.github.kotlinmania.windowssys.windows.win32.storage.xps

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Devmodea
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Devmodew
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc

public expect fun abortDoc(hdc: Hdc): Int

public expect fun deviceCapabilitiesA(pdevice: Pcstr, pport: Pcstr, fwcapability: PrinterDeviceCapabilities, poutput: Pstr, pdevmode: ConstPtr<Devmodea>): Int

public expect fun deviceCapabilitiesW(pdevice: Pcwstr, pport: Pcwstr, fwcapability: PrinterDeviceCapabilities, poutput: Pwstr, pdevmode: ConstPtr<Devmodew>): Int

public expect fun endDoc(hdc: Hdc): Int

public expect fun endPage(hdc: Hdc): Int

public expect fun escape(hdc: Hdc, iescape: Int, cjin: Int, pvin: Pcstr, pvout: MutPtr<CVoid>): Int

public expect fun extEscape(hdc: Hdc, iescape: Int, cjinput: Int, lpindata: Pcstr, cjoutput: Int, lpoutdata: Pstr): Int

public expect fun printWindow(hwnd: Hwnd, hdcblt: Hdc, nflags: PrintWindowFlags): Bool

public expect fun setAbortProc(hdc: Hdc, proc: Abortproc): Int

public expect fun startDocA(hdc: Hdc, lpdi: ConstPtr<Docinfoa>): Int

public expect fun startDocW(hdc: Hdc, lpdi: ConstPtr<Docinfow>): Int

public expect fun startPage(hdc: Hdc): Int
