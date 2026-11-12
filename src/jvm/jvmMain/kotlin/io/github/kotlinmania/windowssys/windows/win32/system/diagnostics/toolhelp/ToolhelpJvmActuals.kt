@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.system.diagnostics.toolhelp

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle

private object WindowsWin32SystemDiagnosticsToolhelpJniBridge {
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
        val stream = WindowsWin32SystemDiagnosticsToolhelpJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32SystemDiagnosticsToolhelpCreateToolhelp32Snapshot(dwflags: Int, th32processid: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32First(lphe: Long, th32processid: Int, th32heapid: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32ListFirst(hsnapshot: Long, lphl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32ListNext(hsnapshot: Long, lphl: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32Next(lphe: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsToolhelpModule32First(hsnapshot: Long, lpme: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsToolhelpModule32FirstW(hsnapshot: Long, lpme: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsToolhelpModule32Next(hsnapshot: Long, lpme: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsToolhelpModule32NextW(hsnapshot: Long, lpme: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32First(hsnapshot: Long, lppe: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32FirstW(hsnapshot: Long, lppe: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32Next(hsnapshot: Long, lppe: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32NextW(hsnapshot: Long, lppe: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsToolhelpThread32First(hsnapshot: Long, lpte: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsToolhelpThread32Next(hsnapshot: Long, lpte: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SystemDiagnosticsToolhelpToolhelp32ReadProcessMemory(th32processid: Int, lpbaseaddress: Long, lpbuffer: Long, cbread: Long, lpnumberofbytesread: Long): Int
}

public actual fun createToolhelp32Snapshot(dwflags: CreateToolhelpSnapshotFlags, th32processid: UInt): Handle =
    MutPtr(WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssysWindowsWin32SystemDiagnosticsToolhelpCreateToolhelp32Snapshot(dwflags.toInt(), th32processid.toInt()))

public actual fun heap32First(lphe: MutPtr<Heapentry32>, th32processid: UInt, th32heapid: ULong): Bool =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32First(lphe.rawAddress, th32processid.toInt(), th32heapid.toLong())

public actual fun heap32ListFirst(hsnapshot: Handle, lphl: MutPtr<Heaplist32>): Bool =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32ListFirst(hsnapshot.rawAddress, lphl.rawAddress)

public actual fun heap32ListNext(hsnapshot: Handle, lphl: MutPtr<Heaplist32>): Bool =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32ListNext(hsnapshot.rawAddress, lphl.rawAddress)

public actual fun heap32Next(lphe: MutPtr<Heapentry32>): Bool =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssysWindowsWin32SystemDiagnosticsToolhelpHeap32Next(lphe.rawAddress)

public actual fun module32First(hsnapshot: Handle, lpme: MutPtr<Moduleentry32>): Bool =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssysWindowsWin32SystemDiagnosticsToolhelpModule32First(hsnapshot.rawAddress, lpme.rawAddress)

public actual fun module32FirstW(hsnapshot: Handle, lpme: MutPtr<Moduleentry32w>): Bool =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssysWindowsWin32SystemDiagnosticsToolhelpModule32FirstW(hsnapshot.rawAddress, lpme.rawAddress)

public actual fun module32Next(hsnapshot: Handle, lpme: MutPtr<Moduleentry32>): Bool =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssysWindowsWin32SystemDiagnosticsToolhelpModule32Next(hsnapshot.rawAddress, lpme.rawAddress)

public actual fun module32NextW(hsnapshot: Handle, lpme: MutPtr<Moduleentry32w>): Bool =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssysWindowsWin32SystemDiagnosticsToolhelpModule32NextW(hsnapshot.rawAddress, lpme.rawAddress)

public actual fun process32First(hsnapshot: Handle, lppe: MutPtr<Processentry32>): Bool =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32First(hsnapshot.rawAddress, lppe.rawAddress)

public actual fun process32FirstW(hsnapshot: Handle, lppe: MutPtr<Processentry32w>): Bool =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32FirstW(hsnapshot.rawAddress, lppe.rawAddress)

public actual fun process32Next(hsnapshot: Handle, lppe: MutPtr<Processentry32>): Bool =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32Next(hsnapshot.rawAddress, lppe.rawAddress)

public actual fun process32NextW(hsnapshot: Handle, lppe: MutPtr<Processentry32w>): Bool =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssysWindowsWin32SystemDiagnosticsToolhelpProcess32NextW(hsnapshot.rawAddress, lppe.rawAddress)

public actual fun thread32First(hsnapshot: Handle, lpte: MutPtr<Threadentry32>): Bool =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssysWindowsWin32SystemDiagnosticsToolhelpThread32First(hsnapshot.rawAddress, lpte.rawAddress)

public actual fun thread32Next(hsnapshot: Handle, lpte: MutPtr<Threadentry32>): Bool =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssysWindowsWin32SystemDiagnosticsToolhelpThread32Next(hsnapshot.rawAddress, lpte.rawAddress)

public actual fun toolhelp32ReadProcessMemory(th32processid: UInt, lpbaseaddress: ConstPtr<CVoid>, lpbuffer: MutPtr<CVoid>, cbread: ULong, lpnumberofbytesread: MutPtr<ULong>): Bool =
    WindowsWin32SystemDiagnosticsToolhelpJniBridge.windowssysWindowsWin32SystemDiagnosticsToolhelpToolhelp32ReadProcessMemory(th32processid.toInt(), lpbaseaddress.rawAddress, lpbuffer.rawAddress, cbread.toLong(), lpnumberofbytesread.rawAddress)
