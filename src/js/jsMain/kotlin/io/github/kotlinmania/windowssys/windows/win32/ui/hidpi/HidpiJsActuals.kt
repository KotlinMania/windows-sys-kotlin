@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.hidpi

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.foundation.HWND
import io.github.kotlinmania.windowssys.windows.win32.graphics.gdi.HMONITOR
import io.github.kotlinmania.windowssys.windows.win32.ui.controls.HTHEME
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.SYSTEM_METRICS_INDEX
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.WINDOW_EX_STYLE
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.WINDOW_STYLE

private val _windowsWin32UiHidpiNapiAddon: dynamic =
    js(
        "\"\"\"(function() { if (typeof process === "undefined" || !process.versions || !process.versions.node) return null; var req = typeof require === "function" ? require : null; if (!req) return null; var fs = req("fs"); var path = req("path"); var dir = process.cwd ? process.cwd() : "."; for (var d = 0; d < 8; d++) {     var c1 = path.resolve(dir, "build/node-ffi/windowssys_native.node");     if (fs.existsSync(c1)) return req(c1);     var c2 = path.resolve(dir, "src/js/node-windowssys/build/Release/windowssys_native.node");     if (fs.existsSync(c2)) return req(c2);     var c3 = path.resolve(dir, "src/js/node-windowssys/build/Debug/windowssys_native.node");     if (fs.existsSync(c3)) return req(c3);     var c4 = path.resolve(dir, "src/js/node-windowssys/dist/build/Release/windowssys_native.node");     if (fs.existsSync(c4)) return req(c4);     var c5 = path.resolve(dir, "src/js/node-windowssys/dist/build/Debug/windowssys_native.node");     if (fs.existsSync(c5)) return req(c5);     var parent = path.dirname(dir);     if (parent === dir) break;     dir = parent; } return null;
        })()\"\"\""
    )

public actual fun AdjustWindowRectExForDpi(lprect: Long, dwstyle: WINDOW_STYLE, bmenu: BOOL, dwexstyle: WINDOW_EX_STYLE, dpi: UInt): BOOL =
    if (_windowsWin32UiHidpiNapiAddon != null) (_windowsWin32UiHidpiNapiAddon.windowssys_windows_win32_ui_hidpi_AdjustWindowRectExForDpi(lprect.toString(), dwstyle.toInt(), bmenu, dwexstyle.toInt(), dpi.toInt()) as Int) else 0

public actual fun AreDpiAwarenessContextsEqual(dpicontexta: DPI_AWARENESS_CONTEXT, dpicontextb: DPI_AWARENESS_CONTEXT): BOOL =
    if (_windowsWin32UiHidpiNapiAddon != null) (_windowsWin32UiHidpiNapiAddon.windowssys_windows_win32_ui_hidpi_AreDpiAwarenessContextsEqual(dpicontexta.toString(), dpicontextb.toString()) as Int) else 0

public actual fun EnableNonClientDpiScaling(hwnd: HWND): BOOL =
    if (_windowsWin32UiHidpiNapiAddon != null) (_windowsWin32UiHidpiNapiAddon.windowssys_windows_win32_ui_hidpi_EnableNonClientDpiScaling(hwnd.toString()) as Int) else 0

public actual fun GetAwarenessFromDpiAwarenessContext(value: DPI_AWARENESS_CONTEXT): DPI_AWARENESS =
    if (_windowsWin32UiHidpiNapiAddon != null) (_windowsWin32UiHidpiNapiAddon.windowssys_windows_win32_ui_hidpi_GetAwarenessFromDpiAwarenessContext(value.toString()) as Int) else 0

public actual fun GetDialogControlDpiChangeBehavior(hwnd: HWND): DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS =
    if (_windowsWin32UiHidpiNapiAddon != null) (_windowsWin32UiHidpiNapiAddon.windowssys_windows_win32_ui_hidpi_GetDialogControlDpiChangeBehavior(hwnd.toString()) as Int) else 0

public actual fun GetDialogDpiChangeBehavior(hdlg: HWND): DIALOG_DPI_CHANGE_BEHAVIORS =
    if (_windowsWin32UiHidpiNapiAddon != null) (_windowsWin32UiHidpiNapiAddon.windowssys_windows_win32_ui_hidpi_GetDialogDpiChangeBehavior(hdlg.toString()) as Int) else 0

public actual fun GetDpiAwarenessContextForProcess(hprocess: HANDLE): DPI_AWARENESS_CONTEXT =
    if (_windowsWin32UiHidpiNapiAddon != null) (_windowsWin32UiHidpiNapiAddon.windowssys_windows_win32_ui_hidpi_GetDpiAwarenessContextForProcess(hprocess.toString()) as String).toLong() else 0L

public actual fun GetDpiForMonitor(hmonitor: HMONITOR, dpitype: MONITOR_DPI_TYPE, dpix: Long, dpiy: Long): HRESULT =
    if (_windowsWin32UiHidpiNapiAddon != null) (_windowsWin32UiHidpiNapiAddon.windowssys_windows_win32_ui_hidpi_GetDpiForMonitor(hmonitor.toString(), dpitype, dpix.toString(), dpiy.toString()) as Int) else 0

public actual fun GetDpiForSystem(): UInt =
    if (_windowsWin32UiHidpiNapiAddon != null) (_windowsWin32UiHidpiNapiAddon.windowssys_windows_win32_ui_hidpi_GetDpiForSystem() as Int).toUInt() else 0u

public actual fun GetDpiForWindow(hwnd: HWND): UInt =
    if (_windowsWin32UiHidpiNapiAddon != null) (_windowsWin32UiHidpiNapiAddon.windowssys_windows_win32_ui_hidpi_GetDpiForWindow(hwnd.toString()) as Int).toUInt() else 0u

public actual fun GetDpiFromDpiAwarenessContext(value: DPI_AWARENESS_CONTEXT): UInt =
    if (_windowsWin32UiHidpiNapiAddon != null) (_windowsWin32UiHidpiNapiAddon.windowssys_windows_win32_ui_hidpi_GetDpiFromDpiAwarenessContext(value.toString()) as Int).toUInt() else 0u

public actual fun GetProcessDpiAwareness(hprocess: HANDLE, value: Long): HRESULT =
    if (_windowsWin32UiHidpiNapiAddon != null) (_windowsWin32UiHidpiNapiAddon.windowssys_windows_win32_ui_hidpi_GetProcessDpiAwareness(hprocess.toString(), value.toString()) as Int) else 0

public actual fun GetSystemDpiForProcess(hprocess: HANDLE): UInt =
    if (_windowsWin32UiHidpiNapiAddon != null) (_windowsWin32UiHidpiNapiAddon.windowssys_windows_win32_ui_hidpi_GetSystemDpiForProcess(hprocess.toString()) as Int).toUInt() else 0u

public actual fun GetSystemMetricsForDpi(nindex: SYSTEM_METRICS_INDEX, dpi: UInt): Int =
    if (_windowsWin32UiHidpiNapiAddon != null) (_windowsWin32UiHidpiNapiAddon.windowssys_windows_win32_ui_hidpi_GetSystemMetricsForDpi(nindex, dpi.toInt()) as Int) else 0

public actual fun GetThreadDpiAwarenessContext(): DPI_AWARENESS_CONTEXT =
    if (_windowsWin32UiHidpiNapiAddon != null) (_windowsWin32UiHidpiNapiAddon.windowssys_windows_win32_ui_hidpi_GetThreadDpiAwarenessContext() as String).toLong() else 0L

public actual fun GetThreadDpiHostingBehavior(): DPI_HOSTING_BEHAVIOR =
    if (_windowsWin32UiHidpiNapiAddon != null) (_windowsWin32UiHidpiNapiAddon.windowssys_windows_win32_ui_hidpi_GetThreadDpiHostingBehavior() as Int) else 0

public actual fun GetWindowDpiAwarenessContext(hwnd: HWND): DPI_AWARENESS_CONTEXT =
    if (_windowsWin32UiHidpiNapiAddon != null) (_windowsWin32UiHidpiNapiAddon.windowssys_windows_win32_ui_hidpi_GetWindowDpiAwarenessContext(hwnd.toString()) as String).toLong() else 0L

public actual fun GetWindowDpiHostingBehavior(hwnd: HWND): DPI_HOSTING_BEHAVIOR =
    if (_windowsWin32UiHidpiNapiAddon != null) (_windowsWin32UiHidpiNapiAddon.windowssys_windows_win32_ui_hidpi_GetWindowDpiHostingBehavior(hwnd.toString()) as Int) else 0

public actual fun IsValidDpiAwarenessContext(value: DPI_AWARENESS_CONTEXT): BOOL =
    if (_windowsWin32UiHidpiNapiAddon != null) (_windowsWin32UiHidpiNapiAddon.windowssys_windows_win32_ui_hidpi_IsValidDpiAwarenessContext(value.toString()) as Int) else 0

public actual fun LogicalToPhysicalPointForPerMonitorDPI(hwnd: HWND, lppoint: Long): BOOL =
    if (_windowsWin32UiHidpiNapiAddon != null) (_windowsWin32UiHidpiNapiAddon.windowssys_windows_win32_ui_hidpi_LogicalToPhysicalPointForPerMonitorDPI(hwnd.toString(), lppoint.toString()) as Int) else 0

public actual fun OpenThemeDataForDpi(hwnd: HWND, pszclasslist: PCWSTR, dpi: UInt): HTHEME =
    if (_windowsWin32UiHidpiNapiAddon != null) (_windowsWin32UiHidpiNapiAddon.windowssys_windows_win32_ui_hidpi_OpenThemeDataForDpi(hwnd.toString(), pszclasslist.toString(), dpi.toInt()) as String).toLong() else 0L

public actual fun PhysicalToLogicalPointForPerMonitorDPI(hwnd: HWND, lppoint: Long): BOOL =
    if (_windowsWin32UiHidpiNapiAddon != null) (_windowsWin32UiHidpiNapiAddon.windowssys_windows_win32_ui_hidpi_PhysicalToLogicalPointForPerMonitorDPI(hwnd.toString(), lppoint.toString()) as Int) else 0

public actual fun SetDialogControlDpiChangeBehavior(hwnd: HWND, mask: DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS, values: DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS): BOOL =
    if (_windowsWin32UiHidpiNapiAddon != null) (_windowsWin32UiHidpiNapiAddon.windowssys_windows_win32_ui_hidpi_SetDialogControlDpiChangeBehavior(hwnd.toString(), mask, values) as Int) else 0

public actual fun SetDialogDpiChangeBehavior(hdlg: HWND, mask: DIALOG_DPI_CHANGE_BEHAVIORS, values: DIALOG_DPI_CHANGE_BEHAVIORS): BOOL =
    if (_windowsWin32UiHidpiNapiAddon != null) (_windowsWin32UiHidpiNapiAddon.windowssys_windows_win32_ui_hidpi_SetDialogDpiChangeBehavior(hdlg.toString(), mask, values) as Int) else 0

public actual fun SetProcessDpiAwareness(value: PROCESS_DPI_AWARENESS): HRESULT =
    if (_windowsWin32UiHidpiNapiAddon != null) (_windowsWin32UiHidpiNapiAddon.windowssys_windows_win32_ui_hidpi_SetProcessDpiAwareness(value) as Int) else 0

public actual fun SetProcessDpiAwarenessContext(value: DPI_AWARENESS_CONTEXT): BOOL =
    if (_windowsWin32UiHidpiNapiAddon != null) (_windowsWin32UiHidpiNapiAddon.windowssys_windows_win32_ui_hidpi_SetProcessDpiAwarenessContext(value.toString()) as Int) else 0

public actual fun SetThreadDpiAwarenessContext(dpicontext: DPI_AWARENESS_CONTEXT): DPI_AWARENESS_CONTEXT =
    if (_windowsWin32UiHidpiNapiAddon != null) (_windowsWin32UiHidpiNapiAddon.windowssys_windows_win32_ui_hidpi_SetThreadDpiAwarenessContext(dpicontext.toString()) as String).toLong() else 0L

public actual fun SetThreadDpiHostingBehavior(value: DPI_HOSTING_BEHAVIOR): DPI_HOSTING_BEHAVIOR =
    if (_windowsWin32UiHidpiNapiAddon != null) (_windowsWin32UiHidpiNapiAddon.windowssys_windows_win32_ui_hidpi_SetThreadDpiHostingBehavior(value) as Int) else 0

public actual fun SystemParametersInfoForDpi(uiaction: UInt, uiparam: UInt, pvparam: Long, fwinini: UInt, dpi: UInt): BOOL =
    if (_windowsWin32UiHidpiNapiAddon != null) (_windowsWin32UiHidpiNapiAddon.windowssys_windows_win32_ui_hidpi_SystemParametersInfoForDpi(uiaction.toInt(), uiparam.toInt(), pvparam.toString(), fwinini.toInt(), dpi.toInt()) as Int) else 0
