@file:OptIn(kotlin.ExperimentalUnsignedTypes::class, kotlin.wasm.ExperimentalWasmInterop::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.hidpi

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
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

// The host must provide the C companion wrapper exports in import module windowssys.
public actual fun adjustWindowRectExForDpi(lprect: MutPtr, dwstyle: WindowStyle, bmenu: Bool, dwexstyle: WindowExStyle, dpi: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiHidpiAdjustWindowRectExForDpi")

public actual fun areDpiAwarenessContextsEqual(dpicontexta: DpiAwarenessContext, dpicontextb: DpiAwarenessContext): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiHidpiAreDpiAwarenessContextsEqual")

public actual fun enableNonClientDpiScaling(hwnd: Hwnd): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiHidpiEnableNonClientDpiScaling")

public actual fun getAwarenessFromDpiAwarenessContext(value: DpiAwarenessContext): DpiAwareness =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiHidpiGetAwarenessFromDpiAwarenessContext")

public actual fun getDialogControlDpiChangeBehavior(hwnd: Hwnd): DialogControlDpiChangeBehaviors =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiHidpiGetDialogControlDpiChangeBehavior")

public actual fun getDialogDpiChangeBehavior(hdlg: Hwnd): DialogDpiChangeBehaviors =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiHidpiGetDialogDpiChangeBehavior")

public actual fun getDpiAwarenessContextForProcess(hprocess: Handle): DpiAwarenessContext =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiHidpiGetDpiAwarenessContextForProcess")

public actual fun getDpiForMonitor(hmonitor: Hmonitor, dpitype: MonitorDpiType, dpix: MutPtr, dpiy: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiHidpiGetDpiForMonitor")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiHidpiGetDpiForSystem")
private external fun wasiWindowssysWindowsWin32UiHidpiGetDpiForSystem(): Int

public actual fun getDpiForSystem(): UInt =
    wasiWindowssysWindowsWin32UiHidpiGetDpiForSystem().toUInt()

public actual fun getDpiForWindow(hwnd: Hwnd): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiHidpiGetDpiForWindow")

public actual fun getDpiFromDpiAwarenessContext(value: DpiAwarenessContext): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiHidpiGetDpiFromDpiAwarenessContext")

public actual fun getProcessDpiAwareness(hprocess: Handle, value: MutPtr): Hresult =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiHidpiGetProcessDpiAwareness")

public actual fun getSystemDpiForProcess(hprocess: Handle): UInt =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiHidpiGetSystemDpiForProcess")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiHidpiGetSystemMetricsForDpi")
private external fun wasiWindowssysWindowsWin32UiHidpiGetSystemMetricsForDpi(nindex: Int, dpi: Int): Int

public actual fun getSystemMetricsForDpi(nindex: SystemMetricsIndex, dpi: UInt): Int =
    wasiWindowssysWindowsWin32UiHidpiGetSystemMetricsForDpi(nindex, dpi.toInt())

public actual fun getThreadDpiAwarenessContext(): DpiAwarenessContext =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiHidpiGetThreadDpiAwarenessContext")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiHidpiGetThreadDpiHostingBehavior")
private external fun wasiWindowssysWindowsWin32UiHidpiGetThreadDpiHostingBehavior(): Int

public actual fun getThreadDpiHostingBehavior(): DpiHostingBehavior =
    wasiWindowssysWindowsWin32UiHidpiGetThreadDpiHostingBehavior()

public actual fun getWindowDpiAwarenessContext(hwnd: Hwnd): DpiAwarenessContext =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiHidpiGetWindowDpiAwarenessContext")

public actual fun getWindowDpiHostingBehavior(hwnd: Hwnd): DpiHostingBehavior =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiHidpiGetWindowDpiHostingBehavior")

public actual fun isValidDpiAwarenessContext(value: DpiAwarenessContext): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiHidpiIsValidDpiAwarenessContext")

public actual fun logicalToPhysicalPointForPerMonitorDPI(hwnd: Hwnd, lppoint: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiHidpiLogicalToPhysicalPointForPerMonitorDPI")

public actual fun openThemeDataForDpi(hwnd: Hwnd, pszclasslist: Pcwstr, dpi: UInt): Htheme =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiHidpiOpenThemeDataForDpi")

public actual fun physicalToLogicalPointForPerMonitorDPI(hwnd: Hwnd, lppoint: MutPtr): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiHidpiPhysicalToLogicalPointForPerMonitorDPI")

public actual fun setDialogControlDpiChangeBehavior(hwnd: Hwnd, mask: DialogControlDpiChangeBehaviors, values: DialogControlDpiChangeBehaviors): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiHidpiSetDialogControlDpiChangeBehavior")

public actual fun setDialogDpiChangeBehavior(hdlg: Hwnd, mask: DialogDpiChangeBehaviors, values: DialogDpiChangeBehaviors): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiHidpiSetDialogDpiChangeBehavior")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiHidpiSetProcessDpiAwareness")
private external fun wasiWindowssysWindowsWin32UiHidpiSetProcessDpiAwareness(value: Int): Int

public actual fun setProcessDpiAwareness(value: ProcessDpiAwareness): Hresult =
    wasiWindowssysWindowsWin32UiHidpiSetProcessDpiAwareness(value)

public actual fun setProcessDpiAwarenessContext(value: DpiAwarenessContext): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiHidpiSetProcessDpiAwarenessContext")

public actual fun setThreadDpiAwarenessContext(dpicontext: DpiAwarenessContext): DpiAwarenessContext =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiHidpiSetThreadDpiAwarenessContext")

@kotlin.wasm.WasmImport("windowssys", "windowssysWindowsWin32UiHidpiSetThreadDpiHostingBehavior")
private external fun wasiWindowssysWindowsWin32UiHidpiSetThreadDpiHostingBehavior(value: Int): Int

public actual fun setThreadDpiHostingBehavior(value: DpiHostingBehavior): DpiHostingBehavior =
    wasiWindowssysWindowsWin32UiHidpiSetThreadDpiHostingBehavior(value)

public actual fun systemParametersInfoForDpi(uiaction: UInt, uiparam: UInt, pvparam: MutPtr, fwinini: UInt, dpi: UInt): Bool =
    throw UnsupportedOperationException("WasmWasi FFI requires a host memory/callback/aggregate or variadic ABI adapter for windowssysWindowsWin32UiHidpiSystemParametersInfoForDpi")
