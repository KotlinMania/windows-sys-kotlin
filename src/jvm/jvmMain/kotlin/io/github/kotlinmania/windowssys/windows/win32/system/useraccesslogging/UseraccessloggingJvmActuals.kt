@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.useraccesslogging

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32SystemUseraccessloggingJniBridge {
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
        val stream = WindowsWin32SystemUseraccessloggingJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32SystemUseraccessloggingUalInstrument(data: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemUseraccessloggingUalRegisterProduct(wszproductname: Long, wszrolename: Long, wszguid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemUseraccessloggingUalStart(data: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemUseraccessloggingUalStop(data: Long): Int
}

public actual fun ualInstrument(data: ConstPtr<UalDataBlob>): Hresult =
    WindowsWin32SystemUseraccessloggingJniBridge.windowssysWindowsWin32SystemUseraccessloggingUalInstrument(data.rawAddress)

public actual fun ualRegisterProduct(wszproductname: Pcwstr, wszrolename: Pcwstr, wszguid: Pcwstr): Hresult =
    WindowsWin32SystemUseraccessloggingJniBridge.windowssysWindowsWin32SystemUseraccessloggingUalRegisterProduct(wszproductname.rawAddress, wszrolename.rawAddress, wszguid.rawAddress)

public actual fun ualStart(data: ConstPtr<UalDataBlob>): Hresult =
    WindowsWin32SystemUseraccessloggingJniBridge.windowssysWindowsWin32SystemUseraccessloggingUalStart(data.rawAddress)

public actual fun ualStop(data: ConstPtr<UalDataBlob>): Hresult =
    WindowsWin32SystemUseraccessloggingJniBridge.windowssysWindowsWin32SystemUseraccessloggingUalStop(data.rawAddress)
