@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.storage.imapi

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Hresult
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpallocatebuffer
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpallocatemore
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.Lpfreebuffer
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.SPropProblemArray
import io.github.kotlinmania.windowssys.windows.win32.system.addressbook.SPropTagArray

private object WindowsWin32StorageImapiJniBridge {
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
        val stream = WindowsWin32StorageImapiJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32StorageImapiCloseIMsgSession(lpmsgsess: Long)

    @JvmStatic
    external fun windowssysWindowsWin32StorageImapiGetAttribIMsgOnIStg(lpobject: Long, lpproptagarray: Long, lpppropattrarray: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageImapiMapStorageSCode(stgscode: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageImapiOpenIMsgSession(lpmalloc: Long, ulflags: Int, lppmsgsess: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32StorageImapiSetAttribIMsgOnIStg(lpobject: Long, lpproptags: Long, lppropattrs: Long, lpppropproblems: Long): Int
}

public actual fun closeIMsgSession(lpmsgsess: Lpmsgsess) {
    WindowsWin32StorageImapiJniBridge.windowssysWindowsWin32StorageImapiCloseIMsgSession(lpmsgsess)
}

public actual fun getAttribIMsgOnIStg(lpobject: MutPtr<CVoid>, lpproptagarray: MutPtr<SPropTagArray>, lpppropattrarray: MutPtr<MutPtr<SPropAttrArray>>): Hresult =
    WindowsWin32StorageImapiJniBridge.windowssysWindowsWin32StorageImapiGetAttribIMsgOnIStg(lpobject.rawAddress, lpproptagarray.rawAddress, lpppropattrarray.rawAddress)

public actual fun mapStorageSCode(stgscode: Int): Int =
    WindowsWin32StorageImapiJniBridge.windowssysWindowsWin32StorageImapiMapStorageSCode(stgscode)

public actual fun openIMsgOnIStg(lpmsgsess: Lpmsgsess, lpallocatebuffer: Lpallocatebuffer, lpallocatemore: Lpallocatemore, lpfreebuffer: Lpfreebuffer, lpmalloc: MutPtr<CVoid>, lpmapisup: MutPtr<CVoid>, lpstg: MutPtr<CVoid>, lpfmsgcallrelease: MutPtr<Msgcallrelease>, ulcallerdata: UInt, ulflags: UInt, lppmsg: MutPtr<MutPtr<CVoid>>): Int =
    0

public actual fun openIMsgSession(lpmalloc: MutPtr<CVoid>, ulflags: UInt, lppmsgsess: MutPtr<Lpmsgsess>): Int =
    WindowsWin32StorageImapiJniBridge.windowssysWindowsWin32StorageImapiOpenIMsgSession(lpmalloc.rawAddress, ulflags.toInt(), lppmsgsess.rawAddress)

public actual fun setAttribIMsgOnIStg(lpobject: MutPtr<CVoid>, lpproptags: MutPtr<SPropTagArray>, lppropattrs: MutPtr<SPropAttrArray>, lpppropproblems: MutPtr<MutPtr<SPropProblemArray>>): Hresult =
    WindowsWin32StorageImapiJniBridge.windowssysWindowsWin32StorageImapiSetAttribIMsgOnIStg(lpobject.rawAddress, lpproptags.rawAddress, lppropattrs.rawAddress, lpppropproblems.rawAddress)
