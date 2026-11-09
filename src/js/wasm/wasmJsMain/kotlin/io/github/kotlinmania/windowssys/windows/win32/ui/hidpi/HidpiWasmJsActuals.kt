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

public actual fun AdjustWindowRectExForDpi(lprect: Long, dwstyle: WINDOW_STYLE, bmenu: BOOL, dwexstyle: WINDOW_EX_STYLE, dpi: UInt): BOOL =
    0

public actual fun AreDpiAwarenessContextsEqual(dpicontexta: DPI_AWARENESS_CONTEXT, dpicontextb: DPI_AWARENESS_CONTEXT): BOOL =
    0

public actual fun EnableNonClientDpiScaling(hwnd: HWND): BOOL =
    0

public actual fun GetAwarenessFromDpiAwarenessContext(value: DPI_AWARENESS_CONTEXT): DPI_AWARENESS =
    0

public actual fun GetDialogControlDpiChangeBehavior(hwnd: HWND): DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS =
    0

public actual fun GetDialogDpiChangeBehavior(hdlg: HWND): DIALOG_DPI_CHANGE_BEHAVIORS =
    0

public actual fun GetDpiAwarenessContextForProcess(hprocess: HANDLE): DPI_AWARENESS_CONTEXT =
    0L

public actual fun GetDpiForMonitor(hmonitor: HMONITOR, dpitype: MONITOR_DPI_TYPE, dpix: Long, dpiy: Long): HRESULT =
    0

public actual fun GetDpiForSystem(): UInt =
    0u

public actual fun GetDpiForWindow(hwnd: HWND): UInt =
    0u

public actual fun GetDpiFromDpiAwarenessContext(value: DPI_AWARENESS_CONTEXT): UInt =
    0u

public actual fun GetProcessDpiAwareness(hprocess: HANDLE, value: Long): HRESULT =
    0

public actual fun GetSystemDpiForProcess(hprocess: HANDLE): UInt =
    0u

public actual fun GetSystemMetricsForDpi(nindex: SYSTEM_METRICS_INDEX, dpi: UInt): Int =
    0

public actual fun GetThreadDpiAwarenessContext(): DPI_AWARENESS_CONTEXT =
    0L

public actual fun GetThreadDpiHostingBehavior(): DPI_HOSTING_BEHAVIOR =
    0

public actual fun GetWindowDpiAwarenessContext(hwnd: HWND): DPI_AWARENESS_CONTEXT =
    0L

public actual fun GetWindowDpiHostingBehavior(hwnd: HWND): DPI_HOSTING_BEHAVIOR =
    0

public actual fun IsValidDpiAwarenessContext(value: DPI_AWARENESS_CONTEXT): BOOL =
    0

public actual fun LogicalToPhysicalPointForPerMonitorDPI(hwnd: HWND, lppoint: Long): BOOL =
    0

public actual fun OpenThemeDataForDpi(hwnd: HWND, pszclasslist: PCWSTR, dpi: UInt): HTHEME =
    0L

public actual fun PhysicalToLogicalPointForPerMonitorDPI(hwnd: HWND, lppoint: Long): BOOL =
    0

public actual fun SetDialogControlDpiChangeBehavior(hwnd: HWND, mask: DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS, values: DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS): BOOL =
    0

public actual fun SetDialogDpiChangeBehavior(hdlg: HWND, mask: DIALOG_DPI_CHANGE_BEHAVIORS, values: DIALOG_DPI_CHANGE_BEHAVIORS): BOOL =
    0

public actual fun SetProcessDpiAwareness(value: PROCESS_DPI_AWARENESS): HRESULT =
    0

public actual fun SetProcessDpiAwarenessContext(value: DPI_AWARENESS_CONTEXT): BOOL =
    0

public actual fun SetThreadDpiAwarenessContext(dpicontext: DPI_AWARENESS_CONTEXT): DPI_AWARENESS_CONTEXT =
    0L

public actual fun SetThreadDpiHostingBehavior(value: DPI_HOSTING_BEHAVIOR): DPI_HOSTING_BEHAVIOR =
    0

public actual fun SystemParametersInfoForDpi(uiaction: UInt, uiparam: UInt, pvparam: Long, fwinini: UInt, dpi: UInt): BOOL =
    0
