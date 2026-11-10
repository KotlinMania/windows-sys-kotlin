@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32UiHidpiJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_adjustWindowRectExForDpi(lprect: Long, dwstyle: Int, bmenu: Int, dwexstyle: Int, dpi: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_areDpiAwarenessContextsEqual(dpicontexta: Long, dpicontextb: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_enableNonClientDpiScaling(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_getAwarenessFromDpiAwarenessContext(value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_getDialogControlDpiChangeBehavior(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_getDialogDpiChangeBehavior(hdlg: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_getDpiAwarenessContextForProcess(hprocess: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_getDpiForMonitor(hmonitor: Long, dpitype: Int, dpix: Long, dpiy: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_getDpiForSystem(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_getDpiForWindow(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_getDpiFromDpiAwarenessContext(value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_getProcessDpiAwareness(hprocess: Long, value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_getSystemDpiForProcess(hprocess: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_getSystemMetricsForDpi(nindex: Int, dpi: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_getThreadDpiAwarenessContext(): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_getThreadDpiHostingBehavior(): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_getWindowDpiAwarenessContext(hwnd: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_getWindowDpiHostingBehavior(hwnd: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_isValidDpiAwarenessContext(value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_logicalToPhysicalPointForPerMonitorDPI(hwnd: Long, lppoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_openThemeDataForDpi(hwnd: Long, pszclasslist: Long, dpi: Int): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_physicalToLogicalPointForPerMonitorDPI(hwnd: Long, lppoint: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_setDialogControlDpiChangeBehavior(hwnd: Long, mask: Int, values: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_setDialogDpiChangeBehavior(hdlg: Long, mask: Int, values: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_setProcessDpiAwareness(value: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_setProcessDpiAwarenessContext(value: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_setThreadDpiAwarenessContext(dpicontext: Long): Long

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_setThreadDpiHostingBehavior(value: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_ui_hidpi_systemParametersInfoForDpi(uiaction: Int, uiparam: Int, pvparam: Long, fwinini: Int, dpi: Int): Int
}

public actual fun adjustWindowRectExForDpi(lprect: COpaquePointer?, dwstyle: WindowStyle, bmenu: Bool, dwexstyle: WindowExStyle, dpi: UInt): Bool =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_adjustWindowRectExForDpi((lprect?.value ?: 0L), dwstyle.toInt(), bmenu, dwexstyle.toInt(), dpi.toInt())

public actual fun areDpiAwarenessContextsEqual(dpicontexta: DpiAwarenessContext, dpicontextb: DpiAwarenessContext): Bool =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_areDpiAwarenessContextsEqual((dpicontexta?.value ?: 0L), (dpicontextb?.value ?: 0L))

public actual fun enableNonClientDpiScaling(hwnd: Hwnd): Bool =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_enableNonClientDpiScaling((hwnd?.value ?: 0L))

public actual fun getAwarenessFromDpiAwarenessContext(value: DpiAwarenessContext): DpiAwareness =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_getAwarenessFromDpiAwarenessContext((value?.value ?: 0L))

public actual fun getDialogControlDpiChangeBehavior(hwnd: Hwnd): DialogControlDpiChangeBehaviors =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_getDialogControlDpiChangeBehavior((hwnd?.value ?: 0L))

public actual fun getDialogDpiChangeBehavior(hdlg: Hwnd): DialogDpiChangeBehaviors =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_getDialogDpiChangeBehavior((hdlg?.value ?: 0L))

public actual fun getDpiAwarenessContextForProcess(hprocess: Handle): DpiAwarenessContext =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_getDpiAwarenessContextForProcess((hprocess?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getDpiForMonitor(hmonitor: Hmonitor, dpitype: MonitorDpiType, dpix: COpaquePointer?, dpiy: COpaquePointer?): Hresult =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_getDpiForMonitor((hmonitor?.value ?: 0L), dpitype, (dpix?.value ?: 0L), (dpiy?.value ?: 0L))

public actual fun getDpiForSystem(): UInt =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_getDpiForSystem().toUInt()

public actual fun getDpiForWindow(hwnd: Hwnd): UInt =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_getDpiForWindow((hwnd?.value ?: 0L)).toUInt()

public actual fun getDpiFromDpiAwarenessContext(value: DpiAwarenessContext): UInt =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_getDpiFromDpiAwarenessContext((value?.value ?: 0L)).toUInt()

public actual fun getProcessDpiAwareness(hprocess: Handle, value: COpaquePointer?): Hresult =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_getProcessDpiAwareness((hprocess?.value ?: 0L), (value?.value ?: 0L))

public actual fun getSystemDpiForProcess(hprocess: Handle): UInt =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_getSystemDpiForProcess((hprocess?.value ?: 0L)).toUInt()

public actual fun getSystemMetricsForDpi(nindex: SystemMetricsIndex, dpi: UInt): Int =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_getSystemMetricsForDpi(nindex, dpi.toInt())

public actual fun getThreadDpiAwarenessContext(): DpiAwarenessContext =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_getThreadDpiAwarenessContext().let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getThreadDpiHostingBehavior(): DpiHostingBehavior =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_getThreadDpiHostingBehavior()

public actual fun getWindowDpiAwarenessContext(hwnd: Hwnd): DpiAwarenessContext =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_getWindowDpiAwarenessContext((hwnd?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun getWindowDpiHostingBehavior(hwnd: Hwnd): DpiHostingBehavior =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_getWindowDpiHostingBehavior((hwnd?.value ?: 0L))

public actual fun isValidDpiAwarenessContext(value: DpiAwarenessContext): Bool =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_isValidDpiAwarenessContext((value?.value ?: 0L))

public actual fun logicalToPhysicalPointForPerMonitorDPI(hwnd: Hwnd, lppoint: COpaquePointer?): Bool =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_logicalToPhysicalPointForPerMonitorDPI((hwnd?.value ?: 0L), (lppoint?.value ?: 0L))

public actual fun openThemeDataForDpi(hwnd: Hwnd, pszclasslist: Pcwstr, dpi: UInt): Htheme =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_openThemeDataForDpi((hwnd?.value ?: 0L), (pszclasslist?.value ?: 0L), dpi.toInt())

public actual fun physicalToLogicalPointForPerMonitorDPI(hwnd: Hwnd, lppoint: COpaquePointer?): Bool =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_physicalToLogicalPointForPerMonitorDPI((hwnd?.value ?: 0L), (lppoint?.value ?: 0L))

public actual fun setDialogControlDpiChangeBehavior(hwnd: Hwnd, mask: DialogControlDpiChangeBehaviors, values: DialogControlDpiChangeBehaviors): Bool =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_setDialogControlDpiChangeBehavior((hwnd?.value ?: 0L), mask, values)

public actual fun setDialogDpiChangeBehavior(hdlg: Hwnd, mask: DialogDpiChangeBehaviors, values: DialogDpiChangeBehaviors): Bool =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_setDialogDpiChangeBehavior((hdlg?.value ?: 0L), mask, values)

public actual fun setProcessDpiAwareness(value: ProcessDpiAwareness): Hresult =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_setProcessDpiAwareness(value)

public actual fun setProcessDpiAwarenessContext(value: DpiAwarenessContext): Bool =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_setProcessDpiAwarenessContext((value?.value ?: 0L))

public actual fun setThreadDpiAwarenessContext(dpicontext: DpiAwarenessContext): DpiAwarenessContext =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_setThreadDpiAwarenessContext((dpicontext?.value ?: 0L)).let { if (it == 0L) null else COpaquePointer(it) }

public actual fun setThreadDpiHostingBehavior(value: DpiHostingBehavior): DpiHostingBehavior =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_setThreadDpiHostingBehavior(value)

public actual fun systemParametersInfoForDpi(uiaction: UInt, uiparam: UInt, pvparam: COpaquePointer?, fwinini: UInt, dpi: UInt): Bool =
    WindowsWin32UiHidpiJniBridge.windowssys_windows_win32_ui_hidpi_systemParametersInfoForDpi(uiaction.toInt(), uiparam.toInt(), (pvparam?.value ?: 0L), fwinini.toInt(), dpi.toInt())
