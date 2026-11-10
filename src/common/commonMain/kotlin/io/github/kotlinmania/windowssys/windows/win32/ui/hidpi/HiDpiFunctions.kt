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

public expect fun adjustWindowRectExForDpi(lprect: COpaquePointer?, dwstyle: WindowStyle, bmenu: Bool, dwexstyle: WindowExStyle, dpi: UInt): Bool

public expect fun areDpiAwarenessContextsEqual(dpicontexta: DpiAwarenessContext, dpicontextb: DpiAwarenessContext): Bool

public expect fun enableNonClientDpiScaling(hwnd: Hwnd): Bool

public expect fun getAwarenessFromDpiAwarenessContext(value: DpiAwarenessContext): DpiAwareness

public expect fun getDialogControlDpiChangeBehavior(hwnd: Hwnd): DialogControlDpiChangeBehaviors

public expect fun getDialogDpiChangeBehavior(hdlg: Hwnd): DialogDpiChangeBehaviors

public expect fun getDpiAwarenessContextForProcess(hprocess: Handle): DpiAwarenessContext

public expect fun getDpiForMonitor(hmonitor: Hmonitor, dpitype: MonitorDpiType, dpix: COpaquePointer?, dpiy: COpaquePointer?): Hresult

public expect fun getDpiForSystem(): UInt

public expect fun getDpiForWindow(hwnd: Hwnd): UInt

public expect fun getDpiFromDpiAwarenessContext(value: DpiAwarenessContext): UInt

public expect fun getProcessDpiAwareness(hprocess: Handle, value: COpaquePointer?): Hresult

public expect fun getSystemDpiForProcess(hprocess: Handle): UInt

public expect fun getSystemMetricsForDpi(nindex: SystemMetricsIndex, dpi: UInt): Int

public expect fun getThreadDpiAwarenessContext(): DpiAwarenessContext

public expect fun getThreadDpiHostingBehavior(): DpiHostingBehavior

public expect fun getWindowDpiAwarenessContext(hwnd: Hwnd): DpiAwarenessContext

public expect fun getWindowDpiHostingBehavior(hwnd: Hwnd): DpiHostingBehavior

public expect fun isValidDpiAwarenessContext(value: DpiAwarenessContext): Bool

public expect fun logicalToPhysicalPointForPerMonitorDPI(hwnd: Hwnd, lppoint: COpaquePointer?): Bool

public expect fun openThemeDataForDpi(hwnd: Hwnd, pszclasslist: Pcwstr, dpi: UInt): Htheme

public expect fun physicalToLogicalPointForPerMonitorDPI(hwnd: Hwnd, lppoint: COpaquePointer?): Bool

public expect fun setDialogControlDpiChangeBehavior(hwnd: Hwnd, mask: DialogControlDpiChangeBehaviors, values: DialogControlDpiChangeBehaviors): Bool

public expect fun setDialogDpiChangeBehavior(hdlg: Hwnd, mask: DialogDpiChangeBehaviors, values: DialogDpiChangeBehaviors): Bool

public expect fun setProcessDpiAwareness(value: ProcessDpiAwareness): Hresult

public expect fun setProcessDpiAwarenessContext(value: DpiAwarenessContext): Bool

public expect fun setThreadDpiAwarenessContext(dpicontext: DpiAwarenessContext): DpiAwarenessContext

public expect fun setThreadDpiHostingBehavior(value: DpiHostingBehavior): DpiHostingBehavior

public expect fun systemParametersInfoForDpi(uiaction: UInt, uiparam: UInt, pvparam: COpaquePointer?, fwinini: UInt, dpi: UInt): Bool
