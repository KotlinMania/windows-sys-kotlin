@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.xps

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc

private object WindowsWin32StorageXpsJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_storage_xps_abortDoc(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_xps_deviceCapabilitiesA(pdevice: Long, pport: Long, fwcapability: Short, poutput: Long, pdevmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_xps_deviceCapabilitiesW(pdevice: Long, pport: Long, fwcapability: Short, poutput: Long, pdevmode: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_xps_endDoc(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_xps_endPage(hdc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_xps_escape(hdc: Long, iescape: Int, cjin: Int, pvin: Long, pvout: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_xps_extEscape(hdc: Long, iescape: Int, cjinput: Int, lpindata: Long, cjoutput: Int, lpoutdata: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_xps_printWindow(hwnd: Long, hdcblt: Long, nflags: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_xps_setAbortProc(hdc: Long, proc: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_xps_startDocA(hdc: Long, lpdi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_xps_startDocW(hdc: Long, lpdi: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_storage_xps_startPage(hdc: Long): Int
}

public actual fun abortDoc(hdc: Hdc): Int =
    WindowsWin32StorageXpsJniBridge.windowssys_windows_win32_storage_xps_abortDoc((hdc?.value ?: 0L))

public actual fun deviceCapabilitiesA(pdevice: Pcstr, pport: Pcstr, fwcapability: PrinterDeviceCapabilities, poutput: Pstr, pdevmode: COpaquePointer?): Int =
    WindowsWin32StorageXpsJniBridge.windowssys_windows_win32_storage_xps_deviceCapabilitiesA((pdevice?.value ?: 0L), (pport?.value ?: 0L), fwcapability.toShort(), (poutput?.value ?: 0L), (pdevmode?.value ?: 0L))

public actual fun deviceCapabilitiesW(pdevice: Pcwstr, pport: Pcwstr, fwcapability: PrinterDeviceCapabilities, poutput: Pwstr, pdevmode: COpaquePointer?): Int =
    WindowsWin32StorageXpsJniBridge.windowssys_windows_win32_storage_xps_deviceCapabilitiesW((pdevice?.value ?: 0L), (pport?.value ?: 0L), fwcapability.toShort(), (poutput?.value ?: 0L), (pdevmode?.value ?: 0L))

public actual fun endDoc(hdc: Hdc): Int =
    WindowsWin32StorageXpsJniBridge.windowssys_windows_win32_storage_xps_endDoc((hdc?.value ?: 0L))

public actual fun endPage(hdc: Hdc): Int =
    WindowsWin32StorageXpsJniBridge.windowssys_windows_win32_storage_xps_endPage((hdc?.value ?: 0L))

public actual fun escape(hdc: Hdc, iescape: Int, cjin: Int, pvin: Pcstr, pvout: COpaquePointer?): Int =
    WindowsWin32StorageXpsJniBridge.windowssys_windows_win32_storage_xps_escape((hdc?.value ?: 0L), iescape, cjin, (pvin?.value ?: 0L), (pvout?.value ?: 0L))

public actual fun extEscape(hdc: Hdc, iescape: Int, cjinput: Int, lpindata: Pcstr, cjoutput: Int, lpoutdata: Pstr): Int =
    WindowsWin32StorageXpsJniBridge.windowssys_windows_win32_storage_xps_extEscape((hdc?.value ?: 0L), iescape, cjinput, (lpindata?.value ?: 0L), cjoutput, (lpoutdata?.value ?: 0L))

public actual fun printWindow(hwnd: Hwnd, hdcblt: Hdc, nflags: PrintWindowFlags): Bool =
    WindowsWin32StorageXpsJniBridge.windowssys_windows_win32_storage_xps_printWindow((hwnd?.value ?: 0L), (hdcblt?.value ?: 0L), nflags.toInt())

public actual fun setAbortProc(hdc: Hdc, proc: Abortproc): Int =
    WindowsWin32StorageXpsJniBridge.windowssys_windows_win32_storage_xps_setAbortProc((hdc?.value ?: 0L), 0L)

public actual fun startDocA(hdc: Hdc, lpdi: COpaquePointer?): Int =
    WindowsWin32StorageXpsJniBridge.windowssys_windows_win32_storage_xps_startDocA((hdc?.value ?: 0L), (lpdi?.value ?: 0L))

public actual fun startDocW(hdc: Hdc, lpdi: COpaquePointer?): Int =
    WindowsWin32StorageXpsJniBridge.windowssys_windows_win32_storage_xps_startDocW((hdc?.value ?: 0L), (lpdi?.value ?: 0L))

public actual fun startPage(hdc: Hdc): Int =
    WindowsWin32StorageXpsJniBridge.windowssys_windows_win32_storage_xps_startPage((hdc?.value ?: 0L))
