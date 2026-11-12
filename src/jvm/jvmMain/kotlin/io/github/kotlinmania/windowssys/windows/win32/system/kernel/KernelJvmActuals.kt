@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.kernel

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object WindowsWin32SystemKernelJniBridge {
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
        val stream = WindowsWin32SystemKernelJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32SystemKernelRtlFirstEntrySList(listhead: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemKernelRtlInitializeSListHead(listhead: Long)

    @JvmStatic
    external fun windowssysWindowsWin32SystemKernelRtlInterlockedFlushSList(listhead: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemKernelRtlInterlockedPopEntrySList(listhead: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemKernelRtlInterlockedPushEntrySList(listhead: Long, listentry: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemKernelRtlInterlockedPushListSListEx(listhead: Long, list: Long, listend: Long, count: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemKernelRtlQueryDepthSList(listhead: Long): Short
}

public actual fun rtlFirstEntrySList(listhead: ConstPtr<SlistHeader>): MutPtr<SlistEntry> =
    MutPtr(WindowsWin32SystemKernelJniBridge.windowssysWindowsWin32SystemKernelRtlFirstEntrySList(listhead.rawAddress))

public actual fun rtlInitializeSListHead(listhead: MutPtr<SlistHeader>) {
    WindowsWin32SystemKernelJniBridge.windowssysWindowsWin32SystemKernelRtlInitializeSListHead(listhead.rawAddress)
}

public actual fun rtlInterlockedFlushSList(listhead: MutPtr<SlistHeader>): MutPtr<SlistEntry> =
    MutPtr(WindowsWin32SystemKernelJniBridge.windowssysWindowsWin32SystemKernelRtlInterlockedFlushSList(listhead.rawAddress))

public actual fun rtlInterlockedPopEntrySList(listhead: MutPtr<SlistHeader>): MutPtr<SlistEntry> =
    MutPtr(WindowsWin32SystemKernelJniBridge.windowssysWindowsWin32SystemKernelRtlInterlockedPopEntrySList(listhead.rawAddress))

public actual fun rtlInterlockedPushEntrySList(listhead: MutPtr<SlistHeader>, listentry: MutPtr<SlistEntry>): MutPtr<SlistEntry> =
    MutPtr(WindowsWin32SystemKernelJniBridge.windowssysWindowsWin32SystemKernelRtlInterlockedPushEntrySList(listhead.rawAddress, listentry.rawAddress))

public actual fun rtlInterlockedPushListSListEx(listhead: MutPtr<SlistHeader>, list: MutPtr<SlistEntry>, listend: MutPtr<SlistEntry>, count: UInt): MutPtr<SlistEntry> =
    MutPtr(WindowsWin32SystemKernelJniBridge.windowssysWindowsWin32SystemKernelRtlInterlockedPushListSListEx(listhead.rawAddress, list.rawAddress, listend.rawAddress, count.toInt()))

public actual fun rtlQueryDepthSList(listhead: ConstPtr<SlistHeader>): UShort =
    WindowsWin32SystemKernelJniBridge.windowssysWindowsWin32SystemKernelRtlQueryDepthSList(listhead.rawAddress).toUShort()
