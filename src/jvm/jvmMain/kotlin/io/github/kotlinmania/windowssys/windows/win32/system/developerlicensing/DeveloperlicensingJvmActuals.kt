@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.developerlicensing

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.foundation.Filetime
import io.github.kotlinmania.windowssys.windows.win32.foundation.Hwnd

private object WindowsWin32SystemDeveloperlicensingJniBridge {
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
        val stream = WindowsWin32SystemDeveloperlicensingJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32SystemDeveloperlicensingAcquireDeveloperLicense(hwndparent: Long, pexpiration: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeveloperlicensingCheckDeveloperLicense(pexpiration: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDeveloperlicensingRemoveDeveloperLicense(hwndparent: Long): Int
}

public actual fun acquireDeveloperLicense(hwndparent: Hwnd, pexpiration: MutPtr<Filetime>): Hresult =
    WindowsWin32SystemDeveloperlicensingJniBridge.windowssysWindowsWin32SystemDeveloperlicensingAcquireDeveloperLicense(hwndparent.rawAddress, pexpiration.rawAddress)

public actual fun checkDeveloperLicense(pexpiration: MutPtr<Filetime>): Hresult =
    WindowsWin32SystemDeveloperlicensingJniBridge.windowssysWindowsWin32SystemDeveloperlicensingCheckDeveloperLicense(pexpiration.rawAddress)

public actual fun removeDeveloperLicense(hwndparent: Hwnd): Hresult =
    WindowsWin32SystemDeveloperlicensingJniBridge.windowssysWindowsWin32SystemDeveloperlicensingRemoveDeveloperLicense(hwndparent.rawAddress)
