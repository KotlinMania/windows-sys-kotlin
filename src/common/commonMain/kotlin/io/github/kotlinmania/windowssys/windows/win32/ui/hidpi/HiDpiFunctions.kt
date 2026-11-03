package io.github.kotlinmania.windowssys.windows.win32.ui.hidpi

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.HRESULT
import io.github.kotlinmania.windowssys.core.PCWSTR

public fun AdjustWindowRectExForDpi(lprect: Long, dwstyle: WindowsAndMessaging.WINDOW_STYLE, bmenu: BOOL, dwexstyle: WindowsAndMessaging.WINDOW_EX_STYLE, dpi: UInt): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "AdjustWindowRectExForDpi", longArrayOf(lprect, Win32DynamicFfi.objectSlot(dwstyle), bmenu.toLong(), Win32DynamicFfi.objectSlot(dwexstyle), dpi.toLong())).toInt()
}

public fun AreDpiAwarenessContextsEqual(dpicontexta: DPI_AWARENESS_CONTEXT, dpicontextb: DPI_AWARENESS_CONTEXT): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "AreDpiAwarenessContextsEqual", longArrayOf(dpicontexta, dpicontextb)).toInt()
}

public fun EnableNonClientDpiScaling(hwnd: Foundation.HWND): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "EnableNonClientDpiScaling", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun GetAwarenessFromDpiAwarenessContext(value: DPI_AWARENESS_CONTEXT): DPI_AWARENESS {
    return Win32DynamicFfi.invoke("user32.dll", "GetAwarenessFromDpiAwarenessContext", longArrayOf(value)).toInt()
}

public fun GetDialogControlDpiChangeBehavior(hwnd: Foundation.HWND): DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS {
    return Win32DynamicFfi.invoke("user32.dll", "GetDialogControlDpiChangeBehavior", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun GetDialogDpiChangeBehavior(hdlg: Foundation.HWND): DIALOG_DPI_CHANGE_BEHAVIORS {
    return Win32DynamicFfi.invoke("user32.dll", "GetDialogDpiChangeBehavior", longArrayOf(Win32DynamicFfi.objectSlot(hdlg))).toInt()
}

public fun GetDpiAwarenessContextForProcess(hprocess: Foundation.HANDLE): DPI_AWARENESS_CONTEXT {
    return Win32DynamicFfi.invoke("user32.dll", "GetDpiAwarenessContextForProcess", longArrayOf(Win32DynamicFfi.objectSlot(hprocess)))
}

public fun GetDpiForMonitor(hmonitor: Graphics.Gdi.HMONITOR, dpitype: MONITOR_DPI_TYPE, dpix: Long, dpiy: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-shcore-scaling-l1-1-1.dll", "GetDpiForMonitor", longArrayOf(Win32DynamicFfi.objectSlot(hmonitor), dpitype.toLong(), dpix, dpiy)).toInt()
}

public fun GetDpiForSystem(): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetDpiForSystem", longArrayOf()).toUInt()
}

public fun GetDpiForWindow(hwnd: Foundation.HWND): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetDpiForWindow", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toUInt()
}

public fun GetDpiFromDpiAwarenessContext(value: DPI_AWARENESS_CONTEXT): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetDpiFromDpiAwarenessContext", longArrayOf(value)).toUInt()
}

public fun GetProcessDpiAwareness(hprocess: Foundation.HANDLE, value: Long): HRESULT {
    return Win32DynamicFfi.invoke("api-ms-win-shcore-scaling-l1-1-1.dll", "GetProcessDpiAwareness", longArrayOf(Win32DynamicFfi.objectSlot(hprocess), value)).toInt()
}

public fun GetSystemDpiForProcess(hprocess: Foundation.HANDLE): UInt {
    return Win32DynamicFfi.invoke("user32.dll", "GetSystemDpiForProcess", longArrayOf(Win32DynamicFfi.objectSlot(hprocess))).toUInt()
}

public fun GetSystemMetricsForDpi(nindex: WindowsAndMessaging.SYSTEM_METRICS_INDEX, dpi: UInt): Int {
    return Win32DynamicFfi.invoke("user32.dll", "GetSystemMetricsForDpi", longArrayOf(Win32DynamicFfi.objectSlot(nindex), dpi.toLong())).toInt()
}

public fun GetThreadDpiAwarenessContext(): DPI_AWARENESS_CONTEXT {
    return Win32DynamicFfi.invoke("user32.dll", "GetThreadDpiAwarenessContext", longArrayOf())
}

public fun GetThreadDpiHostingBehavior(): DPI_HOSTING_BEHAVIOR {
    return Win32DynamicFfi.invoke("user32.dll", "GetThreadDpiHostingBehavior", longArrayOf()).toInt()
}

public fun GetWindowDpiAwarenessContext(hwnd: Foundation.HWND): DPI_AWARENESS_CONTEXT {
    return Win32DynamicFfi.invoke("user32.dll", "GetWindowDpiAwarenessContext", longArrayOf(Win32DynamicFfi.objectSlot(hwnd)))
}

public fun GetWindowDpiHostingBehavior(hwnd: Foundation.HWND): DPI_HOSTING_BEHAVIOR {
    return Win32DynamicFfi.invoke("user32.dll", "GetWindowDpiHostingBehavior", longArrayOf(Win32DynamicFfi.objectSlot(hwnd))).toInt()
}

public fun IsValidDpiAwarenessContext(value: DPI_AWARENESS_CONTEXT): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "IsValidDpiAwarenessContext", longArrayOf(value)).toInt()
}

public fun LogicalToPhysicalPointForPerMonitorDPI(hwnd: Foundation.HWND, lppoint: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "LogicalToPhysicalPointForPerMonitorDPI", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), lppoint)).toInt()
}

public fun OpenThemeDataForDpi(hwnd: Foundation.HWND, pszclasslist: PCWSTR, dpi: UInt): Controls.HTHEME {
    Win32DynamicFfi.invoke("uxtheme.dll", "OpenThemeDataForDpi", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), pszclasslist, dpi.toLong()))
    return Controls.HTHEME()
}

public fun PhysicalToLogicalPointForPerMonitorDPI(hwnd: Foundation.HWND, lppoint: Long): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "PhysicalToLogicalPointForPerMonitorDPI", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), lppoint)).toInt()
}

public fun SetDialogControlDpiChangeBehavior(hwnd: Foundation.HWND, mask: DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS, values: DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetDialogControlDpiChangeBehavior", longArrayOf(Win32DynamicFfi.objectSlot(hwnd), mask.toLong(), values.toLong())).toInt()
}

public fun SetDialogDpiChangeBehavior(hdlg: Foundation.HWND, mask: DIALOG_DPI_CHANGE_BEHAVIORS, values: DIALOG_DPI_CHANGE_BEHAVIORS): BOOL {
    return Win32DynamicFfi.invoke("user32.dll", "SetDialogDpiChangeBehavior", longArrayOf(Win32DynamicFfi.objectSlot(hdlg), mask.toLong(), values.toLong())).toInt()
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
