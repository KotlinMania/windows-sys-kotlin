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

private object WindowsWin32UiHidpiJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_AdjustWindowRectExForDpi(lprect: Long, dwstyle: Int, bmenu: Int, dwexstyle: Int, dpi: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_AreDpiAwarenessContextsEqual(dpicontexta: Long, dpicontextb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_EnableNonClientDpiScaling(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_GetAwarenessFromDpiAwarenessContext(value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_GetDialogControlDpiChangeBehavior(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_GetDialogDpiChangeBehavior(hdlg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_GetDpiAwarenessContextForProcess(hprocess: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_GetDpiForMonitor(hmonitor: Long, dpitype: Int, dpix: Long, dpiy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_GetDpiForSystem(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_GetDpiForWindow(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_GetDpiFromDpiAwarenessContext(value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_GetProcessDpiAwareness(hprocess: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_GetSystemDpiForProcess(hprocess: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_GetSystemMetricsForDpi(nindex: Int, dpi: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_GetThreadDpiAwarenessContext(): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_GetThreadDpiHostingBehavior(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_GetWindowDpiAwarenessContext(hwnd: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_GetWindowDpiHostingBehavior(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_IsValidDpiAwarenessContext(value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_LogicalToPhysicalPointForPerMonitorDPI(hwnd: Long, lppoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_OpenThemeDataForDpi(hwnd: Long, pszclasslist: Long, dpi: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_PhysicalToLogicalPointForPerMonitorDPI(hwnd: Long, lppoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_SetDialogControlDpiChangeBehavior(hwnd: Long, mask: Int, values: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_SetDialogDpiChangeBehavior(hdlg: Long, mask: Int, values: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_SetProcessDpiAwareness(value: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_SetProcessDpiAwarenessContext(value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_SetThreadDpiAwarenessContext(dpicontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_SetThreadDpiHostingBehavior(value: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_SystemParametersInfoForDpi(uiaction: Int, uiparam: Int, pvparam: Long, fwinini: Int, dpi: Int): Int
}

public actual fun AdjustWindowRectExForDpi(lprect: Long, dwstyle: WINDOW_STYLE, bmenu: BOOL, dwexstyle: WINDOW_EX_STYLE, dpi: UInt): BOOL =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_AdjustWindowRectExForDpi(lprect, dwstyle.toInt(), bmenu, dwexstyle.toInt(), dpi.toInt())

public actual fun AreDpiAwarenessContextsEqual(dpicontexta: DPI_AWARENESS_CONTEXT, dpicontextb: DPI_AWARENESS_CONTEXT): BOOL =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_AreDpiAwarenessContextsEqual(dpicontexta, dpicontextb)

public actual fun EnableNonClientDpiScaling(hwnd: HWND): BOOL =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_EnableNonClientDpiScaling(hwnd)

public actual fun GetAwarenessFromDpiAwarenessContext(value: DPI_AWARENESS_CONTEXT): DPI_AWARENESS =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_GetAwarenessFromDpiAwarenessContext(value)

public actual fun GetDialogControlDpiChangeBehavior(hwnd: HWND): DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_GetDialogControlDpiChangeBehavior(hwnd)

public actual fun GetDialogDpiChangeBehavior(hdlg: HWND): DIALOG_DPI_CHANGE_BEHAVIORS =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_GetDialogDpiChangeBehavior(hdlg)

public actual fun GetDpiAwarenessContextForProcess(hprocess: HANDLE): DPI_AWARENESS_CONTEXT =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_GetDpiAwarenessContextForProcess(hprocess)

public actual fun GetDpiForMonitor(hmonitor: HMONITOR, dpitype: MONITOR_DPI_TYPE, dpix: Long, dpiy: Long): HRESULT =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_GetDpiForMonitor(hmonitor, dpitype, dpix, dpiy)

public actual fun GetDpiForSystem(): UInt =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_GetDpiForSystem().toUInt()

public actual fun GetDpiForWindow(hwnd: HWND): UInt =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_GetDpiForWindow(hwnd).toUInt()

public actual fun GetDpiFromDpiAwarenessContext(value: DPI_AWARENESS_CONTEXT): UInt =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_GetDpiFromDpiAwarenessContext(value).toUInt()

public actual fun GetProcessDpiAwareness(hprocess: HANDLE, value: Long): HRESULT =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_GetProcessDpiAwareness(hprocess, value)

public actual fun GetSystemDpiForProcess(hprocess: HANDLE): UInt =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_GetSystemDpiForProcess(hprocess).toUInt()

public actual fun GetSystemMetricsForDpi(nindex: SYSTEM_METRICS_INDEX, dpi: UInt): Int =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_GetSystemMetricsForDpi(nindex, dpi.toInt())

public actual fun GetThreadDpiAwarenessContext(): DPI_AWARENESS_CONTEXT =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_GetThreadDpiAwarenessContext()

public actual fun GetThreadDpiHostingBehavior(): DPI_HOSTING_BEHAVIOR =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_GetThreadDpiHostingBehavior()

public actual fun GetWindowDpiAwarenessContext(hwnd: HWND): DPI_AWARENESS_CONTEXT =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_GetWindowDpiAwarenessContext(hwnd)

public actual fun GetWindowDpiHostingBehavior(hwnd: HWND): DPI_HOSTING_BEHAVIOR =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_GetWindowDpiHostingBehavior(hwnd)

public actual fun IsValidDpiAwarenessContext(value: DPI_AWARENESS_CONTEXT): BOOL =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_IsValidDpiAwarenessContext(value)

public actual fun LogicalToPhysicalPointForPerMonitorDPI(hwnd: HWND, lppoint: Long): BOOL =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_LogicalToPhysicalPointForPerMonitorDPI(hwnd, lppoint)

public actual fun OpenThemeDataForDpi(hwnd: HWND, pszclasslist: PCWSTR, dpi: UInt): HTHEME =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_OpenThemeDataForDpi(hwnd, pszclasslist, dpi.toInt())

public actual fun PhysicalToLogicalPointForPerMonitorDPI(hwnd: HWND, lppoint: Long): BOOL =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_PhysicalToLogicalPointForPerMonitorDPI(hwnd, lppoint)

public actual fun SetDialogControlDpiChangeBehavior(hwnd: HWND, mask: DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS, values: DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS): BOOL =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_SetDialogControlDpiChangeBehavior(hwnd, mask, values)

public actual fun SetDialogDpiChangeBehavior(hdlg: HWND, mask: DIALOG_DPI_CHANGE_BEHAVIORS, values: DIALOG_DPI_CHANGE_BEHAVIORS): BOOL =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_SetDialogDpiChangeBehavior(hdlg, mask, values)

public actual fun SetProcessDpiAwareness(value: PROCESS_DPI_AWARENESS): HRESULT =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_SetProcessDpiAwareness(value)

public actual fun SetProcessDpiAwarenessContext(value: DPI_AWARENESS_CONTEXT): BOOL =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_SetProcessDpiAwarenessContext(value)

public actual fun SetThreadDpiAwarenessContext(dpicontext: DPI_AWARENESS_CONTEXT): DPI_AWARENESS_CONTEXT =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_SetThreadDpiAwarenessContext(dpicontext)

public actual fun SetThreadDpiHostingBehavior(value: DPI_HOSTING_BEHAVIOR): DPI_HOSTING_BEHAVIOR =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_SetThreadDpiHostingBehavior(value)

public actual fun SystemParametersInfoForDpi(uiaction: UInt, uiparam: UInt, pvparam: Long, fwinini: UInt, dpi: UInt): BOOL =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_SystemParametersInfoForDpi(uiaction.toInt(), uiparam.toInt(), pvparam, fwinini.toInt(), dpi.toInt())
