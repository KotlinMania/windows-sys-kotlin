@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.ui.magnification

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd
import io.github.kotlinmania.windowssys.windows.win32.foundation.Rect

private object WindowsWin32UiMagnificationJniBridge {
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
        val stream = WindowsWin32UiMagnificationJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32UiMagnificationMagGetColorEffect(hwnd: Long, peffect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiMagnificationMagGetFullscreenColorEffect(peffect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiMagnificationMagGetFullscreenTransform(pmaglevel: Long, pxoffset: Long, pyoffset: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiMagnificationMagGetImageScalingCallback(hwnd: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32UiMagnificationMagGetInputTransform(pfenabled: Long, prectsource: Long, prectdest: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiMagnificationMagGetWindowFilterList(hwnd: Long, pdwfiltermode: Long, count: Int, phwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiMagnificationMagGetWindowSource(hwnd: Long, prect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiMagnificationMagGetWindowTransform(hwnd: Long, ptransform: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiMagnificationMagInitialize(): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiMagnificationMagSetColorEffect(hwnd: Long, peffect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiMagnificationMagSetFullscreenColorEffect(peffect: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiMagnificationMagSetFullscreenTransform(maglevel: Float, xoffset: Int, yoffset: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiMagnificationMagSetImageScalingCallback(hwnd: Long, callback: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiMagnificationMagSetInputTransform(fenabled: Int, prectsource: Long, prectdest: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiMagnificationMagSetWindowFilterList(hwnd: Long, dwfiltermode: Int, count: Int, phwnd: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiMagnificationMagSetWindowTransform(hwnd: Long, ptransform: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiMagnificationMagShowSystemCursor(fshowcursor: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32UiMagnificationMagUninitialize(): Int
}

public actual fun magGetColorEffect(hwnd: Hwnd, peffect: MutPtr<Magcoloreffect>): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssysWindowsWin32UiMagnificationMagGetColorEffect(hwnd.rawAddress, peffect.rawAddress)

public actual fun magGetFullscreenColorEffect(peffect: MutPtr<Magcoloreffect>): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssysWindowsWin32UiMagnificationMagGetFullscreenColorEffect(peffect.rawAddress)

public actual fun magGetFullscreenTransform(pmaglevel: MutPtr<Float>, pxoffset: MutPtr<Int>, pyoffset: MutPtr<Int>): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssysWindowsWin32UiMagnificationMagGetFullscreenTransform(pmaglevel.rawAddress, pxoffset.rawAddress, pyoffset.rawAddress)

public actual fun magGetImageScalingCallback(hwnd: Hwnd): MagImageScalingCallback =
    null

public actual fun magGetInputTransform(pfenabled: MutPtr<Bool>, prectsource: MutPtr<Rect>, prectdest: MutPtr<Rect>): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssysWindowsWin32UiMagnificationMagGetInputTransform(pfenabled.rawAddress, prectsource.rawAddress, prectdest.rawAddress)

public actual fun magGetWindowFilterList(hwnd: Hwnd, pdwfiltermode: MutPtr<MwFiltermode>, count: Int, phwnd: MutPtr<Hwnd>): Int =
    WindowsWin32UiMagnificationJniBridge.windowssysWindowsWin32UiMagnificationMagGetWindowFilterList(hwnd.rawAddress, pdwfiltermode.rawAddress, count, phwnd.rawAddress)

public actual fun magGetWindowSource(hwnd: Hwnd, prect: MutPtr<Rect>): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssysWindowsWin32UiMagnificationMagGetWindowSource(hwnd.rawAddress, prect.rawAddress)

public actual fun magGetWindowTransform(hwnd: Hwnd, ptransform: MutPtr<Magtransform>): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssysWindowsWin32UiMagnificationMagGetWindowTransform(hwnd.rawAddress, ptransform.rawAddress)

public actual fun magInitialize(): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssysWindowsWin32UiMagnificationMagInitialize()

public actual fun magSetColorEffect(hwnd: Hwnd, peffect: MutPtr<Magcoloreffect>): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssysWindowsWin32UiMagnificationMagSetColorEffect(hwnd.rawAddress, peffect.rawAddress)

public actual fun magSetFullscreenColorEffect(peffect: ConstPtr<Magcoloreffect>): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssysWindowsWin32UiMagnificationMagSetFullscreenColorEffect(peffect.rawAddress)

public actual fun magSetFullscreenTransform(maglevel: Float, xoffset: Int, yoffset: Int): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssysWindowsWin32UiMagnificationMagSetFullscreenTransform(maglevel, xoffset, yoffset)

public actual fun magSetImageScalingCallback(hwnd: Hwnd, callback: MagImageScalingCallback): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssysWindowsWin32UiMagnificationMagSetImageScalingCallback(hwnd.rawAddress, 0L)

public actual fun magSetInputTransform(fenabled: Bool, prectsource: ConstPtr<Rect>, prectdest: ConstPtr<Rect>): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssysWindowsWin32UiMagnificationMagSetInputTransform(fenabled, prectsource.rawAddress, prectdest.rawAddress)

public actual fun magSetWindowFilterList(hwnd: Hwnd, dwfiltermode: MwFiltermode, count: Int, phwnd: MutPtr<Hwnd>): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssysWindowsWin32UiMagnificationMagSetWindowFilterList(hwnd.rawAddress, dwfiltermode.toInt(), count, phwnd.rawAddress)

public actual fun magSetWindowSource(hwnd: Hwnd, rect: Rect): Bool =
    0

public actual fun magSetWindowTransform(hwnd: Hwnd, ptransform: MutPtr<Magtransform>): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssysWindowsWin32UiMagnificationMagSetWindowTransform(hwnd.rawAddress, ptransform.rawAddress)

public actual fun magShowSystemCursor(fshowcursor: Bool): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssysWindowsWin32UiMagnificationMagShowSystemCursor(fshowcursor)

public actual fun magUninitialize(): Bool =
    WindowsWin32UiMagnificationJniBridge.windowssysWindowsWin32UiMagnificationMagUninitialize()
