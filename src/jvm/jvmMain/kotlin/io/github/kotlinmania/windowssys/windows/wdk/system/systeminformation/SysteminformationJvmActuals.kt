@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.wdk.system.systeminformation

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Ntstatus

private object WindowsWdkSystemSysteminformationJniBridge {
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
        val stream = WindowsWdkSystemSysteminformationJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWdkSystemSysteminformationNtQuerySystemInformation(systeminformationclass: Int, systeminformation: Long, systeminformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSysteminformationNtQuerySystemTime(systemtime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSysteminformationNtQueryTimerResolution(maximumtime: Long, minimumtime: Long, currenttime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSysteminformationZwQuerySystemInformation(systeminformationclass: Int, systeminformation: Long, systeminformationlength: Int, returnlength: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSysteminformationZwQuerySystemTime(systemtime: Long): Int

    @JvmStatic
    external fun windowssysWindowsWdkSystemSysteminformationZwQueryTimerResolution(maximumtime: Long, minimumtime: Long, currenttime: Long): Int
}

public actual fun ntQuerySystemInformation(systeminformationclass: SystemInformationClass, systeminformation: MutPtr, systeminformationlength: UInt, returnlength: MutPtr): Ntstatus =
    WindowsWdkSystemSysteminformationJniBridge.windowssysWindowsWdkSystemSysteminformationNtQuerySystemInformation(systeminformationclass, systeminformation.rawAddress, systeminformationlength.toInt(), returnlength.rawAddress)

public actual fun ntQuerySystemTime(systemtime: MutPtr): Ntstatus =
    WindowsWdkSystemSysteminformationJniBridge.windowssysWindowsWdkSystemSysteminformationNtQuerySystemTime(systemtime.rawAddress)

public actual fun ntQueryTimerResolution(maximumtime: MutPtr, minimumtime: MutPtr, currenttime: MutPtr): Ntstatus =
    WindowsWdkSystemSysteminformationJniBridge.windowssysWindowsWdkSystemSysteminformationNtQueryTimerResolution(maximumtime.rawAddress, minimumtime.rawAddress, currenttime.rawAddress)

public actual fun zwQuerySystemInformation(systeminformationclass: SystemInformationClass, systeminformation: MutPtr, systeminformationlength: UInt, returnlength: MutPtr): Ntstatus =
    WindowsWdkSystemSysteminformationJniBridge.windowssysWindowsWdkSystemSysteminformationZwQuerySystemInformation(systeminformationclass, systeminformation.rawAddress, systeminformationlength.toInt(), returnlength.rawAddress)

public actual fun zwQuerySystemTime(systemtime: MutPtr): Ntstatus =
    WindowsWdkSystemSysteminformationJniBridge.windowssysWindowsWdkSystemSysteminformationZwQuerySystemTime(systemtime.rawAddress)

public actual fun zwQueryTimerResolution(maximumtime: MutPtr, minimumtime: MutPtr, currenttime: MutPtr): Ntstatus =
    WindowsWdkSystemSysteminformationJniBridge.windowssysWindowsWdkSystemSysteminformationZwQueryTimerResolution(maximumtime.rawAddress, minimumtime.rawAddress, currenttime.rawAddress)
