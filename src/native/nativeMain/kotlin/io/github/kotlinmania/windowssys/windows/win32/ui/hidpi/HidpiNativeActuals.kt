@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun adjustWindowRectExForDpi(lprect: COpaquePointer?, dwstyle: WindowStyle, bmenu: Bool, dwexstyle: WindowExStyle, dpi: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_adjustWindowRectExForDpi(lprect?.value?.toCPointer<ByteVar>(), dwstyle, bmenu, dwexstyle, dpi)

public actual fun areDpiAwarenessContextsEqual(dpicontexta: DpiAwarenessContext, dpicontextb: DpiAwarenessContext): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_areDpiAwarenessContextsEqual(dpicontexta?.value?.toCPointer<ByteVar>(), dpicontextb?.value?.toCPointer<ByteVar>())

public actual fun enableNonClientDpiScaling(hwnd: Hwnd): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_enableNonClientDpiScaling(hwnd?.value?.toCPointer<ByteVar>())

public actual fun getAwarenessFromDpiAwarenessContext(value: DpiAwarenessContext): DpiAwareness =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_getAwarenessFromDpiAwarenessContext(value?.value?.toCPointer<ByteVar>())

public actual fun getDialogControlDpiChangeBehavior(hwnd: Hwnd): DialogControlDpiChangeBehaviors =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_getDialogControlDpiChangeBehavior(hwnd?.value?.toCPointer<ByteVar>())

public actual fun getDialogDpiChangeBehavior(hdlg: Hwnd): DialogDpiChangeBehaviors =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_getDialogDpiChangeBehavior(hdlg?.value?.toCPointer<ByteVar>())

public actual fun getDpiAwarenessContextForProcess(hprocess: Handle): DpiAwarenessContext =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_getDpiAwarenessContextForProcess(hprocess?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getDpiForMonitor(hmonitor: Hmonitor, dpitype: MonitorDpiType, dpix: COpaquePointer?, dpiy: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_getDpiForMonitor(hmonitor?.value?.toCPointer<ByteVar>(), dpitype, dpix?.value?.toCPointer<ByteVar>(), dpiy?.value?.toCPointer<ByteVar>())

public actual fun getDpiForSystem(): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_getDpiForSystem()

public actual fun getDpiForWindow(hwnd: Hwnd): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_getDpiForWindow(hwnd?.value?.toCPointer<ByteVar>())

public actual fun getDpiFromDpiAwarenessContext(value: DpiAwarenessContext): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_getDpiFromDpiAwarenessContext(value?.value?.toCPointer<ByteVar>())

public actual fun getProcessDpiAwareness(hprocess: Handle, value: COpaquePointer?): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_getProcessDpiAwareness(hprocess?.value?.toCPointer<ByteVar>(), value?.value?.toCPointer<ByteVar>())

public actual fun getSystemDpiForProcess(hprocess: Handle): UInt =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_getSystemDpiForProcess(hprocess?.value?.toCPointer<ByteVar>())

public actual fun getSystemMetricsForDpi(nindex: SystemMetricsIndex, dpi: UInt): Int =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_getSystemMetricsForDpi(nindex, dpi)

public actual fun getThreadDpiAwarenessContext(): DpiAwarenessContext =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_getThreadDpiAwarenessContext()?.let { COpaquePointer(it.toLong()) }

public actual fun getThreadDpiHostingBehavior(): DpiHostingBehavior =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_getThreadDpiHostingBehavior()

public actual fun getWindowDpiAwarenessContext(hwnd: Hwnd): DpiAwarenessContext =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_getWindowDpiAwarenessContext(hwnd?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun getWindowDpiHostingBehavior(hwnd: Hwnd): DpiHostingBehavior =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_getWindowDpiHostingBehavior(hwnd?.value?.toCPointer<ByteVar>())

public actual fun isValidDpiAwarenessContext(value: DpiAwarenessContext): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_isValidDpiAwarenessContext(value?.value?.toCPointer<ByteVar>())

public actual fun logicalToPhysicalPointForPerMonitorDPI(hwnd: Hwnd, lppoint: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_logicalToPhysicalPointForPerMonitorDPI(hwnd?.value?.toCPointer<ByteVar>(), lppoint?.value?.toCPointer<ByteVar>())

public actual fun openThemeDataForDpi(hwnd: Hwnd, pszclasslist: Pcwstr, dpi: UInt): Htheme =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_openThemeDataForDpi(hwnd?.value?.toCPointer<ByteVar>(), pszclasslist?.value?.toCPointer<ByteVar>(), dpi)

public actual fun physicalToLogicalPointForPerMonitorDPI(hwnd: Hwnd, lppoint: COpaquePointer?): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_physicalToLogicalPointForPerMonitorDPI(hwnd?.value?.toCPointer<ByteVar>(), lppoint?.value?.toCPointer<ByteVar>())

public actual fun setDialogControlDpiChangeBehavior(hwnd: Hwnd, mask: DialogControlDpiChangeBehaviors, values: DialogControlDpiChangeBehaviors): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_setDialogControlDpiChangeBehavior(hwnd?.value?.toCPointer<ByteVar>(), mask, values)

public actual fun setDialogDpiChangeBehavior(hdlg: Hwnd, mask: DialogDpiChangeBehaviors, values: DialogDpiChangeBehaviors): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_setDialogDpiChangeBehavior(hdlg?.value?.toCPointer<ByteVar>(), mask, values)

public actual fun setProcessDpiAwareness(value: ProcessDpiAwareness): Hresult =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_setProcessDpiAwareness(value)

public actual fun setProcessDpiAwarenessContext(value: DpiAwarenessContext): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_setProcessDpiAwarenessContext(value?.value?.toCPointer<ByteVar>())

public actual fun setThreadDpiAwarenessContext(dpicontext: DpiAwarenessContext): DpiAwarenessContext =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_setThreadDpiAwarenessContext(dpicontext?.value?.toCPointer<ByteVar>())?.let { COpaquePointer(it.toLong()) }

public actual fun setThreadDpiHostingBehavior(value: DpiHostingBehavior): DpiHostingBehavior =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_setThreadDpiHostingBehavior(value)

public actual fun systemParametersInfoForDpi(uiaction: UInt, uiparam: UInt, pvparam: COpaquePointer?, fwinini: UInt, dpi: UInt): Bool =
    io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssys_windows_win32_ui_hidpi_systemParametersInfoForDpi(uiaction, uiparam, pvparam?.value?.toCPointer<ByteVar>(), fwinini, dpi)
