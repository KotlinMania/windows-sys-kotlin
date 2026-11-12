@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.filehistory

import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Hresult

private object WindowsWin32StorageFilehistoryJniBridge {
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
        val stream = WindowsWin32StorageFilehistoryJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32StorageFilehistoryFhServiceBlockBackup(pipe: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilehistoryFhServiceClosePipe(pipe: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilehistoryFhServiceOpenPipe(startserviceifstopped: Int, pipe: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilehistoryFhServiceReloadConfiguration(pipe: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilehistoryFhServiceStartBackup(pipe: Long, lowpriorityio: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilehistoryFhServiceStopBackup(pipe: Long, stoptracking: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageFilehistoryFhServiceUnblockBackup(pipe: Long): Int
}

public actual fun fhServiceBlockBackup(pipe: FhServicePipeHandle): Hresult =
    WindowsWin32StorageFilehistoryJniBridge.windowssysWindowsWin32StorageFilehistoryFhServiceBlockBackup(pipe.rawAddress)

public actual fun fhServiceClosePipe(pipe: FhServicePipeHandle): Hresult =
    WindowsWin32StorageFilehistoryJniBridge.windowssysWindowsWin32StorageFilehistoryFhServiceClosePipe(pipe.rawAddress)

public actual fun fhServiceOpenPipe(startserviceifstopped: Bool, pipe: MutPtr): Hresult =
    WindowsWin32StorageFilehistoryJniBridge.windowssysWindowsWin32StorageFilehistoryFhServiceOpenPipe(startserviceifstopped, pipe.rawAddress)

public actual fun fhServiceReloadConfiguration(pipe: FhServicePipeHandle): Hresult =
    WindowsWin32StorageFilehistoryJniBridge.windowssysWindowsWin32StorageFilehistoryFhServiceReloadConfiguration(pipe.rawAddress)

public actual fun fhServiceStartBackup(pipe: FhServicePipeHandle, lowpriorityio: Bool): Hresult =
    WindowsWin32StorageFilehistoryJniBridge.windowssysWindowsWin32StorageFilehistoryFhServiceStartBackup(pipe.rawAddress, lowpriorityio)

public actual fun fhServiceStopBackup(pipe: FhServicePipeHandle, stoptracking: Bool): Hresult =
    WindowsWin32StorageFilehistoryJniBridge.windowssysWindowsWin32StorageFilehistoryFhServiceStopBackup(pipe.rawAddress, stoptracking)

public actual fun fhServiceUnblockBackup(pipe: FhServicePipeHandle): Hresult =
    WindowsWin32StorageFilehistoryJniBridge.windowssysWindowsWin32StorageFilehistoryFhServiceUnblockBackup(pipe.rawAddress)
