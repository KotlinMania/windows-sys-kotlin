@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

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

private object WindowsWin32UiHidpiJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "windowssys_jni.dll"
                "macos" -> "libwindowssys_jni.dylib"
                else -> "libwindowssys_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/windowssys/native/$hostPlatform-$hostArch/$libFileName"
        val stream = WindowsWin32UiHidpiJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("windowssys_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssysWindowsWin32UiHidpiAdjustWindowRectExForDpi(lprect: Long, dwstyle: Int, bmenu: Int, dwexstyle: Int, dpi: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiHidpiAreDpiAwarenessContextsEqual(dpicontexta: Long, dpicontextb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiHidpiEnableNonClientDpiScaling(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiHidpiGetAwarenessFromDpiAwarenessContext(value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiHidpiGetDialogControlDpiChangeBehavior(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiHidpiGetDialogDpiChangeBehavior(hdlg: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiHidpiGetDpiAwarenessContextForProcess(hprocess: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiHidpiGetDpiForMonitor(hmonitor: Long, dpitype: Int, dpix: Long, dpiy: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiHidpiGetDpiForSystem(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiHidpiGetDpiForWindow(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiHidpiGetDpiFromDpiAwarenessContext(value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiHidpiGetProcessDpiAwareness(hprocess: Long, value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiHidpiGetSystemDpiForProcess(hprocess: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiHidpiGetSystemMetricsForDpi(nindex: Int, dpi: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiHidpiGetThreadDpiAwarenessContext(): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiHidpiGetThreadDpiHostingBehavior(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiHidpiGetWindowDpiAwarenessContext(hwnd: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiHidpiGetWindowDpiHostingBehavior(hwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiHidpiIsValidDpiAwarenessContext(value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiHidpiLogicalToPhysicalPointForPerMonitorDPI(hwnd: Long, lppoint: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiHidpiOpenThemeDataForDpi(hwnd: Long, pszclasslist: Long, dpi: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiHidpiPhysicalToLogicalPointForPerMonitorDPI(hwnd: Long, lppoint: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiHidpiSetDialogControlDpiChangeBehavior(hwnd: Long, mask: Int, values: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiHidpiSetDialogDpiChangeBehavior(hdlg: Long, mask: Int, values: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiHidpiSetProcessDpiAwareness(value: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiHidpiSetProcessDpiAwarenessContext(value: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiHidpiSetThreadDpiAwarenessContext(dpicontext: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiHidpiSetThreadDpiHostingBehavior(value: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiHidpiSystemParametersInfoForDpi(uiaction: Int, uiparam: Int, pvparam: Long, fwinini: Int, dpi: Int): Int
}

public actual fun adjustWindowRectExForDpi(lprect: MutPtr, dwstyle: WindowStyle, bmenu: Bool, dwexstyle: WindowExStyle, dpi: UInt): Bool =
    WindowsWin32UiHidpiJniBridge.windowssysWindowsWin32UiHidpiAdjustWindowRectExForDpi(lprect.rawAddress, dwstyle.toInt(), bmenu, dwexstyle.toInt(), dpi.toInt())

public actual fun areDpiAwarenessContextsEqual(dpicontexta: DpiAwarenessContext, dpicontextb: DpiAwarenessContext): Bool =
    WindowsWin32UiHidpiJniBridge.windowssysWindowsWin32UiHidpiAreDpiAwarenessContextsEqual(dpicontexta.rawAddress, dpicontextb.rawAddress)

public actual fun enableNonClientDpiScaling(hwnd: Hwnd): Bool =
    WindowsWin32UiHidpiJniBridge.windowssysWindowsWin32UiHidpiEnableNonClientDpiScaling(hwnd.rawAddress)

public actual fun getAwarenessFromDpiAwarenessContext(value: DpiAwarenessContext): DpiAwareness =
    WindowsWin32UiHidpiJniBridge.windowssysWindowsWin32UiHidpiGetAwarenessFromDpiAwarenessContext(value.rawAddress)

public actual fun getDialogControlDpiChangeBehavior(hwnd: Hwnd): DialogControlDpiChangeBehaviors =
    WindowsWin32UiHidpiJniBridge.windowssysWindowsWin32UiHidpiGetDialogControlDpiChangeBehavior(hwnd.rawAddress)

public actual fun getDialogDpiChangeBehavior(hdlg: Hwnd): DialogDpiChangeBehaviors =
    WindowsWin32UiHidpiJniBridge.windowssysWindowsWin32UiHidpiGetDialogDpiChangeBehavior(hdlg.rawAddress)

public actual fun getDpiAwarenessContextForProcess(hprocess: Handle): DpiAwarenessContext =
    MutPtr(WindowsWin32UiHidpiJniBridge.windowssysWindowsWin32UiHidpiGetDpiAwarenessContextForProcess(hprocess.rawAddress))

public actual fun getDpiForMonitor(hmonitor: Hmonitor, dpitype: MonitorDpiType, dpix: MutPtr, dpiy: MutPtr): Hresult =
    WindowsWin32UiHidpiJniBridge.windowssysWindowsWin32UiHidpiGetDpiForMonitor(hmonitor.rawAddress, dpitype, dpix.rawAddress, dpiy.rawAddress)

public actual fun getDpiForSystem(): UInt =
    WindowsWin32UiHidpiJniBridge.windowssysWindowsWin32UiHidpiGetDpiForSystem().toUInt()

public actual fun getDpiForWindow(hwnd: Hwnd): UInt =
    WindowsWin32UiHidpiJniBridge.windowssysWindowsWin32UiHidpiGetDpiForWindow(hwnd.rawAddress).toUInt()

public actual fun getDpiFromDpiAwarenessContext(value: DpiAwarenessContext): UInt =
    WindowsWin32UiHidpiJniBridge.windowssysWindowsWin32UiHidpiGetDpiFromDpiAwarenessContext(value.rawAddress).toUInt()

public actual fun getProcessDpiAwareness(hprocess: Handle, value: MutPtr): Hresult =
    WindowsWin32UiHidpiJniBridge.windowssysWindowsWin32UiHidpiGetProcessDpiAwareness(hprocess.rawAddress, value.rawAddress)

public actual fun getSystemDpiForProcess(hprocess: Handle): UInt =
    WindowsWin32UiHidpiJniBridge.windowssysWindowsWin32UiHidpiGetSystemDpiForProcess(hprocess.rawAddress).toUInt()

public actual fun getSystemMetricsForDpi(nindex: SystemMetricsIndex, dpi: UInt): Int =
    WindowsWin32UiHidpiJniBridge.windowssysWindowsWin32UiHidpiGetSystemMetricsForDpi(nindex, dpi.toInt())

public actual fun getThreadDpiAwarenessContext(): DpiAwarenessContext =
    MutPtr(WindowsWin32UiHidpiJniBridge.windowssysWindowsWin32UiHidpiGetThreadDpiAwarenessContext())

public actual fun getThreadDpiHostingBehavior(): DpiHostingBehavior =
    WindowsWin32UiHidpiJniBridge.windowssysWindowsWin32UiHidpiGetThreadDpiHostingBehavior()

public actual fun getWindowDpiAwarenessContext(hwnd: Hwnd): DpiAwarenessContext =
    MutPtr(WindowsWin32UiHidpiJniBridge.windowssysWindowsWin32UiHidpiGetWindowDpiAwarenessContext(hwnd.rawAddress))

public actual fun getWindowDpiHostingBehavior(hwnd: Hwnd): DpiHostingBehavior =
    WindowsWin32UiHidpiJniBridge.windowssysWindowsWin32UiHidpiGetWindowDpiHostingBehavior(hwnd.rawAddress)

public actual fun isValidDpiAwarenessContext(value: DpiAwarenessContext): Bool =
    WindowsWin32UiHidpiJniBridge.windowssysWindowsWin32UiHidpiIsValidDpiAwarenessContext(value.rawAddress)

public actual fun logicalToPhysicalPointForPerMonitorDPI(hwnd: Hwnd, lppoint: MutPtr): Bool =
    WindowsWin32UiHidpiJniBridge.windowssysWindowsWin32UiHidpiLogicalToPhysicalPointForPerMonitorDPI(hwnd.rawAddress, lppoint.rawAddress)

public actual fun openThemeDataForDpi(hwnd: Hwnd, pszclasslist: Pcwstr, dpi: UInt): Htheme =
    WindowsWin32UiHidpiJniBridge.windowssysWindowsWin32UiHidpiOpenThemeDataForDpi(hwnd.rawAddress, pszclasslist.rawAddress, dpi.toInt())

public actual fun physicalToLogicalPointForPerMonitorDPI(hwnd: Hwnd, lppoint: MutPtr): Bool =
    WindowsWin32UiHidpiJniBridge.windowssysWindowsWin32UiHidpiPhysicalToLogicalPointForPerMonitorDPI(hwnd.rawAddress, lppoint.rawAddress)

public actual fun setDialogControlDpiChangeBehavior(hwnd: Hwnd, mask: DialogControlDpiChangeBehaviors, values: DialogControlDpiChangeBehaviors): Bool =
    WindowsWin32UiHidpiJniBridge.windowssysWindowsWin32UiHidpiSetDialogControlDpiChangeBehavior(hwnd.rawAddress, mask, values)

public actual fun setDialogDpiChangeBehavior(hdlg: Hwnd, mask: DialogDpiChangeBehaviors, values: DialogDpiChangeBehaviors): Bool =
    WindowsWin32UiHidpiJniBridge.windowssysWindowsWin32UiHidpiSetDialogDpiChangeBehavior(hdlg.rawAddress, mask, values)

public actual fun setProcessDpiAwareness(value: ProcessDpiAwareness): Hresult =
    WindowsWin32UiHidpiJniBridge.windowssysWindowsWin32UiHidpiSetProcessDpiAwareness(value)

public actual fun setProcessDpiAwarenessContext(value: DpiAwarenessContext): Bool =
    WindowsWin32UiHidpiJniBridge.windowssysWindowsWin32UiHidpiSetProcessDpiAwarenessContext(value.rawAddress)

public actual fun setThreadDpiAwarenessContext(dpicontext: DpiAwarenessContext): DpiAwarenessContext =
    MutPtr(WindowsWin32UiHidpiJniBridge.windowssysWindowsWin32UiHidpiSetThreadDpiAwarenessContext(dpicontext.rawAddress))

public actual fun setThreadDpiHostingBehavior(value: DpiHostingBehavior): DpiHostingBehavior =
    WindowsWin32UiHidpiJniBridge.windowssysWindowsWin32UiHidpiSetThreadDpiHostingBehavior(value)

public actual fun systemParametersInfoForDpi(uiaction: UInt, uiparam: UInt, pvparam: MutPtr, fwinini: UInt, dpi: UInt): Bool =
    WindowsWin32UiHidpiJniBridge.windowssysWindowsWin32UiHidpiSystemParametersInfoForDpi(uiaction.toInt(), uiparam.toInt(), pvparam.rawAddress, fwinini.toInt(), dpi.toInt())
