package io.github.kotlinmania.windowssys.windows.win32.ui.hidpi

import io.github.kotlinmania.windowssys.Win32DynamicFfi
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

public fun AdjustWindowRectExForDpi(lprect: Long, dwstyle: WINDOW_STYLE, bmenu: BOOL, dwexstyle: WINDOW_EX_STYLE, dpi: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "AdjustWindowRectExForDpi", longArrayOf(lprect, dwstyle.toLong(), bmenu.toLong(), dwexstyle.toLong(), dpi.toLong())).toInt()
}

public fun AreDpiAwarenessContextsEqual(dpicontexta: DPI_AWARENESS_CONTEXT, dpicontextb: DPI_AWARENESS_CONTEXT): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "AreDpiAwarenessContextsEqual", longArrayOf(dpicontexta, dpicontextb)).toInt()
}

public fun EnableNonClientDpiScaling(hwnd: HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EnableNonClientDpiScaling", longArrayOf(hwnd)).toInt()
}

public fun GetAwarenessFromDpiAwarenessContext(value: DPI_AWARENESS_CONTEXT): DPI_AWARENESS {
    return Win32DynamicFfi.invoke("user32.dll", "GetAwarenessFromDpiAwarenessContext", longArrayOf(value)).toInt()
}

public fun GetDialogControlDpiChangeBehavior(hwnd: HWND): DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS {
    return Win32DynamicFfi.invoke("user32.dll", "GetDialogControlDpiChangeBehavior", longArrayOf(hwnd)).toInt()
}

public fun GetDialogDpiChangeBehavior(hdlg: HWND): DIALOG_DPI_CHANGE_BEHAVIORS {
    return Win32DynamicFfi.invoke("user32.dll", "GetDialogDpiChangeBehavior", longArrayOf(hdlg)).toInt()
}

public fun GetDpiAwarenessContextForProcess(hprocess: HANDLE): DPI_AWARENESS_CONTEXT {
    return Win32DynamicFfi.invoke("user32.dll", "GetDpiAwarenessContextForProcess", longArrayOf(hprocess))
}

public fun GetDpiForMonitor(hmonitor: HMONITOR, dpitype: MONITOR_DPI_TYPE, dpix: Long, dpiy: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-shcore-scaling-l1-1-1.dll", "GetDpiForMonitor", longArrayOf(hmonitor, dpitype.toLong(), dpix, dpiy)).toInt()
}

public fun GetDpiForSystem(): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetDpiForSystem", longArrayOf()).toUInt()
}

public fun GetDpiForWindow(hwnd: HWND): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetDpiForWindow", longArrayOf(hwnd)).toUInt()
}

public fun GetDpiFromDpiAwarenessContext(value: DPI_AWARENESS_CONTEXT): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetDpiFromDpiAwarenessContext", longArrayOf(value)).toUInt()
}

public fun GetProcessDpiAwareness(hprocess: HANDLE, value: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-shcore-scaling-l1-1-1.dll", "GetProcessDpiAwareness", longArrayOf(hprocess, value)).toInt()
}

public fun GetSystemDpiForProcess(hprocess: HANDLE): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetSystemDpiForProcess", longArrayOf(hprocess)).toUInt()
}

public fun GetSystemMetricsForDpi(nindex: SYSTEM_METRICS_INDEX, dpi: UInt): Int {
    return Win32DynamicFfi.invoke("user32.dll", "GetSystemMetricsForDpi", longArrayOf(nindex.toLong(), dpi.toLong())).toInt()
}

public fun GetThreadDpiAwarenessContext(): DPI_AWARENESS_CONTEXT {
    return Win32DynamicFfi.invoke("user32.dll", "GetThreadDpiAwarenessContext", longArrayOf())
}

public fun GetThreadDpiHostingBehavior(): DPI_HOSTING_BEHAVIOR {
    return Win32DynamicFfi.invoke("user32.dll", "GetThreadDpiHostingBehavior", longArrayOf()).toInt()
}

public fun GetWindowDpiAwarenessContext(hwnd: HWND): DPI_AWARENESS_CONTEXT {
    return Win32DynamicFfi.invoke("user32.dll", "GetWindowDpiAwarenessContext", longArrayOf(hwnd))
}

public fun GetWindowDpiHostingBehavior(hwnd: HWND): DPI_HOSTING_BEHAVIOR {
    return Win32DynamicFfi.invoke("user32.dll", "GetWindowDpiHostingBehavior", longArrayOf(hwnd)).toInt()
}

public fun IsValidDpiAwarenessContext(value: DPI_AWARENESS_CONTEXT): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsValidDpiAwarenessContext", longArrayOf(value)).toInt()
}

public fun LogicalToPhysicalPointForPerMonitorDPI(hwnd: HWND, lppoint: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "LogicalToPhysicalPointForPerMonitorDPI", longArrayOf(hwnd, lppoint)).toInt()
}

public fun OpenThemeDataForDpi(hwnd: HWND, pszclasslist: PCWSTR, dpi: UInt): HTHEME {
    return Win32DynamicFfi.invoke("uxtheme.dll", "OpenThemeDataForDpi", longArrayOf(hwnd, pszclasslist, dpi.toLong()))
}

public fun PhysicalToLogicalPointForPerMonitorDPI(hwnd: HWND, lppoint: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "PhysicalToLogicalPointForPerMonitorDPI", longArrayOf(hwnd, lppoint)).toInt()
}

public fun SetDialogControlDpiChangeBehavior(hwnd: HWND, mask: DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS, values: DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetDialogControlDpiChangeBehavior", longArrayOf(hwnd, mask.toLong(), values.toLong())).toInt()
}

public fun SetDialogDpiChangeBehavior(hdlg: HWND, mask: DIALOG_DPI_CHANGE_BEHAVIORS, values: DIALOG_DPI_CHANGE_BEHAVIORS): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetDialogDpiChangeBehavior", longArrayOf(hdlg, mask.toLong(), values.toLong())).toInt()
}

public fun SetProcessDpiAwareness(value: PROCESS_DPI_AWARENESS): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-shcore-scaling-l1-1-1.dll", "SetProcessDpiAwareness", longArrayOf(value.toLong())).toInt()
}

public fun SetProcessDpiAwarenessContext(value: DPI_AWARENESS_CONTEXT): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetProcessDpiAwarenessContext", longArrayOf(value)).toInt()
}

public fun SetThreadDpiAwarenessContext(dpicontext: DPI_AWARENESS_CONTEXT): DPI_AWARENESS_CONTEXT {
    return Win32DynamicFfi.invoke("user32.dll", "SetThreadDpiAwarenessContext", longArrayOf(dpicontext))
}

public fun SetThreadDpiHostingBehavior(value: DPI_HOSTING_BEHAVIOR): DPI_HOSTING_BEHAVIOR {
    return Win32DynamicFfi.invoke("user32.dll", "SetThreadDpiHostingBehavior", longArrayOf(value.toLong())).toInt()
}

public fun SystemParametersInfoForDpi(uiaction: UInt, uiparam: UInt, pvparam: Long, fwinini: UInt, dpi: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SystemParametersInfoForDpi", longArrayOf(uiaction.toLong(), uiparam.toLong(), pvparam, fwinini.toLong(), dpi.toLong())).toInt()
}
