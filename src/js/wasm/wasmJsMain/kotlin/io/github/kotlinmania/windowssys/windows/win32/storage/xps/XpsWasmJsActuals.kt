@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

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

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32StorageXpsNapiAddon(): Boolean

private val windowsWin32StorageXpsNapiAvailable: Boolean = initWindowsWin32StorageXpsNapiAddon()

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageXpsAbortDoc(p0)")
private external fun wasmWindowssysWindowsWin32StorageXpsAbortDoc(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageXpsDeviceCapabilitiesA(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageXpsDeviceCapabilitiesA(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageXpsDeviceCapabilitiesW(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageXpsDeviceCapabilitiesW(p0: String, p1: String, p2: Int, p3: String, p4: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageXpsEndDoc(p0)")
private external fun wasmWindowssysWindowsWin32StorageXpsEndDoc(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageXpsEndPage(p0)")
private external fun wasmWindowssysWindowsWin32StorageXpsEndPage(p0: String): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageXpsEscape(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32StorageXpsEscape(p0: String, p1: Int, p2: Int, p3: String, p4: String): Int

@JsFun("(p0, p1, p2, p3, p4, p5) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageXpsExtEscape(p0, p1, p2, p3, p4, p5)")
private external fun wasmWindowssysWindowsWin32StorageXpsExtEscape(p0: String, p1: Int, p2: Int, p3: String, p4: Int, p5: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageXpsPrintWindow(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32StorageXpsPrintWindow(p0: String, p1: String, p2: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageXpsSetAbortProc(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageXpsSetAbortProc(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageXpsStartDocA(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageXpsStartDocA(p0: String, p1: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageXpsStartDocW(p0, p1)")
private external fun wasmWindowssysWindowsWin32StorageXpsStartDocW(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32StorageXpsStartPage(p0)")
private external fun wasmWindowssysWindowsWin32StorageXpsStartPage(p0: String): Int

public actual fun abortDoc(hdc: Hdc): Int =
    if (windowsWin32StorageXpsNapiAvailable) wasmWindowssysWindowsWin32StorageXpsAbortDoc(hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deviceCapabilitiesA(pdevice: Pcstr, pport: Pcstr, fwcapability: PrinterDeviceCapabilities, poutput: Pstr, pdevmode: ConstPtr): Int =
    if (windowsWin32StorageXpsNapiAvailable) wasmWindowssysWindowsWin32StorageXpsDeviceCapabilitiesA(pdevice.rawAddress.toString(), pport.rawAddress.toString(), fwcapability.toInt(), poutput.rawAddress.toString(), pdevmode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun deviceCapabilitiesW(pdevice: Pcwstr, pport: Pcwstr, fwcapability: PrinterDeviceCapabilities, poutput: Pwstr, pdevmode: ConstPtr): Int =
    if (windowsWin32StorageXpsNapiAvailable) wasmWindowssysWindowsWin32StorageXpsDeviceCapabilitiesW(pdevice.rawAddress.toString(), pport.rawAddress.toString(), fwcapability.toInt(), poutput.rawAddress.toString(), pdevmode.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endDoc(hdc: Hdc): Int =
    if (windowsWin32StorageXpsNapiAvailable) wasmWindowssysWindowsWin32StorageXpsEndDoc(hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun endPage(hdc: Hdc): Int =
    if (windowsWin32StorageXpsNapiAvailable) wasmWindowssysWindowsWin32StorageXpsEndPage(hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun escape(hdc: Hdc, iescape: Int, cjin: Int, pvin: Pcstr, pvout: MutPtr): Int =
    if (windowsWin32StorageXpsNapiAvailable) wasmWindowssysWindowsWin32StorageXpsEscape(hdc.rawAddress.toString(), iescape, cjin, pvin.rawAddress.toString(), pvout.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun extEscape(hdc: Hdc, iescape: Int, cjinput: Int, lpindata: Pcstr, cjoutput: Int, lpoutdata: Pstr): Int =
    if (windowsWin32StorageXpsNapiAvailable) wasmWindowssysWindowsWin32StorageXpsExtEscape(hdc.rawAddress.toString(), iescape, cjinput, lpindata.rawAddress.toString(), cjoutput, lpoutdata.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun printWindow(hwnd: Hwnd, hdcblt: Hdc, nflags: PrintWindowFlags): Bool =
    if (windowsWin32StorageXpsNapiAvailable) wasmWindowssysWindowsWin32StorageXpsPrintWindow(hwnd.rawAddress.toString(), hdcblt.rawAddress.toString(), nflags.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setAbortProc(hdc: Hdc, proc: Abortproc): Int =
    if (windowsWin32StorageXpsNapiAvailable) wasmWindowssysWindowsWin32StorageXpsSetAbortProc(hdc.rawAddress.toString(), 0L.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startDocA(hdc: Hdc, lpdi: ConstPtr): Int =
    if (windowsWin32StorageXpsNapiAvailable) wasmWindowssysWindowsWin32StorageXpsStartDocA(hdc.rawAddress.toString(), lpdi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startDocW(hdc: Hdc, lpdi: ConstPtr): Int =
    if (windowsWin32StorageXpsNapiAvailable) wasmWindowssysWindowsWin32StorageXpsStartDocW(hdc.rawAddress.toString(), lpdi.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun startPage(hdc: Hdc): Int =
    if (windowsWin32StorageXpsNapiAvailable) wasmWindowssysWindowsWin32StorageXpsStartPage(hdc.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")
