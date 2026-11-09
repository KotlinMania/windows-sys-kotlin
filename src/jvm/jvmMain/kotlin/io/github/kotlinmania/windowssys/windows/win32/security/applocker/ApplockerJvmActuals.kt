@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.applocker

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.SAFER_LEVEL_HANDLE

private object WindowsWin32SecurityApplockerJniBridge {
    init {
        System.loadLibrary("windowssys_jni")
    }

    @JvmStatic
    external fun windowssys_windows_win32_security_applocker_SaferCloseLevel(hlevelhandle: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_applocker_SaferComputeTokenFromLevel(levelhandle: Long, inaccesstoken: Long, outaccesstoken: Long, dwflags: Int, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_applocker_SaferCreateLevel(dwscopeid: Int, dwlevelid: Int, openflags: Int, plevelhandle: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_applocker_SaferGetLevelInformation(levelhandle: Long, dwinfotype: Int, lpquerybuffer: Long, dwinbuffersize: Int, lpdwoutbuffersize: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_applocker_SaferGetPolicyInformation(dwscopeid: Int, saferpolicyinfoclass: Int, infobuffersize: Int, infobuffer: Long, infobufferretsize: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_applocker_SaferIdentifyLevel(dwnumproperties: Int, pcodeproperties: Long, plevelhandle: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_applocker_SaferRecordEventLogEntry(hlevel: Long, sztargetpath: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_applocker_SaferSetLevelInformation(levelhandle: Long, dwinfotype: Int, lpquerybuffer: Long, dwinbuffersize: Int): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_applocker_SaferSetPolicyInformation(dwscopeid: Int, saferpolicyinfoclass: Int, infobuffersize: Int, infobuffer: Long, lpreserved: Long): Int

    @JvmStatic
    external fun windowssys_windows_win32_security_applocker_SaferiIsExecutableFileType(szfullpathname: Long, bfromshellexecute: Boolean): Int
}

public actual fun SaferCloseLevel(hlevelhandle: SAFER_LEVEL_HANDLE): BOOL =
    WindowsWin32SecurityApplockerJniBridge.windowssys_windows_win32_security_applocker_SaferCloseLevel(hlevelhandle)

public actual fun SaferComputeTokenFromLevel(levelhandle: SAFER_LEVEL_HANDLE, inaccesstoken: HANDLE, outaccesstoken: Long, dwflags: SAFER_COMPUTE_TOKEN_FROM_LEVEL_FLAGS, lpreserved: Long): BOOL =
    WindowsWin32SecurityApplockerJniBridge.windowssys_windows_win32_security_applocker_SaferComputeTokenFromLevel(levelhandle, inaccesstoken, outaccesstoken, dwflags.toInt(), lpreserved)

public actual fun SaferCreateLevel(dwscopeid: UInt, dwlevelid: UInt, openflags: UInt, plevelhandle: Long, lpreserved: Long): BOOL =
    WindowsWin32SecurityApplockerJniBridge.windowssys_windows_win32_security_applocker_SaferCreateLevel(dwscopeid.toInt(), dwlevelid.toInt(), openflags.toInt(), plevelhandle, lpreserved)

public actual fun SaferGetLevelInformation(levelhandle: SAFER_LEVEL_HANDLE, dwinfotype: SAFER_OBJECT_INFO_CLASS, lpquerybuffer: Long, dwinbuffersize: UInt, lpdwoutbuffersize: Long): BOOL =
    WindowsWin32SecurityApplockerJniBridge.windowssys_windows_win32_security_applocker_SaferGetLevelInformation(levelhandle, dwinfotype, lpquerybuffer, dwinbuffersize.toInt(), lpdwoutbuffersize)

public actual fun SaferGetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SAFER_POLICY_INFO_CLASS, infobuffersize: UInt, infobuffer: Long, infobufferretsize: Long, lpreserved: Long): BOOL =
    WindowsWin32SecurityApplockerJniBridge.windowssys_windows_win32_security_applocker_SaferGetPolicyInformation(dwscopeid.toInt(), saferpolicyinfoclass, infobuffersize.toInt(), infobuffer, infobufferretsize, lpreserved)

public actual fun SaferIdentifyLevel(dwnumproperties: UInt, pcodeproperties: Long, plevelhandle: Long, lpreserved: Long): BOOL =
    WindowsWin32SecurityApplockerJniBridge.windowssys_windows_win32_security_applocker_SaferIdentifyLevel(dwnumproperties.toInt(), pcodeproperties, plevelhandle, lpreserved)

public actual fun SaferRecordEventLogEntry(hlevel: SAFER_LEVEL_HANDLE, sztargetpath: PCWSTR, lpreserved: Long): BOOL =
    WindowsWin32SecurityApplockerJniBridge.windowssys_windows_win32_security_applocker_SaferRecordEventLogEntry(hlevel, sztargetpath, lpreserved)

public actual fun SaferSetLevelInformation(levelhandle: SAFER_LEVEL_HANDLE, dwinfotype: SAFER_OBJECT_INFO_CLASS, lpquerybuffer: Long, dwinbuffersize: UInt): BOOL =
    WindowsWin32SecurityApplockerJniBridge.windowssys_windows_win32_security_applocker_SaferSetLevelInformation(levelhandle, dwinfotype, lpquerybuffer, dwinbuffersize.toInt())

public actual fun SaferSetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SAFER_POLICY_INFO_CLASS, infobuffersize: UInt, infobuffer: Long, lpreserved: Long): BOOL =
    WindowsWin32SecurityApplockerJniBridge.windowssys_windows_win32_security_applocker_SaferSetPolicyInformation(dwscopeid.toInt(), saferpolicyinfoclass, infobuffersize.toInt(), infobuffer, lpreserved)

public actual fun SaferiIsExecutableFileType(szfullpathname: PCWSTR, bfromshellexecute: Boolean): BOOL =
    WindowsWin32SecurityApplockerJniBridge.windowssys_windows_win32_security_applocker_SaferiIsExecutableFileType(szfullpathname, bfromshellexecute)
