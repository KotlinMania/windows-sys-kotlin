package io.github.kotlinmania.windowssys.windows.win32.security.applocker

import io.github.kotlinmania.windowssys.COpaquePointer
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SaferLevelHandle

public expect fun saferCloseLevel(hlevelhandle: SaferLevelHandle): Bool

public expect fun saferComputeTokenFromLevel(levelhandle: SaferLevelHandle, inaccesstoken: Handle, outaccesstoken: COpaquePointer?, dwflags: SaferComputeTokenFromLevelFlags, lpreserved: COpaquePointer?): Bool

public expect fun saferCreateLevel(dwscopeid: UInt, dwlevelid: UInt, openflags: UInt, plevelhandle: COpaquePointer?, lpreserved: COpaquePointer?): Bool

public expect fun saferGetLevelInformation(levelhandle: SaferLevelHandle, dwinfotype: SaferObjectInfoClass, lpquerybuffer: COpaquePointer?, dwinbuffersize: UInt, lpdwoutbuffersize: COpaquePointer?): Bool

public expect fun saferGetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SaferPolicyInfoClass, infobuffersize: UInt, infobuffer: COpaquePointer?, infobufferretsize: COpaquePointer?, lpreserved: COpaquePointer?): Bool

public expect fun saferIdentifyLevel(dwnumproperties: UInt, pcodeproperties: COpaquePointer?, plevelhandle: COpaquePointer?, lpreserved: COpaquePointer?): Bool

public expect fun saferRecordEventLogEntry(hlevel: SaferLevelHandle, sztargetpath: Pcwstr, lpreserved: COpaquePointer?): Bool

public expect fun saferSetLevelInformation(levelhandle: SaferLevelHandle, dwinfotype: SaferObjectInfoClass, lpquerybuffer: COpaquePointer?, dwinbuffersize: UInt): Bool

public expect fun saferSetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SaferPolicyInfoClass, infobuffersize: UInt, infobuffer: COpaquePointer?, lpreserved: COpaquePointer?): Bool

public expect fun saferiIsExecutableFileType(szfullpathname: Pcwstr, bfromshellexecute: Boolean): Bool
