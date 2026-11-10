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

public actual fun adjustWindowRectExForDpi(lprect: COpaquePointer?, dwstyle: WindowStyle, bmenu: Bool, dwexstyle: WindowExStyle, dpi: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun areDpiAwarenessContextsEqual(dpicontexta: DpiAwarenessContext, dpicontextb: DpiAwarenessContext): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun enableNonClientDpiScaling(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getAwarenessFromDpiAwarenessContext(value: DpiAwarenessContext): DpiAwareness =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDialogControlDpiChangeBehavior(hwnd: Hwnd): DialogControlDpiChangeBehaviors =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDialogDpiChangeBehavior(hdlg: Hwnd): DialogDpiChangeBehaviors =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDpiAwarenessContextForProcess(hprocess: Handle): DpiAwarenessContext =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDpiForMonitor(hmonitor: Hmonitor, dpitype: MonitorDpiType, dpix: COpaquePointer?, dpiy: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDpiForSystem(): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDpiForWindow(hwnd: Hwnd): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getDpiFromDpiAwarenessContext(value: DpiAwarenessContext): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getProcessDpiAwareness(hprocess: Handle, value: COpaquePointer?): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getSystemDpiForProcess(hprocess: Handle): UInt =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getSystemMetricsForDpi(nindex: SystemMetricsIndex, dpi: UInt): Int =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThreadDpiAwarenessContext(): DpiAwarenessContext =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getThreadDpiHostingBehavior(): DpiHostingBehavior =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWindowDpiAwarenessContext(hwnd: Hwnd): DpiAwarenessContext =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun getWindowDpiHostingBehavior(hwnd: Hwnd): DpiHostingBehavior =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun isValidDpiAwarenessContext(value: DpiAwarenessContext): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun logicalToPhysicalPointForPerMonitorDPI(hwnd: Hwnd, lppoint: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun openThemeDataForDpi(hwnd: Hwnd, pszclasslist: Pcwstr, dpi: UInt): Htheme =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun physicalToLogicalPointForPerMonitorDPI(hwnd: Hwnd, lppoint: COpaquePointer?): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setDialogControlDpiChangeBehavior(hwnd: Hwnd, mask: DialogControlDpiChangeBehaviors, values: DialogControlDpiChangeBehaviors): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setDialogDpiChangeBehavior(hdlg: Hwnd, mask: DialogDpiChangeBehaviors, values: DialogDpiChangeBehaviors): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setProcessDpiAwareness(value: ProcessDpiAwareness): Hresult =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setProcessDpiAwarenessContext(value: DpiAwarenessContext): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setThreadDpiAwarenessContext(dpicontext: DpiAwarenessContext): DpiAwarenessContext =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun setThreadDpiHostingBehavior(value: DpiHostingBehavior): DpiHostingBehavior =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")

public actual fun systemParametersInfoForDpi(uiaction: UInt, uiparam: UInt, pvparam: COpaquePointer?, fwinini: UInt, dpi: UInt): Bool =
    throw UnsupportedOperationException("Native FFI is not available on WasmWasi")
