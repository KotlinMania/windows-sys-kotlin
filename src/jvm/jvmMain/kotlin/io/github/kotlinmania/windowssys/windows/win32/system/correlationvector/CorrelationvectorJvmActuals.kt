@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.correlationvector

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Guid

private object WindowsWin32SystemCorrelationvectorJniBridge {
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
        val stream = WindowsWin32SystemCorrelationvectorJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32SystemCorrelationvectorRtlExtendCorrelationVector(correlationvector: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemCorrelationvectorRtlIncrementCorrelationVector(correlationvector: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemCorrelationvectorRtlInitializeCorrelationVector(correlationvector: Long, version: Int, guid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemCorrelationvectorRtlValidateCorrelationVector(vector: Long): Int
}

public actual fun rtlExtendCorrelationVector(correlationvector: MutPtr<CorrelationVector>): UInt =
    WindowsWin32SystemCorrelationvectorJniBridge.windowssysWindowsWin32SystemCorrelationvectorRtlExtendCorrelationVector(correlationvector.rawAddress).toUInt()

public actual fun rtlIncrementCorrelationVector(correlationvector: MutPtr<CorrelationVector>): UInt =
    WindowsWin32SystemCorrelationvectorJniBridge.windowssysWindowsWin32SystemCorrelationvectorRtlIncrementCorrelationVector(correlationvector.rawAddress).toUInt()

public actual fun rtlInitializeCorrelationVector(correlationvector: MutPtr<CorrelationVector>, version: Int, guid: ConstPtr<Guid>): UInt =
    WindowsWin32SystemCorrelationvectorJniBridge.windowssysWindowsWin32SystemCorrelationvectorRtlInitializeCorrelationVector(correlationvector.rawAddress, version, guid.rawAddress).toUInt()

public actual fun rtlValidateCorrelationVector(vector: ConstPtr<CorrelationVector>): UInt =
    WindowsWin32SystemCorrelationvectorJniBridge.windowssysWindowsWin32SystemCorrelationvectorRtlValidateCorrelationVector(vector.rawAddress).toUInt()
