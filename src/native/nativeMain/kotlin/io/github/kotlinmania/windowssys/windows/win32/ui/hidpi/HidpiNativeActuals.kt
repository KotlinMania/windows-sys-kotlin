@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

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
import io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssysWindowsWin32UiHidpiAdjustWindowRectExForDpi
import io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssysWindowsWin32UiHidpiAreDpiAwarenessContextsEqual
import io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssysWindowsWin32UiHidpiEnableNonClientDpiScaling
import io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssysWindowsWin32UiHidpiGetAwarenessFromDpiAwarenessContext
import io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssysWindowsWin32UiHidpiGetDialogControlDpiChangeBehavior
import io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssysWindowsWin32UiHidpiGetDialogDpiChangeBehavior
import io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssysWindowsWin32UiHidpiGetDpiAwarenessContextForProcess
import io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssysWindowsWin32UiHidpiGetDpiForMonitor
import io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssysWindowsWin32UiHidpiGetDpiForSystem
import io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssysWindowsWin32UiHidpiGetDpiForWindow
import io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssysWindowsWin32UiHidpiGetDpiFromDpiAwarenessContext
import io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssysWindowsWin32UiHidpiGetProcessDpiAwareness
import io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssysWindowsWin32UiHidpiGetSystemDpiForProcess
import io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssysWindowsWin32UiHidpiGetSystemMetricsForDpi
import io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssysWindowsWin32UiHidpiGetThreadDpiAwarenessContext
import io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssysWindowsWin32UiHidpiGetThreadDpiHostingBehavior
import io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssysWindowsWin32UiHidpiGetWindowDpiAwarenessContext
import io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssysWindowsWin32UiHidpiGetWindowDpiHostingBehavior
import io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssysWindowsWin32UiHidpiIsValidDpiAwarenessContext
import io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssysWindowsWin32UiHidpiLogicalToPhysicalPointForPerMonitorDPI
import io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssysWindowsWin32UiHidpiOpenThemeDataForDpi
import io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssysWindowsWin32UiHidpiPhysicalToLogicalPointForPerMonitorDPI
import io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssysWindowsWin32UiHidpiSetDialogControlDpiChangeBehavior
import io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssysWindowsWin32UiHidpiSetDialogDpiChangeBehavior
import io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssysWindowsWin32UiHidpiSetProcessDpiAwareness
import io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssysWindowsWin32UiHidpiSetProcessDpiAwarenessContext
import io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssysWindowsWin32UiHidpiSetThreadDpiAwarenessContext
import io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssysWindowsWin32UiHidpiSetThreadDpiHostingBehavior
import io.github.kotlinmania.windowssys.windows.win32.ui.hidpi.cinterop.windowssysWindowsWin32UiHidpiSystemParametersInfoForDpi
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.SystemMetricsIndex
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.WindowExStyle
import io.github.kotlinmania.windowssys.windows.win32.ui.windowsandmessaging.WindowStyle
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

public actual fun adjustWindowRectExForDpi(lprect: MutPtr<Rect>, dwstyle: WindowStyle, bmenu: Bool, dwexstyle: WindowExStyle, dpi: UInt): Bool =
    windowssysWindowsWin32UiHidpiAdjustWindowRectExForDpi(lprect.rawAddress.toCPointer<ByteVar>(), dwstyle, bmenu, dwexstyle, dpi)

public actual fun areDpiAwarenessContextsEqual(dpicontexta: DpiAwarenessContext, dpicontextb: DpiAwarenessContext): Bool =
    windowssysWindowsWin32UiHidpiAreDpiAwarenessContextsEqual(dpicontexta.rawAddress.toCPointer<ByteVar>(), dpicontextb.rawAddress.toCPointer<ByteVar>())

public actual fun enableNonClientDpiScaling(hwnd: Hwnd): Bool =
    windowssysWindowsWin32UiHidpiEnableNonClientDpiScaling(hwnd.rawAddress.toCPointer<ByteVar>())

public actual fun getAwarenessFromDpiAwarenessContext(value: DpiAwarenessContext): DpiAwareness =
    windowssysWindowsWin32UiHidpiGetAwarenessFromDpiAwarenessContext(value.rawAddress.toCPointer<ByteVar>())

public actual fun getDialogControlDpiChangeBehavior(hwnd: Hwnd): DialogControlDpiChangeBehaviors =
    windowssysWindowsWin32UiHidpiGetDialogControlDpiChangeBehavior(hwnd.rawAddress.toCPointer<ByteVar>())

public actual fun getDialogDpiChangeBehavior(hdlg: Hwnd): DialogDpiChangeBehaviors =
    windowssysWindowsWin32UiHidpiGetDialogDpiChangeBehavior(hdlg.rawAddress.toCPointer<ByteVar>())

public actual fun getDpiAwarenessContextForProcess(hprocess: Handle): DpiAwarenessContext =
    MutPtr(windowssysWindowsWin32UiHidpiGetDpiAwarenessContextForProcess(hprocess.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getDpiForMonitor(hmonitor: Hmonitor, dpitype: MonitorDpiType, dpix: MutPtr<UInt>, dpiy: MutPtr<UInt>): Hresult =
    windowssysWindowsWin32UiHidpiGetDpiForMonitor(hmonitor.rawAddress.toCPointer<ByteVar>(), dpitype, dpix.rawAddress.toCPointer<ByteVar>(), dpiy.rawAddress.toCPointer<ByteVar>())

public actual fun getDpiForSystem(): UInt =
    windowssysWindowsWin32UiHidpiGetDpiForSystem()

public actual fun getDpiForWindow(hwnd: Hwnd): UInt =
    windowssysWindowsWin32UiHidpiGetDpiForWindow(hwnd.rawAddress.toCPointer<ByteVar>())

public actual fun getDpiFromDpiAwarenessContext(value: DpiAwarenessContext): UInt =
    windowssysWindowsWin32UiHidpiGetDpiFromDpiAwarenessContext(value.rawAddress.toCPointer<ByteVar>())

public actual fun getProcessDpiAwareness(hprocess: Handle, value: MutPtr<ProcessDpiAwareness>): Hresult =
    windowssysWindowsWin32UiHidpiGetProcessDpiAwareness(hprocess.rawAddress.toCPointer<ByteVar>(), value.rawAddress.toCPointer<ByteVar>())

public actual fun getSystemDpiForProcess(hprocess: Handle): UInt =
    windowssysWindowsWin32UiHidpiGetSystemDpiForProcess(hprocess.rawAddress.toCPointer<ByteVar>())

public actual fun getSystemMetricsForDpi(nindex: SystemMetricsIndex, dpi: UInt): Int =
    windowssysWindowsWin32UiHidpiGetSystemMetricsForDpi(nindex, dpi)

public actual fun getThreadDpiAwarenessContext(): DpiAwarenessContext =
    MutPtr(windowssysWindowsWin32UiHidpiGetThreadDpiAwarenessContext()?.toLong() ?: 0L)

public actual fun getThreadDpiHostingBehavior(): DpiHostingBehavior =
    windowssysWindowsWin32UiHidpiGetThreadDpiHostingBehavior()

public actual fun getWindowDpiAwarenessContext(hwnd: Hwnd): DpiAwarenessContext =
    MutPtr(windowssysWindowsWin32UiHidpiGetWindowDpiAwarenessContext(hwnd.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun getWindowDpiHostingBehavior(hwnd: Hwnd): DpiHostingBehavior =
    windowssysWindowsWin32UiHidpiGetWindowDpiHostingBehavior(hwnd.rawAddress.toCPointer<ByteVar>())

public actual fun isValidDpiAwarenessContext(value: DpiAwarenessContext): Bool =
    windowssysWindowsWin32UiHidpiIsValidDpiAwarenessContext(value.rawAddress.toCPointer<ByteVar>())

public actual fun logicalToPhysicalPointForPerMonitorDPI(hwnd: Hwnd, lppoint: MutPtr<Point>): Bool =
    windowssysWindowsWin32UiHidpiLogicalToPhysicalPointForPerMonitorDPI(hwnd.rawAddress.toCPointer<ByteVar>(), lppoint.rawAddress.toCPointer<ByteVar>())

public actual fun openThemeDataForDpi(hwnd: Hwnd, pszclasslist: Pcwstr, dpi: UInt): Htheme =
    windowssysWindowsWin32UiHidpiOpenThemeDataForDpi(hwnd.rawAddress.toCPointer<ByteVar>(), pszclasslist.rawAddress.toCPointer<ByteVar>(), dpi)

public actual fun physicalToLogicalPointForPerMonitorDPI(hwnd: Hwnd, lppoint: MutPtr<Point>): Bool =
    windowssysWindowsWin32UiHidpiPhysicalToLogicalPointForPerMonitorDPI(hwnd.rawAddress.toCPointer<ByteVar>(), lppoint.rawAddress.toCPointer<ByteVar>())

public actual fun setDialogControlDpiChangeBehavior(hwnd: Hwnd, mask: DialogControlDpiChangeBehaviors, values: DialogControlDpiChangeBehaviors): Bool =
    windowssysWindowsWin32UiHidpiSetDialogControlDpiChangeBehavior(hwnd.rawAddress.toCPointer<ByteVar>(), mask, values)

public actual fun setDialogDpiChangeBehavior(hdlg: Hwnd, mask: DialogDpiChangeBehaviors, values: DialogDpiChangeBehaviors): Bool =
    windowssysWindowsWin32UiHidpiSetDialogDpiChangeBehavior(hdlg.rawAddress.toCPointer<ByteVar>(), mask, values)

public actual fun setProcessDpiAwareness(value: ProcessDpiAwareness): Hresult =
    windowssysWindowsWin32UiHidpiSetProcessDpiAwareness(value)

public actual fun setProcessDpiAwarenessContext(value: DpiAwarenessContext): Bool =
    windowssysWindowsWin32UiHidpiSetProcessDpiAwarenessContext(value.rawAddress.toCPointer<ByteVar>())

public actual fun setThreadDpiAwarenessContext(dpicontext: DpiAwarenessContext): DpiAwarenessContext =
    MutPtr(windowssysWindowsWin32UiHidpiSetThreadDpiAwarenessContext(dpicontext.rawAddress.toCPointer<ByteVar>())?.toLong() ?: 0L)

public actual fun setThreadDpiHostingBehavior(value: DpiHostingBehavior): DpiHostingBehavior =
    windowssysWindowsWin32UiHidpiSetThreadDpiHostingBehavior(value)

public actual fun systemParametersInfoForDpi(uiaction: UInt, uiparam: UInt, pvparam: MutPtr<CVoid>, fwinini: UInt, dpi: UInt): Bool =
    windowssysWindowsWin32UiHidpiSystemParametersInfoForDpi(uiaction, uiparam, pvparam.rawAddress.toCPointer<ByteVar>(), fwinini, dpi)
