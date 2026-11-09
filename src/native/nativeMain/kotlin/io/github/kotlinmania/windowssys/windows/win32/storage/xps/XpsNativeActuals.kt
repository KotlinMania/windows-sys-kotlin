@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.xps

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun AbortDoc(hdc: HDC): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssys_windows_win32_storage_xps_AbortDoc(hdc.toCPointer<ByteVar>())

public actual fun DeviceCapabilitiesA(pdevice: PCSTR, pport: PCSTR, fwcapability: PRINTER_DEVICE_CAPABILITIES, poutput: PSTR, pdevmode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssys_windows_win32_storage_xps_DeviceCapabilitiesA(pdevice.toCPointer<ByteVar>(), pport.toCPointer<ByteVar>(), fwcapability, poutput.toCPointer<ByteVar>(), pdevmode.toCPointer<ByteVar>())

public actual fun DeviceCapabilitiesW(pdevice: PCWSTR, pport: PCWSTR, fwcapability: PRINTER_DEVICE_CAPABILITIES, poutput: PWSTR, pdevmode: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssys_windows_win32_storage_xps_DeviceCapabilitiesW(pdevice.toCPointer<ByteVar>(), pport.toCPointer<ByteVar>(), fwcapability, poutput.toCPointer<ByteVar>(), pdevmode.toCPointer<ByteVar>())

public actual fun EndDoc(hdc: HDC): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssys_windows_win32_storage_xps_EndDoc(hdc.toCPointer<ByteVar>())

public actual fun EndPage(hdc: HDC): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssys_windows_win32_storage_xps_EndPage(hdc.toCPointer<ByteVar>())

public actual fun Escape(hdc: HDC, iescape: Int, cjin: Int, pvin: PCSTR, pvout: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssys_windows_win32_storage_xps_Escape(hdc.toCPointer<ByteVar>(), iescape, cjin, pvin.toCPointer<ByteVar>(), pvout.toCPointer<ByteVar>())

public actual fun ExtEscape(hdc: HDC, iescape: Int, cjinput: Int, lpindata: PCSTR, cjoutput: Int, lpoutdata: PSTR): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssys_windows_win32_storage_xps_ExtEscape(hdc.toCPointer<ByteVar>(), iescape, cjinput, lpindata.toCPointer<ByteVar>(), cjoutput, lpoutdata.toCPointer<ByteVar>())

public actual fun PrintWindow(hwnd: HWND, hdcblt: HDC, nflags: PRINT_WINDOW_FLAGS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssys_windows_win32_storage_xps_PrintWindow(hwnd.toCPointer<ByteVar>(), hdcblt.toCPointer<ByteVar>(), nflags)

public actual fun SetAbortProc(hdc: HDC, proc: ABORTPROC): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssys_windows_win32_storage_xps_SetAbortProc(hdc.toCPointer<ByteVar>(), proc.toLong().toCPointer<ByteVar>())

public actual fun StartDocA(hdc: HDC, lpdi: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssys_windows_win32_storage_xps_StartDocA(hdc.toCPointer<ByteVar>(), lpdi.toCPointer<ByteVar>())

public actual fun StartDocW(hdc: HDC, lpdi: Long): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssys_windows_win32_storage_xps_StartDocW(hdc.toCPointer<ByteVar>(), lpdi.toCPointer<ByteVar>())

public actual fun StartPage(hdc: HDC): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssys_windows_win32_storage_xps_StartPage(hdc.toCPointer<ByteVar>())
