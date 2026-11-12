@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private val windowsWin32UiHidpiNapiAddon: dynamic =
    js("(function() { if (typeof globalThis !== 'undefined' && typeof globalThis.__km_napi_windowssys !== 'undefined') return globalThis.__km_napi_windowssys; if (typeof process === 'undefined' || !process.versions || !process.versions.node) return null; var mod = process.getBuiltinModule ? process.getBuiltinModule('module') : (process.mainModule && process.mainModule.constructor); var req = (mod && mod.createRequire) ? mod.createRequire((process.cwd ? process.cwd() : '.') + '/package.json') : (process.mainModule ? process.mainModule.require : null); if (!req) return null; try { var pkg = req('@kotlinmania/windowssys-native-bindings'); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = pkg; return pkg; } catch (_) {} var fs = req('fs'); var path = req('path'); var dir = process.cwd ? process.cwd() : '.'; var rels = ['windowssys_native.node', 'build/node-ffi/windowssys_native.node', 'build/node-ffi/release/windowssys_native.node', 'build/node-ffi/debug/windowssys_native.node', 'src/js/node-windowssys/build/Release/windowssys_native.node', 'src/js/node-windowssys/build/Debug/windowssys_native.node', 'src/js/node-windowssys/dist/build/Release/windowssys_native.node', 'src/js/node-windowssys/dist/build/Debug/windowssys_native.node']; for (var d = 0; d < 8; d++) { for (var i = 0; i < rels.length; i++) { var c = path.resolve(dir, rels[i]); if (fs.existsSync(c)) { var loaded = req(c); if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = loaded; return loaded; } } var parent = path.dirname(dir); if (parent === dir) break; dir = parent; } if (typeof globalThis !== 'undefined') globalThis.__km_napi_windowssys = null; return null; })()")

public actual fun adjustWindowRectExForDpi(lprect: MutPtr<Rect>, dwstyle: WindowStyle, bmenu: Bool, dwexstyle: WindowExStyle, dpi: UInt): Bool =
    if (windowsWin32UiHidpiNapiAddon != null) (windowsWin32UiHidpiNapiAddon.windowssysWindowsWin32UiHidpiAdjustWindowRectExForDpi(lprect.rawAddress.toString(), dwstyle.toInt(), bmenu, dwexstyle.toInt(), dpi.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun areDpiAwarenessContextsEqual(dpicontexta: DpiAwarenessContext, dpicontextb: DpiAwarenessContext): Bool =
    if (windowsWin32UiHidpiNapiAddon != null) (windowsWin32UiHidpiNapiAddon.windowssysWindowsWin32UiHidpiAreDpiAwarenessContextsEqual(dpicontexta.rawAddress.toString(), dpicontextb.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun enableNonClientDpiScaling(hwnd: Hwnd): Bool =
    if (windowsWin32UiHidpiNapiAddon != null) (windowsWin32UiHidpiNapiAddon.windowssysWindowsWin32UiHidpiEnableNonClientDpiScaling(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getAwarenessFromDpiAwarenessContext(value: DpiAwarenessContext): DpiAwareness =
    if (windowsWin32UiHidpiNapiAddon != null) (windowsWin32UiHidpiNapiAddon.windowssysWindowsWin32UiHidpiGetAwarenessFromDpiAwarenessContext(value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDialogControlDpiChangeBehavior(hwnd: Hwnd): DialogControlDpiChangeBehaviors =
    if (windowsWin32UiHidpiNapiAddon != null) (windowsWin32UiHidpiNapiAddon.windowssysWindowsWin32UiHidpiGetDialogControlDpiChangeBehavior(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDialogDpiChangeBehavior(hdlg: Hwnd): DialogDpiChangeBehaviors =
    if (windowsWin32UiHidpiNapiAddon != null) (windowsWin32UiHidpiNapiAddon.windowssysWindowsWin32UiHidpiGetDialogDpiChangeBehavior(hdlg.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDpiAwarenessContextForProcess(hprocess: Handle): DpiAwarenessContext =
    if (windowsWin32UiHidpiNapiAddon != null) MutPtr((windowsWin32UiHidpiNapiAddon.windowssysWindowsWin32UiHidpiGetDpiAwarenessContextForProcess(hprocess.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDpiForMonitor(hmonitor: Hmonitor, dpitype: MonitorDpiType, dpix: MutPtr<UInt>, dpiy: MutPtr<UInt>): Hresult =
    if (windowsWin32UiHidpiNapiAddon != null) (windowsWin32UiHidpiNapiAddon.windowssysWindowsWin32UiHidpiGetDpiForMonitor(hmonitor.rawAddress.toString(), dpitype, dpix.rawAddress.toString(), dpiy.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDpiForSystem(): UInt =
    if (windowsWin32UiHidpiNapiAddon != null) (windowsWin32UiHidpiNapiAddon.windowssysWindowsWin32UiHidpiGetDpiForSystem() as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDpiForWindow(hwnd: Hwnd): UInt =
    if (windowsWin32UiHidpiNapiAddon != null) (windowsWin32UiHidpiNapiAddon.windowssysWindowsWin32UiHidpiGetDpiForWindow(hwnd.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getDpiFromDpiAwarenessContext(value: DpiAwarenessContext): UInt =
    if (windowsWin32UiHidpiNapiAddon != null) (windowsWin32UiHidpiNapiAddon.windowssysWindowsWin32UiHidpiGetDpiFromDpiAwarenessContext(value.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getProcessDpiAwareness(hprocess: Handle, value: MutPtr<ProcessDpiAwareness>): Hresult =
    if (windowsWin32UiHidpiNapiAddon != null) (windowsWin32UiHidpiNapiAddon.windowssysWindowsWin32UiHidpiGetProcessDpiAwareness(hprocess.rawAddress.toString(), value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemDpiForProcess(hprocess: Handle): UInt =
    if (windowsWin32UiHidpiNapiAddon != null) (windowsWin32UiHidpiNapiAddon.windowssysWindowsWin32UiHidpiGetSystemDpiForProcess(hprocess.rawAddress.toString()) as Int).toUInt() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getSystemMetricsForDpi(nindex: SystemMetricsIndex, dpi: UInt): Int =
    if (windowsWin32UiHidpiNapiAddon != null) (windowsWin32UiHidpiNapiAddon.windowssysWindowsWin32UiHidpiGetSystemMetricsForDpi(nindex, dpi.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadDpiAwarenessContext(): DpiAwarenessContext =
    if (windowsWin32UiHidpiNapiAddon != null) MutPtr((windowsWin32UiHidpiNapiAddon.windowssysWindowsWin32UiHidpiGetThreadDpiAwarenessContext() as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getThreadDpiHostingBehavior(): DpiHostingBehavior =
    if (windowsWin32UiHidpiNapiAddon != null) (windowsWin32UiHidpiNapiAddon.windowssysWindowsWin32UiHidpiGetThreadDpiHostingBehavior() as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowDpiAwarenessContext(hwnd: Hwnd): DpiAwarenessContext =
    if (windowsWin32UiHidpiNapiAddon != null) MutPtr((windowsWin32UiHidpiNapiAddon.windowssysWindowsWin32UiHidpiGetWindowDpiAwarenessContext(hwnd.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun getWindowDpiHostingBehavior(hwnd: Hwnd): DpiHostingBehavior =
    if (windowsWin32UiHidpiNapiAddon != null) (windowsWin32UiHidpiNapiAddon.windowssysWindowsWin32UiHidpiGetWindowDpiHostingBehavior(hwnd.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun isValidDpiAwarenessContext(value: DpiAwarenessContext): Bool =
    if (windowsWin32UiHidpiNapiAddon != null) (windowsWin32UiHidpiNapiAddon.windowssysWindowsWin32UiHidpiIsValidDpiAwarenessContext(value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun logicalToPhysicalPointForPerMonitorDPI(hwnd: Hwnd, lppoint: MutPtr<Point>): Bool =
    if (windowsWin32UiHidpiNapiAddon != null) (windowsWin32UiHidpiNapiAddon.windowssysWindowsWin32UiHidpiLogicalToPhysicalPointForPerMonitorDPI(hwnd.rawAddress.toString(), lppoint.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun openThemeDataForDpi(hwnd: Hwnd, pszclasslist: Pcwstr, dpi: UInt): Htheme =
    if (windowsWin32UiHidpiNapiAddon != null) (windowsWin32UiHidpiNapiAddon.windowssysWindowsWin32UiHidpiOpenThemeDataForDpi(hwnd.rawAddress.toString(), pszclasslist.rawAddress.toString(), dpi.toInt()) as String).toLong() else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun physicalToLogicalPointForPerMonitorDPI(hwnd: Hwnd, lppoint: MutPtr<Point>): Bool =
    if (windowsWin32UiHidpiNapiAddon != null) (windowsWin32UiHidpiNapiAddon.windowssysWindowsWin32UiHidpiPhysicalToLogicalPointForPerMonitorDPI(hwnd.rawAddress.toString(), lppoint.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDialogControlDpiChangeBehavior(hwnd: Hwnd, mask: DialogControlDpiChangeBehaviors, values: DialogControlDpiChangeBehaviors): Bool =
    if (windowsWin32UiHidpiNapiAddon != null) (windowsWin32UiHidpiNapiAddon.windowssysWindowsWin32UiHidpiSetDialogControlDpiChangeBehavior(hwnd.rawAddress.toString(), mask, values) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setDialogDpiChangeBehavior(hdlg: Hwnd, mask: DialogDpiChangeBehaviors, values: DialogDpiChangeBehaviors): Bool =
    if (windowsWin32UiHidpiNapiAddon != null) (windowsWin32UiHidpiNapiAddon.windowssysWindowsWin32UiHidpiSetDialogDpiChangeBehavior(hdlg.rawAddress.toString(), mask, values) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessDpiAwareness(value: ProcessDpiAwareness): Hresult =
    if (windowsWin32UiHidpiNapiAddon != null) (windowsWin32UiHidpiNapiAddon.windowssysWindowsWin32UiHidpiSetProcessDpiAwareness(value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setProcessDpiAwarenessContext(value: DpiAwarenessContext): Bool =
    if (windowsWin32UiHidpiNapiAddon != null) (windowsWin32UiHidpiNapiAddon.windowssysWindowsWin32UiHidpiSetProcessDpiAwarenessContext(value.rawAddress.toString()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadDpiAwarenessContext(dpicontext: DpiAwarenessContext): DpiAwarenessContext =
    if (windowsWin32UiHidpiNapiAddon != null) MutPtr((windowsWin32UiHidpiNapiAddon.windowssysWindowsWin32UiHidpiSetThreadDpiAwarenessContext(dpicontext.rawAddress.toString()) as String).toLong()) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun setThreadDpiHostingBehavior(value: DpiHostingBehavior): DpiHostingBehavior =
    if (windowsWin32UiHidpiNapiAddon != null) (windowsWin32UiHidpiNapiAddon.windowssysWindowsWin32UiHidpiSetThreadDpiHostingBehavior(value) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")

public actual fun systemParametersInfoForDpi(uiaction: UInt, uiparam: UInt, pvparam: MutPtr<CVoid>, fwinini: UInt, dpi: UInt): Bool =
    if (windowsWin32UiHidpiNapiAddon != null) (windowsWin32UiHidpiNapiAddon.windowssysWindowsWin32UiHidpiSystemParametersInfoForDpi(uiaction.toInt(), uiparam.toInt(), pvparam.rawAddress.toString(), fwinini.toInt(), dpi.toInt()) as Int) else throw UnsupportedOperationException("Native FFI addon is not available")
