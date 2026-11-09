@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun AdjustWindowRectExForDpi(lprect: Long, dwstyle: WINDOW_STYLE, bmenu: BOOL, dwexstyle: WINDOW_EX_STYLE, dpi: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_AdjustWindowRectExForDpi(lprect.toCPointer<ByteVar>(), dwstyle, bmenu, dwexstyle, dpi)

public actual fun AreDpiAwarenessContextsEqual(dpicontexta: DPI_AWARENESS_CONTEXT, dpicontextb: DPI_AWARENESS_CONTEXT): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_AreDpiAwarenessContextsEqual(dpicontexta.toCPointer<ByteVar>(), dpicontextb.toCPointer<ByteVar>())

public actual fun EnableNonClientDpiScaling(hwnd: HWND): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_EnableNonClientDpiScaling(hwnd.toCPointer<ByteVar>())

public actual fun GetAwarenessFromDpiAwarenessContext(value: DPI_AWARENESS_CONTEXT): DPI_AWARENESS =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_GetAwarenessFromDpiAwarenessContext(value.toCPointer<ByteVar>())

public actual fun GetDialogControlDpiChangeBehavior(hwnd: HWND): DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_GetDialogControlDpiChangeBehavior(hwnd.toCPointer<ByteVar>())

public actual fun GetDialogDpiChangeBehavior(hdlg: HWND): DIALOG_DPI_CHANGE_BEHAVIORS =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_GetDialogDpiChangeBehavior(hdlg.toCPointer<ByteVar>())

public actual fun GetDpiAwarenessContextForProcess(hprocess: HANDLE): DPI_AWARENESS_CONTEXT =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_GetDpiAwarenessContextForProcess(hprocess.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GetDpiForMonitor(hmonitor: HMONITOR, dpitype: MONITOR_DPI_TYPE, dpix: Long, dpiy: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_GetDpiForMonitor(hmonitor.toCPointer<ByteVar>(), dpitype, dpix.toCPointer<ByteVar>(), dpiy.toCPointer<ByteVar>())

public actual fun GetDpiForSystem(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_GetDpiForSystem()

public actual fun GetDpiForWindow(hwnd: HWND): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_GetDpiForWindow(hwnd.toCPointer<ByteVar>())

public actual fun GetDpiFromDpiAwarenessContext(value: DPI_AWARENESS_CONTEXT): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_GetDpiFromDpiAwarenessContext(value.toCPointer<ByteVar>())

public actual fun GetProcessDpiAwareness(hprocess: HANDLE, value: Long): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_GetProcessDpiAwareness(hprocess.toCPointer<ByteVar>(), value.toCPointer<ByteVar>())

public actual fun GetSystemDpiForProcess(hprocess: HANDLE): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_GetSystemDpiForProcess(hprocess.toCPointer<ByteVar>())

public actual fun GetSystemMetricsForDpi(nindex: SYSTEM_METRICS_INDEX, dpi: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_GetSystemMetricsForDpi(nindex, dpi)

public actual fun GetThreadDpiAwarenessContext(): DPI_AWARENESS_CONTEXT =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_GetThreadDpiAwarenessContext()?.toLong() ?: 0L

public actual fun GetThreadDpiHostingBehavior(): DPI_HOSTING_BEHAVIOR =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_GetThreadDpiHostingBehavior()

public actual fun GetWindowDpiAwarenessContext(hwnd: HWND): DPI_AWARENESS_CONTEXT =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_GetWindowDpiAwarenessContext(hwnd.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun GetWindowDpiHostingBehavior(hwnd: HWND): DPI_HOSTING_BEHAVIOR =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_GetWindowDpiHostingBehavior(hwnd.toCPointer<ByteVar>())

public actual fun IsValidDpiAwarenessContext(value: DPI_AWARENESS_CONTEXT): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_IsValidDpiAwarenessContext(value.toCPointer<ByteVar>())

public actual fun LogicalToPhysicalPointForPerMonitorDPI(hwnd: HWND, lppoint: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_LogicalToPhysicalPointForPerMonitorDPI(hwnd.toCPointer<ByteVar>(), lppoint.toCPointer<ByteVar>())

public actual fun OpenThemeDataForDpi(hwnd: HWND, pszclasslist: PCWSTR, dpi: UInt): HTHEME =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_OpenThemeDataForDpi(hwnd.toCPointer<ByteVar>(), pszclasslist.toCPointer<ByteVar>(), dpi)

public actual fun PhysicalToLogicalPointForPerMonitorDPI(hwnd: HWND, lppoint: Long): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_PhysicalToLogicalPointForPerMonitorDPI(hwnd.toCPointer<ByteVar>(), lppoint.toCPointer<ByteVar>())

public actual fun SetDialogControlDpiChangeBehavior(hwnd: HWND, mask: DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS, values: DIALOG_CONTROL_DPI_CHANGE_BEHAVIORS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_SetDialogControlDpiChangeBehavior(hwnd.toCPointer<ByteVar>(), mask, values)

public actual fun SetDialogDpiChangeBehavior(hdlg: HWND, mask: DIALOG_DPI_CHANGE_BEHAVIORS, values: DIALOG_DPI_CHANGE_BEHAVIORS): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_SetDialogDpiChangeBehavior(hdlg.toCPointer<ByteVar>(), mask, values)

public actual fun SetProcessDpiAwareness(value: PROCESS_DPI_AWARENESS): HRESULT =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_SetProcessDpiAwareness(value)

public actual fun SetProcessDpiAwarenessContext(value: DPI_AWARENESS_CONTEXT): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_SetProcessDpiAwarenessContext(value.toCPointer<ByteVar>())

public actual fun SetThreadDpiAwarenessContext(dpicontext: DPI_AWARENESS_CONTEXT): DPI_AWARENESS_CONTEXT =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_SetThreadDpiAwarenessContext(dpicontext.toCPointer<ByteVar>())?.toLong() ?: 0L

public actual fun SetThreadDpiHostingBehavior(value: DPI_HOSTING_BEHAVIOR): DPI_HOSTING_BEHAVIOR =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_SetThreadDpiHostingBehavior(value)

public actual fun SystemParametersInfoForDpi(uiaction: UInt, uiparam: UInt, pvparam: Long, fwinini: UInt, dpi: UInt): BOOL =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_SystemParametersInfoForDpi(uiaction, uiparam, pvparam.toCPointer<ByteVar>(), fwinini, dpi)
