package io.github.kotlinmania.windowssys.windows.win32.security.applocker

import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SaferLevelHandle

public expect fun saferCloseLevel(hlevelhandle: SaferLevelHandle): Bool

public expect fun saferComputeTokenFromLevel(levelhandle: SaferLevelHandle, inaccesstoken: Handle, outaccesstoken: MutPtr<Handle>, dwflags: SaferComputeTokenFromLevelFlags, lpreserved: MutPtr<CVoid>): Bool

public expect fun saferCreateLevel(dwscopeid: UInt, dwlevelid: UInt, openflags: UInt, plevelhandle: MutPtr<SaferLevelHandle>, lpreserved: ConstPtr<CVoid>): Bool

public expect fun saferGetLevelInformation(levelhandle: SaferLevelHandle, dwinfotype: SaferObjectInfoClass, lpquerybuffer: MutPtr<CVoid>, dwinbuffersize: UInt, lpdwoutbuffersize: MutPtr<UInt>): Bool

public expect fun saferGetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SaferPolicyInfoClass, infobuffersize: UInt, infobuffer: MutPtr<CVoid>, infobufferretsize: MutPtr<UInt>, lpreserved: ConstPtr<CVoid>): Bool

public expect fun saferIdentifyLevel(dwnumproperties: UInt, pcodeproperties: ConstPtr<SaferCodePropertiesV2>, plevelhandle: MutPtr<SaferLevelHandle>, lpreserved: ConstPtr<CVoid>): Bool

public expect fun saferRecordEventLogEntry(hlevel: SaferLevelHandle, sztargetpath: Pcwstr, lpreserved: ConstPtr<CVoid>): Bool

public expect fun saferSetLevelInformation(levelhandle: SaferLevelHandle, dwinfotype: SaferObjectInfoClass, lpquerybuffer: ConstPtr<CVoid>, dwinbuffersize: UInt): Bool

public expect fun saferSetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SaferPolicyInfoClass, infobuffersize: UInt, infobuffer: ConstPtr<CVoid>, lpreserved: ConstPtr<CVoid>): Bool

public expect fun saferiIsExecutableFileType(szfullpathname: Pcwstr, bfromshellexecute: Boolean): Bool
