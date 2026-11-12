package io.github.kotlinmania.windowssys.windows.win32.security.applocker

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SaferLevelHandle

public expect fun saferCloseLevel(hlevelhandle: SaferLevelHandle): Bool

public expect fun saferComputeTokenFromLevel(levelhandle: SaferLevelHandle, inaccesstoken: Handle, outaccesstoken: MutPtr, dwflags: SaferComputeTokenFromLevelFlags, lpreserved: MutPtr): Bool

public expect fun saferCreateLevel(dwscopeid: UInt, dwlevelid: UInt, openflags: UInt, plevelhandle: MutPtr, lpreserved: ConstPtr): Bool

public expect fun saferGetLevelInformation(levelhandle: SaferLevelHandle, dwinfotype: SaferObjectInfoClass, lpquerybuffer: MutPtr, dwinbuffersize: UInt, lpdwoutbuffersize: MutPtr): Bool

public expect fun saferGetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SaferPolicyInfoClass, infobuffersize: UInt, infobuffer: MutPtr, infobufferretsize: MutPtr, lpreserved: ConstPtr): Bool

public expect fun saferIdentifyLevel(dwnumproperties: UInt, pcodeproperties: ConstPtr, plevelhandle: MutPtr, lpreserved: ConstPtr): Bool

public expect fun saferRecordEventLogEntry(hlevel: SaferLevelHandle, sztargetpath: Pcwstr, lpreserved: ConstPtr): Bool

public expect fun saferSetLevelInformation(levelhandle: SaferLevelHandle, dwinfotype: SaferObjectInfoClass, lpquerybuffer: ConstPtr, dwinbuffersize: UInt): Bool

public expect fun saferSetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SaferPolicyInfoClass, infobuffersize: UInt, infobuffer: ConstPtr, lpreserved: ConstPtr): Bool

public expect fun saferiIsExecutableFileType(szfullpathname: Pcwstr, bfromshellexecute: Boolean): Bool
