@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.iis

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool

private object WindowsWin32SystemIisJniBridge {
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
        val stream = WindowsWin32SystemIisJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32SystemIisGetExtensionVersion(pver: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemIisGetFilterVersion(pver: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemIisHttpExtensionProc(pecb: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemIisHttpFilterProc(pfc: Long, notificationtype: Int, pvnotification: Long): Int
}

public actual fun getExtensionVersion(pver: MutPtr<HseVersionInfo>): Bool =
    WindowsWin32SystemIisJniBridge.windowssysWindowsWin32SystemIisGetExtensionVersion(pver.rawAddress)

public actual fun getFilterVersion(pver: MutPtr<HttpFilterVersion>): Bool =
    WindowsWin32SystemIisJniBridge.windowssysWindowsWin32SystemIisGetFilterVersion(pver.rawAddress)

public actual fun httpExtensionProc(pecb: ConstPtr<ExtensionControlBlock>): UInt =
    WindowsWin32SystemIisJniBridge.windowssysWindowsWin32SystemIisHttpExtensionProc(pecb.rawAddress).toUInt()

public actual fun httpFilterProc(pfc: MutPtr<HttpFilterContext>, notificationtype: UInt, pvnotification: MutPtr<CVoid>): UInt =
    WindowsWin32SystemIisJniBridge.windowssysWindowsWin32SystemIisHttpFilterProc(pfc.rawAddress, notificationtype.toInt(), pvnotification.rawAddress).toUInt()
