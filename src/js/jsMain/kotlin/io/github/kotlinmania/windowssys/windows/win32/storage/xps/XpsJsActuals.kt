@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWin32StorageXpsNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun abortDoc(hdc: Hdc): Int =
    if (windowsWin32StorageXpsNapiAddon != null) (windowsWin32StorageXpsNapiAddon.windowssysWindowsWin32StorageXpsAbortDoc(hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deviceCapabilitiesA(pdevice: Pcstr, pport: Pcstr, fwcapability: PrinterDeviceCapabilities, poutput: Pstr, pdevmode: ConstPtr<Devmodea>): Int =
    if (windowsWin32StorageXpsNapiAddon != null) (windowsWin32StorageXpsNapiAddon.windowssysWindowsWin32StorageXpsDeviceCapabilitiesA(pdevice.rawAddress.toString(), pport.rawAddress.toString(), fwcapability.toInt(), poutput.rawAddress.toString(), pdevmode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deviceCapabilitiesW(pdevice: Pcwstr, pport: Pcwstr, fwcapability: PrinterDeviceCapabilities, poutput: Pwstr, pdevmode: ConstPtr<Devmodew>): Int =
    if (windowsWin32StorageXpsNapiAddon != null) (windowsWin32StorageXpsNapiAddon.windowssysWindowsWin32StorageXpsDeviceCapabilitiesW(pdevice.rawAddress.toString(), pport.rawAddress.toString(), fwcapability.toInt(), poutput.rawAddress.toString(), pdevmode.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endDoc(hdc: Hdc): Int =
    if (windowsWin32StorageXpsNapiAddon != null) (windowsWin32StorageXpsNapiAddon.windowssysWindowsWin32StorageXpsEndDoc(hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endPage(hdc: Hdc): Int =
    if (windowsWin32StorageXpsNapiAddon != null) (windowsWin32StorageXpsNapiAddon.windowssysWindowsWin32StorageXpsEndPage(hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun escape(hdc: Hdc, iescape: Int, cjin: Int, pvin: Pcstr, pvout: MutPtr<CVoid>): Int =
    if (windowsWin32StorageXpsNapiAddon != null) (windowsWin32StorageXpsNapiAddon.windowssysWindowsWin32StorageXpsEscape(hdc.rawAddress.toString(), iescape, cjin, pvin.rawAddress.toString(), pvout.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extEscape(hdc: Hdc, iescape: Int, cjinput: Int, lpindata: Pcstr, cjoutput: Int, lpoutdata: Pstr): Int =
    if (windowsWin32StorageXpsNapiAddon != null) (windowsWin32StorageXpsNapiAddon.windowssysWindowsWin32StorageXpsExtEscape(hdc.rawAddress.toString(), iescape, cjinput, lpindata.rawAddress.toString(), cjoutput, lpoutdata.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printWindow(hwnd: Hwnd, hdcblt: Hdc, nflags: PrintWindowFlags): Bool =
    if (windowsWin32StorageXpsNapiAddon != null) (windowsWin32StorageXpsNapiAddon.windowssysWindowsWin32StorageXpsPrintWindow(hwnd.rawAddress.toString(), hdcblt.rawAddress.toString(), nflags.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setAbortProc(hdc: Hdc, proc: Abortproc): Int =
    if (windowsWin32StorageXpsNapiAddon != null) (windowsWin32StorageXpsNapiAddon.windowssysWindowsWin32StorageXpsSetAbortProc(hdc.rawAddress.toString(), 0L.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startDocA(hdc: Hdc, lpdi: ConstPtr<Docinfoa>): Int =
    if (windowsWin32StorageXpsNapiAddon != null) (windowsWin32StorageXpsNapiAddon.windowssysWindowsWin32StorageXpsStartDocA(hdc.rawAddress.toString(), lpdi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startDocW(hdc: Hdc, lpdi: ConstPtr<Docinfow>): Int =
    if (windowsWin32StorageXpsNapiAddon != null) (windowsWin32StorageXpsNapiAddon.windowssysWindowsWin32StorageXpsStartDocW(hdc.rawAddress.toString(), lpdi.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startPage(hdc: Hdc): Int =
    if (windowsWin32StorageXpsNapiAddon != null) (windowsWin32StorageXpsNapiAddon.windowssysWindowsWin32StorageXpsStartPage(hdc.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
