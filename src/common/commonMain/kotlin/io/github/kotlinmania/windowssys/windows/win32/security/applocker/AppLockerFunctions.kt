package io.github.kotlinmania.windowssys.windows.win32.security.applocker

import io.github.kotlinmania.windowssys.Win32DynamicFfi
import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.SAFER_LEVEL_HANDLE

public fun SaferCloseLevel(hlevelhandle: SAFER_LEVEL_HANDLE): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "SaferCloseLevel", longArrayOf(hlevelhandle)).toInt()
}

public fun SaferComputeTokenFromLevel(levelhandle: SAFER_LEVEL_HANDLE, inaccesstoken: HANDLE, outaccesstoken: Long, dwflags: SAFER_COMPUTE_TOKEN_FROM_LEVEL_FLAGS, lpreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "SaferComputeTokenFromLevel", longArrayOf(levelhandle, inaccesstoken, outaccesstoken, dwflags.toLong(), lpreserved)).toInt()
}

public fun SaferCreateLevel(dwscopeid: UInt, dwlevelid: UInt, openflags: UInt, plevelhandle: Long, lpreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "SaferCreateLevel", longArrayOf(dwscopeid.toLong(), dwlevelid.toLong(), openflags.toLong(), plevelhandle, lpreserved)).toInt()
}

public fun SaferGetLevelInformation(levelhandle: SAFER_LEVEL_HANDLE, dwinfotype: SAFER_OBJECT_INFO_CLASS, lpquerybuffer: Long, dwinbuffersize: UInt, lpdwoutbuffersize: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "SaferGetLevelInformation", longArrayOf(levelhandle, dwinfotype.toLong(), lpquerybuffer, dwinbuffersize.toLong(), lpdwoutbuffersize)).toInt()
}

public fun SaferGetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SAFER_POLICY_INFO_CLASS, infobuffersize: UInt, infobuffer: Long, infobufferretsize: Long, lpreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "SaferGetPolicyInformation", longArrayOf(dwscopeid.toLong(), saferpolicyinfoclass.toLong(), infobuffersize.toLong(), infobuffer, infobufferretsize, lpreserved)).toInt()
}

public fun SaferIdentifyLevel(dwnumproperties: UInt, pcodeproperties: Long, plevelhandle: Long, lpreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "SaferIdentifyLevel", longArrayOf(dwnumproperties.toLong(), pcodeproperties, plevelhandle, lpreserved)).toInt()
}

public fun SaferRecordEventLogEntry(hlevel: SAFER_LEVEL_HANDLE, sztargetpath: PCWSTR, lpreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "SaferRecordEventLogEntry", longArrayOf(hlevel, sztargetpath, lpreserved)).toInt()
}

public fun SaferSetLevelInformation(levelhandle: SAFER_LEVEL_HANDLE, dwinfotype: SAFER_OBJECT_INFO_CLASS, lpquerybuffer: Long, dwinbuffersize: UInt): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "SaferSetLevelInformation", longArrayOf(levelhandle, dwinfotype.toLong(), lpquerybuffer, dwinbuffersize.toLong())).toInt()
}

public fun SaferSetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SAFER_POLICY_INFO_CLASS, infobuffersize: UInt, infobuffer: Long, lpreserved: Long): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "SaferSetPolicyInformation", longArrayOf(dwscopeid.toLong(), saferpolicyinfoclass.toLong(), infobuffersize.toLong(), infobuffer, lpreserved)).toInt()
}

public fun SaferiIsExecutableFileType(szfullpathname: PCWSTR, bfromshellexecute: Boolean): BOOL {
    return Win32DynamicFfi.invoke("advapi32.dll", "SaferiIsExecutableFileType", longArrayOf(szfullpathname, if (bfromshellexecute) 1L else 0L)).toInt()
}
