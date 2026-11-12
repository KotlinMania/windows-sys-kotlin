@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.hidpi

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Point
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hmonitor
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Htheme
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.SystemMetricsIndex
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.WindowExStyle
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.WindowStyle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun initWindowsWin32UiHidpiNapiAddon(): Boolean

private val windowsWin32UiHidpiNapiAvailable: Boolean = initWindowsWin32UiHidpiNapiAddon()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiHidpiAdjustWindowRectExForDpi(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiHidpiAdjustWindowRectExForDpi(p0: String, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiHidpiAreDpiAwarenessContextsEqual(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiHidpiAreDpiAwarenessContextsEqual(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiHidpiEnableNonClientDpiScaling(p0)")
private external fun wasmWindowssysWindowsWin32UiHidpiEnableNonClientDpiScaling(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiHidpiGetAwarenessFromDpiAwarenessContext(p0)")
private external fun wasmWindowssysWindowsWin32UiHidpiGetAwarenessFromDpiAwarenessContext(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiHidpiGetDialogControlDpiChangeBehavior(p0)")
private external fun wasmWindowssysWindowsWin32UiHidpiGetDialogControlDpiChangeBehavior(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiHidpiGetDialogDpiChangeBehavior(p0)")
private external fun wasmWindowssysWindowsWin32UiHidpiGetDialogDpiChangeBehavior(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiHidpiGetDpiAwarenessContextForProcess(p0)")
private external fun wasmWindowssysWindowsWin32UiHidpiGetDpiAwarenessContextForProcess(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiHidpiGetDpiForMonitor(p0, p1, p2, p3)")
private external fun wasmWindowssysWindowsWin32UiHidpiGetDpiForMonitor(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiHidpiGetDpiForSystem()")
private external fun wasmWindowssysWindowsWin32UiHidpiGetDpiForSystem(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiHidpiGetDpiForWindow(p0)")
private external fun wasmWindowssysWindowsWin32UiHidpiGetDpiForWindow(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiHidpiGetDpiFromDpiAwarenessContext(p0)")
private external fun wasmWindowssysWindowsWin32UiHidpiGetDpiFromDpiAwarenessContext(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiHidpiGetProcessDpiAwareness(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiHidpiGetProcessDpiAwareness(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiHidpiGetSystemDpiForProcess(p0)")
private external fun wasmWindowssysWindowsWin32UiHidpiGetSystemDpiForProcess(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiHidpiGetSystemMetricsForDpi(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiHidpiGetSystemMetricsForDpi(p0: Int, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiHidpiGetThreadDpiAwarenessContext()")
private external fun wasmWindowssysWindowsWin32UiHidpiGetThreadDpiAwarenessContext(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiHidpiGetThreadDpiHostingBehavior()")
private external fun wasmWindowssysWindowsWin32UiHidpiGetThreadDpiHostingBehavior(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiHidpiGetWindowDpiAwarenessContext(p0)")
private external fun wasmWindowssysWindowsWin32UiHidpiGetWindowDpiAwarenessContext(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiHidpiGetWindowDpiHostingBehavior(p0)")
private external fun wasmWindowssysWindowsWin32UiHidpiGetWindowDpiHostingBehavior(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiHidpiIsValidDpiAwarenessContext(p0)")
private external fun wasmWindowssysWindowsWin32UiHidpiIsValidDpiAwarenessContext(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiHidpiLogicalToPhysicalPointForPerMonitorDPI(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiHidpiLogicalToPhysicalPointForPerMonitorDPI(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiHidpiOpenThemeDataForDpi(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiHidpiOpenThemeDataForDpi(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiHidpiPhysicalToLogicalPointForPerMonitorDPI(p0, p1)")
private external fun wasmWindowssysWindowsWin32UiHidpiPhysicalToLogicalPointForPerMonitorDPI(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiHidpiSetDialogControlDpiChangeBehavior(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiHidpiSetDialogControlDpiChangeBehavior(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiHidpiSetDialogDpiChangeBehavior(p0, p1, p2)")
private external fun wasmWindowssysWindowsWin32UiHidpiSetDialogDpiChangeBehavior(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiHidpiSetProcessDpiAwareness(p0)")
private external fun wasmWindowssysWindowsWin32UiHidpiSetProcessDpiAwareness(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiHidpiSetProcessDpiAwarenessContext(p0)")
private external fun wasmWindowssysWindowsWin32UiHidpiSetProcessDpiAwarenessContext(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiHidpiSetThreadDpiAwarenessContext(p0)")
private external fun wasmWindowssysWindowsWin32UiHidpiSetThreadDpiAwarenessContext(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiHidpiSetThreadDpiHostingBehavior(p0)")
private external fun wasmWindowssysWindowsWin32UiHidpiSetThreadDpiHostingBehavior(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssysWindowsWin32UiHidpiSystemParametersInfoForDpi(p0, p1, p2, p3, p4)")
private external fun wasmWindowssysWindowsWin32UiHidpiSystemParametersInfoForDpi(p0: Int, p1: Int, p2: String, p3: Int, p4: Int): Int

public actual fun adjustWindowRectExForDpi(lprect: MutPtr<Rect>, dwstyle: WindowStyle, bmenu: Bool, dwexstyle: WindowExStyle, dpi: UInt): Bool =
    if (windowsWin32UiHidpiNapiAvailable) wasmWindowssysWindowsWin32UiHidpiAdjustWindowRectExForDpi(lprect.rawAddress.toString(), dwstyle.toInt(), bmenu, dwexstyle.toInt(), dpi.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun areDpiAwarenessContextsEqual(dpicontexta: DpiAwarenessContext, dpicontextb: DpiAwarenessContext): Bool =
    if (windowsWin32UiHidpiNapiAvailable) wasmWindowssysWindowsWin32UiHidpiAreDpiAwarenessContextsEqual(dpicontexta.rawAddress.toString(), dpicontextb.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableNonClientDpiScaling(hwnd: Hwnd): Bool =
    if (windowsWin32UiHidpiNapiAvailable) wasmWindowssysWindowsWin32UiHidpiEnableNonClientDpiScaling(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAwarenessFromDpiAwarenessContext(value: DpiAwarenessContext): DpiAwareness =
    if (windowsWin32UiHidpiNapiAvailable) wasmWindowssysWindowsWin32UiHidpiGetAwarenessFromDpiAwarenessContext(value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDialogControlDpiChangeBehavior(hwnd: Hwnd): DialogControlDpiChangeBehaviors =
    if (windowsWin32UiHidpiNapiAvailable) wasmWindowssysWindowsWin32UiHidpiGetDialogControlDpiChangeBehavior(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDialogDpiChangeBehavior(hdlg: Hwnd): DialogDpiChangeBehaviors =
    if (windowsWin32UiHidpiNapiAvailable) wasmWindowssysWindowsWin32UiHidpiGetDialogDpiChangeBehavior(hdlg.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDpiAwarenessContextForProcess(hprocess: Handle): DpiAwarenessContext =
    if (windowsWin32UiHidpiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiHidpiGetDpiAwarenessContextForProcess(hprocess.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDpiForMonitor(hmonitor: Hmonitor, dpitype: MonitorDpiType, dpix: MutPtr<UInt>, dpiy: MutPtr<UInt>): Hresult =
    if (windowsWin32UiHidpiNapiAvailable) wasmWindowssysWindowsWin32UiHidpiGetDpiForMonitor(hmonitor.rawAddress.toString(), dpitype, dpix.rawAddress.toString(), dpiy.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDpiForSystem(): UInt =
    if (windowsWin32UiHidpiNapiAvailable) wasmWindowssysWindowsWin32UiHidpiGetDpiForSystem().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDpiForWindow(hwnd: Hwnd): UInt =
    if (windowsWin32UiHidpiNapiAvailable) wasmWindowssysWindowsWin32UiHidpiGetDpiForWindow(hwnd.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDpiFromDpiAwarenessContext(value: DpiAwarenessContext): UInt =
    if (windowsWin32UiHidpiNapiAvailable) wasmWindowssysWindowsWin32UiHidpiGetDpiFromDpiAwarenessContext(value.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessDpiAwareness(hprocess: Handle, value: MutPtr<ProcessDpiAwareness>): Hresult =
    if (windowsWin32UiHidpiNapiAvailable) wasmWindowssysWindowsWin32UiHidpiGetProcessDpiAwareness(hprocess.rawAddress.toString(), value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemDpiForProcess(hprocess: Handle): UInt =
    if (windowsWin32UiHidpiNapiAvailable) wasmWindowssysWindowsWin32UiHidpiGetSystemDpiForProcess(hprocess.rawAddress.toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemMetricsForDpi(nindex: SystemMetricsIndex, dpi: UInt): Int =
    if (windowsWin32UiHidpiNapiAvailable) wasmWindowssysWindowsWin32UiHidpiGetSystemMetricsForDpi(nindex, dpi.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadDpiAwarenessContext(): DpiAwarenessContext =
    if (windowsWin32UiHidpiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiHidpiGetThreadDpiAwarenessContext().toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadDpiHostingBehavior(): DpiHostingBehavior =
    if (windowsWin32UiHidpiNapiAvailable) wasmWindowssysWindowsWin32UiHidpiGetThreadDpiHostingBehavior() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowDpiAwarenessContext(hwnd: Hwnd): DpiAwarenessContext =
    if (windowsWin32UiHidpiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiHidpiGetWindowDpiAwarenessContext(hwnd.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowDpiHostingBehavior(hwnd: Hwnd): DpiHostingBehavior =
    if (windowsWin32UiHidpiNapiAvailable) wasmWindowssysWindowsWin32UiHidpiGetWindowDpiHostingBehavior(hwnd.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidDpiAwarenessContext(value: DpiAwarenessContext): Bool =
    if (windowsWin32UiHidpiNapiAvailable) wasmWindowssysWindowsWin32UiHidpiIsValidDpiAwarenessContext(value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun logicalToPhysicalPointForPerMonitorDPI(hwnd: Hwnd, lppoint: MutPtr<Point>): Bool =
    if (windowsWin32UiHidpiNapiAvailable) wasmWindowssysWindowsWin32UiHidpiLogicalToPhysicalPointForPerMonitorDPI(hwnd.rawAddress.toString(), lppoint.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openThemeDataForDpi(hwnd: Hwnd, pszclasslist: Pcwstr, dpi: UInt): Htheme =
    if (windowsWin32UiHidpiNapiAvailable) wasmWindowssysWindowsWin32UiHidpiOpenThemeDataForDpi(hwnd.rawAddress.toString(), pszclasslist.rawAddress.toString(), dpi.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun physicalToLogicalPointForPerMonitorDPI(hwnd: Hwnd, lppoint: MutPtr<Point>): Bool =
    if (windowsWin32UiHidpiNapiAvailable) wasmWindowssysWindowsWin32UiHidpiPhysicalToLogicalPointForPerMonitorDPI(hwnd.rawAddress.toString(), lppoint.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDialogControlDpiChangeBehavior(hwnd: Hwnd, mask: DialogControlDpiChangeBehaviors, values: DialogControlDpiChangeBehaviors): Bool =
    if (windowsWin32UiHidpiNapiAvailable) wasmWindowssysWindowsWin32UiHidpiSetDialogControlDpiChangeBehavior(hwnd.rawAddress.toString(), mask, values) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDialogDpiChangeBehavior(hdlg: Hwnd, mask: DialogDpiChangeBehaviors, values: DialogDpiChangeBehaviors): Bool =
    if (windowsWin32UiHidpiNapiAvailable) wasmWindowssysWindowsWin32UiHidpiSetDialogDpiChangeBehavior(hdlg.rawAddress.toString(), mask, values) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessDpiAwareness(value: ProcessDpiAwareness): Hresult =
    if (windowsWin32UiHidpiNapiAvailable) wasmWindowssysWindowsWin32UiHidpiSetProcessDpiAwareness(value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessDpiAwarenessContext(value: DpiAwarenessContext): Bool =
    if (windowsWin32UiHidpiNapiAvailable) wasmWindowssysWindowsWin32UiHidpiSetProcessDpiAwarenessContext(value.rawAddress.toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadDpiAwarenessContext(dpicontext: DpiAwarenessContext): DpiAwarenessContext =
    if (windowsWin32UiHidpiNapiAvailable) MutPtr(wasmWindowssysWindowsWin32UiHidpiSetThreadDpiAwarenessContext(dpicontext.rawAddress.toString()).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadDpiHostingBehavior(value: DpiHostingBehavior): DpiHostingBehavior =
    if (windowsWin32UiHidpiNapiAvailable) wasmWindowssysWindowsWin32UiHidpiSetThreadDpiHostingBehavior(value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemParametersInfoForDpi(uiaction: UInt, uiparam: UInt, pvparam: MutPtr<CVoid>, fwinini: UInt, dpi: UInt): Bool =
    if (windowsWin32UiHidpiNapiAvailable) wasmWindowssysWindowsWin32UiHidpiSystemParametersInfoForDpi(uiaction.toInt(), uiparam.toInt(), pvparam.rawAddress.toString(), fwinini.toInt(), dpi.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")
