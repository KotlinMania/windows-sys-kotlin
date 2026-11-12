@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.foundation

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Bstr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.core.Pcstr
import io.github.kotlinmania.windowssys.core.Pcwstr

private object WindowsWin32FoundationJniBridge {
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
        val stream = WindowsWin32FoundationJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32FoundationCloseHandle(hobject: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32FoundationCompareObjectHandles(hfirstobjecthandle: Long, hsecondobjecthandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32FoundationDuplicateHandle(hsourceprocesshandle: Long, hsourcehandle: Long, htargetprocesshandle: Long, lptargethandle: Long, dwdesiredaccess: Int, binherithandle: Int, dwoptions: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32FoundationFreeLibrary(hlibmodule: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32FoundationGetHandleInformation(hobject: Long, lpdwflags: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32FoundationGetLastError(): Int

    @JvmStatic
    external fun windowssysWindowsWin32FoundationGlobalFree(hmem: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32FoundationLocalFree(hmem: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32FoundationRtlNtStatusToDosError(status: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32FoundationSetHandleInformation(hobject: Long, dwmask: Int, dwflags: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32FoundationSetLastError(dwerrcode: Int)

    @JvmStatic
    external fun windowssysWindowsWin32FoundationSetLastErrorEx(dwerrcode: Int, dwtype: Int)

    @JvmStatic
    external fun windowssysWindowsWin32FoundationSysAddRefString(bstrstring: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32FoundationSysAllocString(psz: Long): Long

    @JvmStatic
    external fun windowssysWindowsWin32FoundationSysAllocStringByteLen(psz: Long, len: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32FoundationSysAllocStringLen(strin: Long, ui: Int): Long

    @JvmStatic
    external fun windowssysWindowsWin32FoundationSysFreeString(bstrstring: Long)

    @JvmStatic
    external fun windowssysWindowsWin32FoundationSysReAllocString(pbstr: Long, psz: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32FoundationSysReAllocStringLen(pbstr: Long, psz: Long, len: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32FoundationSysReleaseString(bstrstring: Long)

    @JvmStatic
    external fun windowssysWindowsWin32FoundationSysStringByteLen(bstr: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32FoundationSysStringLen(pbstr: Long): Int
}

public actual fun closeHandle(hobject: Handle): Bool =
    WindowsWin32FoundationJniBridge.windowssysWindowsWin32FoundationCloseHandle(hobject.rawAddress)

public actual fun compareObjectHandles(hfirstobjecthandle: Handle, hsecondobjecthandle: Handle): Bool =
    WindowsWin32FoundationJniBridge.windowssysWindowsWin32FoundationCompareObjectHandles(hfirstobjecthandle.rawAddress, hsecondobjecthandle.rawAddress)

public actual fun duplicateHandle(hsourceprocesshandle: Handle, hsourcehandle: Handle, htargetprocesshandle: Handle, lptargethandle: MutPtr, dwdesiredaccess: UInt, binherithandle: Bool, dwoptions: DuplicateHandleOptions): Bool =
    WindowsWin32FoundationJniBridge.windowssysWindowsWin32FoundationDuplicateHandle(hsourceprocesshandle.rawAddress, hsourcehandle.rawAddress, htargetprocesshandle.rawAddress, lptargethandle.rawAddress, dwdesiredaccess.toInt(), binherithandle, dwoptions.toInt())

public actual fun freeLibrary(hlibmodule: Hmodule): Bool =
    WindowsWin32FoundationJniBridge.windowssysWindowsWin32FoundationFreeLibrary(hlibmodule.rawAddress)

public actual fun getHandleInformation(hobject: Handle, lpdwflags: MutPtr): Bool =
    WindowsWin32FoundationJniBridge.windowssysWindowsWin32FoundationGetHandleInformation(hobject.rawAddress, lpdwflags.rawAddress)

public actual fun getLastError(): Win32Error =
    WindowsWin32FoundationJniBridge.windowssysWindowsWin32FoundationGetLastError().toUInt()

public actual fun globalFree(hmem: Hglobal): Hglobal =
    MutPtr(WindowsWin32FoundationJniBridge.windowssysWindowsWin32FoundationGlobalFree(hmem.rawAddress))

public actual fun localFree(hmem: Hlocal): Hlocal =
    MutPtr(WindowsWin32FoundationJniBridge.windowssysWindowsWin32FoundationLocalFree(hmem.rawAddress))

public actual fun rtlNtStatusToDosError(status: Ntstatus): UInt =
    WindowsWin32FoundationJniBridge.windowssysWindowsWin32FoundationRtlNtStatusToDosError(status).toUInt()

public actual fun setHandleInformation(hobject: Handle, dwmask: UInt, dwflags: HandleFlags): Bool =
    WindowsWin32FoundationJniBridge.windowssysWindowsWin32FoundationSetHandleInformation(hobject.rawAddress, dwmask.toInt(), dwflags.toInt())

public actual fun setLastError(dwerrcode: Win32Error) {
    WindowsWin32FoundationJniBridge.windowssysWindowsWin32FoundationSetLastError(dwerrcode.toInt())
}

public actual fun setLastErrorEx(dwerrcode: Win32Error, dwtype: UInt) {
    WindowsWin32FoundationJniBridge.windowssysWindowsWin32FoundationSetLastErrorEx(dwerrcode.toInt(), dwtype.toInt())
}

public actual fun sysAddRefString(bstrstring: Bstr): Hresult =
    WindowsWin32FoundationJniBridge.windowssysWindowsWin32FoundationSysAddRefString(bstrstring.rawAddress)

public actual fun sysAllocString(psz: Pcwstr): Bstr =
    ConstPtr(WindowsWin32FoundationJniBridge.windowssysWindowsWin32FoundationSysAllocString(psz.rawAddress))

public actual fun sysAllocStringByteLen(psz: Pcstr, len: UInt): Bstr =
    ConstPtr(WindowsWin32FoundationJniBridge.windowssysWindowsWin32FoundationSysAllocStringByteLen(psz.rawAddress, len.toInt()))

public actual fun sysAllocStringLen(strin: Pcwstr, ui: UInt): Bstr =
    ConstPtr(WindowsWin32FoundationJniBridge.windowssysWindowsWin32FoundationSysAllocStringLen(strin.rawAddress, ui.toInt()))

public actual fun sysFreeString(bstrstring: Bstr) {
    WindowsWin32FoundationJniBridge.windowssysWindowsWin32FoundationSysFreeString(bstrstring.rawAddress)
}

public actual fun sysReAllocString(pbstr: MutPtr, psz: Pcwstr): Int =
    WindowsWin32FoundationJniBridge.windowssysWindowsWin32FoundationSysReAllocString(pbstr.rawAddress, psz.rawAddress)

public actual fun sysReAllocStringLen(pbstr: MutPtr, psz: Pcwstr, len: UInt): Int =
    WindowsWin32FoundationJniBridge.windowssysWindowsWin32FoundationSysReAllocStringLen(pbstr.rawAddress, psz.rawAddress, len.toInt())

public actual fun sysReleaseString(bstrstring: Bstr) {
    WindowsWin32FoundationJniBridge.windowssysWindowsWin32FoundationSysReleaseString(bstrstring.rawAddress)
}

public actual fun sysStringByteLen(bstr: Bstr): UInt =
    WindowsWin32FoundationJniBridge.windowssysWindowsWin32FoundationSysStringByteLen(bstr.rawAddress).toUInt()

public actual fun sysStringLen(pbstr: Bstr): UInt =
    WindowsWin32FoundationJniBridge.windowssysWindowsWin32FoundationSysStringLen(pbstr.rawAddress).toUInt()
