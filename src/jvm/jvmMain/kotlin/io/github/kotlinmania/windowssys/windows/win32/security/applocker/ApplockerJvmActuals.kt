@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.applocker

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SaferLevelHandle

private object WindowsWin32SecurityApplockerJniBridge {
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
        val stream = WindowsWin32SecurityApplockerJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun windowssysWindowsWin32SecurityApplockerSaferCloseLevel(hlevelhandle: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityApplockerSaferComputeTokenFromLevel(levelhandle: Long, inaccesstoken: Long, outaccesstoken: Long, dwflags: Int, lpreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityApplockerSaferCreateLevel(dwscopeid: Int, dwlevelid: Int, openflags: Int, plevelhandle: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityApplockerSaferGetLevelInformation(levelhandle: Long, dwinfotype: Int, lpquerybuffer: Long, dwinbuffersize: Int, lpdwoutbuffersize: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityApplockerSaferGetPolicyInformation(dwscopeid: Int, saferpolicyinfoclass: Int, infobuffersize: Int, infobuffer: Long, infobufferretsize: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityApplockerSaferIdentifyLevel(dwnumproperties: Int, pcodeproperties: Long, plevelhandle: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityApplockerSaferRecordEventLogEntry(hlevel: Long, sztargetpath: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityApplockerSaferSetLevelInformation(levelhandle: Long, dwinfotype: Int, lpquerybuffer: Long, dwinbuffersize: Int): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityApplockerSaferSetPolicyInformation(dwscopeid: Int, saferpolicyinfoclass: Int, infobuffersize: Int, infobuffer: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssysWindowsWin32SecurityApplockerSaferiIsExecutableFileType(szfullpathname: Long, bfromshellexecute: Boolean): Int
}

public actual fun saferCloseLevel(hlevelhandle: SaferLevelHandle): Bool =
    WindowsWin32SecurityApplockerJniBridge.windowssysWindowsWin32SecurityApplockerSaferCloseLevel(hlevelhandle.rawAddress)

public actual fun saferComputeTokenFromLevel(levelhandle: SaferLevelHandle, inaccesstoken: Handle, outaccesstoken: MutPtr, dwflags: SaferComputeTokenFromLevelFlags, lpreserved: MutPtr): Bool =
    WindowsWin32SecurityApplockerJniBridge.windowssysWindowsWin32SecurityApplockerSaferComputeTokenFromLevel(levelhandle.rawAddress, inaccesstoken.rawAddress, outaccesstoken.rawAddress, dwflags.toInt(), lpreserved.rawAddress)

public actual fun saferCreateLevel(dwscopeid: UInt, dwlevelid: UInt, openflags: UInt, plevelhandle: MutPtr, lpreserved: ConstPtr): Bool =
    WindowsWin32SecurityApplockerJniBridge.windowssysWindowsWin32SecurityApplockerSaferCreateLevel(dwscopeid.toInt(), dwlevelid.toInt(), openflags.toInt(), plevelhandle.rawAddress, lpreserved.rawAddress)

public actual fun saferGetLevelInformation(levelhandle: SaferLevelHandle, dwinfotype: SaferObjectInfoClass, lpquerybuffer: MutPtr, dwinbuffersize: UInt, lpdwoutbuffersize: MutPtr): Bool =
    WindowsWin32SecurityApplockerJniBridge.windowssysWindowsWin32SecurityApplockerSaferGetLevelInformation(levelhandle.rawAddress, dwinfotype, lpquerybuffer.rawAddress, dwinbuffersize.toInt(), lpdwoutbuffersize.rawAddress)

public actual fun saferGetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SaferPolicyInfoClass, infobuffersize: UInt, infobuffer: MutPtr, infobufferretsize: MutPtr, lpreserved: ConstPtr): Bool =
    WindowsWin32SecurityApplockerJniBridge.windowssysWindowsWin32SecurityApplockerSaferGetPolicyInformation(dwscopeid.toInt(), saferpolicyinfoclass, infobuffersize.toInt(), infobuffer.rawAddress, infobufferretsize.rawAddress, lpreserved.rawAddress)

public actual fun saferIdentifyLevel(dwnumproperties: UInt, pcodeproperties: ConstPtr, plevelhandle: MutPtr, lpreserved: ConstPtr): Bool =
    WindowsWin32SecurityApplockerJniBridge.windowssysWindowsWin32SecurityApplockerSaferIdentifyLevel(dwnumproperties.toInt(), pcodeproperties.rawAddress, plevelhandle.rawAddress, lpreserved.rawAddress)

public actual fun saferRecordEventLogEntry(hlevel: SaferLevelHandle, sztargetpath: Pcwstr, lpreserved: ConstPtr): Bool =
    WindowsWin32SecurityApplockerJniBridge.windowssysWindowsWin32SecurityApplockerSaferRecordEventLogEntry(hlevel.rawAddress, sztargetpath.rawAddress, lpreserved.rawAddress)

public actual fun saferSetLevelInformation(levelhandle: SaferLevelHandle, dwinfotype: SaferObjectInfoClass, lpquerybuffer: ConstPtr, dwinbuffersize: UInt): Bool =
    WindowsWin32SecurityApplockerJniBridge.windowssysWindowsWin32SecurityApplockerSaferSetLevelInformation(levelhandle.rawAddress, dwinfotype, lpquerybuffer.rawAddress, dwinbuffersize.toInt())

public actual fun saferSetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SaferPolicyInfoClass, infobuffersize: UInt, infobuffer: ConstPtr, lpreserved: ConstPtr): Bool =
    WindowsWin32SecurityApplockerJniBridge.windowssysWindowsWin32SecurityApplockerSaferSetPolicyInformation(dwscopeid.toInt(), saferpolicyinfoclass, infobuffersize.toInt(), infobuffer.rawAddress, lpreserved.rawAddress)

public actual fun saferiIsExecutableFileType(szfullpathname: Pcwstr, bfromshellexecute: Boolean): Bool =
    WindowsWin32SecurityApplockerJniBridge.windowssysWindowsWin32SecurityApplockerSaferiIsExecutableFileType(szfullpathname.rawAddress, bfromshellexecute)
