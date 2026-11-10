@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.applocker

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SaferLevelHandle

private object WindowsWin32SecurityApplockerJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_applocker_saferCloseLevel(hlevelhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_applocker_saferComputeTokenFromLevel(levelhandle: Long, inaccesstoken: Long, outaccesstoken: Long, dwflags: Int, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_applocker_saferCreateLevel(dwscopeid: Int, dwlevelid: Int, openflags: Int, plevelhandle: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_applocker_saferGetLevelInformation(levelhandle: Long, dwinfotype: Int, lpquerybuffer: Long, dwinbuffersize: Int, lpdwoutbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_applocker_saferGetPolicyInformation(dwscopeid: Int, saferpolicyinfoclass: Int, infobuffersize: Int, infobuffer: Long, infobufferretsize: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_applocker_saferIdentifyLevel(dwnumproperties: Int, pcodeproperties: Long, plevelhandle: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_applocker_saferRecordEventLogEntry(hlevel: Long, sztargetpath: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_applocker_saferSetLevelInformation(levelhandle: Long, dwinfotype: Int, lpquerybuffer: Long, dwinbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_applocker_saferSetPolicyInformation(dwscopeid: Int, saferpolicyinfoclass: Int, infobuffersize: Int, infobuffer: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_applocker_saferiIsExecutableFileType(szfullpathname: Long, bfromshellexecute: Boolean): Int
}

public actual fun saferCloseLevel(hlevelhandle: SaferLevelHandle): Bool =
    WindowsWin32SecurityApplockerJniBridge.windowssys_windows_win32_security_applocker_saferCloseLevel((hlevelhandle?.value ?: 0L))

public actual fun saferComputeTokenFromLevel(levelhandle: SaferLevelHandle, inaccesstoken: Handle, outaccesstoken: COpaquePointer?, dwflags: SaferComputeTokenFromLevelFlags, lpreserved: COpaquePointer?): Bool =
    WindowsWin32SecurityApplockerJniBridge.windowssys_windows_win32_security_applocker_saferComputeTokenFromLevel((levelhandle?.value ?: 0L), (inaccesstoken?.value ?: 0L), (outaccesstoken?.value ?: 0L), dwflags.toInt(), (lpreserved?.value ?: 0L))

public actual fun saferCreateLevel(dwscopeid: UInt, dwlevelid: UInt, openflags: UInt, plevelhandle: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    WindowsWin32SecurityApplockerJniBridge.windowssys_windows_win32_security_applocker_saferCreateLevel(dwscopeid.toInt(), dwlevelid.toInt(), openflags.toInt(), (plevelhandle?.value ?: 0L), (lpreserved?.value ?: 0L))

public actual fun saferGetLevelInformation(levelhandle: SaferLevelHandle, dwinfotype: SaferObjectInfoClass, lpquerybuffer: COpaquePointer?, dwinbuffersize: UInt, lpdwoutbuffersize: COpaquePointer?): Bool =
    WindowsWin32SecurityApplockerJniBridge.windowssys_windows_win32_security_applocker_saferGetLevelInformation((levelhandle?.value ?: 0L), dwinfotype, (lpquerybuffer?.value ?: 0L), dwinbuffersize.toInt(), (lpdwoutbuffersize?.value ?: 0L))

public actual fun saferGetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SaferPolicyInfoClass, infobuffersize: UInt, infobuffer: COpaquePointer?, infobufferretsize: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    WindowsWin32SecurityApplockerJniBridge.windowssys_windows_win32_security_applocker_saferGetPolicyInformation(dwscopeid.toInt(), saferpolicyinfoclass, infobuffersize.toInt(), (infobuffer?.value ?: 0L), (infobufferretsize?.value ?: 0L), (lpreserved?.value ?: 0L))

public actual fun saferIdentifyLevel(dwnumproperties: UInt, pcodeproperties: COpaquePointer?, plevelhandle: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    WindowsWin32SecurityApplockerJniBridge.windowssys_windows_win32_security_applocker_saferIdentifyLevel(dwnumproperties.toInt(), (pcodeproperties?.value ?: 0L), (plevelhandle?.value ?: 0L), (lpreserved?.value ?: 0L))

public actual fun saferRecordEventLogEntry(hlevel: SaferLevelHandle, sztargetpath: Pcwstr, lpreserved: COpaquePointer?): Bool =
    WindowsWin32SecurityApplockerJniBridge.windowssys_windows_win32_security_applocker_saferRecordEventLogEntry((hlevel?.value ?: 0L), (sztargetpath?.value ?: 0L), (lpreserved?.value ?: 0L))

public actual fun saferSetLevelInformation(levelhandle: SaferLevelHandle, dwinfotype: SaferObjectInfoClass, lpquerybuffer: COpaquePointer?, dwinbuffersize: UInt): Bool =
    WindowsWin32SecurityApplockerJniBridge.windowssys_windows_win32_security_applocker_saferSetLevelInformation((levelhandle?.value ?: 0L), dwinfotype, (lpquerybuffer?.value ?: 0L), dwinbuffersize.toInt())

public actual fun saferSetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SaferPolicyInfoClass, infobuffersize: UInt, infobuffer: COpaquePointer?, lpreserved: COpaquePointer?): Bool =
    WindowsWin32SecurityApplockerJniBridge.windowssys_windows_win32_security_applocker_saferSetPolicyInformation(dwscopeid.toInt(), saferpolicyinfoclass, infobuffersize.toInt(), (infobuffer?.value ?: 0L), (lpreserved?.value ?: 0L))

public actual fun saferiIsExecutableFileType(szfullpathname: Pcwstr, bfromshellexecute: Boolean): Bool =
    WindowsWin32SecurityApplockerJniBridge.windowssys_windows_win32_security_applocker_saferiIsExecutableFileType((szfullpathname?.value ?: 0L), bfromshellexecute)
