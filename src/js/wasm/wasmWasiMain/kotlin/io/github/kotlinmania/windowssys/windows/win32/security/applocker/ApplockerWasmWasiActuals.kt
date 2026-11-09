@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.applocker

import io.github.kotlinmania.windowssys.core.BOOL
import io.github.kotlinmania.windowssys.core.PCWSTR
import io.github.kotlinmania.windowssys.windows.win32.foundation.HANDLE
import io.github.kotlinmania.windowssys.windows.win32.security.SAFER_LEVEL_HANDLE

public actual fun SaferCloseLevel(hlevelhandle: SAFER_LEVEL_HANDLE): BOOL =
    0

public actual fun SaferComputeTokenFromLevel(levelhandle: SAFER_LEVEL_HANDLE, inaccesstoken: HANDLE, outaccesstoken: Long, dwflags: SAFER_COMPUTE_TOKEN_FROM_LEVEL_FLAGS, lpreserved: Long): BOOL =
    0

public actual fun SaferCreateLevel(dwscopeid: UInt, dwlevelid: UInt, openflags: UInt, plevelhandle: Long, lpreserved: Long): BOOL =
    0

public actual fun SaferGetLevelInformation(levelhandle: SAFER_LEVEL_HANDLE, dwinfotype: SAFER_OBJECT_INFO_CLASS, lpquerybuffer: Long, dwinbuffersize: UInt, lpdwoutbuffersize: Long): BOOL =
    0

public actual fun SaferGetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SAFER_POLICY_INFO_CLASS, infobuffersize: UInt, infobuffer: Long, infobufferretsize: Long, lpreserved: Long): BOOL =
    0

public actual fun SaferIdentifyLevel(dwnumproperties: UInt, pcodeproperties: Long, plevelhandle: Long, lpreserved: Long): BOOL =
    0

public actual fun SaferRecordEventLogEntry(hlevel: SAFER_LEVEL_HANDLE, sztargetpath: PCWSTR, lpreserved: Long): BOOL =
    0

public actual fun SaferSetLevelInformation(levelhandle: SAFER_LEVEL_HANDLE, dwinfotype: SAFER_OBJECT_INFO_CLASS, lpquerybuffer: Long, dwinbuffersize: UInt): BOOL =
    0

public actual fun SaferSetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SAFER_POLICY_INFO_CLASS, infobuffersize: UInt, infobuffer: Long, lpreserved: Long): BOOL =
    0

public actual fun SaferiIsExecutableFileType(szfullpathname: PCWSTR, bfromshellexecute: Boolean): BOOL =
    0
