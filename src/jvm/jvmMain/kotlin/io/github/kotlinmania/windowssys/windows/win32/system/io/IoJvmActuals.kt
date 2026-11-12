@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.io

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32SystemIoJniBridge {
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
        val stream = WindowsWin32SystemIoJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32SystemIoBindIoCompletionCallback(filehandle: Long, function: Long, flags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemIoCancelIo(hfile: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemIoCancelIoEx(hfile: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemIoCancelSynchronousIo(hthread: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemIoCreateIoCompletionPort(filehandle: Long, existingcompletionport: Long, completionkey: Long, numberofconcurrentthreads: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemIoDeviceIoControl(hdevice: Long, dwiocontrolcode: Int, lpinbuffer: Long, ninbuffersize: Int, lpoutbuffer: Long, noutbuffersize: Int, lpbytesreturned: Long, lpoverlapped: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemIoGetOverlappedResult(hfile: Long, lpoverlapped: Long, lpnumberofbytestransferred: Long, bwait: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemIoGetOverlappedResultEx(hfile: Long, lpoverlapped: Long, lpnumberofbytestransferred: Long, dwmilliseconds: Int, balertable: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemIoGetQueuedCompletionStatus(completionport: Long, lpnumberofbytestransferred: Long, lpcompletionkey: Long, lpoverlapped: Long, dwmilliseconds: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemIoGetQueuedCompletionStatusEx(completionport: Long, lpcompletionportentries: Long, ulcount: Int, ulnumentriesremoved: Long, dwmilliseconds: Int, falertable: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemIoPostQueuedCompletionStatus(completionport: Long, dwnumberofbytestransferred: Int, dwcompletionkey: Long, lpoverlapped: Long): Int
}

public actual fun bindIoCompletionCallback(filehandle: Handle, function: LpoverlappedCompletionRoutine, flags: UInt): Bool =
    WindowsWin32SystemIoJniBridge.windowssysWindowsWin32SystemIoBindIoCompletionCallback(filehandle.rawAddress, 0L, flags.toInt())

public actual fun cancelIo(hfile: Handle): Bool =
    WindowsWin32SystemIoJniBridge.windowssysWindowsWin32SystemIoCancelIo(hfile.rawAddress)

public actual fun cancelIoEx(hfile: Handle, lpoverlapped: ConstPtr): Bool =
    WindowsWin32SystemIoJniBridge.windowssysWindowsWin32SystemIoCancelIoEx(hfile.rawAddress, lpoverlapped.rawAddress)

public actual fun cancelSynchronousIo(hthread: Handle): Bool =
    WindowsWin32SystemIoJniBridge.windowssysWindowsWin32SystemIoCancelSynchronousIo(hthread.rawAddress)

public actual fun createIoCompletionPort(filehandle: Handle, existingcompletionport: Handle, completionkey: ULong, numberofconcurrentthreads: UInt): Handle =
    MutPtr(WindowsWin32SystemIoJniBridge.windowssysWindowsWin32SystemIoCreateIoCompletionPort(filehandle.rawAddress, existingcompletionport.rawAddress, completionkey.toLong(), numberofconcurrentthreads.toInt()))

public actual fun deviceIoControl(hdevice: Handle, dwiocontrolcode: UInt, lpinbuffer: ConstPtr, ninbuffersize: UInt, lpoutbuffer: MutPtr, noutbuffersize: UInt, lpbytesreturned: MutPtr, lpoverlapped: MutPtr): Bool =
    WindowsWin32SystemIoJniBridge.windowssysWindowsWin32SystemIoDeviceIoControl(hdevice.rawAddress, dwiocontrolcode.toInt(), lpinbuffer.rawAddress, ninbuffersize.toInt(), lpoutbuffer.rawAddress, noutbuffersize.toInt(), lpbytesreturned.rawAddress, lpoverlapped.rawAddress)

public actual fun getOverlappedResult(hfile: Handle, lpoverlapped: ConstPtr, lpnumberofbytestransferred: MutPtr, bwait: Bool): Bool =
    WindowsWin32SystemIoJniBridge.windowssysWindowsWin32SystemIoGetOverlappedResult(hfile.rawAddress, lpoverlapped.rawAddress, lpnumberofbytestransferred.rawAddress, bwait)

public actual fun getOverlappedResultEx(hfile: Handle, lpoverlapped: ConstPtr, lpnumberofbytestransferred: MutPtr, dwmilliseconds: UInt, balertable: Bool): Bool =
    WindowsWin32SystemIoJniBridge.windowssysWindowsWin32SystemIoGetOverlappedResultEx(hfile.rawAddress, lpoverlapped.rawAddress, lpnumberofbytestransferred.rawAddress, dwmilliseconds.toInt(), balertable)

public actual fun getQueuedCompletionStatus(completionport: Handle, lpnumberofbytestransferred: MutPtr, lpcompletionkey: MutPtr, lpoverlapped: MutPtr, dwmilliseconds: UInt): Bool =
    WindowsWin32SystemIoJniBridge.windowssysWindowsWin32SystemIoGetQueuedCompletionStatus(completionport.rawAddress, lpnumberofbytestransferred.rawAddress, lpcompletionkey.rawAddress, lpoverlapped.rawAddress, dwmilliseconds.toInt())

public actual fun getQueuedCompletionStatusEx(completionport: Handle, lpcompletionportentries: MutPtr, ulcount: UInt, ulnumentriesremoved: MutPtr, dwmilliseconds: UInt, falertable: Bool): Bool =
    WindowsWin32SystemIoJniBridge.windowssysWindowsWin32SystemIoGetQueuedCompletionStatusEx(completionport.rawAddress, lpcompletionportentries.rawAddress, ulcount.toInt(), ulnumentriesremoved.rawAddress, dwmilliseconds.toInt(), falertable)

public actual fun postQueuedCompletionStatus(completionport: Handle, dwnumberofbytestransferred: UInt, dwcompletionkey: ULong, lpoverlapped: ConstPtr): Bool =
    WindowsWin32SystemIoJniBridge.windowssysWindowsWin32SystemIoPostQueuedCompletionStatus(completionport.rawAddress, dwnumberofbytestransferred.toInt(), dwcompletionkey.toLong(), lpoverlapped.rawAddress)
