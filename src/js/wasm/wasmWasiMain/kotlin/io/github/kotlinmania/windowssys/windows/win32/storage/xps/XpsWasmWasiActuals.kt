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

public actual fun abortDoc(hdc: Hdc): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun deviceCapabilitiesA(pdevice: Pcstr, pport: Pcstr, fwcapability: PrinterDeviceCapabilities, poutput: Pstr, pdevmode: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun deviceCapabilitiesW(pdevice: Pcwstr, pport: Pcwstr, fwcapability: PrinterDeviceCapabilities, poutput: Pwstr, pdevmode: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun endDoc(hdc: Hdc): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun endPage(hdc: Hdc): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun escape(hdc: Hdc, iescape: Int, cjin: Int, pvin: Pcstr, pvout: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun extEscape(hdc: Hdc, iescape: Int, cjinput: Int, lpindata: Pcstr, cjoutput: Int, lpoutdata: Pstr): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun printWindow(hwnd: Hwnd, hdcblt: Hdc, nflags: PrintWindowFlags): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setAbortProc(hdc: Hdc, proc: Abortproc): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun startDocA(hdc: Hdc, lpdi: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun startDocW(hdc: Hdc, lpdi: COpaquePointer?): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun startPage(hdc: Hdc): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
