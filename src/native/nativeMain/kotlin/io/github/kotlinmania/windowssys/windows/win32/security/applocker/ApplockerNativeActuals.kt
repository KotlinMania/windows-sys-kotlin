@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.windowssys.windows.win32.security.applocker

import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr
import io.github.kotlinmania.windowssys.core.Bool
import io.github.kotlinmania.windowssys.core.Pcwstr
import io.github.kotlinmania.windowssys.windows.win32.foundation.Handle
import io.github.kotlinmania.windowssys.windows.win32.security.SaferLevelHandle
import io.github.kotlinmania.windowssys.windows.win32.security.applocker.cinterop.windowssysWindowsWin32SecurityApplockerSaferCloseLevel
import io.github.kotlinmania.windowssys.windows.win32.security.applocker.cinterop.windowssysWindowsWin32SecurityApplockerSaferComputeTokenFromLevel
import io.github.kotlinmania.windowssys.windows.win32.security.applocker.cinterop.windowssysWindowsWin32SecurityApplockerSaferCreateLevel
import io.github.kotlinmania.windowssys.windows.win32.security.applocker.cinterop.windowssysWindowsWin32SecurityApplockerSaferGetLevelInformation
import io.github.kotlinmania.windowssys.windows.win32.security.applocker.cinterop.windowssysWindowsWin32SecurityApplockerSaferGetPolicyInformation
import io.github.kotlinmania.windowssys.windows.win32.security.applocker.cinterop.windowssysWindowsWin32SecurityApplockerSaferIdentifyLevel
import io.github.kotlinmania.windowssys.windows.win32.security.applocker.cinterop.windowssysWindowsWin32SecurityApplockerSaferRecordEventLogEntry
import io.github.kotlinmania.windowssys.windows.win32.security.applocker.cinterop.windowssysWindowsWin32SecurityApplockerSaferSetLevelInformation
import io.github.kotlinmania.windowssys.windows.win32.security.applocker.cinterop.windowssysWindowsWin32SecurityApplockerSaferSetPolicyInformation
import io.github.kotlinmania.windowssys.windows.win32.security.applocker.cinterop.windowssysWindowsWin32SecurityApplockerSaferiIsExecutableFileType
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun saferCloseLevel(hlevelhandle: SaferLevelHandle): Bool =
    windowssysWindowsWin32SecurityApplockerSaferCloseLevel(hlevelhandle.rawAddress.toCPointer<ByteVar>())

public actual fun saferComputeTokenFromLevel(levelhandle: SaferLevelHandle, inaccesstoken: Handle, outaccesstoken: MutPtr, dwflags: SaferComputeTokenFromLevelFlags, lpreserved: MutPtr): Bool =
    windowssysWindowsWin32SecurityApplockerSaferComputeTokenFromLevel(levelhandle.rawAddress.toCPointer<ByteVar>(), inaccesstoken.rawAddress.toCPointer<ByteVar>(), outaccesstoken.rawAddress.toCPointer<ByteVar>(), dwflags, lpreserved.rawAddress.toCPointer<ByteVar>())

public actual fun saferCreateLevel(dwscopeid: UInt, dwlevelid: UInt, openflags: UInt, plevelhandle: MutPtr, lpreserved: ConstPtr): Bool =
    windowssysWindowsWin32SecurityApplockerSaferCreateLevel(dwscopeid, dwlevelid, openflags, plevelhandle.rawAddress.toCPointer<ByteVar>(), lpreserved.rawAddress.toCPointer<ByteVar>())

public actual fun saferGetLevelInformation(levelhandle: SaferLevelHandle, dwinfotype: SaferObjectInfoClass, lpquerybuffer: MutPtr, dwinbuffersize: UInt, lpdwoutbuffersize: MutPtr): Bool =
    windowssysWindowsWin32SecurityApplockerSaferGetLevelInformation(levelhandle.rawAddress.toCPointer<ByteVar>(), dwinfotype, lpquerybuffer.rawAddress.toCPointer<ByteVar>(), dwinbuffersize, lpdwoutbuffersize.rawAddress.toCPointer<ByteVar>())

public actual fun saferGetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SaferPolicyInfoClass, infobuffersize: UInt, infobuffer: MutPtr, infobufferretsize: MutPtr, lpreserved: ConstPtr): Bool =
    windowssysWindowsWin32SecurityApplockerSaferGetPolicyInformation(dwscopeid, saferpolicyinfoclass, infobuffersize, infobuffer.rawAddress.toCPointer<ByteVar>(), infobufferretsize.rawAddress.toCPointer<ByteVar>(), lpreserved.rawAddress.toCPointer<ByteVar>())

public actual fun saferIdentifyLevel(dwnumproperties: UInt, pcodeproperties: ConstPtr, plevelhandle: MutPtr, lpreserved: ConstPtr): Bool =
    windowssysWindowsWin32SecurityApplockerSaferIdentifyLevel(dwnumproperties, pcodeproperties.rawAddress.toCPointer<ByteVar>(), plevelhandle.rawAddress.toCPointer<ByteVar>(), lpreserved.rawAddress.toCPointer<ByteVar>())

public actual fun saferRecordEventLogEntry(hlevel: SaferLevelHandle, sztargetpath: Pcwstr, lpreserved: ConstPtr): Bool =
    windowssysWindowsWin32SecurityApplockerSaferRecordEventLogEntry(hlevel.rawAddress.toCPointer<ByteVar>(), sztargetpath.rawAddress.toCPointer<ByteVar>(), lpreserved.rawAddress.toCPointer<ByteVar>())

public actual fun saferSetLevelInformation(levelhandle: SaferLevelHandle, dwinfotype: SaferObjectInfoClass, lpquerybuffer: ConstPtr, dwinbuffersize: UInt): Bool =
    windowssysWindowsWin32SecurityApplockerSaferSetLevelInformation(levelhandle.rawAddress.toCPointer<ByteVar>(), dwinfotype, lpquerybuffer.rawAddress.toCPointer<ByteVar>(), dwinbuffersize)

public actual fun saferSetPolicyInformation(dwscopeid: UInt, saferpolicyinfoclass: SaferPolicyInfoClass, infobuffersize: UInt, infobuffer: ConstPtr, lpreserved: ConstPtr): Bool =
    windowssysWindowsWin32SecurityApplockerSaferSetPolicyInformation(dwscopeid, saferpolicyinfoclass, infobuffersize, infobuffer.rawAddress.toCPointer<ByteVar>(), lpreserved.rawAddress.toCPointer<ByteVar>())

public actual fun saferiIsExecutableFileType(szfullpathname: Pcwstr, bfromshellexecute: Boolean): Bool =
    windowssysWindowsWin32SecurityApplockerSaferiIsExecutableFileType(szfullpathname.rawAddress.toCPointer<ByteVar>(), bfromshellexecute)
