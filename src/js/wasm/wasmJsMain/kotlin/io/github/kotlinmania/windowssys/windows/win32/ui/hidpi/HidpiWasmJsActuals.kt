@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.js.ExperimentalWasmJsInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.hidpi

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.Hmonitor
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.Htheme
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.SystemMetricsIndex
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.WindowExStyle
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.WindowStyle

@JsFun("() => { if (typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys !== null; if (typeof process === 'undefined' || !process.versions || !process.versions.node) { globalThis.__km_napi_windowssys = null; return false; } var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) { globalThis.__km_napi_windowssys = null; return false; } try { globalThis.__km_napi_windowssys = req('@kotlinmania/windowssys-native-bindings'); return true; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { globalThis.__km_napi_windowssys = req(c); return true; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } globalThis.__km_napi_windowssys = null; return false; }")
private external fun _initWindowsWin32UiHidpiNapiAddon(): Boolean

private val _windowsWin32UiHidpiNapiAvailable: Boolean = _initWindowsWin32UiHidpiNapiAddon()

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_hidpi_adjustWindowRectExForDpi(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_ui_hidpi_adjustWindowRectExForDpi(p0: String, p1: Int, p2: Int, p3: Int, p4: Int): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_hidpi_areDpiAwarenessContextsEqual(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_hidpi_areDpiAwarenessContextsEqual(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_hidpi_enableNonClientDpiScaling(p0)")
private external fun _wasm_windowssys_windows_win32_ui_hidpi_enableNonClientDpiScaling(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_hidpi_getAwarenessFromDpiAwarenessContext(p0)")
private external fun _wasm_windowssys_windows_win32_ui_hidpi_getAwarenessFromDpiAwarenessContext(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_hidpi_getDialogControlDpiChangeBehavior(p0)")
private external fun _wasm_windowssys_windows_win32_ui_hidpi_getDialogControlDpiChangeBehavior(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_hidpi_getDialogDpiChangeBehavior(p0)")
private external fun _wasm_windowssys_windows_win32_ui_hidpi_getDialogDpiChangeBehavior(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_hidpi_getDpiAwarenessContextForProcess(p0)")
private external fun _wasm_windowssys_windows_win32_ui_hidpi_getDpiAwarenessContextForProcess(p0: String): String

@JsFun("(p0, p1, p2, p3) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_hidpi_getDpiForMonitor(p0, p1, p2, p3)")
private external fun _wasm_windowssys_windows_win32_ui_hidpi_getDpiForMonitor(p0: String, p1: Int, p2: String, p3: String): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_hidpi_getDpiForSystem()")
private external fun _wasm_windowssys_windows_win32_ui_hidpi_getDpiForSystem(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_hidpi_getDpiForWindow(p0)")
private external fun _wasm_windowssys_windows_win32_ui_hidpi_getDpiForWindow(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_hidpi_getDpiFromDpiAwarenessContext(p0)")
private external fun _wasm_windowssys_windows_win32_ui_hidpi_getDpiFromDpiAwarenessContext(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_hidpi_getProcessDpiAwareness(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_hidpi_getProcessDpiAwareness(p0: String, p1: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_hidpi_getSystemDpiForProcess(p0)")
private external fun _wasm_windowssys_windows_win32_ui_hidpi_getSystemDpiForProcess(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_hidpi_getSystemMetricsForDpi(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_hidpi_getSystemMetricsForDpi(p0: Int, p1: Int): Int

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_hidpi_getThreadDpiAwarenessContext()")
private external fun _wasm_windowssys_windows_win32_ui_hidpi_getThreadDpiAwarenessContext(): String

@JsFun("() => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_hidpi_getThreadDpiHostingBehavior()")
private external fun _wasm_windowssys_windows_win32_ui_hidpi_getThreadDpiHostingBehavior(): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_hidpi_getWindowDpiAwarenessContext(p0)")
private external fun _wasm_windowssys_windows_win32_ui_hidpi_getWindowDpiAwarenessContext(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_hidpi_getWindowDpiHostingBehavior(p0)")
private external fun _wasm_windowssys_windows_win32_ui_hidpi_getWindowDpiHostingBehavior(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_hidpi_isValidDpiAwarenessContext(p0)")
private external fun _wasm_windowssys_windows_win32_ui_hidpi_isValidDpiAwarenessContext(p0: String): Int

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_hidpi_logicalToPhysicalPointForPerMonitorDPI(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_hidpi_logicalToPhysicalPointForPerMonitorDPI(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_hidpi_openThemeDataForDpi(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_hidpi_openThemeDataForDpi(p0: String, p1: String, p2: Int): String

@JsFun("(p0, p1) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_hidpi_physicalToLogicalPointForPerMonitorDPI(p0, p1)")
private external fun _wasm_windowssys_windows_win32_ui_hidpi_physicalToLogicalPointForPerMonitorDPI(p0: String, p1: String): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_hidpi_setDialogControlDpiChangeBehavior(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_hidpi_setDialogControlDpiChangeBehavior(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0, p1, p2) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_hidpi_setDialogDpiChangeBehavior(p0, p1, p2)")
private external fun _wasm_windowssys_windows_win32_ui_hidpi_setDialogDpiChangeBehavior(p0: String, p1: Int, p2: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_hidpi_setProcessDpiAwareness(p0)")
private external fun _wasm_windowssys_windows_win32_ui_hidpi_setProcessDpiAwareness(p0: Int): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_hidpi_setProcessDpiAwarenessContext(p0)")
private external fun _wasm_windowssys_windows_win32_ui_hidpi_setProcessDpiAwarenessContext(p0: String): Int

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_hidpi_setThreadDpiAwarenessContext(p0)")
private external fun _wasm_windowssys_windows_win32_ui_hidpi_setThreadDpiAwarenessContext(p0: String): String

@JsFun("(p0) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_hidpi_setThreadDpiHostingBehavior(p0)")
private external fun _wasm_windowssys_windows_win32_ui_hidpi_setThreadDpiHostingBehavior(p0: Int): Int

@JsFun("(p0, p1, p2, p3, p4) => globalThis.__km_napi_windowssys.windowssys_windows_win32_ui_hidpi_systemParametersInfoForDpi(p0, p1, p2, p3, p4)")
private external fun _wasm_windowssys_windows_win32_ui_hidpi_systemParametersInfoForDpi(p0: Int, p1: Int, p2: String, p3: Int, p4: Int): Int

public actual fun adjustWindowRectExForDpi(lprect: COpaquePointer?, dwstyle: WindowStyle, bmenu: Bool, dwexstyle: WindowExStyle, dpi: UInt): Bool =
    if (_windowsWin32UiHidpiNapiAvailable) _wasm_windowssys_windows_win32_ui_hidpi_adjustWindowRectExForDpi((lprect?.value ?: 0L).toString(), dwstyle.toInt(), bmenu, dwexstyle.toInt(), dpi.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun areDpiAwarenessContextsEqual(dpicontexta: DpiAwarenessContext, dpicontextb: DpiAwarenessContext): Bool =
    if (_windowsWin32UiHidpiNapiAvailable) _wasm_windowssys_windows_win32_ui_hidpi_areDpiAwarenessContextsEqual((dpicontexta?.value ?: 0L).toString(), (dpicontextb?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableNonClientDpiScaling(hwnd: Hwnd): Bool =
    if (_windowsWin32UiHidpiNapiAvailable) _wasm_windowssys_windows_win32_ui_hidpi_enableNonClientDpiScaling((hwnd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAwarenessFromDpiAwarenessContext(value: DpiAwarenessContext): DpiAwareness =
    if (_windowsWin32UiHidpiNapiAvailable) _wasm_windowssys_windows_win32_ui_hidpi_getAwarenessFromDpiAwarenessContext((value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDialogControlDpiChangeBehavior(hwnd: Hwnd): DialogControlDpiChangeBehaviors =
    if (_windowsWin32UiHidpiNapiAvailable) _wasm_windowssys_windows_win32_ui_hidpi_getDialogControlDpiChangeBehavior((hwnd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDialogDpiChangeBehavior(hdlg: Hwnd): DialogDpiChangeBehaviors =
    if (_windowsWin32UiHidpiNapiAvailable) _wasm_windowssys_windows_win32_ui_hidpi_getDialogDpiChangeBehavior((hdlg?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDpiAwarenessContextForProcess(hprocess: Handle): DpiAwarenessContext =
    if (_windowsWin32UiHidpiNapiAvailable) _wasm_windowssys_windows_win32_ui_hidpi_getDpiAwarenessContextForProcess((hprocess?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDpiForMonitor(hmonitor: Hmonitor, dpitype: MonitorDpiType, dpix: COpaquePointer?, dpiy: COpaquePointer?): Hresult =
    if (_windowsWin32UiHidpiNapiAvailable) _wasm_windowssys_windows_win32_ui_hidpi_getDpiForMonitor((hmonitor?.value ?: 0L).toString(), dpitype, (dpix?.value ?: 0L).toString(), (dpiy?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDpiForSystem(): UInt =
    if (_windowsWin32UiHidpiNapiAvailable) _wasm_windowssys_windows_win32_ui_hidpi_getDpiForSystem().toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDpiForWindow(hwnd: Hwnd): UInt =
    if (_windowsWin32UiHidpiNapiAvailable) _wasm_windowssys_windows_win32_ui_hidpi_getDpiForWindow((hwnd?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDpiFromDpiAwarenessContext(value: DpiAwarenessContext): UInt =
    if (_windowsWin32UiHidpiNapiAvailable) _wasm_windowssys_windows_win32_ui_hidpi_getDpiFromDpiAwarenessContext((value?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessDpiAwareness(hprocess: Handle, value: COpaquePointer?): Hresult =
    if (_windowsWin32UiHidpiNapiAvailable) _wasm_windowssys_windows_win32_ui_hidpi_getProcessDpiAwareness((hprocess?.value ?: 0L).toString(), (value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemDpiForProcess(hprocess: Handle): UInt =
    if (_windowsWin32UiHidpiNapiAvailable) _wasm_windowssys_windows_win32_ui_hidpi_getSystemDpiForProcess((hprocess?.value ?: 0L).toString()).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemMetricsForDpi(nindex: SystemMetricsIndex, dpi: UInt): Int =
    if (_windowsWin32UiHidpiNapiAvailable) _wasm_windowssys_windows_win32_ui_hidpi_getSystemMetricsForDpi(nindex, dpi.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadDpiAwarenessContext(): DpiAwarenessContext =
    if (_windowsWin32UiHidpiNapiAvailable) _wasm_windowssys_windows_win32_ui_hidpi_getThreadDpiAwarenessContext().toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadDpiHostingBehavior(): DpiHostingBehavior =
    if (_windowsWin32UiHidpiNapiAvailable) _wasm_windowssys_windows_win32_ui_hidpi_getThreadDpiHostingBehavior() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowDpiAwarenessContext(hwnd: Hwnd): DpiAwarenessContext =
    if (_windowsWin32UiHidpiNapiAvailable) _wasm_windowssys_windows_win32_ui_hidpi_getWindowDpiAwarenessContext((hwnd?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowDpiHostingBehavior(hwnd: Hwnd): DpiHostingBehavior =
    if (_windowsWin32UiHidpiNapiAvailable) _wasm_windowssys_windows_win32_ui_hidpi_getWindowDpiHostingBehavior((hwnd?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidDpiAwarenessContext(value: DpiAwarenessContext): Bool =
    if (_windowsWin32UiHidpiNapiAvailable) _wasm_windowssys_windows_win32_ui_hidpi_isValidDpiAwarenessContext((value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun logicalToPhysicalPointForPerMonitorDPI(hwnd: Hwnd, lppoint: COpaquePointer?): Bool =
    if (_windowsWin32UiHidpiNapiAvailable) _wasm_windowssys_windows_win32_ui_hidpi_logicalToPhysicalPointForPerMonitorDPI((hwnd?.value ?: 0L).toString(), (lppoint?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openThemeDataForDpi(hwnd: Hwnd, pszclasslist: Pcwstr, dpi: UInt): Htheme =
    if (_windowsWin32UiHidpiNapiAvailable) _wasm_windowssys_windows_win32_ui_hidpi_openThemeDataForDpi((hwnd?.value ?: 0L).toString(), (pszclasslist?.value ?: 0L).toString(), dpi.toInt()).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun physicalToLogicalPointForPerMonitorDPI(hwnd: Hwnd, lppoint: COpaquePointer?): Bool =
    if (_windowsWin32UiHidpiNapiAvailable) _wasm_windowssys_windows_win32_ui_hidpi_physicalToLogicalPointForPerMonitorDPI((hwnd?.value ?: 0L).toString(), (lppoint?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDialogControlDpiChangeBehavior(hwnd: Hwnd, mask: DialogControlDpiChangeBehaviors, values: DialogControlDpiChangeBehaviors): Bool =
    if (_windowsWin32UiHidpiNapiAvailable) _wasm_windowssys_windows_win32_ui_hidpi_setDialogControlDpiChangeBehavior((hwnd?.value ?: 0L).toString(), mask, values) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDialogDpiChangeBehavior(hdlg: Hwnd, mask: DialogDpiChangeBehaviors, values: DialogDpiChangeBehaviors): Bool =
    if (_windowsWin32UiHidpiNapiAvailable) _wasm_windowssys_windows_win32_ui_hidpi_setDialogDpiChangeBehavior((hdlg?.value ?: 0L).toString(), mask, values) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessDpiAwareness(value: ProcessDpiAwareness): Hresult =
    if (_windowsWin32UiHidpiNapiAvailable) _wasm_windowssys_windows_win32_ui_hidpi_setProcessDpiAwareness(value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessDpiAwarenessContext(value: DpiAwarenessContext): Bool =
    if (_windowsWin32UiHidpiNapiAvailable) _wasm_windowssys_windows_win32_ui_hidpi_setProcessDpiAwarenessContext((value?.value ?: 0L).toString()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadDpiAwarenessContext(dpicontext: DpiAwarenessContext): DpiAwarenessContext =
    if (_windowsWin32UiHidpiNapiAvailable) _wasm_windowssys_windows_win32_ui_hidpi_setThreadDpiAwarenessContext((dpicontext?.value ?: 0L).toString()).toLong().let { if (it == 0L) null else COpaquePointer(it) } else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadDpiHostingBehavior(value: DpiHostingBehavior): DpiHostingBehavior =
    if (_windowsWin32UiHidpiNapiAvailable) _wasm_windowssys_windows_win32_ui_hidpi_setThreadDpiHostingBehavior(value) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemParametersInfoForDpi(uiaction: UInt, uiparam: UInt, pvparam: COpaquePointer?, fwinini: UInt, dpi: UInt): Bool =
    if (_windowsWin32UiHidpiNapiAvailable) _wasm_windowssys_windows_win32_ui_hidpi_systemParametersInfoForDpi(uiaction.toInt(), uiparam.toInt(), (pvparam?.value ?: 0L).toString(), fwinini.toInt(), dpi.toInt()) else throw UnsupportedOperationException("Native FFI addon is not available")
