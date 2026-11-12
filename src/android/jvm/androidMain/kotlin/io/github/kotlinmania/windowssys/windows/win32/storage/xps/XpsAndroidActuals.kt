@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.xps

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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
    external fun windowssysWindowsWin32StorageXpsAbortDoc(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageXpsDeviceCapabilitiesA(pdevice: Long, pport: Long, fwcapability: Short, poutput: Long, pdevmode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageXpsDeviceCapabilitiesW(pdevice: Long, pport: Long, fwcapability: Short, poutput: Long, pdevmode: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageXpsEndDoc(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageXpsEndPage(hdc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageXpsEscape(hdc: Long, iescape: Int, cjin: Int, pvin: Long, pvout: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageXpsExtEscape(hdc: Long, iescape: Int, cjinput: Int, lpindata: Long, cjoutput: Int, lpoutdata: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageXpsPrintWindow(hwnd: Long, hdcblt: Long, nflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageXpsSetAbortProc(hdc: Long, proc: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageXpsStartDocA(hdc: Long, lpdi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageXpsStartDocW(hdc: Long, lpdi: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageXpsStartPage(hdc: Long): Int
}

public actual fun abortDoc(hdc: Hdc): Int =
    WindowsWin32StorageXpsJniBridge.windowssysWindowsWin32StorageXpsAbortDoc(hdc.rawAddress)

public actual fun deviceCapabilitiesA(pdevice: Pcstr, pport: Pcstr, fwcapability: PrinterDeviceCapabilities, poutput: Pstr, pdevmode: ConstPtr): Int =
    WindowsWin32StorageXpsJniBridge.windowssysWindowsWin32StorageXpsDeviceCapabilitiesA(pdevice.rawAddress, pport.rawAddress, fwcapability.toShort(), poutput.rawAddress, pdevmode.rawAddress)

public actual fun deviceCapabilitiesW(pdevice: Pcwstr, pport: Pcwstr, fwcapability: PrinterDeviceCapabilities, poutput: Pwstr, pdevmode: ConstPtr): Int =
    WindowsWin32StorageXpsJniBridge.windowssysWindowsWin32StorageXpsDeviceCapabilitiesW(pdevice.rawAddress, pport.rawAddress, fwcapability.toShort(), poutput.rawAddress, pdevmode.rawAddress)

public actual fun endDoc(hdc: Hdc): Int =
    WindowsWin32StorageXpsJniBridge.windowssysWindowsWin32StorageXpsEndDoc(hdc.rawAddress)

public actual fun endPage(hdc: Hdc): Int =
    WindowsWin32StorageXpsJniBridge.windowssysWindowsWin32StorageXpsEndPage(hdc.rawAddress)

public actual fun escape(hdc: Hdc, iescape: Int, cjin: Int, pvin: Pcstr, pvout: MutPtr): Int =
    WindowsWin32StorageXpsJniBridge.windowssysWindowsWin32StorageXpsEscape(hdc.rawAddress, iescape, cjin, pvin.rawAddress, pvout.rawAddress)

public actual fun extEscape(hdc: Hdc, iescape: Int, cjinput: Int, lpindata: Pcstr, cjoutput: Int, lpoutdata: Pstr): Int =
    WindowsWin32StorageXpsJniBridge.windowssysWindowsWin32StorageXpsExtEscape(hdc.rawAddress, iescape, cjinput, lpindata.rawAddress, cjoutput, lpoutdata.rawAddress)

public actual fun printWindow(hwnd: Hwnd, hdcblt: Hdc, nflags: PrintWindowFlags): Bool =
    WindowsWin32StorageXpsJniBridge.windowssysWindowsWin32StorageXpsPrintWindow(hwnd.rawAddress, hdcblt.rawAddress, nflags.toInt())

public actual fun setAbortProc(hdc: Hdc, proc: Abortproc): Int =
    WindowsWin32StorageXpsJniBridge.windowssysWindowsWin32StorageXpsSetAbortProc(hdc.rawAddress, 0L)

public actual fun startDocA(hdc: Hdc, lpdi: ConstPtr): Int =
    WindowsWin32StorageXpsJniBridge.windowssysWindowsWin32StorageXpsStartDocA(hdc.rawAddress, lpdi.rawAddress)

public actual fun startDocW(hdc: Hdc, lpdi: ConstPtr): Int =
    WindowsWin32StorageXpsJniBridge.windowssysWindowsWin32StorageXpsStartDocW(hdc.rawAddress, lpdi.rawAddress)

public actual fun startPage(hdc: Hdc): Int =
    WindowsWin32StorageXpsJniBridge.windowssysWindowsWin32StorageXpsStartPage(hdc.rawAddress)
