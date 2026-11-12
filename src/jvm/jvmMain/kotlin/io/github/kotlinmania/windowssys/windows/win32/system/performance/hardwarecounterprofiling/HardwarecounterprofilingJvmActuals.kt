@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.performance.hardwarecounterprofiling

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32SystemPerformanceHardwarecounterprofilingJniBridge {
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
        val stream = WindowsWin32SystemPerformanceHardwarecounterprofilingJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingDisableThreadProfiling(performancedatahandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingEnableThreadProfiling(threadhandle: Long, flags: Int, hardwarecounters: Long, performancedatahandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingQueryThreadProfiling(threadhandle: Long, enabled: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingReadThreadProfilingData(performancedatahandle: Long, flags: Int, performancedata: Long): Int
}

public actual fun disableThreadProfiling(performancedatahandle: Handle): UInt =
    WindowsWin32SystemPerformanceHardwarecounterprofilingJniBridge.windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingDisableThreadProfiling(performancedatahandle.rawAddress).toUInt()

public actual fun enableThreadProfiling(threadhandle: Handle, flags: UInt, hardwarecounters: ULong, performancedatahandle: MutPtr<Handle>): UInt =
    WindowsWin32SystemPerformanceHardwarecounterprofilingJniBridge.windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingEnableThreadProfiling(threadhandle.rawAddress, flags.toInt(), hardwarecounters.toLong(), performancedatahandle.rawAddress).toUInt()

public actual fun queryThreadProfiling(threadhandle: Handle, enabled: MutPtr<Boolean>): UInt =
    WindowsWin32SystemPerformanceHardwarecounterprofilingJniBridge.windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingQueryThreadProfiling(threadhandle.rawAddress, enabled.rawAddress).toUInt()

public actual fun readThreadProfilingData(performancedatahandle: Handle, flags: UInt, performancedata: MutPtr<PerformanceData>): UInt =
    WindowsWin32SystemPerformanceHardwarecounterprofilingJniBridge.windowssysWindowsWin32SystemPerformanceHardwarecounterprofilingReadThreadProfilingData(performancedatahandle.rawAddress, flags.toInt(), performancedata.rawAddress).toUInt()
