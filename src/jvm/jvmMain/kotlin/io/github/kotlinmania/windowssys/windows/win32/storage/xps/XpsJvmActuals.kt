@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.xps

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCSTR
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.core.PSTR
import io.github.kotlinmania.windowssys.core.PWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HDC

private object WindowsWin32StorageXpsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_xps_AbortDoc(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_xps_DeviceCapabilitiesA(pdevice: Long, pport: Long, fwcapability: Short, poutput: Long, pdevmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_xps_DeviceCapabilitiesW(pdevice: Long, pport: Long, fwcapability: Short, poutput: Long, pdevmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_xps_EndDoc(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_xps_EndPage(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_xps_Escape(hdc: Long, iescape: Int, cjin: Int, pvin: Long, pvout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_xps_ExtEscape(hdc: Long, iescape: Int, cjinput: Int, lpindata: Long, cjoutput: Int, lpoutdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_xps_PrintWindow(hwnd: Long, hdcblt: Long, nflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_xps_SetAbortProc(hdc: Long, proc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_xps_StartDocA(hdc: Long, lpdi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_xps_StartDocW(hdc: Long, lpdi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_xps_StartPage(hdc: Long): Int
}

public actual fun AbortDoc(hdc: HDC): Int =
    WindowsWin32StorageXpsJniBridge.windowssys_windows_win32_storage_xps_AbortDoc(hdc)

public actual fun DeviceCapabilitiesA(pdevice: PCSTR, pport: PCSTR, fwcapability: PRINTER_DEVICE_CAPABILITIES, poutput: PSTR, pdevmode: Long): Int =
    WindowsWin32StorageXpsJniBridge.windowssys_windows_win32_storage_xps_DeviceCapabilitiesA(pdevice, pport, fwcapability.toShort(), poutput, pdevmode)

public actual fun DeviceCapabilitiesW(pdevice: PCWSTR, pport: PCWSTR, fwcapability: PRINTER_DEVICE_CAPABILITIES, poutput: PWSTR, pdevmode: Long): Int =
    WindowsWin32StorageXpsJniBridge.windowssys_windows_win32_storage_xps_DeviceCapabilitiesW(pdevice, pport, fwcapability.toShort(), poutput, pdevmode)

public actual fun EndDoc(hdc: HDC): Int =
    WindowsWin32StorageXpsJniBridge.windowssys_windows_win32_storage_xps_EndDoc(hdc)

public actual fun EndPage(hdc: HDC): Int =
    WindowsWin32StorageXpsJniBridge.windowssys_windows_win32_storage_xps_EndPage(hdc)

public actual fun Escape(hdc: HDC, iescape: Int, cjin: Int, pvin: PCSTR, pvout: Long): Int =
    WindowsWin32StorageXpsJniBridge.windowssys_windows_win32_storage_xps_Escape(hdc, iescape, cjin, pvin, pvout)

public actual fun ExtEscape(hdc: HDC, iescape: Int, cjinput: Int, lpindata: PCSTR, cjoutput: Int, lpoutdata: PSTR): Int =
    WindowsWin32StorageXpsJniBridge.windowssys_windows_win32_storage_xps_ExtEscape(hdc, iescape, cjinput, lpindata, cjoutput, lpoutdata)

public actual fun PrintWindow(hwnd: HWND, hdcblt: HDC, nflags: PRINT_WINDOW_FLAGS): BOOL =
    WindowsWin32StorageXpsJniBridge.windowssys_windows_win32_storage_xps_PrintWindow(hwnd, hdcblt, nflags.toInt())

public actual fun SetAbortProc(hdc: HDC, proc: ABORTPROC): Int =
    WindowsWin32StorageXpsJniBridge.windowssys_windows_win32_storage_xps_SetAbortProc(hdc, proc.toLong())

public actual fun StartDocA(hdc: HDC, lpdi: Long): Int =
    WindowsWin32StorageXpsJniBridge.windowssys_windows_win32_storage_xps_StartDocA(hdc, lpdi)

public actual fun StartDocW(hdc: HDC, lpdi: Long): Int =
    WindowsWin32StorageXpsJniBridge.windowssys_windows_win32_storage_xps_StartDocW(hdc, lpdi)

public actual fun StartPage(hdc: HDC): Int =
    WindowsWin32StorageXpsJniBridge.windowssys_windows_win32_storage_xps_StartPage(hdc)
