@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.xps

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.core.Pstr
import io.github.kotlinmania.windowssys.core.Pwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hdc
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun abortDoc(hdc: Hdc): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssys_windows_win32_storage_xps_abortDoc(hdc?.value?.toCPointer<ByteVar>())

public actual fun deviceCapabilitiesA(pdevice: Pcstr, pport: Pcstr, fwcapability: PrinterDeviceCapabilities, poutput: Pstr, pdevmode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssys_windows_win32_storage_xps_deviceCapabilitiesA(pdevice?.value?.toCPointer<ByteVar>(), pport?.value?.toCPointer<ByteVar>(), fwcapability, poutput?.value?.toCPointer<ByteVar>(), pdevmode?.value?.toCPointer<ByteVar>())

public actual fun deviceCapabilitiesW(pdevice: Pcwstr, pport: Pcwstr, fwcapability: PrinterDeviceCapabilities, poutput: Pwstr, pdevmode: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssys_windows_win32_storage_xps_deviceCapabilitiesW(pdevice?.value?.toCPointer<ByteVar>(), pport?.value?.toCPointer<ByteVar>(), fwcapability, poutput?.value?.toCPointer<ByteVar>(), pdevmode?.value?.toCPointer<ByteVar>())

public actual fun endDoc(hdc: Hdc): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssys_windows_win32_storage_xps_endDoc(hdc?.value?.toCPointer<ByteVar>())

public actual fun endPage(hdc: Hdc): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssys_windows_win32_storage_xps_endPage(hdc?.value?.toCPointer<ByteVar>())

public actual fun escape(hdc: Hdc, iescape: Int, cjin: Int, pvin: Pcstr, pvout: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssys_windows_win32_storage_xps_escape(hdc?.value?.toCPointer<ByteVar>(), iescape, cjin, pvin?.value?.toCPointer<ByteVar>(), pvout?.value?.toCPointer<ByteVar>())

public actual fun extEscape(hdc: Hdc, iescape: Int, cjinput: Int, lpindata: Pcstr, cjoutput: Int, lpoutdata: Pstr): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssys_windows_win32_storage_xps_extEscape(hdc?.value?.toCPointer<ByteVar>(), iescape, cjinput, lpindata?.value?.toCPointer<ByteVar>(), cjoutput, lpoutdata?.value?.toCPointer<ByteVar>())

public actual fun printWindow(hwnd: Hwnd, hdcblt: Hdc, nflags: PrintWindowFlags): Bool =
    io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssys_windows_win32_storage_xps_printWindow(hwnd?.value?.toCPointer<ByteVar>(), hdcblt?.value?.toCPointer<ByteVar>(), nflags)

public actual fun setAbortProc(hdc: Hdc, proc: Abortproc): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssys_windows_win32_storage_xps_setAbortProc(hdc?.value?.toCPointer<ByteVar>(), 0L.toCPointer<ByteVar>())

public actual fun startDocA(hdc: Hdc, lpdi: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssys_windows_win32_storage_xps_startDocA(hdc?.value?.toCPointer<ByteVar>(), lpdi?.value?.toCPointer<ByteVar>())

public actual fun startDocW(hdc: Hdc, lpdi: COpaquePointer?): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssys_windows_win32_storage_xps_startDocW(hdc?.value?.toCPointer<ByteVar>(), lpdi?.value?.toCPointer<ByteVar>())

public actual fun startPage(hdc: Hdc): Int =
    io.github.kotlinmania.windowssys.windows.win32.storage.xps.cinterop.windowssys_windows_win32_storage_xps_startPage(hdc?.value?.toCPointer<ByteVar>())
