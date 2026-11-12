@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.indexserver

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32StorageIndexserverJniBridge {
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
        val stream = WindowsWin32StorageIndexserverJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32StorageIndexserverBindIFilterFromStorage(pstg: Long, punkouter: Long, ppiunk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIndexserverBindIFilterFromStream(pstm: Long, punkouter: Long, ppiunk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIndexserverLoadIFilter(pwcspath: Long, punkouter: Long, ppiunk: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageIndexserverLoadIFilterEx(pwcspath: Long, dwflags: Int, riid: Long, ppiunk: Long): Int
}

public actual fun bindIFilterFromStorage(pstg: MutPtr, punkouter: MutPtr, ppiunk: MutPtr): Hresult =
    WindowsWin32StorageIndexserverJniBridge.windowssysWindowsWin32StorageIndexserverBindIFilterFromStorage(pstg.rawAddress, punkouter.rawAddress, ppiunk.rawAddress)

public actual fun bindIFilterFromStream(pstm: MutPtr, punkouter: MutPtr, ppiunk: MutPtr): Hresult =
    WindowsWin32StorageIndexserverJniBridge.windowssysWindowsWin32StorageIndexserverBindIFilterFromStream(pstm.rawAddress, punkouter.rawAddress, ppiunk.rawAddress)

public actual fun loadIFilter(pwcspath: Pcwstr, punkouter: MutPtr, ppiunk: MutPtr): Hresult =
    WindowsWin32StorageIndexserverJniBridge.windowssysWindowsWin32StorageIndexserverLoadIFilter(pwcspath.rawAddress, punkouter.rawAddress, ppiunk.rawAddress)

public actual fun loadIFilterEx(pwcspath: Pcwstr, dwflags: UInt, riid: ConstPtr, ppiunk: MutPtr): Hresult =
    WindowsWin32StorageIndexserverJniBridge.windowssysWindowsWin32StorageIndexserverLoadIFilterEx(pwcspath.rawAddress, dwflags.toInt(), riid.rawAddress, ppiunk.rawAddress)
