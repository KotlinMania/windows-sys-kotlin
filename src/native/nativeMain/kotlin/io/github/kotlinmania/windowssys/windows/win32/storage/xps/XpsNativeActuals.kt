@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssysWindowsWin32StorageXpsAbortDoc
import io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssysWindowsWin32StorageXpsDeviceCapabilitiesA
import io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssysWindowsWin32StorageXpsDeviceCapabilitiesW
import io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssysWindowsWin32StorageXpsEndDoc
import io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssysWindowsWin32StorageXpsEndPage
import io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssysWindowsWin32StorageXpsEscape
import io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssysWindowsWin32StorageXpsExtEscape
import io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssysWindowsWin32StorageXpsPrintWindow
import io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssysWindowsWin32StorageXpsSetAbortProc
import io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssysWindowsWin32StorageXpsStartDocA
import io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssysWindowsWin32StorageXpsStartDocW
import io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssysWindowsWin32StorageXpsStartPage
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun abortDoc(hdc: Hdc): Int =
    windowssysWindowsWin32StorageXpsAbortDoc(hdc.rawAddress.toCPointer<ByteVar>())

public actual fun deviceCapabilitiesA(pdevice: Pcstr, pport: Pcstr, fwcapability: PrinterDeviceCapabilities, poutput: Pstr, pdevmode: ConstPtr<Devmodea>): Int =
    windowssysWindowsWin32StorageXpsDeviceCapabilitiesA(pdevice.rawAddress.toCPointer<ByteVar>(), pport.rawAddress.toCPointer<ByteVar>(), fwcapability, poutput.rawAddress.toCPointer<ByteVar>(), pdevmode.rawAddress.toCPointer<ByteVar>())

public actual fun deviceCapabilitiesW(pdevice: Pcwstr, pport: Pcwstr, fwcapability: PrinterDeviceCapabilities, poutput: Pwstr, pdevmode: ConstPtr<Devmodew>): Int =
    windowssysWindowsWin32StorageXpsDeviceCapabilitiesW(pdevice.rawAddress.toCPointer<ByteVar>(), pport.rawAddress.toCPointer<ByteVar>(), fwcapability, poutput.rawAddress.toCPointer<ByteVar>(), pdevmode.rawAddress.toCPointer<ByteVar>())

public actual fun endDoc(hdc: Hdc): Int =
    windowssysWindowsWin32StorageXpsEndDoc(hdc.rawAddress.toCPointer<ByteVar>())

public actual fun endPage(hdc: Hdc): Int =
    windowssysWindowsWin32StorageXpsEndPage(hdc.rawAddress.toCPointer<ByteVar>())

public actual fun escape(hdc: Hdc, iescape: Int, cjin: Int, pvin: Pcstr, pvout: MutPtr<CVoid>): Int =
    windowssysWindowsWin32StorageXpsEscape(hdc.rawAddress.toCPointer<ByteVar>(), iescape, cjin, pvin.rawAddress.toCPointer<ByteVar>(), pvout.rawAddress.toCPointer<ByteVar>())

public actual fun extEscape(hdc: Hdc, iescape: Int, cjinput: Int, lpindata: Pcstr, cjoutput: Int, lpoutdata: Pstr): Int =
    windowssysWindowsWin32StorageXpsExtEscape(hdc.rawAddress.toCPointer<ByteVar>(), iescape, cjinput, lpindata.rawAddress.toCPointer<ByteVar>(), cjoutput, lpoutdata.rawAddress.toCPointer<ByteVar>())

public actual fun printWindow(hwnd: Hwnd, hdcblt: Hdc, nflags: PrintWindowFlags): Bool =
    windowssysWindowsWin32StorageXpsPrintWindow(hwnd.rawAddress.toCPointer<ByteVar>(), hdcblt.rawAddress.toCPointer<ByteVar>(), nflags)

public actual fun setAbortProc(hdc: Hdc, proc: Abortproc): Int =
    windowssysWindowsWin32StorageXpsSetAbortProc(hdc.rawAddress.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun startDocA(hdc: Hdc, lpdi: ConstPtr<Docinfoa>): Int =
    windowssysWindowsWin32StorageXpsStartDocA(hdc.rawAddress.toCPointer<ByteVar>(), lpdi.rawAddress.toCPointer<ByteVar>())

public actual fun startDocW(hdc: Hdc, lpdi: ConstPtr<Docinfow>): Int =
    windowssysWindowsWin32StorageXpsStartDocW(hdc.rawAddress.toCPointer<ByteVar>(), lpdi.rawAddress.toCPointer<ByteVar>())

public actual fun startPage(hdc: Hdc): Int =
    windowssysWindowsWin32StorageXpsStartPage(hdc.rawAddress.toCPointer<ByteVar>())
